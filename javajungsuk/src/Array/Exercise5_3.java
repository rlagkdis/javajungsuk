package Array;

public class Exercise5_3 {
	public static void main(String [] args) {
		// �迭 arr�� ��� ��� ���� ���ϴ� ���α׷�
		int [] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("sum="+sum);
	}

}
