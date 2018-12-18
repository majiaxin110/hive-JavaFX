package cn.tj.mtHive;

import cn.tj.mtHive.view.ContentController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application {
    private Stage primaryStage;
    private BorderPane rootLayout;

    public void initLayout() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MainApp.class.getResource(""));
        rootLayout = (BorderPane) loader.load();
        Scene scene = new Scene(rootLayout);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void showContentView() throws IOException {
        // Load person overview.
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MainApp.class.getResource("view/content.fxml"));
        SplitPane personOverview = (SplitPane) loader.load();

        // Set person overview into the center of root layout.
        rootLayout.setCenter(personOverview);

        ContentController contentController = loader.getController();
        contentController.setMainApp(this);
    }
    @Override
    public void start(Stage primaryStage) throws Exception{
        this.primaryStage = primaryStage;
        primaryStage.setTitle("销售统计程序");
//        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();

        initLayout();

        showContentView();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
