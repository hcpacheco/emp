package emp.controle;

import java.util.List;

import emp.ZonaDePatrulha;

public class Business {
	
	private Notificacao n; // = new Notificacao();
	private List<ZonaDePatrulha> z; // = new ZonaDePatrulha();
//	private DAO =

	public void newZonaDePatulha(List<Float> latitudes, List<Float> longitudes) 
	{
		int tamanhoLatitude = latitudes.size();
		int tamanhoLongitude = longitudes.size();
		
		//checa poligono formado por quatro pontos
		if(tamanhoLatitude == 4 && tamanhoLongitude==4)
		{
			ZonaDePatrulha novaZona = new ZonaDePatrulha(latitudes,longitudes);
			this.z.add(novaZona);
		}
	}
	
	public void enviaParaDrone()
	{
		
	}
	
	public void enviaParaTornozeleira()
	{
		
	}
	
	public boolean validar(String usuario, String senha)
	{
		return true;
	}
	
	
}
