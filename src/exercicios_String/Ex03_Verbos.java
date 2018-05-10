package exercicios_String;

import javax.swing.JOptionPane;

public class Ex03_Verbos {
	public static void main(String[] args){
		
		//Variaveis
		
		String texto;
		String ar = "ar";
		String newTexto = "";
		String conjugacao;
		boolean erroTexto = false;
		
		
		//Solicitando uma palavra ao cliente
		do{
			erroTexto = false;
			
		texto = JOptionPane.showInputDialog("Digite uma palavra");
		
			for(int analisa = 0 ; analisa < texto.length() ; analisa++){
				if(texto.indexOf(" ") != -1){
					JOptionPane.showMessageDialog(null, "Digite apenas uma palavra");
					erroTexto = true;
					break;
			}
			}
				
				
		
			
		if(erroTexto == false){	
			if(texto.endsWith(ar)){
				for(int analisa = 0 ; analisa < texto.length() - 2 ; analisa++){
					newTexto += String.valueOf(texto.charAt(analisa));
				}
			}else{
				JOptionPane.showMessageDialog(null, "Digite um verbo que termine com -AR");
				erroTexto = true;
			}
		}
		
		}while(erroTexto == true);
		
		//Mostrando a conjugação para o cliente
		
		conjugacao ="**** Conjugando o verbo ****\n\n";
		conjugacao+="Eu "+newTexto+"o\n";
		conjugacao+="Tu "+newTexto+"as\n";
		conjugacao+="Ele "+newTexto+"a\n";
		conjugacao+="Nós "+newTexto+"amos\n";
		conjugacao+="Vós "+newTexto+"ais\n";
		conjugacao+="Eles "+newTexto+"am\n";
		
		JOptionPane.showMessageDialog(null, conjugacao);
		
	}
}
