class Main{
    public static void main(String[] args) {
        Main(){
            System.out.println("3 constructor");
        }
        {
            System.out.println("2 instance");
        }
        static{
            System.out.println("1 static");
        }
    }
}