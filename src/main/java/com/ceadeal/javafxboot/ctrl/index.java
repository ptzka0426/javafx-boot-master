package com.ceadeal.javafxboot.ctrl;

import de.felixroske.jfxsupport.FXMLController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
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

    @FXML
    private TextField txt1;

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
            txt1.setText(fileAbsolutePath);
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("提示");
            alert.setHeaderText("确定要执行吗？");
            alert.setContentText("请慎重考虑，程序即将运行?");

            alert.showAndWait()
                    .filter(response -> response == ButtonType.OK)
                    .ifPresent(response -> System.out.println("正在执行!"));
        }
    }

}
