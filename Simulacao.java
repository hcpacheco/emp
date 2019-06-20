package emp;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import emp.persistencia.Civil;
import emp.persistencia.DAOEmp;
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
		Date d1 = new Date();
		Date d2 = new Date();
        // Converte string para date
        SimpleDateFormat dateformat = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        String strdate = "02-04-2000 21:35:00";
        try {
            d1 = dateformat.parse(strdate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
            
        SimpleDateFormat dateformat2 = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        String strdate2 = "10-08-1988 11:10:00";
        try {
            d2 = dateformat2.parse(strdate2);
        } catch (ParseException e) {
            e.printStackTrace();
        }
		
		
		//CIVIS
		//(String nome, Date d, Sexo s, String cpf, List<Float> posicoes, boolean suspeito, boolean conhecido)
		Civil c1 = new Civil("Maria", d1, Sexo.FEMININO, "1234", posicoes, false);
		Civil c2 = new Civil("Joao", d2, null, null, null, false);
		Civil c3 = new Civil( null, false);
		Civil c4 = new Civil( null, true);
		Civil c5 = new Civil( null, true);
		Civil c6 = new Civil("Aline", d2, null, null, null, false);
		
		//POLICIAIS
		
		//DETENTOS
		
		//OBJETOS PERIGOSOS
		
		//Inicialização de banco de dados para simulação
		DAOEmp d = new DAOEmp();
		
		
		
		


	}

}
