package exercicios_Math;

import javax.swing.JOptionPane;

public class Ex01_Calculadora {

	public static void main(String[] args) {
		
		
		
		//Variaveis
		String operacao = "**** Escolha uma opera��o ****\n\n";
			operacao+="1)Soma\n";
			operacao+="2)Subtra��o\n";
			operacao+="3)Multiplica��o\n";
			operacao+="4)Divis�o\n";
			operacao+="5)Seno\n";
			operacao+="6)Cosseno\n";
			operacao+="7)Tangente\n";
			operacao+="8)Log\n";
			operacao+="9)Raiz Quadrada\n";
			operacao+="10)Raiz Cubica\n";
		int escolhaOperacao;
		
		int num1 = 0, num2 = 0;
		String resultado = "";
		boolean sairCalculadora = false;
				
		//Escolhendo a operacao
		do{
			
			escolhaOperacao = Integer.parseInt(JOptionPane.showInputDialog(operacao));
			switch(escolhaOperacao){
			case 1:
			case 2:
			case 3:
			case 4:
				num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero"));
				num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero"));
			break;
			
			default:
				num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero"));
			break;
			
			
			}
			
			//Calculando
			
			switch(escolhaOperacao){
			case 1: 
				resultado = num1+" + "+num2+" = "+(num1 + num2);
			break;
			case 2:
				resultado = num1+" - "+num2+" = "+(num1 - num2);
			break;
			case 3:
				resultado = num1+" * "+num2+" = "+(num1 * num2);
			break;
			case 4:
				resultado = num1+" / "+num2+" = "+(num1 / num2);
			break;
			case 5:
				resultado = "O seno do valor digitado �: "+String.valueOf(String.format("%.2f",(Math.sin(num1))));
			break;
			case 6:
				resultado = "O cosseno do valor digitado �: "+String.valueOf(String.format("%.2f",(Math.cos(num1))));
			break;
			case 7:
				resultado = "A tangente do valor digitado �: "+String.valueOf(String.format("%.2f",Math.tan(num1)));
			break;
			case 8:
				
				resultado = "O logo do valor digitado �: "+String.valueOf(String.format("%.2f",(Math.log(num1))));
			break;
			case 9:
				resultado = "A raiz quadrado do valor digitado �: "+String.valueOf(String.format("%.0f",(Math.sqrt(num1))));
			break;
			case 10:
				resultado = "A raiz cubica do valor digitado �: "+String.valueOf(String.format("%.0f",(Math.cbrt(num1))));
			break;
			
			}
			
			JOptionPane.showMessageDialog(null, resultado);
			
			
			
		}while(sairCalculadora == true);

	}

}
