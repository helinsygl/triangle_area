
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        double a,b,c;
        double alan,u;
        System.out.println("Üçgenin ilk kenarını giriniz>");
        a=inp.nextDouble();
        System.out.println("Üçgenin ikici kenarını girinşz>");
        b= inp.nextDouble();
        System.out.println("Üçgenin üçüncü kenarını giriniz>");
        c= inp.nextDouble();
        u=(a+b+c)/2;
        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin alanı>"+alan);



    }
}