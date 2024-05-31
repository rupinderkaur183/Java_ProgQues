package arrays;

public class MinMaxArray {
	public static void main(String[] args) {

		int[] a = new int[]{2,3,3,4,2,4,1,1,30};
		int max = a[0];
		int min = a[0];
		for(int i = 0; i<a.length; i++) {
			if(max> a[i]) {
				max = a[i];
			}
			if(min< a[i]) {
				min = a[i];
			}
		}
		System.out.println("Max : " + max + " Min : "+ min);
		
	}

}
