public class SecondLargestNum {
       public static void main(String[] args) {
int arr[] = {1, 2,8,7, 3};
    int largest=arr[0];
    int secondlarge=-1;

    for (int i = 0; i < arr.length; i++) {
     if (arr[i]>largest) {
        secondlarge=largest;
         largest=arr[i];
     }else if (arr[i] > secondlarge && arr[i] != largest){
             secondlarge = arr[i];
     }  

    }
    System.out.println(largest);
     System.out.println(secondlarge);

    } 
}
