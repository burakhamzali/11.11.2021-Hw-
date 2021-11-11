
public class MyList {

	String[] liste;

	public MyList() {
		this.liste = new String[0];
	}

	public String[] add(String element) {
		String[] tempListe = new String[liste.length + 1];

		for (int i = 0; i < liste.length; i++) {
			tempListe[i] = liste[i];
		}
		tempListe[tempListe.length - 1] = element;
		liste = new String[tempListe.length];
		for (int i = 0; i < tempListe.length; i++) {
			liste[i] = tempListe[i];
		}
		return liste;
	}
	
	public void list() {
		System.out.println("Listenin Elemanları:");
		for (String result : liste) {
			System.out.println(result);
		}
	}

}
