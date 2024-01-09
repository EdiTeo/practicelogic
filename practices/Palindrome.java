package practicelogic.practices;

public class Palindrome {
    public static void main(String[] args) {
        int a = 1233441;
        System.out.println("ES PALINDROME? " + isPalindrome(a));

        int b = 232;
        System.out.println("ES PALINDROME? " + isPalindrome(b));

    }
    public static boolean isPalindrome(int x) {
        String n = String.valueOf(x);
        int s = n.length();
        int j = 0;
        for(int i = s - 1; i > 0; i--){
            if(n.charAt(i) != n.charAt(j)){
                return false;
            }
            j++;
        }
        return true;
    }
}
