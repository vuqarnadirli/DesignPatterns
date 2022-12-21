package main;

import bean.BMW;
import bean.Fanar;
import bean.Mercedes;

public class Main {
    public static void main(String[] args) {
        Mercedes m = new Mercedes();
        m.name = "test";

        Fanar f = new Fanar("sss", m);
        System.out.println(f.getM().name);

        f.getM().name = "alma";
        System.out.println(f.getM().name);

        m.name = "alma";
        System.out.println(f.getM().name);
    }
}
