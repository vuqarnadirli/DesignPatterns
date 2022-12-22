package main;

import bean.BMW;
import bean.Mercedes;
import builderPattern.Fanar;

public class Main {
    public static void main(String[] args) {

        Fanar.FanarBuilder builder = Fanar.builder();

        builder.setName("dd");
        Fanar f = builder.build();
        builder.setName("sss");
        System.out.println(f.getName());
    }
}
