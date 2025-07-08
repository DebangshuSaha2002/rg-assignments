//This method of doing the singleton pattern works fine but it is not thread safe
//So to make it thread safe we can use the double checked locking method

class A{
    public static A obj;

    //Declare the constructor as private
    private A(){
        System.out.println("Inside class A is constructor");
    }

    public static A getInstance(){
        if(obj==null){
            obj=new A();
        }
        return obj;
    }
}

class DP{
    public static void main(String[] args) {
        A obj1 = A.getInstance();
        A obj2 = A.getInstance();

        //If we print the address to which these objects point. It will be the same
        //So singleton pattern is working fine here
        System.out.println(obj1);
        System.out.println(obj2);
    }
}