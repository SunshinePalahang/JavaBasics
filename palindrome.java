public class palindrome {
    public static void main(String[] args) {
        String original  =  "racecar";
        String reversed = "";

       for (int i = original.length() -1; i >= 0; i --){
        reversed += original.charAt(i);
       }

       boolean isPalindrome = original.equals(reversed);

       if (isPalindrome){
        System.out.println("The word '"+ original + "' is a palindrome.");
       }
       else{
        System.out.println("The word '"+ original + "' is  not a palindrome.");
       }

       String result = reversed.toString();

       System.out.println("Original string: "+ original);
       System.out.println("Reversed string: "+ result);
    }    
}
