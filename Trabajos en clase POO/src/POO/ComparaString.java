package POO;

public class ComparaString {

	public static void main(String[] args) {
		String S="";
		boolean F=true;
		do{
			System.out.print("ESCRIBE UNA LETRA  M=Mujer,  H=Hombre: ");
			S = Leer.dato();
			
			if(S.equals("M") || S.equals("H")) {
				break;
			}
		}while(F);
		
		System.out.println("YA PASÓ");
		System.out.println(S);
		
		if(S.equals("M")){
			System.out.println("ES MUJER");
		}
		else {
			System.out.println("ES HOMBRE");
		}
	}
}