import java.io.*;
import java.util.*;
import java.lang.*;
class set
{
public static void main(String [] args)
{
Scanner in=new Scanner(System.in);
Set<String> st=new TreeSet<String>();
int s=in.nextInt();
int i=0;
while(i<s)
{
st.add(in.nextLine());
i++;
}

System.out.println(st);
}
}