package CRT;

public class GOd {
    int A;

    public GOd(int A){
        this.A=A;

    }
    public int getData(int i ){
        if(i<0){
            return 1;
        }
        else {
            System.out.print(i);
            getData(i-1);
        }
        return 0;
    }


    public static void main(String[] args){
        GOd a=new GOd(6);
        System.out.println(a.getData(-1));


    }
}
