import java.io.*;
import java.util.*;
import java.lang.*;
class hashmap
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
HashMap< Integer,String> sw=new HashMap<>();
int t=in.nextInt();
int i=0;
while(i<t)
{
sw.put(in.nextInt(),in.nextLine());
}
System.out.println(sw);
}}s

