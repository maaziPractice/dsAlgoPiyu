
public class FindPivotOrMinRotatedArray {

	public static void main(String[] args) {

     //int arr[] = {5,6,7,8,9, 10, 11,-1,1,2,3,4};
		
     int arr[] = {12,11};
     
     System.out.println(findMinEleIndex(arr,0,arr.length-1));
     
		
	}
	
	static int findMinEleIndex(int arr[], int start, int end){
		
		
		if(start==end) return start;
		
		if(arr[start] < arr[end]) return start;
		
		int mid = (int)Math.floor((start+end)/2);
		if(mid>start){ 
			if(arr[mid-1]>arr[mid]){// mid is lowest
				return mid;
			}
		}
		
		if(mid<end){ //mid is highest
			if(arr[mid]>arr[mid+1]){
				return mid+1;
			}
		}
		
		if(arr[start] < arr[mid]){
			return findMinEleIndex(arr, mid+1, end);
		}else{
			return findMinEleIndex(arr, start, mid-1);
		}

	}

}
