package java_1;

public class AB {
	public static void main(String[] args) {
		String str = "hello java";
		str.toUpperCase();
		for (int i = str.length()-1; i >=0; i--) {
			System.out.print(str.charAt(i) + "changes");
		}
	}

}
