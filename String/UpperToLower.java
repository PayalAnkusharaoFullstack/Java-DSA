public class UpperToLower{
            public static void main(String[] args) {
        String str="aUan";
        String lower="";

        for (int i =0; i <= str.length()-1; i++) {
            lower=lower+Character.toLowerCase(str.charAt(i));

        }
   System.out.println(lower);
    }
}
