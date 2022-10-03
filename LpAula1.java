/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import javax.swing.JFrame;
import javax.swing.JLabel;
//Para importar tudo de vez se coloca uma "*" depois do segundo ponto.

/**
 *
 * @author ALUNO
 */
public class LpAula1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Criando uma janela (JFreme).
        JFrame f = new JFrame();
        
        //Define a altura e a largura da janela (em pixels).
        f.setSize(400,600);
        
        //Define o título da janela.
        f.setTitle("Sistema IFBA");
        
        //Criando um rótulo
        JLabel l1 = new JLabel("Rótulo 01.");
        
        //Define o posicionamento do rótulo na janela e define a sua largura 
        // e altura.
        l1.setBounds(200,50,100,50);
        
        //Adiciona o rótulo (label) à janela (JFrame).
        f.add(l1);
        
        //Define o posicionamento absoluto.
        f.setLayout(null);
        
        f.setVisible(true); //tornando o quadro visível.
        
    }
    
}
