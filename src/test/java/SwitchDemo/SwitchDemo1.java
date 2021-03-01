package SwitchDemo;

public class SwitchDemo1 {
    public static void main(String[] args) {
        int age=18;

        switch (age){
            case 16:
                System.out.println("you are under 18");
                break;
            case 18:
                System.out.println(" are you eligible for vote");
                    break;
            case 20:
                System.out.println("you are over 18");
                break;
            default:
                System.out.println("you are not eligible for vote");
        } //switch condition ends
    }// main method ends
}// class ends
