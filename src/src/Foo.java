public class Foo {
    public static int sum(int n, int m) {
        return n + m;
    }
    public static void main(String[] args) {
        int i = 20;
        int s;
        char a;

        int m;
        s = sum(i, m = 10);
        a = '?';
        System.out.println(a);
        System.out.println("Hello");
        System.out.println(s);
    }
}
