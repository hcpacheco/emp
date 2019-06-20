package emp.persistencia;

import java.util.ArrayList;
import java.util.List;

public class ZonaDePatrulha {
	private List<Float> latitudes;//= new ArrayList();
	private List<Float> longitudes;// = new ArrayList();
	private String nome;
	
	public List getLatitudes() {
		return latitudes;
	}
	
	public List getLongitudes() {
		return longitudes;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public ZonaDePatrulha(List latitudes, List longitudes, String nome) {
		super();
		this.latitudes = latitudes;
		this.longitudes = longitudes;
		this.nome = nome;
	}

	public ZonaDePatrulha(List<Float> latitudes, List<Float> longitudes) {
		super();
		this.latitudes = latitudes;
		this.longitudes = longitudes;
	}
	
	
	
	

}
