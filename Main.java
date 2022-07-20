public class Main {
    public static void main(String[] args) {
        print("hello world!");
        System.out.println("1 + 1 = " + myadd());
    }

    private static void print(String s) {
        System.out.println(s);
    }

    public static int myadd() {
        return 1 + 1;
    }
}
