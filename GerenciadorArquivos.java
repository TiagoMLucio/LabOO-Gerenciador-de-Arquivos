import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class GerenciadorArquivos {
	private String nomeArquivoInput;
	private String nomeArquivoOutput;
	
	public GerenciadorArquivos(String nomeArquivoInput, String nomeArquivoOutput) {
		this.nomeArquivoInput = nomeArquivoInput;
		this.nomeArquivoOutput = nomeArquivoOutput;
	}

	private void passaTexto(Reader leitor, Writer escritor) {
		BufferedReader leitorLinha = new BufferedReader(leitor);
        String linha;
        
		try (leitor; escritor;) {
			while ((linha = leitorLinha.readLine()) != null) {
			    escritor.write(linha+"\n");
			}
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		
		GerenciadorArquivos arquivos = new GerenciadorArquivos(args[0],args[1]);
		
		try {
			FileReader leitorFluxoEntradas = new FileReader(arquivos.nomeArquivoInput);
			FileWriter escritorFluxoSaidas = new FileWriter(arquivos.nomeArquivoOutput, true);
			
			arquivos.passaTexto(leitorFluxoEntradas, escritorFluxoSaidas);
			
		} catch (FileNotFoundException e) {
			System.out.println("Erro: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	
	}

}
