package Interview240121;

// multiple inheritance program
interface Finance { abstract void bank();}
    interface Finance2{ abstract void mainBranch();}
    interface Finance3 extends Finance,Finance2 { abstract void subBranch();}
class Finance4 implements Finance3{
    public void bank(){ System.out.println("finance approved by bank"); }
    public void mainBranch(){ System.out.println("main branch authorize the finance"); }
    public void subBranch(){ System.out.println("sub branch deliver to customer"); }
    public static void main(String[] args) {
        Finance4 obj=new Finance4();
        obj.bank();
        obj.mainBranch();
        obj.subBranch();
    }
}
