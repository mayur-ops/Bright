package InheritanceDemo;
// example of hirarchical
public class MainBank {
    public void mainBranch(){
        System.out.println("this is main branch");
    }
} //Main bank class ends
class Hsbc{
    public void branch(){
        System.out.println("hsbc is sub branch");
    }
} // HSBC class ends
class Barclays extends MainBank{
    public void subBranch(){
        System.out.println("barclays sub branch");
    }
    public static void main(String[] args) {
        Barclays obj=new Barclays();
        obj.subBranch();
        obj.mainBranch();
        //obj.Hsbc;
    }
}// Barclays class ends

