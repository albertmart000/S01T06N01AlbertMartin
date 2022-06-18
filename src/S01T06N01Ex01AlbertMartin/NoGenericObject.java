package PruebaEX1;

public class NoGenericObjectPrueba {

    private String string1;
    private String string2;
    private String string3;

    public NoGenericObjectPrueba(String string1, String string2, String string3) {
        this.string1 = string1;
        this.string2 = string2;
        this.string3 = string3;
    }

    public String getString1() {
        return string1;
    }

    public String getString2() {
        return string2;
    }

    public String getString3() {
        return string3;
    }

    @Override
    public String toString() {
        return "NoGenericObjectPrueba{" +
                "string1='" + string1 + '\'' +
                ", string2='" + string2 + '\'' +
                ", string3='" + string3 + '\'' +
                '}';
    }
}
