package api;

public class StringTest4 {
	public static void main(String[] args) {
		String str = "The winner takes it all";
		System.out.println(str.charAt(1)); // 몇번째 문자를 뽑아낼 수 있다.
		System.out.println(str.indexOf("i"));
		System.out.println(str.length());
		System.out.println(str.lastIndexOf("i"));
		System.out.println(str.replace("it all", "whole things"));
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.substring(4, 10));
		System.out.println(str.substring(4));
	}
}
