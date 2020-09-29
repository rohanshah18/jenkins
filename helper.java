public class helper{
	public static boolean isEven(int num){
		return (num%2==0);
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

	private static int sum2(int a, int b){
		return a+b;
	}

	public static void main(String[] args) {
		System.out.println(isEven(Integer.valueOf(args[0])));
		System.out.println(reverseString(args[1]));
		System.out.println(sum2(Integer.valueOf(args[2]), (Integer.valueOf(args[3]))));
	}
}