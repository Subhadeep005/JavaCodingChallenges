package my.practice.java;

public class PrintName {

	public static void main(String[] args) {
		
		String str = "My Name is Shubhadeep I like coffee.";
		
		String arr[]= str.split(" ");
		
		for(int i=0; i<arr.length;i++) {
			
			if(arr[i].contains("e"))
			System.out.println(arr[i]);
		}
	}

}
