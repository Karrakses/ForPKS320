package com.example.forpks319;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.TilePane;
import javafx.stage.FileChooser;
import javafx.stage.Window;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class MainFormController {
    @FXML
    private TilePane groupImage;

    @FXML
    protected void initialize(){
        PrintImage(groupImage);
    }
    @FXML
    void getIMG(ActionEvent event) {

        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Открыть файл для загрузки");
        Window primaryStage = null;
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("Изображения (*.jpg)","*.jpg");
        fileChooser.getExtensionFilters().add(extFilter);
        @SuppressWarnings("deprecation") File file = fileChooser.showOpenDialog(null);
        if (file != null){
            PrintImage.getimg(file);
            createimg(groupImage,file.toString());
        } else {
            System.out.println("Файл не выбран");
        }
    }
    @FXML
    public static void PrintImage(TilePane groupImage)
    {
        try {
            FileReader filereader = new FileReader(PrintImage.GetListImage());
            BufferedReader reader = new BufferedReader(filereader);
            String line = reader.readLine();
            createimg(groupImage, line);
            while (line != null) {
                line = reader.readLine();
                createimg(groupImage,line);

            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public static void createimg(TilePane groupImage, String path){
        ImageView img = new ImageView(new Image(path));
        img.setFitWidth(100);
        img.setFitHeight(100);
        groupImage.getChildren().add(img);
    }

}
