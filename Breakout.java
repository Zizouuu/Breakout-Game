/*
* File: Breakout.java
* ——————-
* Name:
* Section Leader:
*
* This file will eventually implement the game of Breakout.
*/

import acm.graphics.*;
import acm.program.*;
import acm.util.*;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Breakout extends GraphicsProgram {

/** Width and height of application window in pixels. On some platforms
* these may NOT actually be the dimensions of the graphics canvas. */
public static final int APPLICATION_WIDTH = 400;
public static final int APPLICATION_HEIGHT = 600;

/** Dimensions of game board. On some platforms these may NOT actually
* be the dimensions of the graphics canvas. */
private static final int WIDTH = APPLICATION_WIDTH;
private static final int HEIGHT = APPLICATION_HEIGHT;

/** Dimensions of the paddle */
private static final int PADDLE_WIDTH = 60;
private static final int PADDLE_HEIGHT = 10;

/** Offset of the paddle up from the bottom */
private static final int PADDLE_Y_OFFSET = 30;

/** Number of bricks per row */
private static final int NBRICKS_PER_ROW = 10;

/** Number of rows of bricks */
private static final int NBRICK_ROWS = 10;

/** Separation between bricks */
private static final int BRICK_SEP = 4;

/** Width of a brick */
private static final int BRICK_WIDTH =
(WIDTH – (NBRICKS_PER_ROW – 1) * BRICK_SEP) / NBRICKS_PER_ROW;

/** Height of a brick */
private static final int BRICK_HEIGHT = 8;


REPORT THIS AD

/** Radius of the ball in pixels */
private static final int BALL_RADIUS = 10;

/** Offset of the top brick row from the top */
private static final int BRICK_Y_OFFSET = 70;

/** Number of turns */
private static final int NTURNS = 3;

/* Method: run() */
/** Runs the Breakout program. */
public void run() {

setupGame();

playGame();

}

private void setupGame(){

buildBricks();
}

private void playGame(){

}

private void buildBricks(){

for(int row = 0; row <NBRICK_ROWS; row++ ){

for( int col = 0; col < NBRICKS_PER_ROW; col++){

GRect brick = new GRect((BRICK_WIDTH +BRICK_SEP)* col,
BRICK_Y_OFFSET + (BRICK_HEIGHT + BRICK_SEP) *row
,BRICK_WIDTH,BRICK_HEIGHT);
brick.setFilled(true);

switch(row){
case 0: brick.setColor(Color.RED); break;
case 1: brick.setColor(Color.RED); break;
case 2: brick.setColor(Color.ORANGE); break;
case 3: brick.setColor(Color.ORANGE); break;
case 4: brick.setColor(Color.YELLOW); break;
case 5: brick.setColor(Color.YELLOW); break;
case 6: brick.setColor(Color.GREEN); break;
case 7: brick.setColor(Color.GREEN); break;
case 8: brick.setColor(Color.CYAN); break;
case 9: brick.setColor(Color.CYAN); break;
default: break;
}


REPORT THIS AD

add(brick);
}
}
}

}