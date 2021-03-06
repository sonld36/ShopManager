package Controller;

import Model.SanPham.DienThoai;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../sample/home.fxml"));
        primaryStage.setTitle("Shop Cong Nghe");
        primaryStage.setScene(new Scene(root, 1200, 680));
        primaryStage.show();
    }



    public static void main(String[] args) {
        launch(args);
    }

}
