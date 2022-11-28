import java.io.*;
import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String str = "Hello, World", revStr = "";
        
        for(int i = str.length() -  1; i >= 0; i--) {
            revStr= revStr + str.charAt(i);
        }
        
        System.out.println("Reverse String:  " + revStr);
        
        
    }
}