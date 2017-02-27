package framework_sara.classes;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import framework_sara.main_exer3;

@XStreamAlias("Fecha")
public class Fecha implements Serializable {

	@XStreamAlias("fecha")
	private String fecha;
	@XStreamAlias("day")
	private int day;
	@XStreamAlias("month")
	private int month;
	@XStreamAlias("year")
	private int year;

	private SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy");

	public String getfecha() {
		return fecha;
	}

	public Fecha() {

	}

	public void setfecha(String fecha) {
		this.fecha = fecha;
	}

	public Fecha(String fecha) {
		String[] SplitArray = null;
		String fechaformat = null;

		SplitArray = fecha.split("-|\\/");
		this.day = Integer.parseInt(SplitArray[0]);
		this.month = Integer.parseInt(SplitArray[1]);
		this.year = Integer.parseInt(SplitArray[2]);
		fechaformat = day + "/" + month + "/" + year;
		this.fecha = fechaformat;

	}

	public Fecha(String fecha, String format) {
		String[] SplitArray = null;
		String fechaformat = null;

		switch (format) {

		case "dd/mm/yyyy":
			SplitArray = fecha.split("/");
			this.day = Integer.parseInt(SplitArray[0]);
			this.month = Integer.parseInt(SplitArray[1]);
			this.year = Integer.parseInt(SplitArray[2]);
			fechaformat = day + "/" + month + "/" + year;
			this.fecha = fechaformat;
			break;

		case "dd-mm-yyyy":
			SplitArray = fecha.split("-");
			this.day = Integer.parseInt(SplitArray[0]);
			this.month = Integer.parseInt(SplitArray[1]);
			this.year = Integer.parseInt(SplitArray[2]);
			fechaformat = day + "-" + month + "-" + year;
			this.fecha = fechaformat;

			break;
		case "yyyy/mm/dd":
			SplitArray = fecha.split("/");
			this.day = Integer.parseInt(SplitArray[2]);
			this.month = Integer.parseInt(SplitArray[1]);
			this.year = Integer.parseInt(SplitArray[0]);
			fechaformat = day + "/" + month + "/" + year;
			this.fecha = fechaformat;
			break;

		case "yyyy-mm-dd":
			SplitArray = fecha.split("-");
			this.day = Integer.parseInt(SplitArray[2]);
			this.month = Integer.parseInt(SplitArray[1]);
			this.year = Integer.parseInt(SplitArray[0]);
			fechaformat = day + "-" + month + "-" + year;
			this.fecha = fechaformat;
			break;

		}// end switch
	}

	public Fecha(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
		this.fecha = day + "/" + month + "/" + year;
	}

	public Calendar StringToCalendar(String fecha) {
		Calendar fechaCalendar = Calendar.getInstance();
		try {
			fechaCalendar.set(this.year, this.month, this.day);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return fechaCalendar;
	}

	public String CalendartoString() {
		Calendar cal = Calendar.getInstance();
		return (cal.getTime().toString());
	}

	public int Comparafecha(Fecha fecha2) {

//		Calendar cal1 = this.StringToCalendar(fecha); // fechacontratacio
//		Calendar cal2 = this.StringToCalendar(fecha2.toString());
		
		Fecha fecha1 = new Fecha(fechaActual());
	
		if (fecha1.after(fecha2))
			return 1; //fecha actual posterior a feha cotratacio OK
		else if (fecha1.before(fecha2))
			return 2; //error
		else
			return 3;// son igual
	}
	
	public int Comparafecha2(Fecha fecha1,Fecha fecha2) {
		
		if (fecha1.before(fecha2))
			return 1; //fecha naixement anterior a feha cotratacio OK
		else if (fecha1.after(fecha2))
			return 2; //error
		else
			return 3;// son igual
		
//		Calendar cal1 = this.StringToCalendar(fecha1.toString()); // fecha naixement
//		Calendar cal2 = this.StringToCalendar(fecha2.toString()); //fecha contratacio
//		
//		SimpleDateFormat formatter=new SimpleDateFormat("DD-MMM-yyyy");  
//		String currentDate = formatter.format(cal1.getTime());
//		
//		if (cal1.before(cal2))
//			return 1; //fecha naixement anterior a feha cotratacio OK
//		else if (cal1.after(cal2))
//			return 2; //error
//		else
//			return 3;// son igual
	}

	private boolean after(Fecha fecha2) {
		// TODO Auto-generated method stub
		return true;
	}

	private boolean before(Fecha fecha2) {
		// TODO Auto-generated method stub
		return true;
	}

	public int Restafecha() {
		int diferencia, any1, anysistema;
		Calendar cal1 = new GregorianCalendar();

		cal1 = (StringToCalendar(fecha));

		any1 = cal1.get(Calendar.YEAR);
		anysistema = this.anyActual();

		diferencia = anysistema - any1;

		return diferencia; // edat o antiguetat
	}

	public int RestaDataMes(String fecha2) {
		int diferencia, mes1, mes2;
		Calendar cal1 = new GregorianCalendar();
		Calendar cal2 = new GregorianCalendar();

		cal1 = (StringToCalendar(fecha));
		cal2 = (StringToCalendar(fecha2));

		mes1 = cal1.get(Calendar.MONTH);
		mes2 = cal2.get(Calendar.MONTH);

		diferencia = mes1 - mes2;
		return diferencia;
	}

	public boolean comprovaFecha() {

		int dia;
		int mes;
		int anyo;
		boolean valido = false;
		String[] fechaArray = null;

		fechaArray = this.fecha.split("-|\\/"); // agafa tant el format en "/"
												// com en "-"

		dia = Integer.parseInt(fechaArray[0]);
		mes = Integer.parseInt(fechaArray[1]);
		anyo = Integer.parseInt(fechaArray[2]);

		if ((anyo > 1930) && (anyo < this.anyActual())) {
			if ((mes >= 1) && (mes <= 12)) {
				switch (mes) {
				case 1: // gener
					if ((dia > 0) && (dia <= 31))
						valido = true;
					break;
				case 2: // febrer

					if ((((anyo % 100 == 0) && (anyo % 400 == 0)) || ((anyo % 100 != 0) && (anyo % 4 == 0)))
							&& (dia > 0) && (dia <= 29))
						valido = true; // any bisiest
					else if ((dia > 0) && (dia <= 28))
						valido = true;
					break;
				case 3: // mar�
					if ((dia > 0) && (dia <= 31))
						valido = true;
					break;
				case 4: // abril
					if ((dia > 0) && (dia <= 30))
						valido = true;
					break;
				case 5: // maig
					if ((dia > 0) && (dia <= 31))
						valido = true;
					break;
				case 6: // juny
					if ((dia > 0) && (dia <= 30))
						valido = true;
					break;
				case 7: // juliol
					if ((dia > 0) && (dia <= 31))
						valido = true;
					break;
				case 8: // agost
					if ((dia > 0) && (dia <= 31))
						valido = true;
					break;
				case 9: // setembre
					if ((dia > 0) && (dia <= 30))
						valido = true;
					break;
				case 10: // octubre
					if ((dia > 0) && (dia <= 31))
						valido = true;
					break;
				case 11: // novembre
					if ((dia > 0) && (dia <= 30))
						valido = true;
					break;
				case 12: // desembre

					if ((dia > 0) && (dia <= 31))
						valido = true;
					break;

				default:
					valido = false;
				}
			} else
				valido = false;
		} else
			valido = false;
		return valido;
	}

	public static String fechaActual() { //afegim static
		Calendar data = new GregorianCalendar();
		String fecha = "";
		String format = Settings.getInstance().getformat_fecha();
		int day;
		int month;
		int year;
		switch (format) {

		case "dd/mm/yyyy":
			day = data.get(data.DAY_OF_MONTH);
			month = data.get(data.MONTH) + 1;

			year = data.get(data.YEAR);
			fecha = day + "/" + month + "/" + year;
			break;

		case "dd-mm-yyyy":
			day = data.get(data.DAY_OF_MONTH);
			month = data.get(data.MONTH) + 1;

			year = data.get(data.YEAR);
			fecha = day + "-" + month + "-" + year;
			break;
		case "yyyy/mm/dd":
			day = data.get(data.DAY_OF_MONTH);
			month = data.get(data.MONTH) + 1;

			year = data.get(data.YEAR);
			fecha = day + "/" + month + "/" + year;
			break;
		case "yyyy-mm-dd":
			day = data.get(data.DAY_OF_MONTH);
			month = data.get(data.MONTH) + 1;

			year = data.get(data.YEAR);
			fecha = day + "-" + month + "-" + year;
			break;

		}// end switch
		return fecha;
	}

	public int diaActual() {
		Calendar data = new GregorianCalendar();
		int dia = data.get(Calendar.DAY_OF_MONTH);
		return dia;
	}

	public int anyActual() {
		Calendar data = new GregorianCalendar();
		int any = data.get(Calendar.YEAR);
		return any;
	}

	public int mesActual() {
		Calendar data = new GregorianCalendar();
		int mes = data.get(Calendar.MONTH);
		return mes + 1;
	}

	public int getday() {
		return this.day;
	}

	public int getmonth() {
		return this.month;
	}

	public int getyear() {
		return this.year;
	}

	public String toString() {
		String fecha = "";
		String format = Settings.getInstance().getformat_fecha();
		switch (format) {

		case "dd/mm/yyyy":
			fecha = this.day + "/" + this.month + "/" + this.year;
			break;
		case "dd-mm-yyyy":
			fecha = this.day + "-" + this.month + "-" + this.year;
			break;
		case "yyyy/mm/dd":
			fecha = this.year + "/" + this.month + "/" + this.day;
			break;
		case "yyyy-mm-dd":
			fecha = this.year + "-" + this.month + "-" + this.day;
		}// end switch
		return fecha;
	}

	public String toStringFormat() {
		String fecha = null;
		fecha = this.day + "/" + this.month + "/" + this.year;
		return fecha;
	}

}//
