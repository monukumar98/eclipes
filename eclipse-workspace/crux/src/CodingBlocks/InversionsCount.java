package CodingBlocks;
import java.util.*;

public class InversionsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int arr[] = new int[n];

			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}

			System.out.println(EnhaneMergeSort(arr, 0, n - 1));
			//System.out.println(getInvCount(arr,n)); 
		}

	}

	public static int EnhaneMergeSort(int arr[], int left, int right) {

		int inv_count = 0;
		int mid = 0;
		if (left >= right) {
			return 0;
		}
		if (right > left) {
			mid = (left + right) / 2;
			inv_count = EnhaneMergeSort(arr, left, mid);
			inv_count += EnhaneMergeSort(arr, mid + 1, right);

		}
		 inv_count += merge(arr, left, mid, right);
		return inv_count;

	}

	private static int merge(int[] arr, int l, int m, int r) {

        int[] left = Arrays.copyOfRange(arr, l, m + 1); 
  
       
        int[] right = Arrays.copyOfRange(arr, m + 1, r + 1); 
  
        int i = 0, j = 0, k = l, swaps = 0; 
  
        while (i < left.length && j < right.length) { 
            if (left[i] <= right[j]) 
                arr[k++] = left[i++]; 
            else { 
                arr[k++] = right[j++]; 
                swaps += (m + 1) - (l + i); 
            } 
        } 
  
        
        while (i < left.length) 
            arr[k++] = left[i++]; 
  
        
        while (j < right.length) 
            arr[k++] = right[j++]; 
  
        return swaps; 
	}
}
//	public static int getSum(int[] BITree, int index) 
//	{ 
//	    int sum = 0; // Initialize result 
//	  
//	    // Traverse ancestors of BITree[index] 
//	    while (index > 0) 
//	    { 
//	        // Add current element of BITree to sum 
//	        sum += BITree[index]; 
//	  
//	        // Move index to parent node in getSum View 
//	        index -= index & (-index); 
//	    } 
//	    return sum; 
//	} 
//	  
//	// Updates a node in Binary Index 
//	// Tree (BITree) at given index 
//	// in BITree. The given value 'val'  
//	// is added to BITree[i] and all 
//	// of its ancestors in tree. 
//public 	static void updateBIT(int[] BITree, int n, 
//	                        int index, int val) 
//	{ 
//	    // Traverse all ancestors and add 'val' 
//	    while (index <= n) 
//	    { 
//	        // Add 'val' to current node of BI Tree 
//	        BITree[index] += val; 
//	  
//	        // Update index to that of parent in update View 
//	        index += index & (-index); 
//	    } 
//	} 
//	  
//	// Returns inversion count arr[0..n-1] 
//	public static int getInvCount(int[] arr, int n) 
//	{ 
//	    int invcount = 0; // Initialize result 
//	  
//	    // Find maximum element in arr[] 
//	    int maxElement = 0; 
//	    for (int i = 0; i < n; i++) 
//	        if (maxElement < arr[i]) 
//	            maxElement = arr[i]; 
//	  
//	    // Create a BIT with size equal to  
//	    // maxElement+1 (Extra one is used so  
//	    // that elements can be directly be 
//	    // used as index) 
//	    int[] BIT = new int[maxElement + 1]; 
//	    for (int i = 1; i <= maxElement; i++) 
//	        BIT[i] = 0; 
//	  
//	    // Traverse all elements from right. 
//	    for (int i = n - 1; i >= 0; i--) 
//	    { 
//	        // Get count of elements smaller than arr[i] 
//	        invcount += getSum(BIT, arr[i] - 1); 
//	  
//	        // Add current element to BIT 
//	        updateBIT(BIT, maxElement, arr[i], 1); 
//	    } 
//	  
//	    return invcount; 
//	} 


