package Interview240121;
// Interface programs
interface Car {
    abstract void ford();
}
class Car2 implements Car{
    public void ford(){
        System.out.println("ford car made in UK");
    }
    public static void main(String[] args) {
        Car2 obj=new Car2();
        obj.ford();
    }
}



