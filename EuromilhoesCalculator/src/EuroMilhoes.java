import java.util.*;

public class EuroMilhoes {


	public static void main(String[] args) {
		//User numbers
		int[] userNum = { 5, 10, 14, 25, 45 };
		int[] userEst = {8, 10};

		Arrays.sort(userNum);
		Arrays.sort(userEst);

		//Random picked numbers
		ComputingTools arr = new ComputingTools();
		int[] randNum = arr.random(5,50);
		int[] randEst = arr.random(2,11);
		
		System.out.println("\nNumeros do jogador");
		for(int i = 0; i < userNum.length; i++)
			System.out.print(userNum[i] + " ");

		System.out.println("\nEstrelas do jogador");
		for(int i = 0; i < userEst.length; i++)
			System.out.print(userEst[i] + " ");


		int sorteio = 1;
		while(true){
			if( (arr.compare(userNum, randNum)) && (arr.compare(userEst, randEst)) ){
				break;
			} else{
				randNum = arr.random(5,50);
				randEst = arr.random(2,11);
				sorteio += 1;
			}
				
		}
		
		System.out.println("\n\nForam necessários "+ sorteio + " sorteios para que saisse o primeiro prémio, " +
				"que é o equivalente a " + sorteio / 104 + " anos.");
		
		System.out.print("\n\nNumeros premiados : ");
		for(int i = 0; i < randNum.length; i++)
			System.out.print(" "+ randNum[i] + " ");
		
		System.out.print("\n\nEstrelas premiadas : ");
		for(int i = 0; i < randEst.length; i++)
			System.out.print(" " + randEst[i] + " ");
		
		
	}

}