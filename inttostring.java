   //Write your code here
String s="";
String s1="";
int d=0, rev=0;
d=n;
if(d<0)
{
    d=d*-1;
    s1="-";
}
if(d==0)
{
    s="0";
}
while(d>0)
{
    rev=d%10;
    d/=10;
    s=rev+""+s;
}
s=s1+s;
//System.out.println(s);
