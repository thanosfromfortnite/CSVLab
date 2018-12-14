import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

import java.io.File;

public class LineCharts extends Application {
    public void start(Stage stage) {
        CSVUtilities file = new CSVUtilities(new File("help.csv"));
        stage.setTitle("Dropout rates lol");
        final NumberAxis xAxis = new NumberAxis();
        final NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Year");
        final LineChart<Number,Number> lineChart = new LineChart<Number,Number>(xAxis,yAxis);

        lineChart.setTitle("My DDP Grades through years");
        XYChart.Series series = new XYChart.Series();
        series.setName("My portfolio or something");

        series.getData().add(new XYChart.Data(2015, 50));
        series.getData().add(new XYChart.Data(2016, 3));
        series.getData().add(new XYChart.Data(2017, 90));


        Scene scene = new Scene(lineChart, 800, 600);
        lineChart.getData().add(series);

        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
