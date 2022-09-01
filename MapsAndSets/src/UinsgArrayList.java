import java.util.ArrayList;

public class UinsgArrayList {

	public static void main(String[] args) {

		//arrays
		int[] nums = new int[5];

		nums[0] = 0;
		nums[1] = 1;
		nums[2] = 2;
		nums[3] = 3;
		nums[4] = 4;

		//arraylist
		ArrayList<Integer> myArrayList = new ArrayList<Integer>(); 
		
		for (int i = 1; i <= 10; i++) {
			myArrayList.add(i); 
		}

		System.out.println(myArrayList); 

	}

}
