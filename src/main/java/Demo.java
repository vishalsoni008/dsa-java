public class Demo {
    public static void main(String[] args) {

        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(5000);
                System.out.println("new thread");
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        });

        thread.start();

        System.out.println(Thread.currentThread().getName());

    }
}