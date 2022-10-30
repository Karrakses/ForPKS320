package com.example.forpks319;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.FileChooser;
import javafx.stage.Window;

import java.io.File;

public class MainFormController {

    @FXML
    void getIMG(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Открыть файл для загрузки");
        Window primaryStage = null;
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("Изображения (*.jpg)","*.jpg");
        fileChooser.getExtensionFilters().add(extFilter);
        @SuppressWarnings("deprecation") File file = fileChooser.showOpenDialog(primaryStage);
        if (file != null){
            PrintImage.getimg(file);
        } else {
            System.out.println("Файл не выбран");
        }
    }

}
