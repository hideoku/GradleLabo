package com.sample

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.stage.Stage

class Launcher extends Application {

    @Override
    void start(Stage stage) {
        stage.title = "Sample"

        Parent parent = FXMLLoader.load(getClass().getResource("sample.fxml"))

        Scene scene = new Scene(parent)
        stage.scene = scene

        stage.show()
    }
}
