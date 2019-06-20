package emp.controle;

public class ControleEmpSingleton {
	private Business b;// = new Business();
//	private DAOEmp d;// = new DAOEmp()
	
	//Instancia singleton de ControleEmp
	private static final ControleEmpSingleton instance = new ControleEmpSingleton();

	//Construtor privado Singleton
	private ControleEmpSingleton() 
	{
		this.b = new Business(null, null);
		//this.d = new DAOEmp();
	}
	
	
	public static ControleEmpSingleton getInstance() 
	{
		return instance;
	}
	
	public boolean validarSenha(String usuario, String senha)
	{
		boolean correto = b.validar(usuario, senha);
		if(correto)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
}
