import java.util.Scanner;

class sam{
public static void main(String args[]){
    int num;
    Scanner sc = new Scanner(System.in);
    num = sc.nextInt();
    for(int i= 0; i<num; i++){
            int temp = i;
            while(temp<num){
            System.out.print(" ");
            temp++;
            }
            System.out.println("#");
        }
    }
}