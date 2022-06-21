public class Test1 {
    public static void main(String[] args) {
        Test2 test2 = new Test2(-100,100);
        Test3 test3 = new Test3(test2);
        Test4 test4 = new Test4(test2);
        test3.start();
        test4.start();

    }
}

