package com.problem1;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProblemOne {
    public static void solOne() throws IOException, URISyntaxException {
        ProblemOne problemOne = new ProblemOne();
        List<Integer> readInput = problemOne.readFile("input1.txt");
        System.out.println("How Many Elf are  "+readInput.size());

        Collections.sort(readInput, Collections.reverseOrder());

        int count = 0;
        int max=0;
        int i =0;

        while(i<3) {
            max = readInput.get(0);
            count += readInput.get(i);
            i++;
        }
            System.out.println("Max : "+max);
            System.out.println("3 Max count : "+count);


    }

    public List<Integer> readFile (String input) throws IOException, URISyntaxException {
        URL resource = getClass().getClassLoader().getResource(input);
        File myObj = new File(resource.toURI());
        List<Integer> lines = new ArrayList<>();
        String line;
        int count = 0;


        Scanner myReader = new Scanner(myObj);

        while (myReader.hasNextLine()) {
            line = myReader.nextLine();
            if(line.isEmpty()){
                lines.add(count);
                count=0;
            } else {
                count += Integer.parseInt(line);
            }
        }
        return lines;
    }
}
