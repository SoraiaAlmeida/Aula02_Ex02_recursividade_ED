package Controller;

public class Controller {
	
	public Controller() {
		super();
	}

	public String converterBinario(int n) {
		
		if (n == 0) {
			return "";
			// A condi��o de parada vai ser quando o 
			
	}
		else {
			int resto = n % 2;
			n = n / 2;
			
			return converterBinario(n) + resto;
			//Caso tenha resto, ele vai armazenar o valor da divis�o e concatenar os valores referente a ultima divis�o.
		}
			
		}

}
