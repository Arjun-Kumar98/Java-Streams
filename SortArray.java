
import java.io.*;
import java.util.Arrays;

class SortArray{

public static void main(String[] args){

    int[] arr = {1,1,1,3,2,2,3,3,5,3,4,4};

    Arrays.sort(arr);
    int temp =0;
    int j=1;
   int i=0;
    while(j<arr.length){
       if(arr[j]>arr[i]){
        temp = arr[i+1];
        arr[i+1] = arr[j];
        arr[j]=temp;
        i++;
       }
      j++;
    }
   
   int[] newArr = Arrays.copyOf(arr,i+1);

  for(int k=0;k<newArr.length;k++)
  {
    System.out.print(newArr[k]+" ");
  }

}

}

