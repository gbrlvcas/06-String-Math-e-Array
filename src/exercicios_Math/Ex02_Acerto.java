package exercicios_Math;

import java.util.Random;

import javax.swing.JOptionPane;

public class Ex02_Acerto {

	public static void main(String[] args) {
		
		//Variaveis
		Random gerador = new Random();
		int numEscolhido;
		int jogo;
		int numJogo;
		int palpites = 0;
		int continuarPalpite;
		boolean repetirPalpite = false;
		boolean erroPalpite = false;
		
		
		do {
				repetirPalpite = false;
			
		//Gerando um número randomico
		numEscolhido = gerador.nextInt(2);
		
		do {
				erroPalpite = false;
		
		//Começando o jogo
		jogo = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero de 1 a 100 e tente sua sorte\nVocê tentou: "+palpites+" vezes"));
			if(jogo > numEscolhido){
			numJogo = (jogo - numEscolhido);
			}else{
				numJogo = (numEscolhido - jogo);	
			}
			if(numJogo == 0) {
				JOptionPane.showMessageDialog(null, "Parabens você acertou!");
					erroPalpite = false;
					
						if(palpites == 0) {
							JOptionPane.showMessageDialog(null, "Nossa! acertou na mosca");
						}else if(palpites <= 5) {
							JOptionPane.showMessageDialog(null, "Parabéns! Você é bom de adivinhação");
						}else if(palpites <= 10) {
							JOptionPane.showMessageDialog(null, "Muito bom. Continue assim");
						}else if(palpites <= 20) {
							JOptionPane.showMessageDialog(null, "Mm... Podia ser melhor. Continue tentando");
						}else if(palpites > 20) {
							JOptionPane.showMessageDialog(null, "Meio lerdo você, hein");
						}
				
				
			}else if(numJogo <= 10) {
				JOptionPane.showMessageDialog(null, "Você está perto!");
				palpites++;
				erroPalpite = true;
				
			}else if(numJogo <= 20) {
				JOptionPane.showMessageDialog(null, "Você esta longe!!");
				palpites++;
				erroPalpite = true;
				
			}else if(numJogo > 20) {
				JOptionPane.showMessageDialog(null, "Ihhhh! Muito longe");
				palpites++;
				erroPalpite = true;
			}
		}while(erroPalpite == true);
			
			//Perguntando se o cliente quer jogar denovo
			continuarPalpite = JOptionPane.showConfirmDialog(null, "Você deseja jogar novamente?","",0);
				if(continuarPalpite == 0) {
					palpites = 0;
					repetirPalpite = true;
				}
			
		}while(repetirPalpite == true);
			
	}

}
