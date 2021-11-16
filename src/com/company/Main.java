package com.company;

public class Main {

    public static void main(String[] args) {
	String myText = "Programming is amazing! No seriously.";
        System.out.println(myText.length()); //prints length of a string
        System.out.println(myText.charAt(0)); // prints the string at position of integer
        System.out.println(myText.substring(0, 7)); //prints characters between positions stated in integer range
        System.out.println(myText.replace("ing is", "ers are")); //replaces first piece of string with the second piece
        int a = 'A';
        System.out.println(a); //prints ascii value for character a

        char b = 66; //prints character for value 66
        System.out.println(b);
    }
}
