public class Test2 {
    private int a;
    private int b;

    private Object object1 = new Object();

    private Object object2 = new Object();

    public Test2(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void method1() {
        synchronized (this) {
            System.out.println(Thread.currentThread() + " a: " + " Time :" + System.currentTimeMillis());
            int result = 0;
            for (int i = 0; i < 20000; i++) {
                result += Math.pow(a, i);
            }
        }
    }

    public void method2() {
        synchronized (this) {
            System.out.println(Thread.currentThread() + " b: " + " Time :" + System.currentTimeMillis());
            int result = 0;
            for (int i = 0; i < 20000; i++) {
                result += Math.pow(a, i);
            }
        }
    }

}
