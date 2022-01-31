import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

class filing
{

public static void main (String args[])
{
try{

File f = new File("save_data.txt");
Scanner s = new Scanner(f);
StringTokenizer a;

while( s.hasNextLine())
{
String data = s.nextLine();
a = new StringTokenizer(data," ");
while(a.hasMoreTokens())
{
System.out.println(a.nextToken());
}
}

s.close();

}
catch (IOException e)
{
System.out.println("error occured");
e.printStackTrace();
}
}
}
