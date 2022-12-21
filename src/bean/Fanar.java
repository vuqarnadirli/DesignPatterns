package bean;

public class Fanar {
    private static Fanar f = null;

    private Fanar() {

    }
    //Effective Java
    //Only one object created. This is SingletonPattern.
    public static Fanar instance() {
        if (f == null) {
            f = new Fanar();
        }
        return f;
    }
}
