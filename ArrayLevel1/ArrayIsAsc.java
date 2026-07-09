public class ArrayIsAsc {
    public static void main(String[] args) {
        int arr[]={1,2,4,7,3};
   boolean isasc=true;


   for (int i = 0; i < arr.length-1; i++) {
       if(arr[i]>arr[i+1])
       isasc=false;
   }

   if(isasc==true){
    System.out.println("array is in ascending");

   }else{
        System.out.println("array is not in ascending");

   }


    }
}
