package comp2402a4;

public class UI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Tree System");
		RyabkoTree nn = new RyabkoTree();
		
		nn.push(12);
		nn.push(2);
		nn.push(4);
		nn.push(5);
		
		nn.printValues();
		
		System.out.println(nn.pop());
		System.out.println();
		System.out.println(nn.prefixSum(1));
		
		

	}

}
