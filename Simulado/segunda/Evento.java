import java.awt.*;
import java.awt.event.*;

public class Evento implements ActionListener{
    private Button botao;

    Evento(Button botao){
        this.botao = botao;
    }

    public void actionPerformed(ActionEvent e){
        System.out.println("Deu certo!!!");
    }

}