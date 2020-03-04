
public class SortOfSort {

	
	public void sortOfSort(int array []) {
		for(int i=0;i<array.length;i++) {
			int max = array[i];
			int j=i-1;
			
			while(j>=0&&array[j]>max) {
				array[j+1] = array[j];
				j=j-1;
			}
			array[j+1]=max;
		}
		
	}
}
