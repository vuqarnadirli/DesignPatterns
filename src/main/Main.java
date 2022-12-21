package main;

import bean.Fanar;

public class Main {
    public static void main(String[] args) {
        Fanar fanar = Fanar.instance();
        Fanar fanar1 = Fanar.instance();

        System.out.println(fanar.toString());
        System.out.println(fanar1.toString());

    }
}
