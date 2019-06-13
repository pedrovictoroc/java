import java.awt.*;
import java.awt.event.*;

public class Main{
    public static void main(String[] args){
        Frame janela = new Frame("Teste");
        janela.setLayout(new FlowLayout());

        Button botao = new Button("Ativar evento");

        Evento evento = new Evento(botao);

        botao.addActionListener(evento);

        janela.add(botao);

        janela.pack();
        janela.setVisible(true);
    }
}