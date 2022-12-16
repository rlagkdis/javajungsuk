package Array;

public class Exercise5_4 {
	public static void main(String [] args) {
		int [] [] arr = {
				{5, 5, 5, 5, 5},
				{10, 10, 10, 10, 10},
				{20, 20, 20, 20, 20},
				{30, 30, 30, 30, 30}
		};
		
		int total = 0;
		float average = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				total += arr[i][j];
			}
		}
		int garo = arr[0].length;
		int sero = arr.length;
		average = (float)total/(garo*sero);  //float가 없으면 16.0이 나온다.
		System.out.println("total=" + total);
		System.out.println("average =" + average);
	}

}
