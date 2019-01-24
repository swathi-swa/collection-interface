import java.io.*;
import java.util.*;
import java.lang.*;
class Array
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
ArrayList<Integer> ar=new ArrayList<Integer>();
int n=in.nextInt();
int i=0;
while(i<n)
{
ar.add(in.nextInt());
i++;
}
System.out.println(ar);
}
}