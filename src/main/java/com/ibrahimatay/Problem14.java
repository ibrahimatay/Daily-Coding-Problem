package com.ibrahimatay;

import java.util.concurrent.ThreadLocalRandom;

public class Problem14 {

    /*
    The area of a circle is defined as πr2. Estimate π to 3 decimal places using a Monte Carlo method.
    Hint: The basic equation of a circle is x2 + y2 = r2.

    My resource reference
    - https://en.wikipedia.org/wiki/Monte_Carlo_method
    - https://en.wikipedia.org/wiki/Pseudorandom_number_generator
    * */

    public double solution(int r){
        double inside = 1;
        double outside = 1;
        double total = 0;

        for (int i=0;i<10000;i++){
            double x = ThreadLocalRandom.current().nextDouble((-1*inside), inside);
            double y = ThreadLocalRandom.current().nextDouble((-1*inside), inside);

            double measure = getDistance(x,y);
            if(measure>inside){
                outside+=1;
            }else{
                inside+=1;
            }
        }

        total = outside+inside;

        return (4*(inside/total));
    }

    private double getDistance(double x1, double y1){
        return getDistance(x1, y1, 0, 0);
    }

    private double getDistance(double x1, double y1, double x, double y){
        double x_diff = x1 - x;
        double y_diff = y1 - y;

        x_diff *= x_diff;
        y_diff *= y_diff;

        return Math.sqrt(x_diff + y_diff);
    }
}
