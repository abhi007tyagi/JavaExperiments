package tyagiabhinav.leetcode;

public class CountSay {

    public static String countAndSay(int n) {
        String result = "1";
        for (int outer = 1; outer < n; outer++) {
            String previous = result;
            result = "";
            int count = 1;
            char say = previous.charAt(0);

            for (int i = 1; i < previous.length(); i++) {
                if (previous.charAt(i) != say) {
                    result = result + count + say;
                    count = 1;
                    say = previous.charAt(i);
                } else count++;
            }
            result = result + count + say;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(1));
        System.out.println(countAndSay(2));
        System.out.println(countAndSay(3));
        System.out.println(countAndSay(4));
        System.out.println(countAndSay(5));
        System.out.println(countAndSay(6));
        System.out.println(countAndSay(7));
    }
}
