import java.io.*;
class rectangle
{
int length,width;
void getdata(int x,int y)
{
length=x;
width=y;
}
void rarea()
{
int area=(length*width);
retutn(area);
}
}
class rect
{
public static void main(String args[])
{
int area1;
rect r1=new rect();
r1.getdata(5,6);
system.out.println("area="+area);
}
}