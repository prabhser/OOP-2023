package ie.tudublin;

import processing.core.PApplet;

public class LifeBoard {

    boolean[][] board;
    private int size;
    PApplet p;

    public LifeBoard(int size, PApplet p){
        this.size = size;
        this.p = p;
        board = new boolean[size][size];
        float cellWidth;
    }

    public void randomise(){
        for (int r = 0; r < size; r++) {
            for (int c = 0; c < board.length; c++) { // randomises board so that some cells dead, alive
                float dice = p.random(0, 1);
                board[r][c] = (dice <= 0.5f);
            }
        }
    }

    public void render(){
        for (int r = 0; r < size; r++) {
            for (int c = 0; c < board.length; c++) { // randomises board so that some cells dead, alive
                cellWidth = p.
                float x = c * cellWidth;
                float y = r * cellWidth;
                if (board[r][c] == true)
                    p.fill(0, 255, 0);
                else
                    p.noFill();

                    //p.square(c*size, r*size, 1);;
            }
        }
    }

    public getSize(){  
        return size;
    }

    public setSize(int size){

    }

}
