
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

	public void remove(String element) {

		String[] tempListe = new String[liste.length];
		for (int i = 0; i < liste.length; i++) {
			tempListe[i] = liste[i];
		}

		liste = new String[liste.length - 1];
		int x = 0;
		for (int i = 0; i < liste.length + 1; i++) {
			if (tempListe[i] == element) {
				continue;
			} else {
				liste[x] = tempListe[i];

			}
			x++;
		}
	}

	public void remove(int index) {
		String[] tempListe = new String[liste.length];
		for (int i = 0; i < tempListe.length; i++) {
			tempListe[i] = liste[i];
		}
		liste = new String[tempListe.length - 1];
		int x = 0;
		for (int i = 0; i < liste.length; i++) {
			if (i == index) {
				continue;
			} else {
				liste[x] = tempListe[i];
			}
			x++;
		}

	}

}
