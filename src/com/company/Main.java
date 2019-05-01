package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        HashMap<Integer, String> myMap = new HashMap<Integer, String>();
        Scanner scan = new Scanner(System.in);
        boolean status = true;
        // myMap.put(10,"ten");
        //  System.out.println(myMap.get(10));
        while (status) {
            try {
                System.out.println("enter any digit number");
                int number = scan.nextInt();
                scan.nextLine();
                //  System.out.println("value availability1 " + myMap.containsValue(10));
                //  System.out.println("value availability 2" + myMap.containsKey(10));
                if (myMap.containsKey(number)) {
                    System.out.println("The value for the key is  :" + myMap.get(number));
                } else {
                    System.out.println("not available, enter the workd to add it");
                    String word = scan.nextLine();
                    myMap.put(number, word);
                    //  System.out.println("here it is :" + myMap.get(number));
                }
            } catch (InputMismatchException e) {
                System.out.println("only number is accepted");
            }
            System.out.println("more numbers?");
            String more = scan.nextLine();
            if (more.equalsIgnoreCase("n")) {
                status = false;

            }

        }
        for (Integer mynumbers : myMap.keySet()) {
            System.out.println( mynumbers + " " + myMap.get(mynumbers));
        }

    }

}

//writing keys and values to a file
/*
    System.out.println("writing keys and values to a file");
            String filename = (System.getProperty("user.dir") + File.separatorChar +"animalNoises.txt");
            System.out.println(filename);

            PrintWriter writer = null;
            try {
            writer = new PrintWriter(new File(filename));
            } catch (FileNotFoundException e) {
            System.out.println("File does not exist!");
            }

            //print both the key and the value on same line
            // for each key in the key set write the key, a tab and the value
            for (String key : map.keySet()) {
            System.out.println("write this line: " + key);
            writer.println(key + "\t" + map.get(key));
            }
            writer.close();

            //read from a file
            System.out.println("read from a file");
            BufferedReader reader = null;
            try {
            reader = new BufferedReader(new FileReader(filename));
            String line = reader.readLine();
            while (line != null) {
            //System.out.println(line);
            String[] key_value_pair = line.split("\t");
            System.out.println("KV Pair:" + key_value_pair[0] + " " + key_value_pair[1]);
            //the key is in key_value_pair[0]
            //the value is in key_value_pair[1]
            // now you could add it back to the hash map if it isn't there already

            line = reader.readLine();
            }
            reader.close();
            } catch (IOException e) {
            System.out.println("File does not exist!");
            }finally{

            }



            }
            }
*/
