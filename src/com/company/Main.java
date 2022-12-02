package com.company;

import com.problem1.ProblemOne;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, URISyntaxException {
        Scanner sc = new Scanner(System.in);
        System.out.println("please select do you to know answer");
        int scInt = sc.nextInt();

        switch(scInt) {
            case 1:
                ProblemOne.solOne();
                break;
            case 2:
                // code block
                break;
            default:
                System.out.println("Hey! don't have this answer this problem");
        }
    }
}
