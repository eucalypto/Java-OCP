package daily._10_02;

public class Enum {
    public static void main(String[] args) {
        System.out.println(MyEnum.valueOf("ONE"));
    }
}

enum MyEnum {
    ONE, TWO, THREE;

    // abstract void echo(String string);
}
