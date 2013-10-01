
import java.util.*;

public class ComputingTools {
	
	


	public int[] random(int arrayLength,int minimo, int maximo) {
		//Returns a non-repetable randomized number array
		int[] arrayNum = new int[arrayLength];
		boolean numRepetido = false;

		//main cycle that runs arrayLength - 1 times
		for(int i = 0; i < arrayNum.length; i++){
			int randNum = minimo + (int)(Math.random() * maximo );
			//System.out.print("O numero gerado foi : " + randNum + "\n");


			while(true){
				//checks if randNum is present on the arrayNum, toggles a flag if so.
				for(int j = 0; j < arrayNum.length ; j++){
					if(arrayNum[j] == randNum){
						numRepetido = true;
						break;
					} else 
						numRepetido = false;
				}
				//if randNum is repeated in the array, randomizes new randNum
				if(numRepetido == true){
					randNum = minimo + 	(int)(Math.random() * maximo );
				//	System.out.print("O numero gerado foi repetido, gerado um novo  : " + randNum + "\n");
				} else{
					//if not, adds it to the array
					arrayNum[i] = randNum;
					//System.out.print("O numero foi escrito no Array : " + arrayNum[i] + "\n");
					break;
				}
			}					
		}

		//sorts the final array with no repetitions for nicer look 
		Arrays.sort(arrayNum);
		return arrayNum;
	}

	//if maximum random number not specified assume 100
	public int[] random(int arrayLength) {
		return this.random(arrayLength,100);
	}

	//if minimum random number not specified assume 1
	public int[] random(int arrayLength, int maximo) {
		return this.random(arrayLength, 1, maximo);
	}
	
	
	
	public boolean compare(int[] numJog, int[] numSort){
		//Compare two arrays and returns the n numbers that are equal, void if none found 
		int acertos = 0;
		
		
		for(int i = 0; i < numJog.length; i++)
			for(int j = 0; j < numJog.length; j++)
				if(numSort[i] == numJog[j]){
					acertos +=1;
				}
		if (acertos == (numJog.length))
			return true;
		else
			return false;
	}

}