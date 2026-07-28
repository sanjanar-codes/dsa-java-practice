public class IsPalindrome {
    public boolean isAlphaNumeric(char ch) {
        return isUpperCase(ch) || isLowerCase(ch) || isDigit(ch);
    }

    public boolean isUpperCase(char ch) {
        return ch >= 'A' && ch <= 'Z';
    }

    public boolean isLowerCase(char ch) {
        return ch >= 'a' && ch <= 'z';
    }

    public boolean isDigit(char ch) {
        return ch >= '0' && ch <= '9';
    }

    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        char[] ch = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (!isAlphaNumeric(ch[left])) {
                left++;
            }

            else if (!isAlphaNumeric(ch[right])) {
                right--;
            }

            else {
                if (ch[left] == ch[right]) {
                    left++;
                    right--;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        IsPalindrome obj = new IsPalindrome();
        String s = "A man, a plan, a canal: Panama";
        System.out.println(obj.isPalindrome(s));
    }

}
