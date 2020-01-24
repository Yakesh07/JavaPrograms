package Batch10;

public class Hello {

	public static void main(String[] args) {

		String s1 = "Java";
		String s2 = new String();
		s2 = "Java Programs";

		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.length());
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase("JAva"));
		System.out.println(s1.concat(s2));
		System.out.println(s2.contains("Ja"));
		System.out.println(s2.substring(3));
		System.out.println(s1.charAt(2));

		char ch[] = s1.toCharArray();
		for(int i=0;i<ch.length;i++){
			System.out.println(ch[i]);
		}
		
		System.out.println("------>");
		
		System.out.println(s2.replaceFirst("Java", "C#"));
		
		String s3="Java was founded in 1995";
		String 	a[]=s3.split(" ");
		for(String b:a){
			System.out.println(b);
		}

	}

}
