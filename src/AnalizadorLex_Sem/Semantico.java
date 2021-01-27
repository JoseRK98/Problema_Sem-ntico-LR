package AnalizadorLex_Sem;

public class Semantico {
	
	private String matriz[][]={//si se agregan datos a la tabla se tienen que modificar la cabezera para la entrada
			{" ","id","int","float","char",",",";","+","-","*","/","(",")","=","$","P","TIPO","V","A","E","T","F"},
			
			{"I0","I7","I4","I5","I6","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","I1","I2","ERROR","I3","ERROR","ERROR","ERROR"},
			
			{"I1","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","P0","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR"},
			
			{"I2","I8","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR"},
			
			{"I3","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","P2","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR"},
			
			{"I4","P3","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR"},
			
			{"I5","P4","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR"},
			
			{"I6","P5","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR"},
			
			{"I7","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","I9","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR"},
			
			{"I8","ERROR","ERROR","ERROR","ERROR","I11","I12","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","I10","ERROR","ERROR","ERROR","ERROR"},
			
			{"I9","I17","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","I16","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","I13","I14","I15"},
			
			{"I10","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","P1","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR"},
            
			{"I11","I18","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR"},
            
			{"I12","I7","I4","I5","I6","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","I19","I2","ERROR","I3","ERROR","ERROR","ERROR"},
            
			{"I13","ERROR","ERROR","ERROR","ERROR","ERROR","I20","I21","I22","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR"},
            
			{"I14","ERROR","ERROR","ERROR","ERROR","P11","P11","P11","P11","I23","I24","ERROR","I24","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR"},
            
			{"I15","ERROR","ERROR","ERROR","ERROR","P14","P14","P14","P14","P14","P14","ERROR","P14","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR"},
			
			{"I16","I17","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","I16","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","I25","I14","I15"},
			
			{"I17","ERROR","ERROR","ERROR","ERROR","P16","P16","P16","P16","P16","P16","ERROR","P16","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR"},
			
			{"I18","ERROR","ERROR","ERROR","ERROR","I11","I12","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","I26","ERROR","ERROR","ERROR","ERROR"},
			
			{"I19","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","P7","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR"},
            
			{"I20","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","P8","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR"},
            
			{"I21","I17","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","I16","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","I27","I15"},
			
			{"I22","I17","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","I16","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","I28","I15"},
			
			{"I23","I17","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","I16","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","I29"},
			
			{"I24","I17","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","I16","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","I30"},
			
			{"I25","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","I21","I22","ERROR","ERROR","ERROR","I31","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR"},
			
			{"I26","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","P6","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR"},
            
			{"I27","ERROR","ERROR","ERROR","ERROR","ERROR","P9","P9","P9","I23","I24","ERROR","P9","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR"},
			
			{"I28","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","P10","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR"},
			
			{"I29","ERROR","ERROR","ERROR","ERROR","ERROR","P10","P10","P10","I23","I24","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR"},
			
			{"I30","ERROR","ERROR","ERROR","ERROR","ERROR","P12","P12","P12","P12","P12","ERROR","P12","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR"},
			
			{"I31","ERROR","ERROR","ERROR","ERROR","ERROR","P13","P13","P13","P13","P13","ERROR","P13","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR","ERROR"}
	};
	//int var1 , var2 ; var1 = var2 ;
	public String[] DevuelvecabeceraRen(){
		String vec[]={" ","id","int","-","*","/","(",")","$","E","T","F"};
		return vec;
		
	}
	public int DevnumCol(){
		int vec=this.matriz.length;
		return vec;
	}
	public String[][] DevueltaTabla(){
		return this.matriz;
	}
	public String[] devuelveFila(int fila)
	{
		String vec[]=new String[matriz[0].length];
		for(int i=0;i<vec.length;i++)
		{
			vec[i]=this.matriz[fila][i];
		}
		
		return vec;
	}

	String pila[] = {"$","I0"};
	String aux[];
	String pala[]= new String [9];
	int act=1, act2;
	int pun, pun2, palab;
	String cad2="";
	String pilaS;
	int pan2;
	String p[]={"P","TIPO,id,V","A","int","float","char",",,id,V",";,P","id,=,E,;","E,+,T"
			,"E,-,T","T","T,*,F","T,/,F","F","(,E,)","id"};
	String ter[]={"id","int","float","char",",",";","+","-","*","/","(",")","=","$","P","TIPO","V","A","E","T","F"};
	boolean ban3=true;
	public String metodo(String ana[])
	{
		pilaS="$ I0 \n";
		aux=new String[ana.length+1];
		for(int i=0;i<ana.length;i++)
		{
			aux[i]=ana[i];
		}
		aux[ana.length]="$";
		ana=aux;
		while(ban3)
		{
			pun=0; pun2=0; palab=0;
			pala= new String [18];
			if(pila[act].compareTo(ana[act2])==0)
			{
				act2++;
				aux=new String[act];
				for(int i=0;i<act;i++)
				{
					aux[i]=pila[i];
				}
			}
			else
			{
				System.out.println(ana[act2]);
				for(int i=0;matriz[0][i].compareTo(ana[act2])!=0;i++)
				{
					pun++;
				}
				System.out.println(pila[act]);
				for(int i=0;matriz[i][0].compareTo(pila[act])!=0;i++)
				{
					pun2++;
				}
				String cad="";
				cad2=matriz[pun2][pun];
				System.out.println(cad2);
				if(cad2.compareTo("ERROR")==0)
				{
					pilaS+="\n"+cad2+""; 
					return pilaS;
				}
				if((cad2.charAt(0)+"").compareTo("P")!=0)
				{
					aux=new String[pila.length+2];
					for(int i=0;i<aux.length;i++)
					{
						if(i<pila.length)
						{
							aux[i]=pila[i];
						}
						else
						{
							aux[i]=matriz[0][pun];
							aux[i+1]=matriz[pun2][pun];
							i++;
						}
					}
					act2++;
				}
				else
				{
					int ps=0;
					if(matriz[pun2][pun].length()==2)
					{
						ps=Integer.parseInt(matriz[pun2][pun].charAt(1)+"");
					}
					else
					{
						ps=Integer.parseInt(matriz[pun2][pun].charAt(2)+"");
						ps+=10;
						System.out.print(ps+"Hola We");
					}
					if(ps!=6)
					{
						cad2=p[ps];
						for(int i=0;cad2.length()>i;i++)
						{
							if(cad2.charAt(i)!=',')
							{
								cad+=cad2.charAt(i);
							}
							else
							{
								pala[palab]=cad;
								palab++;
								act++;
								System.out.print(cad);
								cad="";
							}
						}
						pala[palab]=cad;
						System.out.println(cad);
						palab++;
					}
					else
					{
						pala[0]=",";
						pala[1]="id";
						pala[2]="V";
						palab+=3;
					}
					
					int pan=0;
					boolean ban=true, ban2=false;
					for(int i=0;i<pila.length&&!ban2;i++)
					{
						ban=false;
						if(pila[pila.length-1-i].indexOf("I")==-1||pila[pila.length-1-i].compareTo("TIPO")==0)
						{
							if(pila[pila.length-1-i].compareTo("I0")!=0)
							{
								for(int j=0;j<palab;j++)
								{
									if(pila[pila.length-1-i].compareTo(pala[j])==0)
									{
										ban=true;
										System.out.print(pala[j]+" ");
										pan=i+1;
										System.out.print(pan+" ");
									}
								}
								if(pila[pila.length-1-i].compareTo(pala[0])==0)
								{
									System.out.println(pala[0]);
									ban2=true;
								}
								if(!ban)
								{
									ban2=true;
								}
							}
						}
					}
					System.out.println();
					System.out.println();
					ban=false;
					aux=new String [pila.length-pan+2];
					pan=0;
					for(int i=0;i<aux.length-2;i++)
					{
						aux[i]=pila[i];
						pan++;
					}
					if(ps==0)
					{
						aux[pan]="P'";
					}
					else
					{
						if(ps>0&&ps<3)
						{
							aux[pan]="P";
						}
						else
						{
							if(ps>2&&ps<6)
							{
								aux[pan]="TIPO";
							}
							else
							{
								if(ps>5&&ps<8)
								{
									aux[pan]="V";
								}
								else
								{
									if(ps==8)
									{
										aux[pan]="A";
									}
									else
									{
										if(ps>8&&ps<12)
										{
											aux[pan]="E";
										}
										else
										{
											if(ps>11&&ps<15)
											{
												aux[pan]="T";
											}
											else
											{
												if(ps>14&&ps<17)
												{
													aux[pan]="F";
												}
											}
										}
									}
								}
							}
						}
					}
					pun=0; pun2=0;
					if(aux[pan].compareTo("P'")!=0)
					{
						for(int i=0;matriz[0][i].compareTo(aux[pan])!=0;i++)
						{
							pun++;
						}
						for(int i=0;matriz[i][0].compareTo(aux[pan-1])!=0;i++)
						{
							pun2++;
						}
						pan++;
						aux[pan]=matriz[pun2][pun];
					
						for(int i=0;i<aux.length;i++)
						{
							System.out.print(aux[i]+" ");
						}
						System.out.println();
					}
					else
					{
						ban3=false;
					}
				}
			}
			if(ban3)
			{
				pila=aux;
				act=pila.length-1;
				pilaS+="\n";
				for(int i=0;i<pila.length;i++)
				{
					pilaS+=pila[i]+" ";
				}
			}
			else
			{
				pilaS+="\n";
				pilaS+="$"+" ";
				pilaS+="I0"+" ";
				pilaS+="P'";
				pilaS+="\n";
				pilaS+="\n";
				pilaS+="ACEPTADA";
			}
			pilaS+="\n";
		}
		return pilaS;
	}
}