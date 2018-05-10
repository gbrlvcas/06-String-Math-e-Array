package exercicios_String;

import javax.swing.JOptionPane;

public class Ex01 {

	public static void main(String[] args) {
		
		//Variaveis
		
		String texto;
		int contador = 0;
		String letraMai="", letraMin="";
		String concatenado="";
		
		
		//Solicitando o cliente digitar um texto
		
		texto = JOptionPane.showInputDialog("Digite uma palavra ou texto");
		
		
		
		//Transformando texto
		
		do{
			
			letraMin = String.valueOf(texto.charAt(contador)).toLowerCase();
			contador++;
			
			letraMai = String.valueOf(texto.charAt(contador)).toUpperCase();
			contador++;
			
			concatenado += letraMin + letraMai;
			
		}while(contador < texto.length());

		JOptionPane.showMessageDialog(null, concatenado);
		
	}

}
