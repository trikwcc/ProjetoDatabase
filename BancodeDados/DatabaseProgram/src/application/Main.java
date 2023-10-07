package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {
	private double x = 0;
	private double y = 0;

	public static void main(String[] args) {
		
		launch(args);

	}

	@Override
	public void start(Stage stage) {
		try {
			Image icon = new Image("Icon.png");
			FXMLLoader loader = new FXMLLoader(getClass().getResource("principal.fxml"));

			Parent root = loader.load();

			Scene scene = new Scene(root);

			root.setOnMousePressed((MouseEvent event) -> {
				x = event.getSceneX();
				y = event.getSceneY();
			});

			root.setOnMouseDragged((MouseEvent event) -> {
				stage.setX(event.getScreenX() - x);
				stage.setY(event.getScreenY() - y);
				stage.setOpacity(.8);
			});

			root.setOnMouseReleased((MouseEvent event) -> {
				stage.setOpacity(1);
			});

			stage.initStyle(StageStyle.TRANSPARENT);

			String css = getClass().getResource("application.css").toExternalForm();
			scene.getStylesheets().add(css);

			stage.setTitle("Police Data Fetcher");
			stage.setResizable(false);

			stage.getIcons().add(icon);
			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
