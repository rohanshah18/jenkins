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

	public static void main(String[] args) {
		int test_var = Integer.valueOf(args[0]);
		System.out.println(isEven(test_var));
		System.out.println(reverseString(args[1]));
	}
}