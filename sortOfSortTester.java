//Issac Beltran helped me with the test cases
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
public class sortOfSortTester {
	@Test
	public void SorterTest1() { //basic test
		int [] arr= {58,1,23,74,33};
		SortOfSort.sortOfSort(arr);
		int [] sol = {33,23,1,58,74};
	assertArrayEquals(sol,arr);
	}
	public void SorterTest2() { //small numbers test
		int [] arr= {0,2,4,6,8};
		SortOfSort.sortOfSort(arr);
		int [] sol = {4,2,0,6,8};
	assertArrayEquals(sol,arr);
	}
	public void SorterTest3() { //neg test
		int [] arr= {-56,-2,3,89,34};
		SortOfSort.sortOfSort(arr);
		int [] sol = {3,-2,-56,34,89};
	assertArrayEquals(sol,arr);
	}
	public void SorterTest4() { //duplicate test
		int [] arr= {4,4,3,7,8};
		SortOfSort.sortOfSort(arr);
		int [] sol = {4,4,3,7,8};
	assertArrayEquals(sol,arr);
	}
	public void SorterTest5() { //all same number test
		int [] arr= {7,7,7,7,7};
		SortOfSort.sortOfSort(arr);
		int [] sol = {7,7,7,7,7};
	assertArrayEquals(sol,arr);
	}
}
