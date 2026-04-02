package controller;

import java.util.ArrayList;
import java.util.List;

import model.Cambio;

public class RegistroCtrl {
	
	private List<Cambio> listaCambi;

	public RegistroCtrl() {
		this.listaCambi = new ArrayList<>();
	}

	public void registraCambio(Cambio cambio) {
		if(cambio != null) {
			this.listaCambi.add(cambio);
		}
	}

	public List<Cambio> getListaCambi() {
		return listaCambi;
	}
	
	public String getStoricoCambi() {
				
		if(listaCambi.size() != 0) {
			StringBuilder sb = new StringBuilder();
			
			sb.append("==== STORICO CAMBI ====");
			
			for (Cambio cambio : listaCambi) {
				sb.append(cambio.toString()).append("\n");
			}
			
			sb.append("Totale cambi avvenuti: " + listaCambi.size());
			sb.append("=======================");
			
			return sb.toString();
		}else {
			return "Non ci sono stati cambi sulla seguente macchina";
		}

	}
	
	
}
