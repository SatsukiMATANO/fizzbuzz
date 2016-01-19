package fizzBuzz_JUnit;

public class FizzBuzz {
	
	public static void main(String[] args){
		fizzBuzz();
	}

	static void fizzBuzz(){
		int num;
		for(num = 0 ; num < 100;){
			num++;
			if(numCheck(num) == null){
				System.out.println(num);
			} else {
				System.out.println(numCheck(num));
			}
			}
	}
	static String numCheck(int num){
		
		if(num % 3 == 0 && num % 5 == 0){
			return "fizzbuzz";
		}
		if(num % 3 == 0){
			return "fizz";
		}
		if(num % 5 == 0){
			return "buzz";
		}
		return null;
	}
}