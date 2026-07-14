public class PelindromeOrNot {
        public static void main(String[] args) {
        String str="aya";
        String rev="";

        for (int i = str.length()-1; i >=0 ; i--) {
            rev=rev+str.charAt(i);

        }
            if(str.equals(rev)){
            System.out.println("pelindrome");
            }else{
                System.out.println("not pelindrone");
            }

    }
}
