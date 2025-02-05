# Monkey-Tree

This project is supposed to essentially be a different version of flappy bird. When you start the program you see rounded rectangles and a monkey. The monkey slowily starts to fall but as you get farther through the trees his falling speed increases. Once you get through all of the trees the program comes up with a restart button and will recreate the game at it's original starting point.

## Motivation
I built the this specific program because I wanted to make some kind of game for my final project. And what better game to recreate than one that was really popular when I was growing up. I also wanted to build this project because I knew that it would be challenging for me. I loved this game when I was in middle school and I really enjoyed getting to program something just like it! 

## How to Run/Play Program
This program only runs through one file name "Tree". When you run it through eclipse you have to go to "Run Configurations", then you click on "Java Application". Once you hit this point you need to make sure "Tree" is selected in the project tab. Then you need to put "Tree" in the main method section and it should run just fine! Once you have the program up and running you will click the primary mouse button to get the monkey to move.
https://github.com/katiejean02/Monkey-Tree.wiki.git

## Code Example
I am really proud of this specific portion because of how hard it was for me to figure out. I was trying do many differents approaches to getan image of a monkey onto the pane and being able to moe it. I was able to do it using a stackpane and moving that instead of just the image.

```
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
```
