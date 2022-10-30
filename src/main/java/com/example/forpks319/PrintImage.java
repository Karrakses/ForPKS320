package com.example.forpks319;


import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;

public class PrintImage {
    private static ArrayList<String> image = new ArrayList<String>();
    public static void getimg(File source){
        try {
            Files.copy(source.toPath(), new File("C:\\Users\\Егоров Александр\\IdeaProjects\\ForPKS319\\src\\main\\resources" + File.separator + source.getName()).toPath());
            image.add("C:\\Users\\Егоров Александр\\IdeaProjects\\ForPKS319\\src\\main\\resources" + File.separator + source.getName());
            System.out.println(image.toString());
        }
        catch (Exception e){

        }

    }

}
