public class Test3 extends Thread {
    private Test2 test2;

    public Test3(Test2 test2) {
        this.test2 = test2;
    }

    @Override
    public void run() {
        while (true) {
            this.test2.method1();
        }
    }
}
