//Code and explanation on encapsulation
class Developer{

    //declaring private class variables to make sure that they are not directly accessible and hidden from outside
    private String name;
    private int age;

    //Public constructor
    public Developer(String name, int age){
        this.name = name;
        this.age = age;
    }

    //Setter for name
    public void setName(String name){
        this.name = name;
        System.out.println("Name is set to "+name);
    }

    //Getter for name
    public void getName(){
        System.out.println("Name: "+this.name);
    }

    //Setter for age
    public void setAge(int age){
        //we can also add up logic in the setters
        this.age = age;
        System.out.println("Age is set to "+age);
    }

    //Getter for age
    public void getAge(){
        System.out.println("Age: "+age);
    }
}

class Employee{
    public static void main(String[] args) {
        //calling the parameterized constructor to set the default values
        Developer obj = new Developer("Debangshu", 22);

        //we cannot access the class variable directly so to access the name and age we use getters
        obj.getName();
        obj.getAge();

        //and to change the class variable we use the setters
        obj.setName("Deb");
        obj.getName();

        obj.setAge(23);
        obj.getAge();
    }
}

