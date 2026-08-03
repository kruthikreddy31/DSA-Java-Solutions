import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        // code here
        int q=x-y;
        int r=x*y;
        int s=x/y;
        int t=x%y;
        int p=x+y;
        
        // The below code prints the output
        System.out.println(p + " " + q + " " + r + " " + s + " " + t);
    }
}