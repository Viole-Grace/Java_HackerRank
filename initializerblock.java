//Write your code here
static boolean flag = false;
static int B=0;
static int H=0;
static {
    Scanner Scanner=new Scanner(System.in);
    B=Scanner.nextInt();
    H=Scanner.nextInt();
    Scanner.close();
    if(B<=0 || H<=0)
    {
        System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
    else 
    {
        flag=true;
    }
    
}
