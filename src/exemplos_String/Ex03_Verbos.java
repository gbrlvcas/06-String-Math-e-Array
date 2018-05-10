package exemplos_String;

public class Ex03_Verbos {

	public static void main(String[] args) {
		
		//Palavra
		String palavra = "andar";
		
		//Quantidade de letras
		int qtd = palavra.length();
		
		//Exibir as primeiras letras
		System.out.println(palavra.substring(0, qtd-2));
		
		//Exibir as últimas letras
		System.out.println(palavra.substring(qtd-2));

	}

}
