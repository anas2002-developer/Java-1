//class Sports{
//    String getName(){
//        return ("Generic Sports");
//    }
//    void getNumberOfTeamMembers(){
//        System.out.println("Each team has n players in "+getName());
//    }
//}
//
//class Soccer extends Sports{
//    @Override
//    String getName(){
//        return ("Soccer Class");
//    }
//    @Override
//    void getNumberOfTeamMembers(){
//        System.out.println("Each team has 11 players in "+getName());
//    }
//}
//
//public class HackerrankMethodOverriding {
//    public static void main(String[] args) {
//        Sports obj1=new Sports();
//        Soccer obj2=new Soccer();
//        System.out.println(obj1.getName());
//        obj2.getNumberOfTeamMembers();
//        System.out.println(obj2.getName());
//        obj2.getNumberOfTeamMembers();
//    }
//}
//
//class BiCycle{
//    String define_me(){
//        return "a vehicle with pedals.";
//    }
//}
//
//class MotorCycle extends BiCycle {
//    String define_me() {
//        return "a cycle with an engine.";
//    }
//
//    MotorCycle() {
//        System.out.println("Hello I am a motorcycle, I am " + define_me());
//        String temp = super.define_me();
//        System.out.println("My ancestor is a cycle who is " + temp);
//    }
//}
//
//public class HackerrankMethodOverriding{
//    public static void main(String[] args) {
//        MotorCycle obj=new MotorCycle();
//    }
//
//}
