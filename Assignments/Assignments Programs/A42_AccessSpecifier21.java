package assignments;

public class A42_AccessSpecifier21 {
 public int pub = 1;
 protected int prot = 2;
 int def = 3;       
 private int priv = 4;

 public void printMembers() {
     System.out.println("PackageA members -> pub:" + pub + " prot:" + prot + " def:" + def + " priv:" + priv);
 }
}
