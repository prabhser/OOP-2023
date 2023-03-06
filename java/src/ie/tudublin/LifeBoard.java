package ie.tudublin;

import processing.core.PApplet;

public class LifeBoard {

    boolean[][] board;
    private int size;
    PApplet p;
    float cellWidth;

    public boolean getCell(int r, int c){
        if (r>=0 && r < size && c>= 0 && c < size)
            return board[r][c];
        else
            return false;
    }

    public int countCells(int r, int c){
        int count = 0;
        for (int i = -1; i < 1; i++) {
            for (int j = -1; j < 1; j++) {
                if (!(i == 0 )&& (j == 0)){
                    if (getCell(i, j)){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public void applyRules(){
        int count = 0;
        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                count = countCells(r, c);
                if (board[r][c] == true){ // if cell is alive
                    if (count == 2 || count == 3) // has 2 or 3 neighbours
                        board[r][c] = true; // stays alive
                    else
                        board[r][c] = false; // dies
                }

                else{ // cell is dead
                    if (count == 3) // has 3 neighbours
                        board[r][c] = true; // revives
                }
            }
        }
    }

    public LifeBoard(int size, PApplet p){
        this.size = size;
        board = new boolean[size][size];
        this.p = p;
        cellWidth = p.width / (float) size;
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
                float x = c * cellWidth;
                float y = r * cellWidth;
                if (board[r][c] == true)
                    p.fill(0, 255, 0);
                else
                    p.noFill();

                p.rect(x, y, cellWidth, cellWidth);
                    //p.square(c*size, r*size, 1);;
            }
        }
    }

    // public getSize(){  
    //     return size;
    // }

    // public setSize(int size){

    // }

}
