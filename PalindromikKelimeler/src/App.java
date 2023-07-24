public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(isPalindrome("Patika"));
        System.out.println(isPalindrome2("makam"));
    }

    public static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public static boolean isPalindrome2(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        if (reverse.equals(str)) {
            return true;
        } else {
            return false;
        }
    }
}
