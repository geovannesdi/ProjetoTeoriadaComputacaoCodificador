import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.Math;

import java.util.ArrayList;

import javax.swing.JOptionPane;

/*Nesse projeto é pega codigo monolitico e codificar e em um expressão com uma tabela equivalente, 
 * na decodificação tem a expressão para gerar o codigo monolitico atraves da tabela.
 * 
 * Autor Anderson e Geovane
 * Data: 08-10-11
 * Version 1.0 
 * A classe Rotulo o seguinte metodos
 * 
 *  operacaoTeste(String,Char ) nesse metodo receber uma subString e o tipo da operação, para salvar na tabela de operaçoes. que são duas Teste e Aritmetica
 *  inserirString
 * inserirQuadrupla(String) receber a String, a instrução de cada linha e colocar vetor de rotulo da quadrupla.
 * gerarPrimos(int) retorna sempre proximo numero primo.
 * quadruplaN(String) recebe a quadrupla e transforma os numeros primos de 2 a 7 com expoente da quadrupla para retorna numero natural EX: 2¹*3¹*5¹*7⁰=30
 * expressaoMonolitica(String) retorna uma string da expressao.
 * 
 * 
 *  
 * Autor Anderson e Geovane
 * Data: 10-10-11
 * Version 1.1 
 * Criação da telas
 * 
 * Autor Anderson e Geovane
 * Data: 10-10-11
 * Version 1.2 
 * vetores Array list rotulo teste,operacao;
 * 
 *  Autor Anderson e Geovane
 * Data: 11-10-11
 * Version 1.3 Beta 
 * vetores Array list rotulo teste,operacao;
 * imprimindo na tela e codificando na tela
 *
 *Autor Anderson e Geovane
 * Data: 13-10-11
 * Version 1.5 Beta 
 * vetores Array list rotulo teste,operacao;
 * imprimindo na tela e codificando na tela
 * salvando em TXT
 *
 */

public class Rotulo {

private ArrayList<String>rotulo,teste,operacao;
private String  quadrupla,expressaoMonolitica;	
private int cont,primo;
  	

public Rotulo()
{
	this.teste = new ArrayList<String>();
    this.operacao =new ArrayList<String>();
    this.rotulo = new ArrayList<String>();
    this.expressaoMonolitica="";
    this.cont=0;
    this.primo=1;
}

//metodo salva o tipo operação se é teste ou operaçao aritmetica
private void operacaoTeste(String subString,char tipo )
{
   
	//se no tipo for Char 'T' é teste
	if(tipo=='T')
     {  
	    boolean testDif = true;
			 //testando se algum teste igual no registrador
		int i =0;
	            
	    while(i<this.teste.size())
	        {    
	          if(teste.get(i).equals(subString))
			     {
				   this.quadrupla+=Integer.toString(i+1);
				   testDif=false;
			     }
	          i++;
	        }
	        
	         //se caso teste diferente salva
			  if(testDif)
			   {
				this.quadrupla+= Integer.toString(this.teste.size()+1);
				this.teste.add(subString);
			   }   
			 
     }else
	  {
		 boolean testDif = true;
			 //testando se algum teste igual no registrador
	      int i =0;
	    	      
	      while(i<this.operacao.size())
	       {
	    	
	    	  if(this.operacao.get(i).equals(subString))
			     {
	    	       this.quadrupla+=Integer.toString(i+1);
			       testDif=false;
			       break;
			     }
			 i++;
	       }
			 //se caso teste diferente salva
			 if(testDif)
			  {
				this.quadrupla+= Integer.toString(operacao.size()+1);
				this.operacao.add(subString);
			  }   
	    	 
	  }
 
}

//metodo para inserir a quadrupla no rotulos
public void inserirQuadrupla(String nome)
{
  //teste para ver se teste ou operaçao se retorna -1 é operação
	this.quadrupla="";
  int pos = nome.indexOf("se");
  
  if (pos != -1)
  {
	//teste quadrupla receber 1;  
	 this.quadrupla+="1";
	 //pegando valor do registrador
	 pos = nome.indexOf("-",pos);
	 pos++;
	 int subInicio = pos;
	 //laço para pegar subString do registrador comando isWhitespace retorna true quando emcontra espaço em branco
	 while(!Character.isWhitespace(nome.charAt(pos)))
		pos++;
	 String subS = nome.substring(subInicio,pos );
	 //salvando subString registrador 
	 this.operacaoTeste(subS,'T');	
     //pegando os rotulos do entao e senão    
	 while(pos<nome.length())
	   {
		 if(!Character.isWhitespace(nome.charAt(pos))&(!Character.isLetter(nome.charAt(pos)))&('_'!=nome.charAt(pos)))
		   this.quadrupla+=String.valueOf(nome.charAt(pos));
		   pos++;
	   }
       
  }else
    {
	  //operação receber 0 na quadrupla
	  this.quadrupla+="0";
	  pos=nome.indexOf("sub-");
	  if(pos==-1)
		  pos=nome.indexOf("ad-");
	  int subInicio = pos;
	  //achando o final da string da operação  
	  while(!Character.isWhitespace(nome.charAt(pos)))
		  pos++;
	  //pegando a subString
	  String subOpe = nome.substring(subInicio,pos);
	  operacaoTeste(subOpe,'O');//passando pelo metodo se operação é repetida
	  //pegando rotulos 
	  while(pos<nome.length())
	    {
		  if(!Character.isWhitespace(nome.charAt(pos))&(!Character.isLetter(nome.charAt(pos)))&('_'!=nome.charAt(pos)))
     		  {
		            
		    	this.quadrupla+=String.valueOf(nome.charAt(pos));
		        this.quadrupla+=String.valueOf(nome.charAt(pos));
		        break;
		      }  
		     pos++;
		 }
				
}
  
  rotulo.add(this.quadrupla);
   
}

//geração do numeros primos
public int gerarPrimo(int primo)
{
	primo++;//proximo primo
	int naoPrimo;//teste não é primo
	while(true)//loop
	{   naoPrimo=0;//zerando contador não primo
		for (int i = primo; i>1 ; i--)//primo divisivel por ele mesmo e por 1
		 if(primo % i == 0)
		   {
			   naoPrimo++;
			   if(naoPrimo==2)
				   break;
		   }
		if(naoPrimo==1)
			return primo;
	  primo++;	
	}
 }


//pegando numero natural do expoente
private long quadruplaN(String quad)
{
  long resul=1;
  int exp,baseP=1,pot;	
  for (int i = 0; i < quad.length(); i++)//elevando numero primos a numeros da quadrupla
   {  
	  exp = Integer.valueOf(String.valueOf(quad.charAt(i)));//pegar caracter e transforma em String depois para inteiro
	  baseP=gerarPrimo(baseP);//pegando a base dos numeros primo
	  pot = (int)Math.pow(baseP, exp);//elevando a potencia baseP^exp
      resul*=pot;//multiplicação de n operações baseP^exp...n
   } 
  return resul;//retornando resultado.
}

//gera a expressao monolitica
private void expressaoIntrucao(String quad, int base)
{
   	
   long  exp = quadruplaN(quad);
   this.expressaoMonolitica += String.valueOf(base)+"^"+String.valueOf(exp)+"*";//expressão monolitica 
  
}

//fazendo a fatoração com numeros primo o expoente dos rotulos
private String decodificaExpoente(long n)
{
  
  int i=0,div=1; //divisor primo e contador
  int cont[]= new int[4];//vetor para salvar os expoente 
  String quadrupla="";//quadrupla
  div=gerarPrimo(div);//gerando numero primo
  cont[i]=0;
  if(n % div == 0 )// primeira testa se e operação aritmetica ou Teste;
  {
	  cont[i]++;//se for dividido incremeta o contador
	  n/=div;
  }
  div=gerarPrimo(div);//pega numero 3 primo
  i++;
  cont[i]=0; //contador primo 3
  //divisões
  while(true)
    if(n%div==0)
	  {
		cont[i]++;
		n/=div;
	   }else
	     {
		   div=gerarPrimo(div);
		   i++;
		   cont[i]=0;
		    while(true)
		      if(n%div==0)
		  	    {
		    	  cont[i]++;
		  	      n/=div;
		  	     }else
		  	       {
		  	    	 div=gerarPrimo(div);
		  	    	 i++;
		  	    	 cont[i]=0;
		  	         while(true)
		  	          if(n%div==0)
				  	    {
				    	  cont[i]++;
				  	      n/=div;
				  	     }else
				  	       {
				  	    	 for (int j = 0; j < cont.length; j++)
				  	    		quadrupla+=String.valueOf(cont[j]);
							 return quadrupla;	
				  	       }
		  	         }	
		  	    	
		    }
	
  }
//recuperando o expoente do rotulo 
private long[] recuperarExpRotulo(String exp)
{
	int pos,tam=0;
	exp+="*";
	for (int j = 0; j < exp.length(); j++) 
		if('^'==exp.charAt(j))
	 		  tam++;	
	 	 
  long expoente[] = new long[tam]; 
  
  pos=0;
  for (int j = 0; j < tam; j++)
  {
	 
	 while('^'!=exp.charAt(pos))
	    pos++;
	 pos++;
	 int subInicio = pos;
	 while('*'!=exp.charAt(pos))
	   pos++;
		
	
	expoente[j]=Long.valueOf(exp.substring(subInicio,pos));;
  }	
   return expoente;
}




//decodificação da expressao monolitica
public String[] codigoMonolitico(String exp)
{

  int i=0;
  
  long expoentes[] = recuperarExpRotulo(exp);
  String codigo[] = new String[expoentes.length];
  String quad[] = new String[expoentes.length];
  for (int j = 0; j < expoentes.length; j++)
      quad[j] = new String(decodificaExpoente(expoentes[j]));


 for (int j = 0; j < expoentes.length; j++)
  if('0'==quad[j].charAt(i))
    {
	  i=0;
	  i++;
	  codigo[j]= new String(String.valueOf(j+1)+": faca "+this.operacao.get((Integer.valueOf(String.valueOf(quad[j].charAt(i))))-1)+ " va_para "+String.valueOf(quad[j].charAt(i+1)));  
	  i=0;
	   
    }else	
      {  
	    i=0;
	    i++;
	    codigo[j]= new String(String.valueOf(j+1)+": se  zero-"+this.teste.get(Integer.valueOf(String.valueOf(quad[j].charAt(i)))-1)+ " entao va_para  "+String.valueOf(quad[j].charAt(i+1))+" senao va_para "+String.valueOf(quad[j].charAt(i+2)));
        i=0;
	   
      }
    
   return codigo;

}

//observação alguns metodos get poderão sair

public void expressaoMonolitica()
{
	
	while(cont<(rotulo.size()))
    {    
    	primo=gerarPrimo(primo);
    	expressaoIntrucao(rotulo.get(cont),primo);
    	cont++;
    }

}


public String getExpressaoMonolitica()
{
    this.expressaoMonolitica = this.expressaoMonolitica.substring(0, this.expressaoMonolitica.length()-1);
	
	return expressaoMonolitica;
}

/***************************************************************************************************
*
*                                  Salvar arquivo
*
*****************************************************************************************************/
//armazena na memoria sencudaria
public void Armazena( )
{
    try {
          String caminho = "testeTC.txt";
          FileWriter escrita = new FileWriter(caminho);
          BufferedWriter escritor = new BufferedWriter(escrita);

          for(int i=0;i< operacao.size();i++)
          {
               escritor.write(operacao.get(i).toString()+";");
               
          }
          escritor.newLine();
          for(int i=0;i< teste.size();i++)
          {
               escritor.write(teste.get(i).toString()+";");

          }

            escritor.flush();
            escritor.close();
            escrita.close();

        }   catch (Exception e)
            {
                JOptionPane.showMessageDialog(null,"Erro ao criar arquivo!!");

            }
    }
//carregar o arquivo para memoria
public boolean carreharArquivo() throws IOException
{

      try {

           FileReader fr = new FileReader("testeTC.txt");
       BufferedReader br = new BufferedReader(fr);
               
           String line, lis_op = null, lis_tes = null;

       this.operacao.clear();
       this.teste.clear();


          if ((line = br.readLine()) != null)
          {
                   lis_op = line;

          }

          if ((line = br.readLine()) != null)
          {
                   lis_tes = line;
          }
        
          
          String s1[] = null;
          for(int i = 0; i <= lis_op.length(); i++){
              
              s1 = lis_op.split(";");

          }

             for (int i = 0; i < s1.length; i++) {
                 operacao.add(s1[i]);

             }

          for(int i = 0; i <= lis_tes.length(); i++){

              s1 = lis_tes.split(";");

          }

              for (int i = 0; i < s1.length; i++) {
                 teste.add(s1[i]);

             }

              return true;
              
      } catch (Exception e)
         {
                JOptionPane.showMessageDialog(null,"Erro ao carregar arquivo!!");
                return false;
         }

      }
 
}


	

