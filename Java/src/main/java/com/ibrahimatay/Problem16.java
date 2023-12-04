package com.ibrahimatay;

public class Problem16 {

    /*
    You run an e-commerce website and want to record the last N order ids in a log.
    Implement a data structure to accomplish this, with the following API:

    record(order_id): adds the order_id to the
    log get_last(i): gets the ith last element from the log.

    i is guaranteed to be smaller than or equal to N.
    You should be as efficient with time and space as possible.
    * */

    private final int maxSize;
    private final int[] buffer;
    private int index;

    public Problem16(int maxSize) throws Exception {

        if (maxSize == 0){
            throw new Exception("maxsize is no zero");
        }

        this.maxSize = maxSize;
        this.buffer = new int[maxSize];
        this.index = 0;
    }

    public void record(int orderId){
        buffer[index] = orderId;
        index = (index + 1) % maxSize;
    }

    public int getLast(int i) throws Exception {

        if(i > maxSize){
            throw new Exception("The value can be less than or equal to max size.");
        }

        return buffer[(index-i+maxSize)%maxSize];
    }
}
