public class Palindrome {
    public static void main(String[] args) {
      String str = "NKNN";
        System.out.println(Palin(str));
    }

    public static Boolean Palin(String str){
          int i = 0;
          int j = str.length()-1;
          for(int k =0; k<str.length(); k++){
              if(str.charAt(i) == str.charAt(j)){
                   i++;
                   j--;
              }
             else{
                 return false;
              }
          }
        return true;
    }
}
