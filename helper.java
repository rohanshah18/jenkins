public class helper {
    public static boolean isEven(int num) {
        return (num % 2 == 0);
    }

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

    private static int sum2(int a, int b) {
        return a + b;
    }

    private static void failFunc(int[] a) {
        System.out.println(a[0]);
    }

    public static void main(String[] args) throws Exception {
        try {
            int[] arr = {1};
            failFunc(arr);
            System.out.println(isEven(Integer.valueOf(args[0])));
            System.out.println(reverseString(args[1]));
            System.out.println(sum2(Integer.valueOf(args[2]), (Integer.valueOf(args[3]))));
        } catch (Exception e) {
            System.out.println(e.getClass().getName());
        }
    }
}