package main;

import bean.BMW;
import bean.Fanar;

public class Main {
    public static void main(String[] args) {
        BMW bmw = new BMW("Alma");
        bmw.getName();
        //can't set. This immutable variable
    }
}
