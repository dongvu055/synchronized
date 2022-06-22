public class Test2 {
    private Object object1;
    private Object object2;

    public Test2(Object object1, Object object2) {
        this.object1 = object1;
        this.object2 = object2;

    }

    public void method1() {
        int result = 1;
        for (int i = 0; i < 50000; i++) {
            result += Math.pow(result, i);
        }
        System.out.println("Thread 1 -        end Time:" + System.currentTimeMillis());
        synchronized (this.object1) {
            int result1 = 1;
            for (int i = 0; i < 50000; i++) {
                result1 += Math.pow(result1, i);
            }
            System.out.println("Thread 1 - Dongbo end Time:" + System.currentTimeMillis());
        }

    }

    public void method2() {
        int result = 1;
        for (int i = 0; i < 50000; i++) {
            result += Math.pow(result, i);
        }
        System.out.println("Thread 2 -        end Time:" + System.currentTimeMillis());
        synchronized (this.object2) {
            int result1 = 1;
            for (int i = 0; i < 50000; i++) {
                result1 += Math.pow(result1, i);
            }
            System.out.println("Thread 2 - Dongbo end Time:" + System.currentTimeMillis());
        }
    }

}
