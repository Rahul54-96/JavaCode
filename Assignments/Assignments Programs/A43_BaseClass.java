package assignments;

public class A43_BaseClass {
	    public int pub = 10;
	    protected int prot = 20;
	    int def = 30;    
	    private int priv = 40;

	    public void showBase() {
	        System.out.println("BaseAccess -> pub:" + pub + " prot:" + prot + " def:" + def + " priv:" + priv);
	    }
	}