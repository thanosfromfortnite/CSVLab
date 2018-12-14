import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class LineCharts extends Application {
    public void start(Stage stage) {
        stage.setTitle("Dropout rates lol");
        final NumberAxis xAxis = new NumberAxis();
        final NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Year");
        final LineChart<Number,Number> lineChart = new LineChart<Number,Number>(xAxis,yAxis);

        lineChart.setTitle("Dropout rates??? lol");
        XYChart.Series series = new XYChart.Series();
        series.setName("My portfolio or something");

    }
}
