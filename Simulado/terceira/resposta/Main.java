import java.io.*;

public class Main{
	public static void main(String[] args){
		try{
			abrirArquivo();
		} catch (ArquivoNaoExiste e){
			System.out.println(e.getMessage());
		}

	}


	public static void abrirArquivo() throws ArquivoNaoExiste{
		File in = new File("./entrasdasdada.txt");
		if(!in.exists())
			throw new ArquivoNaoExiste("O arquivo não existe!");
		else
			System.out.println("O arquivo existe!");
	}

}