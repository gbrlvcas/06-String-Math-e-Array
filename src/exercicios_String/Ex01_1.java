package exercicios_String;

import javax.swing.JOptionPane;

public class Ex01_1 {

	public static void main(String[] args) {
		
		//Variaveis
		String texto;
		
		
		//Solicitando ao cliente para digitar uma palavra ou texto
		
		texto = JOptionPane.showInputDialog("Digite uma palavra ou texto");
		
		String textoEdit = "";
		
		//Editando o texto
		
		for(int analisa = 0 ; analisa < texto.length() ; analisa++){
			
			if(analisa % 2 == 0){
				textoEdit += String.valueOf(texto.charAt(analisa)).toLowerCase();
			}else{
				textoEdit += String.valueOf(texto.charAt(analisa)).toUpperCase();
			}
		}

			JOptionPane.showMessageDialog(null, textoEdit);
	}

}
