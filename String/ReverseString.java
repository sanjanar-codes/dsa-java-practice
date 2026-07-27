public class ReverseString {
    public String reverseString(String s) {
        char temp;
        char[] ch = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;

        }

        return new String(ch);

    }

    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        String input = "Hello, World!";
        String reversed = rs.reverseString(input);
        System.out.println("Original string: " + input);
        System.out.println("Reversed string: " + reversed);
    }
}