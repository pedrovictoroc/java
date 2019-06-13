import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class Main{
    public static void main(String[] args){
        Frame janela = new Frame("Desafio!");

        Button botao = new Button("Aperte para copiar!");
        EventoBotao evento = new EventoBotao(botao);
        botao.addActionListener(evento);
        
        janela.add(botao);

        janela.pack();
        janela.setVisible(true);
    }
}