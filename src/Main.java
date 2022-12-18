import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       System.out.println("N1 sayısını giriniz:");
       int n1 = input.nextInt();
        System.out.println("N2 sayısını giriniz:");
        int n2 = input.nextInt();
        int ekok = 0;
        int ebob = 1;
        int  i =1;
        while(i<=n1){
            if((i%n2)==0 && (i&n2)==0){ebob =i;}
            i++;
        }
        System.out.println("Ebob:"+ebob);
        int k=1;
        while(k<=n1*n2){
            if((k%n1)==0&&(k&n2)==0){
                ekok=k;}
                k++; }
            System.out.println("Ekok:"+ekok);
        }





    }
