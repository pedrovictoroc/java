import java.awt.*;
import java.awt.event.*;

public class TratadorEventoBotao implements ActionListener {

	private Button botao;

	public TratadorEventoBotao(Button botao){
		this.botao = botao;
	}

	public void actionPerformed(ActionEvent e){
		System.out.println("O botão foi clicado!");
	}

}