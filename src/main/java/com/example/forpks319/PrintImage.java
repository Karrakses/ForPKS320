package com.example.forpks319;


import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;

public class PrintImage {
     public static void getimg(File source){
         File newImage = new File("C:\\Users\\Егоров Александр\\IdeaProjects\\ForPKS319\\src\\main\\resources\\Image" + File.separator + source.getName());
        try {
            if (newImage.exists()){
                System.out.println("Изображение уже существует");
            }
            else
            {
                Files.copy(source.toPath(), newImage.toPath());
                FileWriter writer = new FileWriter("C:\\Users\\Егоров Александр\\IdeaProjects\\ForPKS319\\src\\main\\resources\\image.txt", true);
                writer.write("C:\\Users\\Егоров Александр\\IdeaProjects\\ForPKS319\\src\\main\\resources\\Image" + File.separator + source.getName());
                writer.append('\n');
                writer.flush();
            }
        }
        catch (Exception e){
System.out.println(e);
        }

    }

    public static File GetListImage(){
         return new File("C:\\Users\\Егоров Александр\\IdeaProjects\\ForPKS319\\src\\main\\resources\\image.txt");

    }

}
