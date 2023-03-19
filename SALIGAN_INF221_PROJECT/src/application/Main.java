package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,650,890);
			primaryStage.setFullScreen(false);
			primaryStage.setResizable(false);
			
			Image image = new Image("Untitled_Artwork 6.jpg");
			
			ImageView imageView = new ImageView();
			imageView.setImage(image);
			
			imageView.setX(0);
			imageView.setY(0);
			imageView.setFitWidth(650);
			imageView.setFitHeight(890);
			
			
			// face front-------------------------
			
			Rectangle recFace = new Rectangle();
			recFace.setX(195);
			recFace.setY(282);
			recFace.setWidth(94);
			recFace.setHeight(5);
//			recFace.setFill(Color.web("#E4D9AB"));
			recFace.setFill(Color.TRANSPARENT);
			recFace.setStroke(Color.web("#E4D9AB"));
			recFace.setStrokeWidth(5);
			recFace.setRotate(2);
			recFace.setArcHeight(5);
			recFace.setArcWidth(5);
			
			Rectangle recFace1 = new Rectangle();
			recFace1.setX(210);
			recFace1.setY(204);
			recFace1.setWidth(90);
			recFace1.setHeight(5);
//			recFace1.setFill(Color.web("#E4D9AB"));
			recFace1.setFill(Color.TRANSPARENT);
			recFace1.setStroke(Color.web("#E4D9AB"));
			recFace1.setStrokeWidth(5);
			recFace1.setRotate(3);
			recFace1.setArcHeight(5);
			recFace1.setArcWidth(5);
			
			Rectangle recFace2 = new Rectangle();
			recFace2.setX(202);
			recFace2.setY(202);
			recFace2.setWidth(5);
			recFace2.setHeight(83);
//			recFace2.setFill(Color.web("#E4D9AB"));
			recFace2.setFill(Color.TRANSPARENT);
			recFace2.setStroke(Color.web("#E4D9AB"));
			recFace2.setStrokeWidth(5);
			recFace2.setRotate(10);
			recFace2.setArcHeight(5);
			recFace2.setArcWidth(5);
			
			Rectangle recFace3 = new Rectangle();
			recFace3.setX(290);
			recFace3.setY(206);
			recFace3.setWidth(5);
			recFace3.setHeight(83);
//			recFace3.setFill(Color.web("#E4D9AB"));
			recFace3.setFill(Color.TRANSPARENT);
			recFace3.setStroke(Color.web("#E4D9AB"));
			recFace3.setStrokeWidth(5);
			recFace3.setRotate(8);
			recFace3.setArcHeight(5);
			recFace3.setArcWidth(5);
			
			Rectangle recFace4 = new Rectangle();
			recFace4.setX(209);
			recFace4.setY(206);
			recFace4.setWidth(77);
			recFace4.setHeight(76);
			recFace4.setFill(Color.web("#E4D9AB"));
//			recFace4.setFill(Color.TRANSPARENT);
			recFace4.setStroke(Color.web("#E4D9AB"));
			recFace4.setStrokeWidth(5);
			recFace4.setRotate(8);
			recFace4.setArcHeight(5);
			recFace4.setArcWidth(5);
			
			// face down---------------------------
			
			Rectangle recFace5 = new Rectangle();
			recFace5.setX(200);
			recFace5.setY(280);
			recFace5.setWidth(5);
			recFace5.setHeight(38);
			recFace5.setFill(Color.web("#D3C096"));
//			recFace5.setFill(Color.TRANSPARENT);
			recFace5.setStroke(Color.web("#D3C096"));
			recFace5.setStrokeWidth(4);
			recFace5.setRotate(-18);
			recFace5.setArcHeight(3);
			recFace5.setArcWidth(3);
			
			Rectangle recFace6 = new Rectangle();
			recFace6.setX(281);
			recFace6.setY(280);
			recFace6.setWidth(5);
			recFace6.setHeight(38);
			recFace6.setFill(Color.web("#D3C096"));
//			recFace6.setFill(Color.TRANSPARENT);
			recFace6.setStroke(Color.web("#D3C096"));
			recFace6.setStrokeWidth(4);
			recFace6.setRotate(16);
			recFace6.setArcHeight(3);
			recFace6.setArcWidth(3);
			
			Rectangle recFace7 = new Rectangle();
			recFace7.setX(206);
			recFace7.setY(315);
			recFace7.setWidth(75);
			recFace7.setHeight(4);
//			recFace7.setFill(Color.web("#D3C096"));
			recFace7.setFill(Color.TRANSPARENT);
			recFace7.setStroke(Color.web("#D3C096"));
			recFace7.setStrokeWidth(4);
			recFace7.setRotate(0);
			recFace7.setArcHeight(3);
			recFace7.setArcWidth(3);
			
			Rectangle recFace8 = new Rectangle();
			recFace8.setX(206);
			recFace8.setY(285);
			recFace8.setWidth(76);
			recFace8.setHeight(30);
			recFace8.setFill(Color.web("#D3C096"));
//			recFace8.setFill(Color.TRANSPARENT);
			recFace8.setStroke(Color.web("#D3C096"));
			recFace8.setStrokeWidth(4);
			recFace8.setRotate(0);
			recFace8.setArcHeight(3);
			recFace8.setArcWidth(3);
			
			// face corner--------------------
			
			Rectangle recFace9 = new Rectangle();
			recFace9.setX(287);
			recFace9.setY(206);
			recFace9.setWidth(35);
			recFace9.setHeight(4);
			recFace9.setFill(Color.web("#F1E6CE"));
//			recFace9.setFill(Color.TRANSPARENT);
			recFace9.setStroke(Color.web("#F1E6CE"));
			recFace9.setStrokeWidth(4);
			recFace9.setRotate(-37);
			recFace9.setArcHeight(3);
			recFace9.setArcWidth(3);
			
			Rectangle recFace10 = new Rectangle();
			recFace10.setX(323);
			recFace10.setY(193);
			recFace10.setWidth(4);
			recFace10.setHeight(23);
			recFace10.setFill(Color.web("#F1E6CE"));
//			recFace10.setFill(Color.TRANSPARENT);
			recFace10.setStroke(Color.web("#F1E6CE"));
			recFace10.setStrokeWidth(4);
			recFace10.setRotate(-35);
			recFace10.setArcHeight(3);
			recFace10.setArcWidth(3);
			
			Rectangle recFace11 = new Rectangle();
			recFace11.setX(331);
			recFace11.setY(212);
			recFace11.setWidth(4);
			recFace11.setHeight(73);
			recFace11.setFill(Color.web("#F1E6CE"));
//			recFace11.setFill(Color.TRANSPARENT);
			recFace11.setStroke(Color.web("#F1E6CE"));
			recFace11.setStrokeWidth(4);
			recFace11.setRotate(-3);
			recFace11.setArcHeight(3);
			recFace11.setArcWidth(3);
			
			Rectangle recFace12 = new Rectangle();
			recFace12.setX(276);
			recFace12.setY(300);
			recFace12.setWidth(65);
			recFace12.setHeight(4);
			recFace12.setFill(Color.web("#F1E6CE"));
//			recFace12.setFill(Color.TRANSPARENT);
			recFace12.setStroke(Color.web("#F1E6CE"));
			recFace12.setStrokeWidth(4);
			recFace12.setRotate(-30);
			recFace12.setArcHeight(3);
			recFace12.setArcWidth(3);
			
			Rectangle recFace13 = new Rectangle();
			recFace13.setX(255);
			recFace13.setY(235);
			recFace13.setWidth(65);
			recFace13.setHeight(70);
			recFace13.setFill(Color.web("#F1E6CE"));
//			recFace13.setFill(Color.TRANSPARENT);
			recFace13.setStroke(Color.web("#F1E6CE"));
			recFace13.setStrokeWidth(4);
			recFace13.setRotate(-25);
			recFace13.setArcHeight(3);
			recFace13.setArcWidth(3);
			
			Rectangle recFace14 = new Rectangle();
			recFace14.setX(291);
			recFace14.setY(205);
			recFace14.setWidth(40);
			recFace14.setHeight(80);
			recFace14.setFill(Color.web("#F1E6CE"));
//			recFace14.setFill(Color.TRANSPARENT);
			recFace14.setStroke(Color.web("#F1E6CE"));
			recFace14.setStrokeWidth(4);
			recFace14.setRotate(-8);
			recFace14.setArcHeight(3);
			recFace14.setArcWidth(3);
			
			
			// ear 
			
			Rectangle recEar = new Rectangle();
			recEar.setX(350);
			recEar.setY(266);
			recEar.setWidth(4);
			recEar.setHeight(43);
			recEar.setFill(Color.web("#F1E6CE"));
//			recEar.setFill(Color.TRANSPARENT);
//			recEar.setStroke(Color.web("#F1E6CE"));
			recEar.setStrokeWidth(2);
			recEar.setRotate(19);
			recEar.setArcHeight(3);
			recEar.setArcWidth(3);
			
			Rectangle recEar1 = new Rectangle();
			recEar1.setX(356);
			recEar1.setY(263);
			recEar1.setWidth(25);
			recEar1.setHeight(4);
			recEar1.setFill(Color.web("#F1E6CE"));
//			recEar1.setFill(Color.TRANSPARENT);
//			recEar1.setStroke(Color.web("#F1E6CE"));
			recEar1.setStrokeWidth(2);
			recEar1.setRotate(-19);
			recEar1.setArcHeight(3);
			recEar1.setArcWidth(3);
			
			Rectangle recEar2 = new Rectangle();
			recEar2.setX(383);
			recEar2.setY(258);
			recEar2.setWidth(4);
			recEar2.setHeight(33);
			recEar2.setFill(Color.web("#F1E6CE"));
//			recEar2.setFill(Color.TRANSPARENT);
//			recEar2.setStroke(Color.web("#F1E6CE"));
			recEar2.setStrokeWidth(2);
			recEar2.setRotate(-17);
			recEar2.setArcHeight(3);
			recEar2.setArcWidth(3);
			
			Rectangle recEar3 = new Rectangle();
			recEar3.setX(370);
			recEar3.setY(281);
			recEar3.setWidth(4);
			recEar3.setHeight(54);
			recEar3.setFill(Color.web("#F1E6CE"));
//			recEar3.setFill(Color.TRANSPARENT);
//			recEar3.setStroke(Color.web("#F1E6CE"));
			recEar3.setStrokeWidth(2);
			recEar3.setRotate(47);
			recEar3.setArcHeight(3);
			recEar3.setArcWidth(3);
			
			Rectangle recEar4 = new Rectangle();
			recEar4.setX(347);
			recEar4.setY(305);
			recEar4.setWidth(4);
			recEar4.setHeight(22);
			recEar4.setFill(Color.web("#F1E6CE"));
//			recEar4.setFill(Color.TRANSPARENT);
//			recEar4.setStroke(Color.web("#F1E6CE"));
			recEar4.setStrokeWidth(2);
			recEar4.setRotate(-23);
			recEar4.setArcHeight(3);
			recEar4.setArcWidth(3);
			
			Rectangle recEar5 = new Rectangle();
			recEar5.setX(361);
			recEar5.setY(263);
			recEar5.setWidth(25);
			recEar5.setHeight(35);
			recEar5.setFill(Color.web("#F1E6CE"));
//			recEar5.setFill(Color.TRANSPARENT);
//			recEar5.setStroke(Color.web("#F1E6CE"));
			recEar5.setStrokeWidth(2);
			recEar5.setRotate(-17);
			recEar5.setArcHeight(3);
			recEar5.setArcWidth(3);
			
			Rectangle recEar6 = new Rectangle();
			recEar6.setX(350);
			recEar6.setY(275);
			recEar6.setWidth(20);
			recEar6.setHeight(40);
			recEar6.setFill(Color.web("#F1E6CE"));
//			recEar6.setFill(Color.TRANSPARENT);
//			recEar6.setStroke(Color.web("#F1E6CE"));
			recEar6.setStrokeWidth(2);
			recEar6.setRotate(20);
			recEar6.setArcHeight(3);
			recEar6.setArcWidth(3);
			
			Rectangle recEar7 = new Rectangle();
			recEar7.setX(353);
			recEar7.setY(284);
			recEar7.setWidth(19);
			recEar7.setHeight(39);
			recEar7.setFill(Color.web("#F1E6CE"));
//			recEar7.setFill(Color.TRANSPARENT);
//			recEar7.setStroke(Color.web("#F1E6CE"));
			recEar7.setStrokeWidth(2);
			recEar7.setRotate(50);
			recEar7.setArcHeight(4);
			recEar7.setArcWidth(4);
			
			
			// beard
			
			Rectangle recBeard = new Rectangle();
			recBeard.setX(215);
			recBeard.setY(318);
			recBeard.setWidth(5);
			recBeard.setHeight(65);
			recBeard.setFill(Color.web("#CC6600"));
//			recBeard.setFill(Color.TRANSPARENT);
//			recBeard.setStroke(Color.web("#CC6600"));
			recBeard.setStrokeWidth(2);
			recBeard.setRotate(-16);
			recBeard.setArcHeight(4);
			recBeard.setArcWidth(4);
			
			Rectangle recBeard1 = new Rectangle();
			recBeard1.setX(225);
			recBeard1.setY(378);
			recBeard1.setWidth(55);
			recBeard1.setHeight(5);
			recBeard1.setFill(Color.web("#CC6600"));
//			recBeard1.setFill(Color.TRANSPARENT);
//			recBeard1.setStroke(Color.web("#CC6600"));
			recBeard1.setStrokeWidth(2);
			recBeard1.setRotate(-2);
			recBeard1.setArcHeight(4);
			recBeard1.setArcWidth(4);
			
			Rectangle recBeard2 = new Rectangle();
			recBeard2.setX(278);
			recBeard2.setY(320);
			recBeard2.setWidth(5);
			recBeard2.setHeight(60);
			recBeard2.setFill(Color.web("#CC6600"));
//			recBeard2.setFill(Color.TRANSPARENT);
//			recBeard2.setStroke(Color.web("#CC6600"));
			recBeard2.setStrokeWidth(2);
			recBeard2.setRotate(3);
			recBeard2.setArcHeight(4);
			recBeard2.setArcWidth(4);
			
			Rectangle recBeard3 = new Rectangle();
			recBeard3.setX(210);
			recBeard3.setY(320);
			recBeard3.setWidth(74);
			recBeard3.setHeight(5);
			recBeard3.setFill(Color.web("#CC6600"));
//			recBeard3.setFill(Color.TRANSPARENT);
//			recBeard3.setStroke(Color.web("#CC6600"));
			recBeard3.setStrokeWidth(2);
			recBeard3.setRotate(1);
			recBeard3.setArcHeight(4);
			recBeard3.setArcWidth(4);
			
			Rectangle recBeard4 = new Rectangle();
			recBeard4.setX(213);
			recBeard4.setY(321);
			recBeard4.setWidth(67);
			recBeard4.setHeight(25);
			recBeard4.setFill(Color.web("#CC6600"));
//			recBeard4.setFill(Color.TRANSPARENT);
//			recBeard4.setStroke(Color.web("#CC6600"));
			recBeard4.setStrokeWidth(2);
			recBeard4.setRotate(-1);
			recBeard4.setArcHeight(4);
			recBeard4.setArcWidth(4);
			
			Rectangle recBeard5 = new Rectangle();
			recBeard5.setX(219);
			recBeard5.setY(344);
			recBeard5.setWidth(60);
			recBeard5.setHeight(20);
			recBeard5.setFill(Color.web("#CC6600"));
//			recBeard5.setFill(Color.TRANSPARENT);
//			recBeard5.setStroke(Color.web("#CC6600"));
			recBeard5.setStrokeWidth(2);
			recBeard5.setRotate(0);
			recBeard5.setArcHeight(4);
			recBeard5.setArcWidth(4);
			
			Rectangle recBeard6 = new Rectangle();
			recBeard6.setX(224);
			recBeard6.setY(360);
			recBeard6.setWidth(56);
			recBeard6.setHeight(21);
			recBeard6.setFill(Color.web("#CC6600"));
//			recBeard6.setFill(Color.TRANSPARENT);
//			recBeard6.setStroke(Color.web("#CC6600"));
			recBeard6.setStrokeWidth(2);
			recBeard6.setRotate(-8);
			recBeard6.setArcHeight(4);
			recBeard6.setArcWidth(4);
			
			// beard corner
			
			Rectangle recBeard7 = new Rectangle();
			recBeard7.setX(280);
			recBeard7.setY(320);
			recBeard7.setWidth(4);
			recBeard7.setHeight(62);
			recBeard7.setFill(Color.web("#FF8C00"));
//			recBeard7.setFill(Color.TRANSPARENT);
//			recBeard7.setStroke(Color.web("#FF8C00"));
			recBeard7.setStrokeWidth(2);
			recBeard7.setRotate(4);
			recBeard7.setArcHeight(4);
			recBeard7.setArcWidth(4);
			
			Rectangle recBeard8 = new Rectangle();
			recBeard8.setX(278);
			recBeard8.setY(305);
			recBeard8.setWidth(65);
			recBeard8.setHeight(4);
			recBeard8.setFill(Color.web("#FF8C00"));
//			recBeard8.setFill(Color.TRANSPARENT);
//			recBeard8.setStroke(Color.web("#FF8C00"));
			recBeard8.setStrokeWidth(2);
			recBeard8.setRotate(-30);
			recBeard8.setArcHeight(4);
			recBeard8.setArcWidth(4);
			
			Rectangle recBeard9 = new Rectangle();
			recBeard9.setX(271);
			recBeard9.setY(352);
			recBeard9.setWidth(91);
			recBeard9.setHeight(4);
			recBeard9.setFill(Color.web("#FF8C00"));
//			recBeard9.setFill(Color.TRANSPARENT);
//			recBeard9.setStroke(Color.web("#FF8C00"));
			recBeard9.setStrokeWidth(2);
			recBeard9.setRotate(-36);
			recBeard9.setArcHeight(4);
			recBeard9.setArcWidth(4);
			
			Rectangle recBeard10 = new Rectangle();
			recBeard10.setX(343);
			recBeard10.setY(288);
			recBeard10.setWidth(4);
			recBeard10.setHeight(44);
			recBeard10.setFill(Color.web("#FF8C00"));
//			recBeard10.setFill(Color.TRANSPARENT);
//			recBeard10.setStroke(Color.web("#FF8C00"));
			recBeard10.setStrokeWidth(2);
			recBeard10.setRotate(-20);
			recBeard10.setArcHeight(4);
			recBeard10.setArcWidth(4);
			
			Rectangle recBeard11 = new Rectangle();
			recBeard11.setX(281);
			recBeard11.setY(320);
			recBeard11.setWidth(10);
			recBeard11.setHeight(57);
			recBeard11.setFill(Color.web("#FF8C00"));
//			recBeard11.setFill(Color.TRANSPARENT);
//			recBeard11.setStroke(Color.web("#FF8C00"));
			recBeard11.setStrokeWidth(2);
			recBeard11.setRotate(4);
			recBeard11.setArcHeight(4);
			recBeard11.setArcWidth(4);
			
			Rectangle recBeard12 = new Rectangle();
			recBeard12.setX(272);
			recBeard12.setY(345);
			recBeard12.setWidth(89);
			recBeard12.setHeight(10);
			recBeard12.setFill(Color.web("#FF8C00"));
//			recBeard12.setFill(Color.TRANSPARENT);
//			recBeard12.setStroke(Color.web("#FF8C00"));
			recBeard12.setStrokeWidth(2);
			recBeard12.setRotate(-36);
			recBeard12.setArcHeight(4);
			recBeard12.setArcWidth(4);
			
			Rectangle recBeard13 = new Rectangle();
			recBeard13.setX(290);
			recBeard13.setY(305);
			recBeard13.setWidth(60);
			recBeard13.setHeight(37);
			recBeard13.setFill(Color.web("#FF8C00"));
//			recBeard13.setFill(Color.TRANSPARENT);
//			recBeard13.setStroke(Color.web("#FF8C00"));
			recBeard13.setStrokeWidth(2);
			recBeard13.setRotate(-27);
			recBeard13.setArcHeight(4);
			recBeard13.setArcWidth(4);
			
			Rectangle recBeard14 = new Rectangle();
			recBeard14.setX(285);
			recBeard14.setY(335);
			recBeard14.setWidth(20);
			recBeard14.setHeight(30);
			recBeard14.setFill(Color.web("#FF8C00"));
//			recBeard14.setFill(Color.TRANSPARENT);
//			recBeard14.setStroke(Color.web("#FF8C00"));
			recBeard14.setStrokeWidth(2);
			recBeard14.setRotate(0);
			recBeard14.setArcHeight(4);
			recBeard14.setArcWidth(4);
			
			// hair  ---------
			
			Rectangle recHair = new Rectangle();
			recHair.setX(318);
			recHair.setY(177);
			recHair.setWidth(42);
			recHair.setHeight(15);
			recHair.setFill(Color.web("#FF8C00"));
//			recHair.setFill(Color.TRANSPARENT);
//			recHair.setStroke(Color.web("#FF8C00"));
			recHair.setStrokeWidth(2);
			recHair.setRotate(-37);
			recHair.setArcHeight(4);
			recHair.setArcWidth(4);
			
			Rectangle recHair1 = new Rectangle();
			recHair1.setX(359);
			recHair1.setY(163);
			recHair1.setWidth(7);
			recHair1.setHeight(44);
			recHair1.setFill(Color.web("#FF8C00"));
//			recHair1.setFill(Color.TRANSPARENT);
//			recHair1.setStroke(Color.web("#FF8C00"));
			recHair1.setStrokeWidth(2);
			recHair1.setRotate(-28);
			recHair1.setArcHeight(4);
			recHair1.setArcWidth(4);
			
			Rectangle recHair2 = new Rectangle();
			recHair2.setX(371);
			recHair2.setY(196);
			recHair2.setWidth(7);
			recHair2.setHeight(65);
			recHair2.setFill(Color.web("#FF8C00"));
//			recHair2.setFill(Color.TRANSPARENT);
//			recHair2.setStroke(Color.web("#FF8C00"));
			recHair2.setStrokeWidth(2);
			recHair2.setRotate(-8);
			recHair2.setArcHeight(4);
			recHair2.setArcWidth(4);
			
			Rectangle recHair3 = new Rectangle();
			recHair3.setX(335);
			recHair3.setY(210);
			recHair3.setWidth(7);
			recHair3.setHeight(82);
			recHair3.setFill(Color.web("#FF8C00"));
//			recHair3.setFill(Color.TRANSPARENT);
//			recHair3.setStroke(Color.web("#FF8C00"));
			recHair3.setStrokeWidth(2);
			recHair3.setRotate(-3);
			recHair3.setArcHeight(4);
			recHair3.setArcWidth(4);
			
			Rectangle recHair4 = new Rectangle();
			recHair4.setX(330);
			recHair4.setY(198);
			recHair4.setWidth(7);
			recHair4.setHeight(20);
			recHair4.setFill(Color.web("#FF8C00"));
//			recHair4.setFill(Color.TRANSPARENT);
//			recHair4.setStroke(Color.web("#FF8C00"));
			recHair4.setStrokeWidth(2);
			recHair4.setRotate(-30);
			recHair4.setArcHeight(4);
			recHair4.setArcWidth(4);
			
			Rectangle recHair5 = new Rectangle();
			recHair5.setX(343);
			recHair5.setY(265);
			recHair5.setWidth(9);
			recHair5.setHeight(40);
			recHair5.setFill(Color.web("#FF8C00"));
//			recHair5.setFill(Color.TRANSPARENT);
//			recHair5.setStroke(Color.web("#FF8C00"));
			recHair5.setStrokeWidth(2);
			recHair5.setRotate(17);
			recHair5.setArcHeight(4);
			recHair5.setArcWidth(4);
			
			Rectangle recHair6 = new Rectangle();
			recHair6.setX(340);
			recHair6.setY(257);
			recHair6.setWidth(9);
			recHair6.setHeight(43);
			recHair6.setFill(Color.web("#FF8C00"));
//			recHair6.setFill(Color.TRANSPARENT);
//			recHair6.setStroke(Color.web("#FF8C00"));
			recHair6.setStrokeWidth(2);
			recHair6.setRotate(17);
			recHair6.setArcHeight(4);
			recHair6.setArcWidth(4);
			
			Rectangle recHair7 = new Rectangle();
			recHair7.setX(341);
			recHair7.setY(258);
			recHair7.setWidth(40);
			recHair7.setHeight(9);
			recHair7.setFill(Color.web("#FF8C00"));
//			recHair7.setFill(Color.TRANSPARENT);
//			recHair7.setStroke(Color.web("#FF8C00"));
			recHair7.setStrokeWidth(2);
			recHair7.setRotate(-20);
			recHair7.setArcHeight(4);
			recHair7.setArcWidth(4);
			
			Rectangle recHair8 = new Rectangle();
			recHair8.setX(339);
			recHair8.setY(203);
			recHair8.setWidth(35);
			recHair8.setHeight(60);
			recHair8.setFill(Color.web("#FF8C00"));
//			recHair8.setFill(Color.TRANSPARENT);
//			recHair8.setStroke(Color.web("#FF8C00"));
			recHair8.setStrokeWidth(2);
			recHair8.setRotate(-7);
			recHair8.setArcHeight(4);
			recHair8.setArcWidth(4);
			
			Rectangle recHair9 = new Rectangle();
			recHair9.setX(335);
			recHair9.setY(185);
			recHair9.setWidth(30);
			recHair9.setHeight(30);
			recHair9.setFill(Color.web("#FF8C00"));
//			recHair9.setFill(Color.TRANSPARENT);
//			recHair9.setStroke(Color.web("#FF8C00"));
			recHair9.setStrokeWidth(2);
			recHair9.setRotate(-30);
			recHair9.setArcHeight(4);
			recHair9.setArcWidth(4);
			
			// hair front
			
			Rectangle recHair10 = new Rectangle();
			recHair10.setX(326);
			recHair10.setY(148);
			recHair10.setWidth(5);
			recHair10.setHeight(69);
			recHair10.setFill(Color.web("#CC6600"));
//			recHair10.setFill(Color.TRANSPARENT);
//			recHair10.setStroke(Color.web("#CC6600"));
			recHair10.setStrokeWidth(2);
			recHair10.setRotate(51);
			recHair10.setArcHeight(4);
			recHair10.setArcWidth(4);
			
			Rectangle recHair11 = new Rectangle();
			recHair11.setX(229);
			recHair11.setY(199);
			recHair11.setWidth(75);
			recHair11.setHeight(5);
			recHair11.setFill(Color.web("#CC6600"));
//			recHair11.setFill(Color.TRANSPARENT);
//			recHair11.setStroke(Color.web("#CC6600"));
			recHair11.setStrokeWidth(2);
			recHair11.setRotate(4);
			recHair11.setArcHeight(4);
			recHair11.setArcWidth(4);
		
			Rectangle recHair12 = new Rectangle();
			recHair12.setX(224);
			recHair12.setY(164);
			recHair12.setWidth(5);
			recHair12.setHeight(36);
			recHair12.setFill(Color.web("#CC6600"));
//			recHair12.setFill(Color.TRANSPARENT);
//			recHair12.setStroke(Color.web("#CC6600"));
			recHair12.setStrokeWidth(2);
			recHair12.setRotate(-20);
			recHair12.setArcHeight(4);
			recHair12.setArcWidth(4);
			
			Rectangle recHair13 = new Rectangle();
			recHair13.setX(213);
			recHair13.setY(143);
			recHair13.setWidth(85);
			recHair13.setHeight(5);
			recHair13.setFill(Color.web("#CC6600"));
//			recHair13.setFill(Color.TRANSPARENT);
//			recHair13.setStroke(Color.web("#CC6600"));
			recHair13.setStrokeWidth(2);
			recHair13.setRotate(-30);
			recHair13.setArcHeight(4);
			recHair13.setArcWidth(4);
			
			Rectangle recHair14 = new Rectangle();
			recHair14.setX(286);
			recHair14.setY(142);
			recHair14.setWidth(75);
			recHair14.setHeight(5);
			recHair14.setFill(Color.web("#CC6600"));
//			recHair14.setFill(Color.TRANSPARENT);
//			recHair14.setStroke(Color.web("#CC6600"));
			recHair14.setStrokeWidth(2);
			recHair14.setRotate(31);
			recHair14.setArcHeight(4);
			recHair14.setArcWidth(4);
			
			Rectangle recHair15 = new Rectangle();
			recHair15.setX(250);
			recHair15.setY(146);
			recHair15.setWidth(57);
			recHair15.setHeight(57);
			recHair15.setFill(Color.web("#CC6600"));
//			recHair15.setFill(Color.TRANSPARENT);
//			recHair15.setStroke(Color.web("#CC6600"));
			recHair15.setStrokeWidth(2);
			recHair15.setRotate(5);
			recHair15.setArcHeight(4);
			recHair15.setArcWidth(4);
			
			Rectangle recHair16 = new Rectangle();
			recHair16.setX(275);
			recHair16.setY(137);
			recHair16.setWidth(55);
			recHair16.setHeight(57);
			recHair16.setFill(Color.web("#CC6600"));
//			recHair16.setFill(Color.TRANSPARENT);
//			recHair16.setStroke(Color.web("#CC6600"));
			recHair16.setStrokeWidth(2);
			recHair16.setRotate(-48);
			recHair16.setArcHeight(4);
			recHair16.setArcWidth(4);
			
			Rectangle recHair17 = new Rectangle();
			recHair17.setX(335);
			recHair17.setY(155);
			recHair17.setWidth(6);
			recHair17.setHeight(30);
			recHair17.setFill(Color.web("#CC6600"));
//			recHair17.setFill(Color.TRANSPARENT);
//			recHair17.setStroke(Color.web("#CC6600"));
			recHair17.setStrokeWidth(2);
			recHair17.setRotate(48);
			recHair17.setArcHeight(4);
			recHair17.setArcWidth(4);
			
			Rectangle recHair18 = new Rectangle();
			recHair18.setX(334);
			recHair18.setY(141);
			recHair18.setWidth(6);
			recHair18.setHeight(33);
			recHair18.setFill(Color.web("#CC6600"));
//			recHair18.setFill(Color.TRANSPARENT);
//			recHair18.setStroke(Color.web("#CC6600"));
			recHair18.setStrokeWidth(2);
			recHair18.setRotate(-55);
			recHair18.setArcHeight(4);
			recHair18.setArcWidth(4);
			
			Rectangle recHair19 = new Rectangle();
			recHair19.setX(263);
			recHair19.setY(132);
			recHair19.setWidth(36);
			recHair19.setHeight(25);
			recHair19.setFill(Color.web("#CC6600"));
//			recHair19.setFill(Color.TRANSPARENT);
//			recHair19.setStroke(Color.web("#CC6600"));
			recHair19.setStrokeWidth(2);
			recHair19.setRotate(-22);
			recHair19.setArcHeight(4);
			recHair19.setArcWidth(4);
			
			Rectangle recHair20 = new Rectangle();
			recHair20.setX(228);
			recHair20.setY(174);
			recHair20.setWidth(25);
			recHair20.setHeight(25);
			recHair20.setFill(Color.web("#CC6600"));
//			recHair20.setFill(Color.TRANSPARENT);
//			recHair20.setStroke(Color.web("#CC6600"));
			recHair20.setStrokeWidth(2);
			recHair20.setRotate(-13);
			recHair20.setArcHeight(4);
			recHair20.setArcWidth(4);
			
			Rectangle recHair21 = new Rectangle();
			recHair21.setX(224);
			recHair21.setY(155);
			recHair21.setWidth(34);
			recHair21.setHeight(25);
			recHair21.setFill(Color.web("#CC6600"));
//			recHair21.setFill(Color.TRANSPARENT);
//			recHair21.setStroke(Color.web("#CC6600"));
			recHair21.setStrokeWidth(2);
			recHair21.setRotate(-20);
			recHair21.setArcHeight(4);
			recHair21.setArcWidth(4);
			
			// hair side 
			
			Rectangle recHair22 = new Rectangle();
			recHair22.setX(212);
			recHair22.setY(195);
			recHair22.setWidth(20);
			recHair22.setHeight(6);
			recHair22.setFill(Color.web("#FF8C00"));
//			recHair22.setFill(Color.TRANSPARENT);
//			recHair22.setStroke(Color.web("#FF8C00"));
			recHair22.setStrokeWidth(2);
			recHair22.setRotate(0);
			recHair22.setArcHeight(4);
			recHair22.setArcWidth(4);
			
			Rectangle recHair23 = new Rectangle();
			recHair23.setX(212);
			recHair23.setY(170);
			recHair23.setWidth(6);
			recHair23.setHeight(32);
			recHair23.setFill(Color.web("#FF8C00"));
//			recHair23.setFill(Color.TRANSPARENT);
//			recHair23.setStroke(Color.web("#FF8C00"));
			recHair23.setStrokeWidth(2);
			recHair23.setRotate(20);
			recHair23.setArcHeight(4);
			recHair23.setArcWidth(4);
			
			Rectangle recHair24 = new Rectangle();
			recHair24.setX(221);
			recHair24.setY(170);
			recHair24.setWidth(6);
			recHair24.setHeight(32);
			recHair24.setFill(Color.web("#FF8C00"));
//			recHair24.setFill(Color.TRANSPARENT);
//			recHair24.setStroke(Color.web("#FF8C00"));
			recHair24.setStrokeWidth(2);
			recHair24.setRotate(-20);
			recHair24.setArcHeight(4);
			recHair24.setArcWidth(4);
			
			Rectangle recHair25 = new Rectangle();
			recHair25.setX(213);
			recHair25.setY(182);
			recHair25.setWidth(14);
			recHair25.setHeight(14);
			recHair25.setFill(Color.web("#FF8C00"));
//			recHair25.setFill(Color.TRANSPARENT);
//			recHair25.setStroke(Color.web("#FF8C00"));
			recHair25.setStrokeWidth(2);
			recHair25.setRotate(-10);
			recHair25.setArcHeight(4);
			recHair25.setArcWidth(4);
			
			// eyebrow
			
			Rectangle recEyebrow = new Rectangle();
			recEyebrow.setX(190);
			recEyebrow.setY(235);
			recEyebrow.setWidth(45);
			recEyebrow.setHeight(12);
			recEyebrow.setFill(Color.web("#CC6600"));
//			recEyebrow.setFill(Color.TRANSPARENT);
//			recEyebrow.setStroke(Color.web("#CC6600"));
			recEyebrow.setStrokeWidth(2);
			recEyebrow.setRotate(-10);

			Rectangle recEyebrow1 = new Rectangle();
			recEyebrow1.setX(260);
			recEyebrow1.setY(235);
			recEyebrow1.setWidth(45);
			recEyebrow1.setHeight(12);
			recEyebrow1.setFill(Color.web("#CC6600"));
//			recEyebrow1.setFill(Color.TRANSPARENT);
//			recEyebrow1.setStroke(Color.web("#CC6600"));
			recEyebrow1.setStrokeWidth(2);
			recEyebrow1.setRotate(10);
			
			// neck
			Rectangle recNeck = new Rectangle();
			recNeck.setX(318);
			recNeck.setY(323);
			recNeck.setWidth(6);
			recNeck.setHeight(110);
			recNeck.setFill(Color.web("#F1E6CE"));
//			recNeck.setFill(Color.TRANSPARENT);
//			recNeck.setStroke(Color.web("#F1E6CE"));
			recNeck.setStrokeWidth(2);
			recNeck.setRotate(10);
			recNeck.setArcHeight(4);
			recNeck.setArcWidth(4);
		
			Rectangle recNeck1 = new Rectangle();
			recNeck1.setX(313);
			recNeck1.setY(426);
			recNeck1.setWidth(45);
			recNeck1.setHeight(6);
			recNeck1.setFill(Color.web("#F1E6CE"));
//			recNeck1.setFill(Color.TRANSPARENT);
//			recNeck1.setStroke(Color.web("#F1E6CE"));
			recNeck1.setStrokeWidth(2);
			recNeck1.setRotate(-2);
			recNeck1.setArcHeight(4);
			recNeck1.setArcWidth(4);
			
			Rectangle recNeck2 = new Rectangle();
			recNeck2.setX(350);
			recNeck2.setY(309);
			recNeck2.setWidth(6);
			recNeck2.setHeight(120);
			recNeck2.setFill(Color.web("#F1E6CE"));
//			recNeck2.setFill(Color.TRANSPARENT);
//			recNeck2.setStroke(Color.web("#F1E6CE"));
			recNeck2.setStrokeWidth(2);
			recNeck2.setRotate(-2);
			recNeck2.setArcHeight(4);
			recNeck2.setArcWidth(4);
			
			Rectangle recNeck3 = new Rectangle();
			recNeck3.setX(321);
			recNeck3.setY(320);
			recNeck3.setWidth(30);
			recNeck3.setHeight(100);
			recNeck3.setFill(Color.web("#F1E6CE"));
//			recNeck3.setFill(Color.TRANSPARENT);
//			recNeck3.setStroke(Color.web("#F1E6CE"));
			recNeck3.setStrokeWidth(2);
			recNeck3.setRotate(4);
			recNeck3.setArcHeight(4);
			recNeck3.setArcWidth(4);
			
			Rectangle recNeck4 = new Rectangle();
			recNeck4.setX(345);
			recNeck4.setY(380);
			recNeck4.setWidth(7);
			recNeck4.setHeight(50);
			recNeck4.setFill(Color.web("#F1E6CE"));
//			recNeck4.setFill(Color.TRANSPARENT);
//			recNeck4.setStroke(Color.web("#F1E6CE"));
			recNeck4.setStrokeWidth(2);
			recNeck4.setRotate(0);
			recNeck4.setArcHeight(4);
			recNeck4.setArcWidth(4);
			
			Rectangle recNeck5 = new Rectangle();
			recNeck5.setX(315);
			recNeck5.setY(400);
			recNeck5.setWidth(30);
			recNeck5.setHeight(30);
			recNeck5.setFill(Color.web("#F1E6CE"));
//			recNeck5.setFill(Color.TRANSPARENT);
//			recNeck5.setStroke(Color.web("#F1E6CE"));
			recNeck5.setStrokeWidth(2);
			recNeck5.setRotate(0);
			recNeck5.setArcHeight(4);
			recNeck5.setArcWidth(4);
			
			// side neck
			Rectangle recNeck6 = new Rectangle();
			recNeck6.setX(295);
			recNeck6.setY(365);
			recNeck6.setWidth(7);
			recNeck6.setHeight(70);
			recNeck6.setFill(Color.web("#D3C096"));
//			recNeck6.setFill(Color.TRANSPARENT);
//			recNeck6.setStroke(Color.web("#D3C096"));
			recNeck6.setStrokeWidth(2);
			recNeck6.setRotate(-25);
			recNeck6.setArcHeight(4);
			recNeck6.setArcWidth(4);
			
			Rectangle recNeck7 = new Rectangle();
			recNeck7.setX(296);
			recNeck7.setY(355);
			recNeck7.setWidth(40);
			recNeck7.setHeight(70);
			recNeck7.setFill(Color.web("#D3C096"));
//			recNeck7.setFill(Color.TRANSPARENT);
//			recNeck7.setStroke(Color.web("#D3C096"));
			recNeck7.setStrokeWidth(2);
			recNeck7.setRotate(-20);
			recNeck7.setArcHeight(4);
			recNeck7.setArcWidth(4);
			
		
			
			// inner clothe
			
			Rectangle recIC = new Rectangle();
			recIC.setX(315);
			recIC.setY(425);
			recIC.setWidth(7);
			recIC.setHeight(65);
			recIC.setFill(Color.web("#6495ED"));
//			recIC.setFill(Color.TRANSPARENT);
//			recIC.setStroke(Color.web("#6495ED"));
			recIC.setStrokeWidth(2);
			recIC.setRotate(-14);
			recIC.setArcHeight(4);
			recIC.setArcWidth(4);
			
			Rectangle recIC1 = new Rectangle();
			recIC1.setX(350);
			recIC1.setY(420);
			recIC1.setWidth(7);
			recIC1.setHeight(65);
			recIC1.setFill(Color.web("#6495ED"));
//			recIC1.setFill(Color.TRANSPARENT);
//			recIC1.setStroke(Color.web("#6495ED"));
			recIC1.setStrokeWidth(2);
			recIC1.setRotate(2);
			recIC1.setArcHeight(4);
			recIC1.setArcWidth(4);
			
			Rectangle recIC2 = new Rectangle();
			recIC2.setX(322);
			recIC2.setY(480);
			recIC2.setWidth(33);
			recIC2.setHeight(7);
			recIC2.setFill(Color.web("#6495ED"));
//			recIC2.setFill(Color.TRANSPARENT);
//			recIC2.setStroke(Color.web("#6495ED"));
			recIC2.setStrokeWidth(2);
			recIC2.setRotate(-7);
			recIC2.setArcHeight(4);
			recIC2.setArcWidth(4);
			
			Rectangle recIC3 = new Rectangle();
			recIC3.setX(315);
			recIC3.setY(420);
			recIC3.setWidth(30);
			recIC3.setHeight(65);
			recIC3.setFill(Color.web("#6495ED"));
//			recIC3.setFill(Color.TRANSPARENT);
//			recIC3.setStroke(Color.web("#6495ED"));
			recIC3.setStrokeWidth(2);
			recIC3.setRotate(-15);
			recIC3.setArcHeight(4);
			recIC3.setArcWidth(4);
			
			Rectangle recIC4 = new Rectangle();
			recIC4.setX(340);
			recIC4.setY(420);
			recIC4.setWidth(15);
			recIC4.setHeight(65);
			recIC4.setFill(Color.web("#6495ED"));
//			recIC4.setFill(Color.TRANSPARENT);
//			recIC4.setStroke(Color.web("#6495ED"));
			recIC4.setStrokeWidth(2);
			recIC4.setRotate(0);
			recIC4.setArcHeight(4);
			recIC4.setArcWidth(4);
			
			// Collar
			Rectangle recCollar = new Rectangle();
			recCollar.setX(316);
			recCollar.setY(477);
			recCollar.setWidth(7);
			recCollar.setHeight(40);
			recCollar.setFill(Color.web("#66B2FF"));
//			recCollar.setFill(Color.TRANSPARENT);
//			recCollar.setStroke(Color.web("#66B2FF"));
			recCollar.setStrokeWidth(2);
			recCollar.setRotate(37);
			recCollar.setArcHeight(4);
			recCollar.setArcWidth(4);
			
			Rectangle recCollar1 = new Rectangle();
			recCollar1.setX(322);
			recCollar1.setY(501);
			recCollar1.setWidth(7);
			recCollar1.setHeight(60);
			recCollar1.setFill(Color.web("#66B2FF"));
//			recCollar1.setFill(Color.TRANSPARENT);
//			recCollar1.setStroke(Color.web("#66B2FF"));
			recCollar1.setStrokeWidth(2);
			recCollar1.setRotate(-39);
			recCollar1.setArcHeight(4);
			recCollar1.setArcWidth(4);
			
			Rectangle recCollar2 = new Rectangle();
			recCollar2.setX(374);
			recCollar2.setY(413);
			recCollar2.setWidth(7);
			recCollar2.setHeight(151);
			recCollar2.setFill(Color.web("#66B2FF"));
//			recCollar2.setFill(Color.TRANSPARENT);
//			recCollar2.setStroke(Color.web("#66B2FF"));
			recCollar2.setStrokeWidth(2);
			recCollar2.setRotate(28);
			recCollar2.setArcHeight(4);
			recCollar2.setArcWidth(4);
			
			Rectangle recCollar3 = new Rectangle();
			recCollar3.setX(378);
			recCollar3.setY(337);
			recCollar3.setWidth(7);
			recCollar3.setHeight(100);
			recCollar3.setFill(Color.web("#66B2FF"));
//			recCollar3.setFill(Color.TRANSPARENT);
//			recCollar3.setStroke(Color.web("#66B2FF"));
			recCollar3.setStrokeWidth(2);
			recCollar3.setRotate(-40);
			recCollar3.setArcHeight(4);
			recCollar3.setArcWidth(4);
			
			Rectangle recCollar4 = new Rectangle();
			recCollar4.setX(340);
			recCollar4.setY(403);
			recCollar4.setWidth(45);
			recCollar4.setHeight(130);
			recCollar4.setFill(Color.web("#66B2FF"));
//			recCollar4.setFill(Color.TRANSPARENT);
//			recCollar4.setStroke(Color.web("#66B2FF"));
			recCollar4.setStrokeWidth(2);
			recCollar4.setRotate(32);
			recCollar4.setArcHeight(4);
			recCollar4.setArcWidth(4);
			
			Rectangle recCollar5 = new Rectangle();
			recCollar5.setX(318);
			recCollar5.setY(495);
			recCollar5.setWidth(45);
			recCollar5.setHeight(40);
			recCollar5.setFill(Color.web("#66B2FF"));
//			recCollar5.setFill(Color.TRANSPARENT);
//			recCollar5.setStroke(Color.web("#66B2FF"));
			recCollar5.setStrokeWidth(2);
			recCollar5.setRotate(-50);
			recCollar5.setArcHeight(4);
			recCollar5.setArcWidth(4);
			
			Rectangle recCollar6 = new Rectangle();
			recCollar6.setX(335);
			recCollar6.setY(531);
			recCollar6.setWidth(15);
			recCollar6.setHeight(15);
			recCollar6.setFill(Color.web("#66B2FF"));
//			recCollar6.setFill(Color.TRANSPARENT);
//			recCollar6.setStroke(Color.web("#66B2FF"));
			recCollar6.setStrokeWidth(2);
			recCollar6.setRotate(-50);
			recCollar6.setArcHeight(4);
			recCollar6.setArcWidth(4);
			
			Rectangle recCollar7 = new Rectangle();
			recCollar7.setX(325);
			recCollar7.setY(363);
			recCollar7.setWidth(60);
			recCollar7.setHeight(80);
			recCollar7.setFill(Color.web("#66B2FF"));
//			recCollar7.setFill(Color.TRANSPARENT);
//			recCollar7.setStroke(Color.web("#66B2FF"));
			recCollar7.setStrokeWidth(2);
			recCollar7.setRotate(-45);
			recCollar7.setArcHeight(4);
			recCollar7.setArcWidth(4);
			
			root.getChildren().add(imageView);
			
			// collar
			root.getChildren().add(recCollar);
			root.getChildren().add(recCollar1);
			root.getChildren().add(recCollar2);
			root.getChildren().add(recCollar3);
			root.getChildren().add(recCollar4);
			root.getChildren().add(recCollar5);
			root.getChildren().add(recCollar6);
			root.getChildren().add(recCollar7);

			
			// inner clothe
			root.getChildren().add(recIC);
			root.getChildren().add(recIC1);
			root.getChildren().add(recIC2);
			root.getChildren().add(recIC3);
			root.getChildren().add(recIC4);


			// side neck
			root.getChildren().add(recNeck6);
			root.getChildren().add(recNeck7);
	
			// neck
			root.getChildren().add(recNeck);
			root.getChildren().add(recNeck1);
			root.getChildren().add(recNeck2);
			root.getChildren().add(recNeck3);
			root.getChildren().add(recNeck4);
			root.getChildren().add(recNeck5);

			
			//ear
			
			root.getChildren().add(recEar7);
			root.getChildren().add(recEar6);
			root.getChildren().add(recEar5);
			root.getChildren().add(recEar4);
			root.getChildren().add(recEar3);
			root.getChildren().add(recEar2);
			root.getChildren().add(recEar1);
			root.getChildren().add(recEar);
			
			
			//face corner
			root.getChildren().add(recFace14);
			root.getChildren().add(recFace13);
			root.getChildren().add(recFace12);
			root.getChildren().add(recFace11);
			root.getChildren().add(recFace10);
			root.getChildren().add(recFace9);
			
			
			// face down 
			root.getChildren().add(recFace8);
			root.getChildren().add(recFace7);
			root.getChildren().add(recFace6);
			root.getChildren().add(recFace5);
			
			// face front
			root.getChildren().add(recFace4);
			root.getChildren().add(recFace3);
			root.getChildren().add(recFace2);
			root.getChildren().add(recFace1);
			root.getChildren().add(recFace);
			
			//beard
			root.getChildren().add(recBeard6);
			root.getChildren().add(recBeard5);
			root.getChildren().add(recBeard4);
			root.getChildren().add(recBeard3);
			root.getChildren().add(recBeard);
			root.getChildren().add(recBeard1);
			root.getChildren().add(recBeard2);
			
			// beard corner
			root.getChildren().add(recBeard7);
			root.getChildren().add(recBeard8);
			root.getChildren().add(recBeard9);
			root.getChildren().add(recBeard10);
			root.getChildren().add(recBeard11);
			root.getChildren().add(recBeard12);
			root.getChildren().add(recBeard13);
			root.getChildren().add(recBeard14);

			// hair 
			
			root.getChildren().add(recHair9);
			root.getChildren().add(recHair8);
			root.getChildren().add(recHair7);
			root.getChildren().add(recHair6);
			root.getChildren().add(recHair5);
			root.getChildren().add(recHair4);
			root.getChildren().add(recHair3);
			root.getChildren().add(recHair2);
			root.getChildren().add(recHair1);
			root.getChildren().add(recHair);
			
			// hair front
			
			root.getChildren().add(recHair10);
			root.getChildren().add(recHair11);
			root.getChildren().add(recHair12);
			root.getChildren().add(recHair13);
			root.getChildren().add(recHair14);
			root.getChildren().add(recHair15);
			root.getChildren().add(recHair16);
			root.getChildren().add(recHair17);
			root.getChildren().add(recHair18);
			root.getChildren().add(recHair19);
			root.getChildren().add(recHair20);
			root.getChildren().add(recHair21);

			// hair side
			root.getChildren().add(recHair22);
			root.getChildren().add(recHair23);
			root.getChildren().add(recHair24);
			root.getChildren().add(recHair25);

			// eyebrow
			root.getChildren().add(recEyebrow);
			root.getChildren().add(recEyebrow1);

	
			
			
			
			

			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
