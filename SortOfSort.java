//Javier Rubio and Issac Beltran helped me with this lab 
public class SortOfSort {

	
	public static void sortOfSort(int []array) {
		int hiIdx=array.length-1;
		int lowIdx=0;
		int max = Integer.MIN_VALUE;
		int current = 0;
		int counter=0;
		int temps=0;
		
		for(int i=0;i<array.length-1;i++) {
			max = Integer.MIN_VALUE;
			current=i;
			
			for(int j=lowIdx; j<=hiIdx;j++) {
				if(array[j]>max) {
					max=array[j];
					current= j;
				}
			}
		if(lowIdx<hiIdx) {
			if(counter<2) {
				temps=array[hiIdx];
				array[hiIdx]=max;
				array[current]=temps;
				counter++;
				hiIdx--;
			}
		}
		else if(counter<4) {
			temps=array[lowIdx];
			array[lowIdx]=max;
			array[current]=temps;
			counter++;
			lowIdx++;
		}
	}
	
		if(counter==4) {
			counter=0;
		}
		
	}
}
