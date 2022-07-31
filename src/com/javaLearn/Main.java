package com.javaLearn;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack <String> games = new Stack<String>();

        games.add("call of Duty ");
        games.add("Far cry ");
        games.add("Mass Effect ");

        //POP Removes from the top of stack the head. Ex. Mass Effect will be removed from Array//
        System.out.println(games.pop());

        System.out.println(games);

    }
}


