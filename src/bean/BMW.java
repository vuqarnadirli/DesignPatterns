package bean;

public class BMW {
    private String name = null; //immutable
    public BMW(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
