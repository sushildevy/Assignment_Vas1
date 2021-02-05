package com.Question45;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ReadDuplicates {
    public static void ReadDuplicates(){
        String filepath="C:\\Users\\Sushil's PC\\Desktop\\Java_training\\vastika\\demo.txt";
        try {
            FileReader fr=new FileReader(filepath);
            BufferedReader br=new BufferedReader(fr);
            String len;
            ArrayList<String> arr=new ArrayList<String> ();
            StringBuilder sb = new StringBuilder();
            while((len=br.readLine())!=null){

                len=len.toLowerCase();
                len=len.replaceAll("\\p{Punct}","");
                len.split(" ");
                System.out.println(len);
                arr.add(len);
                sb.append(len);
                sb.append(" ");

            }
            String s=sb.toString();
            String words[]=s.split(" ");
            System.out.println("duplicate words: ");
            for(int i=0;i<words.length;i++) {
                int ct = 1;
                for (int j = i + 1; j < words.length; j++) {
                    if (words[i].equals(words[j])) {
                        ct++;
                        words[j] = "0";
                    }
                }
                if (ct > 1 && words[i] != "0") {
                    System.out.println(words[i]);
                }


                br.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
