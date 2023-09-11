package com.ceadeal.javafxboot.ctrl;

import de.felixroske.jfxsupport.FXMLController;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import javafx.stage.Window;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author Lt
 * @create 2023-09-11 11:43
 */
@Slf4j
@FXMLController
public class index implements Initializable {
    // 主容器
    public Pane rootIndex;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        log.info("initialize: {}", location.getPath());
    }

    public void btn1(ActionEvent actionEvent) {
        Window window = rootIndex.getScene().getWindow();
        FileChooser fileChooser = new FileChooser();
        // 文件类型过滤器
        FileChooser.ExtensionFilter filter = new FileChooser.ExtensionFilter("Excel files (*.xls, *.xlsx)", "*.xls", "*.xlsx");
        fileChooser.getExtensionFilters().add(filter);
        // ...
        File file = fileChooser.showOpenDialog(window);
        String fileName = file == null ? "" : file.getName();
        String fileAbsolutePath = file == null ? "" : file.getAbsolutePath();

        if (file != null) {
            
        }
    }

}
