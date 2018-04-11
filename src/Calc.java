
public class Calc{

	public static void main(String[] args){

		int x=Integer.parseInt(args[0]);
		char oper=args[1].charAt(0);
		int y=Integer.parseInt(args[2]);

		if(oper=='+'){
			int z=x+y;
			System.out.println("La somme de "+x+" et "+y+" est:" +z );
		}
		else if(oper=='-'){
			int z=x-y;
			System.out.println("La soustraction de "+x+" et "+y+" est:" +z );
		}
		else if(oper=='x'){
			int z=x*y;
			System.out.println("La multiplication de "+x+" et "+y+" est:" +z );
		}
		else if(oper=='/'){
			int z=x/y;
			System.out.println("La division de "+x+" et "+y+" est:" +z );
			}
}
} 