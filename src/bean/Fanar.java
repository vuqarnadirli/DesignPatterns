package bean;

public class Fanar {
    private String name = null; //effectively final
    private Mercedes m = null;

    public Fanar(String name, Mercedes m) {
        this.name = name;

        Mercedes mm = new Mercedes();
        mm.name = m.name;
        this.m = mm;
    }

    public String getName() {
        return name;
    }

    public Mercedes getM() {
        Mercedes mm = new Mercedes();
        mm.name = m.name;
        return mm;
    }
}
