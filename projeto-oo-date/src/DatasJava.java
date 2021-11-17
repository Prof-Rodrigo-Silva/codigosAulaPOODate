import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasJava {

	public static void main(String[] args) throws ParseException {
		
Date date = new Date();
		
		System.out.println(date);
		
		System.out.println("Data em milesegundos "+date.getTime());
		
		System.out.println("Dia do mês "+date.getDate());
		
		//Formatando datas
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Data atual: "+simpleDateFormat.format(date));
		
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.println("Data para BD: "+simpleDateFormat.format(date));
		
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		System.out.println("Data com horas: "+simpleDateFormat.format(date));
		
		simpleDateFormat.parse("1982-07-08 20:10:07");
		
		System.out.println(simpleDateFormat.parse("1982-07-08 20:10:07"));
		
		simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println(simpleDateFormat.parse("08/07/1982"));
		
		
		System.out.println("--------------------------------------------------");
		//-----------------------CALENDAR-------------------------
		
		Calendar calendar = Calendar.getInstance();
		
		System.out.println("Data em milesegundos "+calendar.getTimeInMillis());
		
		System.out.println("Dia do mês "+calendar.get(Calendar.DAY_OF_MONTH));
		
		System.out.println("Dia da semana "+calendar.get(Calendar.DAY_OF_WEEK));
		
		System.out.println("Hora do dia "+(calendar.get(Calendar.HOUR_OF_DAY)-1));
		
		System.out.println("Minuto "+calendar.get(Calendar.MINUTE));
		
		System.out.println("Segundo "+calendar.get(Calendar.SECOND));
		
		System.out.println("Ano "+calendar.get(Calendar.YEAR));
		
		simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Formatação "+simpleDateFormat.format(calendar.getTime()));

		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		System.out.println("Formatação "+simpleDateFormat.format(calendar.getTime()));
		
		
		System.out.println("--------------------------------------------------");
		
		simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		Date dataVencimentoBoleto = simpleDateFormat.parse("15/12/2021");
		
		Date dataAtual = simpleDateFormat.parse("16/11/2021");
		
		//After: data 1 maior que data 2
		//before: data 1 menor que data 2
		if(dataVencimentoBoleto.after(dataAtual)) {//data 1 maior q a data 2?
			System.out.println("Boleto não vencido");
		}else {
			System.out.println("Boleto vencido");
		}
		
		if(dataVencimentoBoleto.before(dataAtual)) {//data 1 menor q a data 2?
			System.out.println("Boleto vencido");
		}else {
			System.out.println("Boleto não vencido");
		}
		
	}

}
