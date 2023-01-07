package Herencia;
//PROGRAMA DONDE SE LLENAN LOS DATOS DE 3 TIPOS DE PRODUCTOS MEDIANTE ARREGLOS Y OBJETOS, Y LUEGO SE IMPRIMEN LOS DATOS POR SEPARADO Y ORDENADOS
public class UsoEmpresaAgro {

	public static void main(String[] args) {
		System.out.println("\tEMPRESA AGROALIMENTARIA");
		//SE CREAN Y LLENAN LOS PRODUCTOS FRESCOS
		Frescos[] fresc = new Frescos[2];
		fresc[0] = new Frescos("08-NOVIEMBRE-2020", "243TB2", "03-ENERO-2019", "MÉXICO");
		fresc[1] = new Frescos("11-JULIO-2022", "834AS9", "27-DICIEMBRE-2018", "FRANCIA");
		
		//SE CREAN Y LLENAN LOS PRODUCTOS REFRIGERADOS
		Refrigerados[] refri = new Refrigerados[3];
		refri[0] = new Refrigerados("09-AGOSTO-2024", "175FR3", "66ER41", "11-MARZO-2017", 9.4);
		refri[1] = new Refrigerados("23-DICIEMBRE-2020", "247HQ4", "52XB27", "04-JULIO-2018", 17.6);
		refri[2] = new Refrigerados("11-OCTUBRE-2019", "302KQ2", "88VY62", "09-ABRIL-2016", 10.4);
		
		//SE CREAN Y LLENAN LOS PRODUCTOS CONGELADOS
		CongeladosAire[] conge_aire = new CongeladosAire[2]; //CONGELADOS POR AIRE
		conge_aire[0] = new CongeladosAire("04-ENERO-2019", "986ÑK1", "21-JUNIO-2015", "VENEZUELA", 0.6, 11.4, 45.7, 15.8, 27.1);
		conge_aire[1] = new CongeladosAire("29-MARZO-2025", "360HY7", "03-AGOSTO-2020", "ITALIA", -2.4, 9.7, 38.9, 19.8, 31.6);
		CongeladosAgua[] conge_agua = new CongeladosAgua[2]; //CONGELADOS POR AGUA
		conge_agua[0] = new CongeladosAgua("01-ABRIL-2028", "127DE4", "30-MARZO-2023", "CANADÁ", -0.3, 3.2);
		conge_agua[1] = new CongeladosAgua("19-AGOSTO-2021", "118AM8", "07-FEBRERO-2019", "JAPÓN", -1.4, 5.9);
		CongeladosNitrogeno[] conge_nitro = new CongeladosNitrogeno[1]; //CONGELADOS POR NITRÓGENO
		conge_nitro[0] = new CongeladosNitrogeno("31-DICIEMBRE-2024", "101YJ5", "13-ABRIL-2020", "INGLATERRA", -5.3, "RÁPIDO", 31.4);
		
		//SE IMPRIMEN LOS PRODUCTOS FRESCOS
		System.out.println("-PRODUCTOS FRESCOS-");
		for(int a=0; a<fresc.length; a++) {
			System.out.println((a+1) + "- " + fresc[a].ToStringFrescos());
		}
		
		//SE IMPRIMEN LOS PRODUCTOS REFRIGERADOS
		System.out.println();
		System.out.println("-PRODUCTOS REFRIGERADOS-");
		for(int b=0; b<refri.length; b++) {
			System.out.println((b+1) + "- " + refri[b].ToStringRefrigerados());
		}
		
		//SE IMPRIMEN LOS PRODUCTOS CONGELADOS
		System.out.println();
		System.out.println("-PRODUCTOS CONGELADOS-");
		//SE IMPRIMEN SOLO LOS PRODUCTOS CONGELADOS POR AIRE
		System.out.println("POR AIRE");
		for(int c=0; c<conge_aire.length; c++) {
			System.out.println((c+1) + "- " + conge_aire[c].ToStringCongeAire());
		}
		
		//SE IMPRIMEN SOLO LOS PRODUCTOS CONGELADOS POR AGUA
		System.out.println();
		System.out.println("POR AGUA");
		for(int d=0; d<conge_agua.length; d++) {
			System.out.println((d+1) + "- " + conge_agua[d].ToStringCongeAgua());
		}
		
		//SE IMPRIMEN SOLO LOS PRODUCTOS CONGELDOS POR NITRÓGENO
		System.out.println();
		System.out.println("POR NITRÓGENO");
		for(int e=0; e<conge_nitro.length; e++) {
			System.out.println((e+1) + "- " + conge_nitro[e].ToStringCongeNitrogeno());
		}
	}
}
//JOSÉ ALFREDO GARCÍA AGUILAR
//CLASE 4-5 PM