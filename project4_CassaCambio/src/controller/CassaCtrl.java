package controller;

import java.util.List;

import model.Cambio;
import model.Cassa;

public class CassaCtrl {

	private Cassa cassa;
	private RegistroCtrl registroCambi;

	public CassaCtrl(String nome, double fondoDollari) {
		this.cassa = new Cassa(nome, fondoDollari);
		this.registroCambi = new RegistroCtrl();
	}
	
	public boolean aggiungiDollari(double importo) {
		return cassa.aggiungiDollari(importo);
	}
	
	public String eseguiCambio(double importoEuro) {
		if(importoEuro <= 0) {
			return "Errore: l'importo deve essere positivo";
		}
		
		if(!cassa.verificaDisponibilita(importoEuro)) {
			return "Mi spiace, fondi insufficienti per eseguire il cambio";
		}
		
		Cambio cambio = cassa.eseguiCambio(importoEuro);
		
		if(cambio != null) {
			registroCambi.registraCambio(cambio);
			stampaScontrino(cambio);
			return "Cambio eseguito correttamente. Importo Dollari: " + cambio.getImportoDollari() +"\nEuro versati: " + cambio.getImportoEuro();
		}
		
		
		return "Non è stato possibile effettuare il cambio";
	}

	public void infoCassa() {
		System.out.println(cassa.toString());
	}

	
	public String getStoricoCambi() {
		return registroCambi.getStoricoCambi();
	}
	
	public String getStoricoCambi2() {
		
		List<Cambio> listaCambi = registroCambi.getListaCambi();
		
		StringBuilder sb = new StringBuilder();
		if(listaCambi.size() != 0) {
			for (Cambio cambio : listaCambi) {
				sb.append(cambio.toString());
			}
			
			return sb.toString();
		}
		
		return "Mi spiace, non ci sono cambi effettuati";
		
	}
	
	
	private static String stampaScontrino(Cambio cambio) {
		return "";
	}
	
}
