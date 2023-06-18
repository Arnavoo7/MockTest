import java.util.Scanner;

public class Sqrt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if(num <= 1) {
            System.out.println(num);
            System.exit(0);
        }

        int start = 1, end = num/2;

        while(start < end) {
            int mid = (start + (end-start)/2) + 1;
            int div = num/mid;

            if(div == mid) {
                System.out.println(mid);
                System.exit(0);
            }
            if(div > mid)
                start = mid;
            else
                end = mid-1;
        }

        System.out.println(start);


    }
}