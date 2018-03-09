package biblioteka;

import java.util.LinkedList;

import biblioteka.interfejs.BibliotekaInterfejs;

public class Biblioteka implements  BibliotekaInterfejs {

	private LinkedList<Knjiga> knjige = new LinkedList<Knjiga>();
	
	@Override
	public void dodajKnjigu(Knjiga k) {
		// TODO Auto-generated method stub
		knjige.add(k);
	}

	@Override
	public void obrisiKnjigu(Knjiga k) {
		// TODO Auto-generated method stub
		knjige.remove(k);
	}

	@Override
	public LinkedList<Knjiga> vratiSveKnjige() {
		// TODO Auto-generated method stub
		return knjige;
	}

	@Override
	public LinkedList<Knjiga> pronadjiKnjigu(Autor autor, String isbn, String naslov, String izdavac) {
		// TODO Auto-generated method stub
		LinkedList<Knjiga> novaLista = new LinkedList<Knjiga>();
		for(int i=0; i<knjige.size(); i++) {
			if(knjige.get(i).getNaslov().contains(naslov))
				novaLista.add(knjige.get(i));
		}
		return novaLista;
	}
	
	
}
