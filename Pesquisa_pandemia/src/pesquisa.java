import java.util.Scanner;

public class pesquisa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //habilitando o uso d teclado
		
		int qtde = 50;		// variavel para quantidade de entrevistados
		int escolha;
		double qtdeM = 0;			// variavel para quantidade de masculinos
		double qtdeF = 0;			// variavel para quantidade de femininos
		int idade = 0;		// variavel para idade ds entrevistado
		int somaIdade = 0;	// variavel criada para a soma total das idades
		int media;			// variavel para média das idades
		
		for (int c=0; c < qtde; c++) { 	// contador que define quantos entrevistados terá, alterar o valor de qtde nas variaveis			
			System.out.print("Digite 0 para Masculino e 1 para Feminino do entrevistado " + (c+1) + ": ");
			escolha = sc.nextInt();
				if (escolha == 0) { // se a escolha for 0 acrescenta 1 na variavel m
					qtdeM += 1;
				} else {			// se a escolha for 1 acrescenta 1 na variavel f
					qtdeF += 1;
				}
				
			System.out.print("Qual a idade do entrevistado? ");
			idade = sc.nextInt();
			somaIdade += idade;				
		}
		
		media = somaIdade / qtde;		 //calculando a media das idades
		double perM = (qtdeM / qtde) * 100;  //calculando porcentagem de Masculinos 
		double perF = (qtdeF / qtde) * 100;  //caculando porcentagem de Femininos		
		System.out.println();
		System.out.println("Percentual de homens: " + perM + "%");
		System.out.println("Percentual de mulheres: " + perF + "%");
		System.out.println("A média de idade é: " + media);
		
		sc.close();
	}
}
