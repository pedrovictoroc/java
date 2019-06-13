import java.awt.*;
import java.awt.event.*;

public class EventoBotao implements ActionListener{
    private Button botao;

    EventoBotao(Button botao){
        this.botao = botao;
    }

    public void actionPerformed(ActionEvent e){
        Arquivo arquivo = new Arquivo("entrada.txt");
        try{
            arquivo.copiarArquivo();
        }catch(ArquivoNaoExiste event){
            System.out.println(event.getMessage());
        }
    }
}