package com.company;

public class program {

    public static void main(String[] args) {
	// write your code here
        System.out.println(System.getProperty("java.version"));
        Dev2 krystian = new Dev2("Krystian Strączek");
        System.out.println(krystian.getAuthor());

        DEV1 Jarek = new DEV1("Jarosław Serwaczak");
        System.out.println(Jarek.getAuthor());


    }
}
