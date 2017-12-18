import java.util.Scanner;

public class test3_1 {
        public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int s1 = scn.nextInt();
        int s2 = scn.nextInt();
        int s3 = scn.nextInt();
        System.out.println(Math.max(Math.max(s1,s2),s3));
        System.out.println(Math.min(Math.min(s1,s2),s3));
        }
    }