import java.util.*;

public class EuroMilhoes {


	public static void main(String[] args) {
		//User numbers
		int[] userNum = { 5, 10, 14, 25, 45 };
		int[] userEst = {8, 11};

		Arrays.sort(userNum);
		Arrays.sort(userEst);

		//Random picked numbers
		ComputingTools arr = new ComputingTools();
		int[] randNum = arr.random(5,50);
		int[] randEst = arr.random(2,11);

		Vector prizeNum = new Vector();
		Vector prizeEst = new Vector();

		System.out.println("\nNumeros do jogador");
		for(int i = 0; i < userNum.length; i++)
			System.out.print(userNum[i] + " ");

		System.out.println("\nEstrelas do jogador");
		for(int i = 0; i < userEst.length; i++)
			System.out.print(userEst[i] + " ");

		System.out.println("\nNumeros sorteados");
		for(int i = 0; i < randNum.length; i++){
			System.out.print(randNum[i] + " ");
		}
		System.out.println("\nEstrelas sorteados");
		for(int i = 0; i < randEst.length; i++){
			System.out.print(randEst[i] + " ");
		}

		for(int i = 0; i < userNum.length; i++)
			for(int j = 0; j < userNum.length; j++)
				if(randNum[i] == userNum[j]){
					prizeNum.add(userNum[j]);
				}

		for(int i = 0; i < userEst.length; i++)
			for(int j = 0; j < userEst.length; j++)
				if(randEst[i] == userEst[j]){
					prizeEst.add(userEst[j]);
				}

		if(prizeNum.size() != 0 || prizeEst.size() != 0 ){
			System.out.println("\n\nNumeros premiados : " + prizeNum);
			System.out.println("\n\nEstrelas premiadas : " + prizeEst);
		}
		else
			System.out.println("\n\nNão acertou nenhum numero ou estrela!");

	}

}