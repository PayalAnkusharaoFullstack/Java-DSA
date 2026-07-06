public class Pattern17 {
           public static void main(String args[]){
        int n=4;
        char ch = 'A';
        for(int i=n;i>=1;i--){
            // for(int j=1;j<=i;j++){
            //     System.out.print(" ");
            // }
            // System.out.println();
                for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch--;
            }
        }


    } 
}
