import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        String name;
        int s1,s2,s3,tot;
        float avg;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        name=sc.nextLine();
        System.out.println("Enter marks of subject 1:");
        s1=sc.nextInt();
        System.out.println("Enter marks of subject 2:");
        s2=sc.nextInt();
        System.out.println("Enter marks of subject 3:");
        s3=sc.nextInt();
        tot=s1+s2+s3;
        avg=(float)tot/3;
        System.out.println("Total marks you scored: "+tot);
        System.out.println("Average marks: "+avg);
        System.out.println("Result");
        if(avg>=90){
            System.out.println("Congrats!!! you've got a special reward\n");
        }
        else if(avg>=85){
            System.out.println("Good, you got a distinction\n");
        }
        else{
            System.out.println("You are passed\n");
        }
    }
}