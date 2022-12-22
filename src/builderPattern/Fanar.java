package builderPattern;

import bean.Mercedes;

public class Fanar {
    private String name = null;
    private Mercedes m = null;

    public Fanar(String name, Mercedes m) {
        this.name = name;
        this.m = m;
    }

    private Fanar() {

    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public Mercedes getM() {
        return m;
    }

    private void setM(Mercedes m) {
        this.m = m;
    }

    public static FanarBuilder builder() {
        return new FanarBuilder();
    }

    public static class FanarBuilder {
        private Fanar f = null;

        public FanarBuilder() {
            f = new Fanar();
        }

        public Fanar build() {
            return new Fanar(f.name, f.m);
        }

        public FanarBuilder setName(String name) {
            this.f.setName(name);
            return this;
        }

        public FanarBuilder setM(Mercedes m) {
            this.f.setM(m);
            return this;
        }

    }
}
