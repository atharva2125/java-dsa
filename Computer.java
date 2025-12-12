public class Computer {
    public void phone(){
        System.out.println("This is a phone method in Computer class");
    }
    public String getpen(int car){
        if(car>100){
            return "Pencil";
        }else{
            return "Pen";
        }
    }
    public static void main(String args[]){
        Computer comp=new Computer();
        comp.phone();
        String result=comp.getpen(80);
        System.out.println(result);}
}
