package com.ibrahimatay;

import java.util.*;

public class Problem11 {

    /*
    * Implement an autocomplete system. That is, given a query string s and a set of all possible query strings, return all strings in the set that have s as a prefix.

      For example, given the query string de and the set of strings [dog, deer, deal], return [deer, deal].

      Hint: Try preprocessing the dictionary into a more efficient data structure to speed up queries.
    * */

    private final Trie trie;

    public Problem11() {
        trie = new Trie();
    }

    public void add(String word) {
        trie.add(word);
    }

    public List<String> getFoundWord(String word) {
        TrieNode node = trie.searchNode(word);

        if (node == null){
            return new ArrayList<>();
        }

        trie.wordsFinderTraversal(node,0);

        return trie.getFoundWord();
    }

    private class TrieNode {
        char c;
        TrieNode parent;
        HashMap<Character, TrieNode> children = new HashMap<>();
        boolean isLeaf;

        public TrieNode() {}
        public TrieNode(char c){this.c = c;}
    }

    private class Trie {
        private TrieNode root;
        ArrayList<String> words;
        TrieNode prefixRoot;
        String curPrefix;

        public Trie() {
            root = new TrieNode();
            words  = new ArrayList<>();
        }

        public void add(String word) {
            HashMap<Character, TrieNode> children = root.children;
            TrieNode crntparent;
            crntparent = root;


            for(int i=0; i<word.length(); i++)
            {
                char c = word.charAt(i);

                TrieNode t;
                if(children.containsKey(c)) {
                    t = children.get(c);
                } else {
                    t = new TrieNode(c);
                    t.parent = crntparent;
                    children.put(c, t);
                }

                children = t.children;
                crntparent = t;

                if(i==(word.length()-1)) {
                    t.isLeaf = true;
                }
            }
        }

        public TrieNode searchNode(String str) {
            Map<Character, TrieNode> children = root.children;
            TrieNode t = null;

            for(int i=0; i<str.length(); i++) {
                char c = str.charAt(i);
                if(children.containsKey(c)) {
                    t = children.get(c);
                    children = t.children;
                } else{
                    return null;
                }
            }

            prefixRoot = t;
            curPrefix = str;
            words.clear();

            return t;
        }

        public void wordsFinderTraversal(TrieNode node, int offset) {
            if(node.isLeaf) {

                TrieNode altair;
                altair = node;

                Stack<String> hstack = new Stack<>();

                while(altair != prefixRoot) {

                    hstack.push(Character.toString(altair.c));
                    altair = altair.parent;
                }

                String swap = curPrefix;

                while(!hstack.empty()) {
                    swap = swap + hstack.pop();
                }

                words.add(swap);
            }

            Set<Character> kset = node.children.keySet();
            Iterator itr = kset.iterator();
            ArrayList<Character> aloc = new ArrayList<>();

            while(itr.hasNext()) {
                Character ch = (Character)itr.next();
                aloc.add(ch);
            }

            for(int i=0;i<aloc.size();i++) {
                wordsFinderTraversal(node.children.get(aloc.get(i)), offset + 2);
            }
        }

        public List<String> getFoundWord(){
            return words;
        }
    }
}
