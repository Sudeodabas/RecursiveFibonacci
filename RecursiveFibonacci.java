import java.util.Scanner;
public class RecursiveFibonacci {
    static int fibb(int x){
        if(x==1||x==2)
            return 1;
        return fibb(x-1)+fibb(x-2);
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int x= inp.nextInt();
        System.out.println(fibb(x));
    }
}
