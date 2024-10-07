public class ReverseNumber
{
    public static void main (String[] args)
    {
        int num=12345;
        int m=num;                  //Temporary Copy of number
        int rev_num=0;              //Reversed Number
        int r=0;                    //Remainder

        while(m%10!=0)
        {
            r=m%10;
            rev_num=10*rev_num+r;
            m=m/10;
        }
        System.out.println("The reverse of number "+num+" is:"+rev_num);
    }
}