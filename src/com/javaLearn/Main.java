package com.javaLearn;

//import java.util.Stack;
//
//public class Main {
//    public static void main(String[] args) {
        //JAVA comes with its own Stack APIs

                    //WHAT DOES STACK DO?//
        //Stack is First in Last Out, Last in First Out//

//        Stack <String> games = new Stack<String>();
//
//        games.add("call of Duty ");
//        games.add("Far cry ");
//        games.add("Mass Effect ");

        //POP DELETES from the top of stack the head. Ex. Mass Effect will be removed from Array//
                        //System.out.println(games.pop());

        //PEEK LOOKS at what's at the top of the stack but does not alter the stack memory remains the same//
                     //System.out.println(games.peek());

        //PUSH ADDS An Argument to the top of stack So now this is first on top Mario//
                    //System.out.println(games.push("Mario"));

//        System.out.println(games);
//
//    }
//}


                //QUEUE
                // USE LINKED LIST WITH QUEUE

//import java.util.LinkedList;
//import java.util.Queue;
//
//
//public class Main {
//     public static void main(String[] args) {
//
//         Queue <String>bbqLine = new LinkedList<String>();

//         bbqLine.add("Susan");
//         bbqLine.add("George");
//         bbqLine.add("Shorty");

                //POLL Removes the next in line Similar to POP in the Stack//
         //bbqLine.poll();

            //toArray Allows you to access the element in the Array by the index number//
//         System.out.println(bbqLine.toArray()[1]);

//    }
//}

import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList <String> linkageDude = new LinkedList<String>();

        linkageDude.add("george");
        linkageDude.add("Tim");
        linkageDude.add("Greg");

        System.out.println(linkageDude.getFirst());

        Iterator it = linkageDude.iterator();
        while (it.hasNext()){
            if (it.next() == "george"){
                System.out.println("WE found u g");
            }
        }
    }
}