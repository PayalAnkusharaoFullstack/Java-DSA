public class CountLeterDigitSpacialchar {
     public static void main(String[] args) {
        
String Sentence="payA @l".toLowerCase();

int Letter=0,Digit=0,Spacialchar=0;

for (int i = 0; i < Sentence.length(); i++) {
char ch=Sentence.charAt(i);
    if(Character.isLetter(ch)){
Letter++;
    }else if(Character.isDigit(ch)){
Digit++;
    }else{
Spacialchar++;
    }    
}
System.out.println("Letter is:"+Letter);
System.out.println("Digit is:"+Digit); 
System.out.println("Spacialchar is:"+Spacialchar); 

    }
}
