public class App {
    public static void main(String[] args) throws Exception {
        Time t1 = new Time(8, 18 ,00);
        t1.show();
        System.out.println("\n");
        t1.set(12, 34, 15);
        t1.show();
        System.out.println("\n");
        System.out.println(t1.getmin());
        System.out.println("\n");
        t1.reset();
        t1.show();
        System.out.println("\n");
    }
}
