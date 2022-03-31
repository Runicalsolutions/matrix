/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrix;


import javax.swing.JFrame;

/**
 *
 * @author derek
 */
public class MatrixUi extends JFrame{
    private int an= 800,al= 600;
    private String name= "Matrix Cortex";
    private boolean visible= true ;

    public MatrixUi(){
        setLocationRelativeTo(null);
        setVisible(visible);
        setSize(an,al);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(name);
        initComponents();
    }

    public MatrixUi(int an, int al, boolean visible){
        this.an = an;
        this.al = al;
        this.visible = visible;
        setVisible(visible);
        setLocationRelativeTo(null);
        setSize(an,al);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(name);
        
    }
    private void initComponents()
    {
        
        
        
        getContentPane().setBackground(new java.awt.Color( 145, 15, 82 ));
        getContentPane().setLayout(null);
    }
    
    
    
    
}
