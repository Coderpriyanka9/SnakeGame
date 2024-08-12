/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakegame1;
import javax.swing.*;
/**
 *
 * @author PRIYANKA
 */
public class SnakeGame1 extends JFrame  {
    SnakeGame1(){
        super("Snake Game");
        Board board=new Board();
        add(board);
        pack();
       setLocationRelativeTo(null);
       setResizable(true); 
    }
  
    public static void main(String[] args) {
        new SnakeGame1().setVisible(true);
    }
    
}
