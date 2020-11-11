public class Student {
    // checks if an int is even
    public static boolean isEven(int num) {
        return (num % 2 == 0);
    }

    // Reverses a String
    public static char[] reverseString(String S) {
        char[] s = S.toCharArray();
        int left = 0, right = s.length - 1;
        while (left < right) {
            char tmp = s[left];
            s[left++] = s[right];
            s[right--] = tmp;
        }
        return s;
    }

    // Sum two int
    private static int sum2(int a, int b) {
        return a + b;
    }

    // Function fails with error ArrayIndexOutOfBounds
    private static void failFunc(int[] a) {
        int i = a[1];
    }

    public static void main(String[] args) throws Exception {
        try {
            int[] arr = {1};
            System.out.println(isEven(Integer.valueOf(args[0])));
            System.out.println(reverseString(args[1]));
            System.out.println(sum2(Integer.valueOf(args[2]), (Integer.valueOf(args[3]))));
            failFunc(arr);
        } catch (Exception e) {
            System.out.println(e.getClass().getName());
        }
    }
}


