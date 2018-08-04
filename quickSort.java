//*******************************************************************
// Welcome to CompileJava!
// If you experience any issues, please contact us ('More Info')  -->
// Also, sorry that the "Paste" feature no longer works! GitHub broke
// this (so we'll switch to a new provider): https://blog.github.com\
// /2018-02-18-deprecation-notice-removing-anonymous-gist-creation/
//*******************************************************************

import java.lang.Math; // headers MUST be above the first class

// one class needs to have a main() method
public class HelloWorld
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
    OtherClass myObject = new OtherClass("Hello World!");
    System.out.print(myObject);
    int arr[]={9,5,1,100,2,3,99,101};
    OtherClass.quickSort(arr,0, arr.length);
    
    for(int i:arr){
          System.out.print(i + "   ");
    }

  }
}

// you can add other public classes to this editor in any order
public class OtherClass
{
  private String message;
  private boolean answer = false;
  
  public OtherClass(String input)
  {
     message = "Why, " + input + " Isn't this something?";
  }
  public String toString()
  {
    return message;
  }
  
  public static void quickSort(int arr[], int start, int end){

    
    if(end <= start)
      return;
    else{
      int pivot = start;
      int i = start+1;
      int j = end;
      
      while(i<j){
        if(arr[i]>=arr[pivot]){
         swap(arr,i, j);
         j--; 
        }else{
          i++;
        }
      }
      
      if(arr[pivot]>=arr[i])
        swap(arr,pivot,i);
             
      quickSort(arr,start, i-1);
      quickSort(arr, i+1, end);
      
    }
    
  }
  
  static void swap(int arr[], int i, int j){
   int temp = arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
  }
}
