package com.crawler;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc =  new Scanner(System.in);

        System.out.println("enter path");
        String path = sc.next();
        String data =  "Do or die";


        WriteFile(path,data);
    }


    public static void WriteFile (String  filepath, String data) throws IOException {
        File file = new File(filepath);

        if (file.exists())
        {
            FileWriter fileWriter = new FileWriter(filepath, true);
            PrintWriter writer =  new PrintWriter(fileWriter);
            writer.append(data);
            writer.close();
            fileWriter.close();
        }
        else
        {
            PrintWriter writer = new PrintWriter(filepath);
            writer.write(data +" \n ");
            writer.close();
        }
    }

    public GoingToDepth(String url, int d, String filepath) throws IOException {
        if (d==0){return ;}

     WriteFile(filepath,url);
     try {
         Doc
     }
    }


}


