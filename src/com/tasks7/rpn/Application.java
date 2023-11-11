package com.tasks7.rpn;

import java.util.Deque;
import java.util.LinkedList;


public class Application {

    public static double parse(String rpnString) {
        String [] str = rpnString.split(" ");
        Deque<String> deque = new LinkedList<>();
        LinkedList <String> symbols = new LinkedList<>();
        symbols.add("+");
        symbols.add("-");
        symbols.add("/");
        symbols.add("*");
        for (String sym: str) {
            deque.add(sym);
        }
        System.out.println(deque);
        System.out.println(deque.pop());
        System.out.println(deque);
        return 1;
    }

    public static void main(String[] args) {
        parse("10 20 + 30 40 + *");
    }
}
