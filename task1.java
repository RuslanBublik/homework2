public class task1 {

public static void main(String[] args) {
    System.out.println(buildString(6, 'a', 'b')); // ababab

    System.out.println(strRLE("aaaabbbcdd"));
    }
    
    private static String buildString(int n, char first, char second) {
        String str = new String();
        for (int i = 0; i < n; i++) {
            str += (i % 2 == 0) ? first : second;
        }
        return str;
    }
    
    private static String strRLE(String str) {
        if (str == "") return str;
        String rle = new String();
        rle += str.charAt(0);
        Integer count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) == str.charAt(i)) count++;
            else {
                rle += (count == 1) ? str.charAt(i) : Integer.toString(count) + str.charAt(i);
                count = 1;
            }
        }
        if (count > 1) rle += count;
        return rle;
    }
}