public class Palindrome {

  public static boolean isPalindrome(final String s){
    if (s.length() <= 1)
      return true;
    for (int i = 0; i < s.length() /2 + 1; i++) {
      final int l = s.length() - 1 - i;
      if(s.charAt(i) != s.charAt(l)) {
        return false;
      }
    }
    return true;
  }

}
