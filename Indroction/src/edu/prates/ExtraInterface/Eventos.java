package edu.prates.ExtraInterface;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Eventos extends JFrame implements ActionListener {
           
    public Eventos(){
        super("Meus Eventos");

        JButton botao = new JButton("Clique");
        botao.addActionListener(this);

        getContentPane().add(botao);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);
    }

    public static void main (String[] args){
        new Eventos();
    }

    public void actionPerformed(ActionEvent e){
         System.out.println("Você clicou!");
    }
}
