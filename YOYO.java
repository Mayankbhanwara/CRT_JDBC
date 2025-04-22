package CRT;

import java.util.Scanner;

public class YOYO {
    public static void main(String[] args) {
        int arr[] =new int[5];

        try {
            for(int i = 0; i<=arr.length;i++){
                System.out.println("Print");
                Scanner sc = new Scanner(System.in);
                arr[i] = sc.nextInt();
            }
       }
       catch(Exception e){
           e.printStackTrace();
       }
       System.out.println("Tasdadsad");
    }
}