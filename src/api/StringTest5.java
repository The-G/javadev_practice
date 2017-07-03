package api;

public class StringTest5 {
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("The winner takes it all");
		
		str.replace(17, 23, "whole things");
		System.out.println(str);
		str.insert(0, "..");
		System.out.println(str);
		str.delete(0, 1);
		System.out.println(str);
		System.out.println(str.reverse());
	
	}
}
