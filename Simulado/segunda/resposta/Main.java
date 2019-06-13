//import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class Main{
	public static void main(String[] args){
		Frame janela = new Frame("Teste de evento!");

		janela.setLayout(new FlowLayout());
		
		Button botao = new Button("Clique Aqui!");
		TratadorEventoBotao tratador = new TratadorEventoBotao(botao);

		botao.addActionListener(tratador);

		janela.add(botao);

		janela.pack();
		janela.setVisible(true);
		janela.show();
	
	}

}