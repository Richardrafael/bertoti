package mvc;

import java.util.*;

public class Model implements Subject {
	private ArrayList<Observer> observers;
	private String relatorio;
	private String relatorioDobro;
	private String relatorioTriplo;
	
	public Model() {
		observers = new ArrayList<Observer>();
	}
	
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}
	
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(relatorio, relatorioDobro, relatorioTriplo);
		}
	}
	
	public void relatoriosChanged() {
		notifyObservers();
	}
	
	public void setRelatorios(String relatorio) {
		this.relatorio = relatorio;
		this.relatorioDobro = String.valueOf(Integer.parseInt(relatorio) * 2);
		this.relatorioTriplo = String.valueOf(Integer.parseInt(relatorio) * 3);
		relatoriosChanged();
	}
	
	public String getRelatorio() {
		return relatorio;
	}
	
	public String getRelatorioDobro() {
		return relatorioDobro;
	}
	
	public String getRelatorioTriplo() {
		return relatorioTriplo;
	}
}