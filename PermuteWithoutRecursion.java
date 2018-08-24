import java.util.Arrays;

/* package whatever; // don't place package name! */


/* Name of the class has to be "Main" only if the class is public. */
class PermuteWithoutRecursion
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//printPermutationsIterative("mayur");
		
		permWithoutRecursion("mayurko");
		
//		int arr3[]={1, 5, 4, 3, 2};
//		printNextNumber(arr3);
//		
//		int arr2[]={5,6, 4,3,2,1};
//		printNextNumber(arr2);
//		
//		int arr[]={5,4, 6,3,2,1};
//		printNextNumber(arr);
//		
//		 int[] arr1={1,2,3,4};
//		printNextNumber(arr1);
	}
	
	
	private static void permWithoutRecursion(String permString){
		
		int indexArr[] = new int[permString.length()];
		for(int i=0;i<indexArr.length;i++){
			indexArr[i]=i+1;
		}
		
		int npn = 0;
		while(true){
			printStringCharWise(permString, indexArr);
			npn++;
			if(getPointOfSplit(indexArr) != 0)
			   printNextNumber(indexArr);
			else break;
		}
		
		System.out.println("npn is :"+npn);
	}
	
	private static void printStringCharWise(String string, int[] indexes){
//		for(int i=0;i<indexes.length;i++){
//			System.out.print(string.charAt(indexes[i]-1));
//		}
//		System.out.println();

	}
	
	
	private static void printPermutationsIterative(String string){
        int [] factorials = new int[string.length()+1];
        factorials[0] = 1;
        for (int i = 1; i<=string.length();i++) {
            factorials[i] = factorials[i-1] * i;
        }

        for (int i = 0; i < factorials[string.length()]; i++) {
            String onePermutation="";
            String temp = string;
            int positionCode = i;
            for (int position = string.length(); position > 0 ;position--){
                int selected = positionCode / factorials[position-1];
                onePermutation += temp.charAt(selected);
                positionCode = positionCode % factorials[position-1];
                temp = temp.substring(0,selected) + temp.substring(selected+1);
            }
            System.out.println(onePermutation);
        }
    }
	
	// start with numberInBaseRadix = {1,2,3,4,5,6,7}
	public static int[] printNextNumber(int[] numberInBaseRadix){
		
		//index on and after which chars are in descending order
		//for example arr={5,4 ...., 6,3,2,1} ... pointOfSplit is 2...that is index of arr[2]==6
		
		int pointOfSplit = getPointOfSplit(numberInBaseRadix);
		
		if(pointOfSplit == 0) return numberInBaseRadix;
		
		else{
			int replaceWith = pointOfSplit;
			for(int i=numberInBaseRadix.length-1;i>pointOfSplit;i--){
				if(numberInBaseRadix[i]>numberInBaseRadix[pointOfSplit-1]){
					replaceWith = i;
					break;
				}
			}
			swapArrayElements(numberInBaseRadix, pointOfSplit-1, replaceWith);
			Arrays.sort(numberInBaseRadix,pointOfSplit,numberInBaseRadix.length);
			System.out.println("Next Number is "+Arrays.toString(numberInBaseRadix));
			return numberInBaseRadix;
		}
	
		
	}
	
	private static int getPointOfSplit(int[] numberInBaseRadix){
		
		for (int i = numberInBaseRadix.length-1; i>=1; i--){ 
		    if (numberInBaseRadix[i] < numberInBaseRadix[i - 1]) {
		        continue;
		    }
		    else {
		    	return i;
		    }
		}
		
		return 0;
	}
	
	private static void swapArrayElements(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j]=temp;
	}
	
	private static void sortArrayFromGivenIndexTOEndOfIt(int arr[], int start){
		int temp[]=new int[arr.length-start];
		for(int i=start,j=0;i<arr.length;i++,j++){
			temp[j]=arr[i];
		}
		
	}
	
	
}
