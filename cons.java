package CRT;

public class cons {
    int a;
    String name;


    public cons (int a,String name){
    this.a=a;
    this.name=name;


    }


    public cons (){
    this.a=0;
    this.name=null;


    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    void display(){
        System.out.println("RollNo"+a+"Name"+name);
    }
    public static void main(String[] args) {

        cons a =new cons();
        a.setName("Dhruv");
        System.out.println(a.getName());


    }
}
