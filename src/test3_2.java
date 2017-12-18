import java.util.Scanner;

public class test3_2 {
        public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        char[] data = scn.nextLine().toCharArray();
        int n = data.length;
        int n1 = n/2;
        boolean flag = true;
        for (int i = 0 ; i<n1 ; i++){
            if (data[i] - data[n-1-i] != 0){
                flag = false;
            }
        }
        if (flag == true){
            System.out.println("Yes");
        }
        else
            System.out.println("No");
    }
}
