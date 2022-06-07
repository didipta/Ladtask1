package classs;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        try{
            Scanner sc=new Scanner(System.in);
            Stack<Integer> p=new Stack<Integer>(5);
            Queue<Integer> q=new Queue<Integer>(5);

            for(int i=0;i<5;i++)
            {
                int a=sc.nextInt();
                p.push(a);
            }
            for(int i=0;i<3;i++)
            {
                p.pop();
            }
            {
                int a=sc.nextInt();
                q.enqueue(a);
            }
            for(int i=0;i<3;i++)
            {
                q.dequeue();
            }



        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
