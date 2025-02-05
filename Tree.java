/*
 Katie Prohaska
 Date: 02/04/2025
 */
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.layout.Pane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import java.io.FileNotFoundException;
import javafx.animation.Animation;
import javafx.scene.input.MouseButton;
import javafx.animation.PathTransition;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.shape.Line;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;
import javafx.animation.TranslateTransition;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.control.Button;
import javafx.application.Platform;
import javafx.scene.text.Text;

public class Tree extends Application{
	public void start(Stage primaryStage) {
		HBox hbox = new HBox(15);
		HBox hbox2 = new HBox(15);
		hbox2.setPadding(new Insets(15,15,15,15));
		hbox.setPadding(new Insets(15,15,15,15));
		Media media = new Media("https://www.epidemicsound.com/sound-effects/tracks/d14db2d4-959d-4ee3-97da-9ed8b64c95ca/");
		MediaPlayer mp = new MediaPlayer(media);
		Line line = new Line(0,0,0,400);
		line.setRotate(90);
		line.setStroke(Color.WHITE);
	
				
		Rectangle r1 = new Rectangle(25,90,60,230);
		Rectangle r2 = new Rectangle(25,50,60,150);
		Rectangle r3 = new Rectangle(25,90,60,200);
		Rectangle r4 = new Rectangle(25,90,60,150);
		Rectangle r5 = new Rectangle(25,90,60,100);
		Rectangle r6 = new Rectangle(25,90,60,90);
		Rectangle r7 = new Rectangle(25,90,60,120);
		Rectangle r8 = new Rectangle(25,90,60,60);
		Rectangle r9 = new Rectangle(25,90,60,230);
		Rectangle r10 = new Rectangle(25,50,60,150);
		Rectangle r11 = new Rectangle(25,90,60,200);
		Rectangle r12 = new Rectangle(25,90,60,150);
		Rectangle r13 = new Rectangle(25,90,60,100);
		Rectangle r14 = new Rectangle(25,90,60,90);
		Rectangle r15 = new Rectangle(25,90,60,120);
		Rectangle r16 = new Rectangle(25,90,60,60);
		
		r1.setArcWidth(15);
		r1.setArcHeight(25);
		r2.setArcWidth(15);
		r2.setArcHeight(25);
		r3.setArcWidth(15);
		r3.setArcHeight(25);
		r4.setArcWidth(15);
		r4.setArcHeight(25);
		r5.setArcHeight(15);
		r5.setArcWidth(25);
		r6.setArcWidth(25);
		r6.setArcHeight(15);
		r7.setArcHeight(15);
		r7.setArcWidth(25);
		r8.setArcHeight(15);
		r8.setArcWidth(25);
		r9.setArcWidth(15);
		r9.setArcHeight(25);
		r10.setArcWidth(15);
		r10.setArcHeight(25);
		r11.setArcWidth(15);
		r11.setArcHeight(25);
		r12.setArcWidth(15);
		r12.setArcHeight(25);
		r13.setArcHeight(15);
		r13.setArcWidth(25);
		r14.setArcWidth(25);
		r14.setArcHeight(15);
		r15.setArcHeight(15);
		r15.setArcWidth(25);
		r16.setArcHeight(15);
		r16.setArcWidth(25);
		
		r1.setRotate(0);
		r2.setRotate(0);
		r3.setRotate(0);
		r4.setRotate(0);
		r5.setRotate(0);
		r6.setRotate(0);
		r7.setRotate(0);
		r8.setRotate(0);
		r9.setRotate(0);
		r10.setRotate(0);
		r11.setRotate(0);
		r12.setRotate(0);
		r13.setRotate(0);
		r14.setRotate(0);
		r15.setRotate(0);
		r16.setRotate(0);
		
		r1.setStroke(Color.BROWN);
		r1.setFill(Color.BROWN);
		r2.setStroke(Color.BROWN);
		r2.setFill(Color.BROWN);
		r3.setStroke(Color.BROWN);
		r3.setFill(Color.BROWN);
		r4.setStroke(Color.BROWN);
		r4.setFill(Color.BROWN);
		r5.setStroke(Color.BROWN);
		r5.setFill(Color.BROWN);
		r6.setStroke(Color.BROWN);
		r6.setFill(Color.BROWN);
		r7.setStroke(Color.BROWN);
		r7.setFill(Color.BROWN);
		r8.setStroke(Color.BROWN);
		r8.setFill(Color.BROWN);
		r9.setStroke(Color.BROWN);
		r9.setFill(Color.BROWN);
		r10.setStroke(Color.BROWN);
		r10.setFill(Color.BROWN);
		r11.setStroke(Color.BROWN);
		r11.setFill(Color.BROWN);
		r12.setStroke(Color.BROWN);
		r12.setFill(Color.BROWN);
		r13.setStroke(Color.BROWN);
		r13.setFill(Color.BROWN);
		r14.setStroke(Color.BROWN);
		r14.setFill(Color.BROWN);
		r15.setStroke(Color.BROWN);
		r15.setFill(Color.BROWN);
		r16.setStroke(Color.BROWN);
		r16.setFill(Color.BROWN);
		
		hbox.getChildren().addAll(r1,r2,r3,r4,r9,r10,r11,r12);
		hbox.setRotate(180);
		hbox.setSpacing(50);
		hbox2.getChildren().addAll(r5,r6,r7,r8,r13,r14,r15,r16);
		hbox2.setRotate(0);
		hbox2.setSpacing(50);
		
		Circle circle = new Circle(25,25,25);
		circle.setFill(Color.WHITE);
		circle.setStroke(Color.BLACK);
		Button restart = new Button("Restart");
		
		Image monkey = new Image("https://s3.amazonaws.com/pix.iemoji.com/images/emoji/apple/ios-12/256/monkey.png");
		ImageView imageView = new ImageView(monkey);
		imageView.setFitHeight(30);
		imageView.setFitWidth(25);
		
		StackPane sp = new StackPane();
		sp.getChildren().add(circle);
		sp.getChildren().add(imageView);
		
		BorderPane pane = new BorderPane();
		pane.setBottom(hbox);
		pane.setTop(hbox2);
		pane.getChildren().addAll(line);
		pane.getChildren().add(sp);
		pane.setAlignment(hbox, Pos.BOTTOM_CENTER);
		pane.setAlignment(hbox2, Pos.TOP_CENTER);
		
		
	    PathTransition pt = new PathTransition();
		pt.setDuration(Duration.millis(30000));
		pt.setPath(line);
		pt.setNode(pane);
		pt.setCycleCount(1);
		pt.play();
		
		TranslateTransition tt = new TranslateTransition(Duration.millis(120000), sp);
		tt.setCycleCount(Timeline.INDEFINITE);
		tt.setFromX(50);
		tt.setFromY(200);
		tt.setToY(8000);
		tt.play();
		
		Scene scene = new Scene(pane,400,400);
		primaryStage.setTitle("Monkey Tree");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		pane.setOnMousePressed(e ->{
			sp.setLayoutX(sp.getLayoutX() + 18);
			if(e.getButton() == MouseButton.PRIMARY) {
				sp.setLayoutY((sp.getLayoutY() - 25));
			}
			else if(e.getButton() == MouseButton.SECONDARY) {
				sp.setLayoutY(sp.getLayoutY() - 25);

			}
		});
		pt.setOnFinished(e ->{
			HBox hbox3 = new HBox(5);
			hbox3.setSpacing(50);
			hbox3.getChildren().addAll(restart);
			pane.setCenter(restart);

			
		});
		restart.setOnAction( e -> {
			primaryStage.close();
			Platform.runLater(() ->{
				new Tree().start(new Stage() );
			});
		});
		if(sp.getLayoutX() == r1.getX() || sp.getLayoutY() == r1.getY()) {
			mp.play();	
		}
		else if(sp.getLayoutX() == r2.getX()|| sp.getLayoutY() == r2.getY()){
			mp.play();			
		}
		else if(sp.getLayoutX() == r3.getX() || sp.getLayoutY() == r3.getY()){			
			mp.play();
		}
		if(sp.getLayoutX() == r4.getX() || sp.getLayoutY() == r4.getY()) {
			mp.play();
		}
		else if(sp.getLayoutX() == r5.getX()|| sp.getLayoutY() == r5.getY()){
			mp.play();
		}
		else if(sp.getLayoutX() == r6.getX() || sp.getLayoutY() == r6.getY()){
			mp.play();
		}
		if(sp.getLayoutX() == r7.getX() || sp.getLayoutY() == r7.getY()) {
			mp.play();
		}
		else if(sp.getLayoutX() == r8.getX()|| sp.getLayoutY() == r8.getY()){
			mp.play();
		}
		else if(sp.getLayoutX() == r9.getX() || sp.getLayoutY() == r9.getY()){
			mp.play();
		}
		if(sp.getLayoutX() == r10.getX() || sp.getLayoutY() == r10.getY()) {
			mp.play();
		}
		else if(sp.getLayoutX() == r11.getX()|| sp.getLayoutY() == r11.getY()){
			mp.play();
		}
		else if(sp.getLayoutX() == r12.getX() || sp.getLayoutY() == r12.getY()){
			mp.play();
		}
		if(sp.getLayoutX() == r13.getX() || sp.getLayoutY() == r13.getY()) {
			mp.play();
		}
		else if(sp.getLayoutX() == r14.getX()|| sp.getLayoutY() == r14.getY()){
			mp.play();	
			}
		else if(sp.getLayoutX() == r15.getX() || sp.getLayoutY() == r15.getY()){
			mp.play();
		}
		else if(sp.getLayoutX() == r16.getX()|| sp.getLayoutY() == r16.getY()){
			mp.play();
		}
}
}