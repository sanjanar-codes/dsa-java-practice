public class ReverseVowels {
    public boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public String reverseVowels(String s) {
        int left = 0;
        char temp;
        s = s.toLowerCase();
        char[] ch = s.toCharArray();

        int right = s.length() - 1;
        while (left < right) {
            if (isVowel(ch[left]) && isVowel(ch[right])) {
                temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            } else {
                if (!isVowel(ch[left])) {
                    left++;
                }
                if (!isVowel(ch[right])) {
                    right--;
                }
            }
        }
        return new String(ch);
    }

    public static void main(String[] args) {
        ReverseVowels rv = new ReverseVowels();
        System.out.println(rv.reverseVowels("hello"));
    }

}
