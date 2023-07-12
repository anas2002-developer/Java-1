class cs{
    int a;
    cs(){
        System.out.println("jyfuf");
    }
}
class python extends cs{
    python(){
        System.out.println("python");
    }
}
class test
{
    public static void main(String args[])
    {
        python p=new python();
        int a=0x1A;
        char b='A';
        int i;
        System.out.println(a);
//        System.out.println(b++);
//        b++;
        System.out.println((int)b);

        for( i=0;i<10;i++){
            System.out.println("i="+i);
        }
        System.out.println(i);

    }
}