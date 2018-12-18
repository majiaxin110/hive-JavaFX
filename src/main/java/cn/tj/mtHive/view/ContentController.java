package cn.tj.mtHive.view;

import cn.tj.mtHive.MainApp;
import cn.tj.mtHive.jdbcData.GetData;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ContentController {
    @FXML
    private Label infoLabel;
    @FXML
    private Button monthTotalMoneyButton;
    @FXML
    private Button goodsSaleButton;
    @FXML
    private Button supplierSaleButton;
    @FXML
    private PieChart pieChart;
    @FXML
    private Button connTestButton;
    @FXML
    private Label connTestLabel;

    private MainApp mainApp = null;
    final Label caption = new Label("");

    private ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
            new PieChart.Data("新垣结衣",15),
            new PieChart.Data("斋藤飞鸟",8),
            new PieChart.Data("石原里美",12));
    @FXML
    private void initialize() {
//        infoLabel.setText("Haha");
        monthTotalMoneyButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                infoLabel.setText("Haha");
            }
        });
        connTestButton.setOnAction((new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                connTestLabel.setText("测试中..");
                boolean isConn = GetData.testConn();
                if (isConn)
                    connTestLabel.setText("连接成功(●ˇ∀ˇ●)");
                else
                    connTestLabel.setText("连接失败Ծ‸Ծ");
            }
        }));
        pieChart.setData(pieChartData);
        pieChart.setTitle("这里显示统计图(●ˇ∀ˇ●)");
        pieChartData.forEach(data ->{
                    String text = String.format("%s %.2f%%", data.getName(),100.0 * data.getPieValue() / 35);
                    data.nameProperty().setValue(text);
                }
                );
    }

    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }

    public Label getInfoLabel() {
        return infoLabel;
    }

    public void setInfoLabel(Label infoLabel) {
        this.infoLabel = infoLabel;
    }

    public Button getMonthTotalMoneyButton() {
        return monthTotalMoneyButton;
    }

    public void setMonthTotalMoneyButton(Button monthTotalMoneyButton) {
        this.monthTotalMoneyButton = monthTotalMoneyButton;
    }

    public MainApp getMainApp() {
        return mainApp;
    }
}
