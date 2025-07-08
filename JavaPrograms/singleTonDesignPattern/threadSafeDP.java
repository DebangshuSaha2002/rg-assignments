//This method of doing the singleton pattern works fine but it is not thread safe
//So to make it thread safe we can use the double checked locking method

class A{
    public static A obj;

    //Declare the constructor as private
    private A(){
        System.out.println("Inside class A is constructor");
    }

    public static A getInstance() //Double checked locking
    {
        if(obj==null){
            synchronized (A.class) {
                if(obj==null){
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
        });

        Thread t2 = new Thread(() -> {
            A obj2 = A.getInstance();
        });

        t1.start();
        t2.start();
    }
}