package Opgaver.Opgave5;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class SierpinskiTriangle extends Application {

    public static final double WIDTH = 600;
    public static final double HEIGHT = 600;

    private Group triangleGroup = new Group();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        VBox vBox = new VBox();
        TextField orderField = new TextField();
        Button drawButton = new Button("Tegn");

        drawButton.setOnAction(e -> {
            int order = Integer.parseInt(orderField.getText());
            triangleGroup.getChildren().clear();
            drawTriangles(order, WIDTH / 2, 0, WIDTH / 2);
        });

        vBox.getChildren().addAll(orderField, drawButton, triangleGroup);
        Scene scene = new Scene(vBox, WIDTH, HEIGHT);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Sierpinski Triangle");
        primaryStage.show();
    }

    private void drawTriangles(int order, double x, double y, double size) {
        if (order == 0) {
            Polygon triangle = new Polygon();
            triangle.getPoints().addAll(x, y,
                    x - size / 2, y + size * Math.sqrt(3) / 2,
                    x + size / 2, y + size * Math.sqrt(3) / 2);
            triangle.setStroke(Color.BLACK);
            triangle.setFill(Color.WHITE);
            triangleGroup.getChildren().add(triangle);
        } else {
            drawTriangles(order - 1, x, y, size / 2);
            drawTriangles(order - 1, x - size / 4, y + size * Math.sqrt(3) / 4, size / 2);
            drawTriangles(order - 1, x + size / 4, y + size * Math.sqrt(3) / 4, size / 2);
        }
    }
}
