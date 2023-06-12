package Satyam_switch;

import java.util.Locale;
import java.util.Scanner;

public class SW09 {
    public static void main(String[] args){
        System.out.println("Enter the browser");
        Scanner sc=new Scanner(System.in);
        String browser;
        browser=sc.next();
        browser=browser.toLowerCase();
        switch (browser){
            case "chrome":
                System.out.println("open chrome");break;
            case "firefox":
                System.out.println("open firefox");break;
            default:
                System.out.println("default");
        }

    }
}
