package emp;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import emp.persistencia.Civil;
import emp.persistencia.DAOEmp;
import emp.persistencia.Detento;
import emp.persistencia.ObjetoPerigoso;
import emp.persistencia.Policial;
import emp.persistencia.Sexo;

public class Simulacao {

	public static void main(String[] args) 
	{
		//inicializacao de 'Banco de Dados'
		
		//ArraList e posicoes
		List<Float> posicoes = new ArrayList<Float>();
		posicoes.add(new Float(10.2));
		posicoes.add(new Float(1.1));
		posicoes.add(new Float(3.3));
		
		//Data de nascimento
		Date data1 = new Date();
		Date data2 = new Date();
        // Converte string para date
        SimpleDateFormat dateformat = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        String strdate = "02-04-2000 21:35:00";

        try {
			data1 = dateformat.parse(strdate);
		} catch (java.text.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

            
        SimpleDateFormat dateformat2 = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        String strdate2 = "10-08-1988 11:10:00";
        try {
			data2 = dateformat2.parse(strdate2);
		} catch (java.text.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		//CIVIS
		//(String nome, Date d, Sexo s, String cpf, List<Float> posicoes, boolean suspeito)
        //(List<Float> posicoes, boolean suspeito)
		Civil civil1 = new Civil("Maria", data1, Sexo.FEMININO, "1234", posicoes, false);
		Civil civil2 = new Civil("Joao", data2, Sexo.MASCULINO, "2345", posicoes, false);
		Civil civil3 = new Civil( posicoes, false);
		Civil civil4 = new Civil( posicoes, true);
		Civil civil5 = new Civil( posicoes, true);
		Civil civil6 = new Civil("Aline", data2, Sexo.FEMININO, "0012", posicoes, false);
		
		//POLICIAIS
		//(String nome, Date d, Sexo s, String cpf, String usuario, String senha, int permissao)
		Policial policial1 = new Policial("Alberto",data1,Sexo.MASCULINO,"8260","alberto","senha",0);
		Policial policial2 = new Policial("Elena",data2,Sexo.FEMININO,"9922","elena","policial",1);
		
		//DETENTOS
		//(String nome, Date d, Sexo s, String cpf,List<Float> posicoes, int atividadeCardiaca)
		Detento detento1 = new Detento("Juliana", data2, Sexo.FEMININO, "0101", posicoes, -1);
		Detento detneto2 = new Detento("Zé", data1, Sexo.MASCULINO, "1010", posicoes, -1);
		
		//OBJETOS PERIGOSOS
		//(String nome, int tamanho)
		ObjetoPerigoso objeto1 = new ObjetoPerigoso("Faca", 17);
		ObjetoPerigoso objeto2 = new ObjetoPerigoso("Pistola", 21);
		ObjetoPerigoso objeto3 = new ObjetoPerigoso("Machado", 50);
		
		
		
		//Inicialização de banco de dados para simulação
		DAOEmp d = new DAOEmp();
		
		
		
		


	}

}
