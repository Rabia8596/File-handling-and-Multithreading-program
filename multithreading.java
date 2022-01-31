public class multithreading extends Thread {
   
    public void run(){
        for(int i=1;i<=3;i++)
        {
            try{
            Thread.sleep(500);
            }catch(Exception e){System.out.println(e);}
        System.out.println(i);
            }}
public static void main(String arg[])
{
multithreading t1=new multithreading();
multithreading t2=new multithreading();
multithreading t3=new multithreading();

t1.start();
try{
t1.join(1500);
}catch(Exception e){System.out.println(e);}

t2.start();
t3.start();
}
}
