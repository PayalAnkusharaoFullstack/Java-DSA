public class CountVowalAndConsonant {
    public static void main(String[] args) {
        
String Sentence="payAl".toLowerCase();

int vowels=0,consonants=0;

for (int i = 0; i < Sentence.length(); i++) {
   char ch=Sentence.charAt(i);
    if(ch>='a'&& ch<'z'){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
          vowels++;
        }else{
          consonants++;  
        }
    }   
}
System.out.println("vowels is:"+vowels);
System.out.println("consonants is:"+consonants); 

    }
}
