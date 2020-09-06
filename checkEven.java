public class checkEven{
	public static void main(String[] args){
		int test_var = 25;

		if(test_var%2 == 0 && helper.isEven(test_var)){
			System.out.println("Test has passed");
		}
		else{
			System.out.println("Test has failed");
		}
	}
}