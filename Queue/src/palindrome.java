public class palindrome {

        public boolean isPalindrome(int x) {
            if (x<0|| (x%10==0 &&x!=0)){
                return false;

            }
            int reverse=0;
            while (x>reverse) {
                reverse = reverse * 10 + x % 10;
                x = x / 10;
            }return reverse==x || reverse/10==x;

    }

    public static void main(String[] args) {
        palindrome s=new palindrome();
        System.out.println(s.isPalindrome(121));
        System.out.println(s.isPalindrome(-121));
        System.out.println(s.isPalindrome(0));
        System.out.println(s.isPalindrome(123));
    }
}