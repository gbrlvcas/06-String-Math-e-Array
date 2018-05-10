package exercicios_String;

import javax.swing.JOptionPane;

public class Ex02_Vogais {

	public static void main(String[] args){
		
		//Variaveis
		
		String texto;
		int vogais = 0;
		
		
		//Solicitando para o cliente digitar uma Palavra ou Texto;
		
		texto = JOptionPane.showInputDialog("Digite uma palavra ou um texto");
		
		
		//Analisando as vogais
		
		for(int analisa = 0; analisa < texto.length(); analisa++){
			switch(texto.charAt(analisa)){
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				vogais++;
			break;
				
			}
		}
		
		//Mostrando o resultado
		
		JOptionPane.showMessageDialog(null, "O que foi digitado possui: "+vogais+" vogais");
	}
}
