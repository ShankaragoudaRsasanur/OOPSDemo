package ooPs;

public class StringMethodsDemo {

    public static void main(String[] args) {

        String name = "Shankaragouda";

        System.out.println("Length : " + name.length());

        System.out.println("Upper : " + name.toUpperCase());

        System.out.println("Lower : " + name.toLowerCase());

        System.out.println("Char : " + name.charAt(0));

        System.out.println("Contains : " + name.contains("gouda"));

        System.out.println("Starts With : " + name.startsWith("Sha"));

        System.out.println("Ends With : " + name.endsWith("da"));

        System.out.println("Substring : " + name.substring(0,5));

        System.out.println("Replace : " + name.replace("gouda","GOUDA"));

        System.out.println("Index : " + name.indexOf('a'));
    }
}