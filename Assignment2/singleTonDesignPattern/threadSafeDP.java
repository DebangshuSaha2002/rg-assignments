//Thread safe approach using the double checked locking method

class A{
    public static A obj;

    //Declare the constructor as private
    private A(){
        System.out.println("Inside class A's constructor");
    }

    public static A getInstance() //Double checked locking
    {
        if(obj==null){
            synchronized (A.class) {
                if(obj==null){
                    System.out.println("Obj is null, creating new instance by " + Thread.currentThread().getName());
                    obj = new A();
                }
            }
        }
        return obj;
    }
}

class threadSafeDP{
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            A obj1 = A.getInstance();
        }, "Thread1");

        Thread t2 = new Thread(() -> {
            A obj2 = A.getInstance();
        }, "Thread2");

        t1.start();
        t2.start();
    }
}