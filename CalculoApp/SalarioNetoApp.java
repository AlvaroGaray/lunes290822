package CalculoApp;
import java.util.*;
public class SalarioNetoApp {

	final static double inss=7, ir=15.6, sindicato=1,inssPatronal=22.5,TASA_ANTIGUEDAD=15.0;
	public static void main(String[] args) {
		
	
		double montoINSS, montoIR, montoSindicato,montoAntiguedad, montoINSSPatronal;
		double ingresoBruto, ingresoTotal, totalDeducciones, ingresoNeto;
		
		Scanner es=new Scanner(System.in);
		
		System.out.println("Ingrese su Salario Bruto(Basico) C$ ");
		ingresoBruto=es.nextDouble();
		
		System.out.println("Ingrse su Antiguedad");
		int antiguedad=es.nextInt();
		
		montoAntiguedad=ingresoBruto*(TASA_ANTIGUEDAD/100);
		montoSindicato=ingresoBruto*sindicato/100;
		ingresoTotal=ingresoBruto+montoAntiguedad;
		montoINSS=ingresoTotal*inss/100;
		montoIR=ingresoTotal*ir/100;
		totalDeducciones=montoINSS+montoIR+montoSindicato;
		montoINSSPatronal=ingresoTotal*inssPatronal/100;
		ingresoNeto=ingresoTotal-totalDeducciones;
		
		System.out.println("     --  TASAS  --     ");
		System.out.println("inss: "+inss+"%");
		System.out.println("ir: "+ir+"%");
		System.out.println("Sindicato: "+sindicato+" %");
		System.out.println("antiguedad: "+antiguedad+" Años");
		System.out.println("Monto por Antiguedad:"+montoAntiguedad);
		System.out.println("inss Patronal "+inssPatronal+" %");
		System.out.println("--  Ingresos Del Empleado  --");
		System.out.println("Ingreso Bruto(Básico)= C$ "+ ingresoBruto);
		System.out.println("Antiguedad = C$ "+ montoAntiguedad);
		System.out.println("IngresoTotal: "+ingresoTotal);
		System.out.println("--  Deducciones Del Empleado  --");
		System.out.println("--  Deducciones Sobre el ingreso Bruto  --");
		System.out.println("Monto del Sindicato =C$ "+montoSindicato);
		System.out.println("Deducciones sobre el Ingreso Total");
		System.out.println("Monto del INSS =C$"+montoINSS);
		System.out.println("Monto del IR =C$"+montoIR);
		System.out.println("Total de Deducciones = C$" + totalDeducciones);
		System.out.println("--  Deducciones del Empleador  --");
		System.out.println("Monto del INSS Patronal= C$ "+montoINSSPatronal);
		System.out.println("--  Total a pagar  --");
		System.out.println("Ingreso Neto = C$ "+ingresoNeto);
		
		
		es.close();


	}

}
