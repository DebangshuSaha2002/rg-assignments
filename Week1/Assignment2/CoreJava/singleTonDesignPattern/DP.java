package singleTonDesignPattern;

//This method of doing the singleton pattern works fine but it is not thread safe
//So to make it thread safe we can use the double checked locking method

class B{
    public static B obj;

    //Declare the constructor as private
    private B(){
        System.out.println("Inside class A is constructor");
    }

    public static B getInstance(){
        if(obj==null){
            obj=new B();
        }
        return obj;
    }
}

class DP{
    public static void main(String[] args) {
        B obj1 = B.getInstance();
        B obj2 = B.getInstance();

        //If we print the address to which these objects point. It will be the same
        //So singleton pattern is working fine here
        System.out.println(obj1);
        System.out.println(obj2);
    }
}