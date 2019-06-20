package emp.persistencia;

import java.util.List;

public class DAOEmp {
	private List<Policial> usuarios;
	private List<Civil> civis;
	private List<Detento> detentos;
	private List<ObjetosPerigosos> objetos;
	
	public List<Policial> getUsuarios() 
	{
		return usuarios;
	}
	
	public void setUsuarios(List<Policial> usuarios) 
	{
		this.usuarios = usuarios;
	}
	
	public List<Civil> getCivis() 
	{
		return civis;
	}
	
	public void setCivis(List<Civil> civis) 
	{
		this.civis = civis;
	}
	
	public List<Detento> getDetentos() 
	{
		return detentos;
	}
	
	public void setDetentos(List<Detento> detentos) 
	{
		this.detentos = detentos;
	}
	
	public List<ObjetosPerigosos> getObjetos() 
	{
		return objetos;
	}
	
	public void setObjetos(List<ObjetosPerigosos> objetos) 
	{
		this.objetos = objetos;
	}
	
	
}
