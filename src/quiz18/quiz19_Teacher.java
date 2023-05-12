package quiz18;

public class quiz19_Teacher {

	public static void main(String[] args) {
	
		System.out.println(palindrome("다시 합창 합시다"));
	
	
	
}
	
	public static String palindrome(String str) {
		str = str.replace(" ", "");
		for(int i = 0; i < str.length()/2; i++) {
			char a = str.charAt(i);
			char b = str.charAt(str.length()-i -1);
			if(a != b) {
				return "회문이 아님";
			}
		}return "회문";
	
	
	
	
}

}