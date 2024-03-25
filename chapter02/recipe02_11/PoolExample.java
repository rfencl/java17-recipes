

public class PoolExample implements Pool {	 
		   public static void main(String args[]) {
			   PoolExample pe = new PoolExample();
			   System.out.println(pe.squareOrRectConstantDepth(10,10,10));
			   System.out.println(pe.squareOrRectVariableDepth(10,10,3, 8, 12));
		   }
}
