import java.io.*;
import java.util.*;
import java.lang.*;
class hash
{
public static void main(String [] args)
{
Scanner in=new Scanner(System.in);
Set<Integer> st=new TreeSet<Integer>();
int s=in.nextInt();
int i=0;
while(i<s)
{
st.add(in.nextInt());
i++;
}

System.out.println(st);
}
}