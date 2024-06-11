package org.mod;
import java.util.Calendar;
public class Servico {
	public static String saudacao(){
		var cal = Calendar.getInstance();
		int hora = cal.get(Calendar.HOUR_OF_DAY);
		if (hora>18){
			return "boa noite";
		} else if (hora>12){
			return "boa tarde";
		} else {
			return "bom dia";
		}
	}	
}