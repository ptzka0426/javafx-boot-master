package com.ceadeal.javafxboot.ctrl;

import de.felixroske.jfxsupport.FXMLController;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import lombok.extern.slf4j.Slf4j;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author Lt
 * @create 2023-09-11 11:43
 */
@Slf4j
@FXMLController
public class index extends AnchorPane implements Initializable {
    // 主容器
    public Pane rootIndex;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        log.info("initialize: {}", location.getPath());
    }


}
