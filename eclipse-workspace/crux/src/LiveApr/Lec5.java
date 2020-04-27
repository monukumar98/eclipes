package LiveApr;

public class Lec5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {3,1,5,-2-4,6};
		System.out.println(maxsubarraysum(arr));

	}
	public static int maxsubarraysum(int arr[]) {
		int max = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			for(int j=i; j<arr.length; j++) {
				int sum=0;
				for(int k=i; k<=j; k++) {
					sum+=arr[k];
				}
				if(sum>max) {
					max=sum;
				}
			}
		}
		return max;
	}

}
