package framework_sara.Module.User.Model.Funcions;

import framework_sara.classes.Fecha;
import framework_sara.classes.Settings;
import framework_sara.classes.Llenguatge.Llenguatge;
import framework_sara.main_exer3;
import framework_sara.Funcions.Funcions;
import framework_sara.Funcions.Validate;

import javax.swing.JOptionPane;

public class Funcions_fecha_user {

	public static Fecha ask_FechaNaixement() {
		boolean result = true;
		Fecha datanaix = null;
		String datanaixement = "";

		do {// Per a comprovar la majoria d'edat
			datanaixement = Funcions_dades_user.askfecha(1);
			datanaix = new Fecha(datanaixement, Settings.getInstance().getformat_fecha()); // Menus.estandar_fecha
			// JOptionPane.showMessageDialog(null, datanaix.toString());

			int edat = datanaix.Restafecha();
			if ((edat < 18) || (edat > 80)) {
				result = false;
				JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("menor_edat1")); // no
																									// tens
																									// la
																									// edat
																									// requerida
			} else {
				result = true;

			} // end else

		} while (result == false);

		return datanaix;
	}//
	
	public static boolean compara_edad_naixement(Fecha datanaix,Fecha fechaCont) {
		boolean correcte=true;
		

		int edat = datanaix.Restafecha();// trau l'edat

		int antiguetat = fechaCont.Restafecha(); // trau antiguitat
		int result4 = edat - antiguetat;
		if (result4 >= 16) {
			correcte=true;
		
		}else {
			
			JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("menor_edat2"));
			correcte=false;
		}
		
		return correcte;
		
	}
	

	public static Fecha ask_FechaContratacio(Fecha datanaix) {

		Fecha fechaCont;

		boolean correcte = true;
		boolean result = true;
		String fechaContratacio;
		// int result3;

		do {
			fechaContratacio = Funcions_dades_user.askfecha(2); // valida format
			fechaCont = new Fecha(fechaContratacio, Settings.getInstance().getformat_fecha());

			// JOptionPane.showMessageDialog(null, fechaCont.toString());

			result = fechaCont.comprovaFecha(); // comprova que la data
												// siga
												// correcta(bisiest)

			if (result == false) {

				correcte = false;
			} else {

				int result1 = fechaCont.Comparafecha2(datanaix,fechaCont); //comprova que la data de contractacio es posterior a la de naixement
			

				switch (result1) { //------------------------------compara naixement i contratacio

				case 1: // contratacio major que naixement
					correcte = true;

					break;
				case 2: // contratacio menor que naixement
					correcte = false;
					JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("compara_fecha2"));
					
					break;

				case 3: // contratacio igual que naixement
					correcte = false;
					JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("compara_fecha2"));
					break;
				}// end switch

				if ((result1 == 2) || (result1 == 3)) {

					correcte = false;
					//JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("compara_fecha1"));

				} else {

					//String fechaactual = fechaCont.fechaActual();
//					String fechaactual= Fecha.fechaActual();
//					Fecha comparafechas = new Fecha(fechaactual, Settings.getInstance().getformat_fecha());
					int result2 = fechaCont.Comparafecha(fechaCont);
					switch (result2) { //------------------------------compara contractacio i actual

					case 1: // si la data contratacio anterior que la actual
						correcte = true;

						break;
					case 2: // si la data de contratacio es posterior que la actual
						correcte = false;
						JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("compara_fecha1"));
						break;
					case 3: // si la data de contratacio es igual que la actual    /*******************************************************?
						correcte = true;
						
						break;
					}// end switch

					int edat = datanaix.Restafecha();// trau l'edat

					int antiguetat = fechaCont.Restafecha(); // trau antiguitat

					if (result2 == 2) {

						correcte = false;

					} else {// calcular diferencia entre fnaix i fcont

						int result4 = edat - antiguetat;
						if (result4 >= 16) {
							correcte = true;
						} else {
							correcte = false;
							JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("menor_edat2"));
						} // end else

					} // end else

				} // end else

			} // end else

		} while (correcte == false);
		return fechaCont;

	}//

	public static String ask_FechaAlta() {
		Fecha actual = new Fecha();

		boolean correcte = true;
		// String fechaAlta;
		int result;
		String fechaActual1;
		String formatFinal = "";

		fechaActual1 = actual.fechaActual();
		String format = Settings.getInstance().getformat_fecha();
		Fecha fecha2 = new Fecha(fechaActual1,format);		
		
		  switch (format) {
		  case "dd/mm/yyyy":
		   formatFinal = +fecha2.getday() + "/" + fecha2.getmonth() + "/" + fecha2.getyear();
		   // format=fnac.getfecha();
		   break;
		  case "dd-mm-yyyy":
		   formatFinal = +fecha2.getday() + "-" + fecha2.getmonth() + "-" + fecha2.getyear();
		   // format=fnac.getfecha();
		   break;
		  case "yyyy/mm/dd":
		   formatFinal = +fecha2.getday() + "/" + fecha2.getmonth() + "/" + fecha2.getyear();
		   // format=fnac.getfecha();
		   break;
		  case "yyyy-mm-dd":
		   formatFinal = +fecha2.getday() + "-" + fecha2.getmonth() + "-" + fecha2.getyear();
		   // format=fnac.getfecha();
		   break;
		  }


		return formatFinal;

	}// end ask_FechaAlta

	
//	public static Fecha ask_FechaContratacio1(Fecha fnac) {
//		
//		int antiguedad = 0;
//		int resultado = 0;
//		int resultado1 = 0;
//		int edad = 0;
//		int valor = 0;
//		boolean continuar = true;
//		String Fecha = "";
//		Fecha fcont = new Fecha();
//		String formato = Settings.getInstance().getformat_fecha();
//		switch (formato) {
//		case "dd/mm/yyyy":
//			do {
//				String fechacontratacion = Funcions.askstring(Llenguatge.getInstance().getProperty("compara_fecha2"), "");
//				boolean result1 = Validate.formatfecha(fechacontratacion);
//				if (result1 == false) {
//					JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("error"));
//					continuar = false;
//				} else {
//					// valida formato y saca antiguedad
//					fcont = new Fecha(fechacontratacion);
//					boolean result2 = fcont.comprovaFecha();
//					if (result2 == true) {
//						antiguedad = fcont.Restafecha();
//						// compara/controla fechas contratacion y nacimiento
//						resultado = fcont.Comparafecha(fnac);
//						if (resultado == 2) {
//
//							continuar = true;
//						} else {
//							continuar = false;
//						}
//						// comprueba que la Fecha de contratacion no sea
//						// superior a
//						// la
//						// actual
//						Fecha = fcont.fechaActual();
//						Fecha comparador = new Fecha(Fecha);
//						resultado1 = fcont.Comparafecha(comparador);
//						if (resultado1 == 1) {
//							continuar = true;
//
//						}
//						if (resultado1 == 2) {
//							continuar = false;
//							JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("error"));
//						}
//						if (resultado1 == 3) {
//							continuar = true;
//						}
//						// comprueba que sea mayor de edad para poder ser
//						// contratado;
//						edad = fnac.Restafecha();
//						valor = edad - antiguedad;
//						if (valor < 18) {
//							JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("error"));
//							continuar = false;
//						} else {
//							continuar = true;
//						}
//					} else {
//						JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("error"));
//						continuar = false;
//
//					}
//
//				}
//
//			} while (continuar == false);
//			break;
//		case "dd-mm-yyyy":
//			do {
//				String fechacontratacion = Funcions.askstring(Llenguatge.getInstance().getProperty("compara_fecha2"), "");
//				boolean result1 = Validate.formatfecha2(fechacontratacion);
//				if (result1 == false) {
//					JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("error"));
//					continuar = false;
//				} else {
//					// valida formato y saca antiguedad
//					fcont = new Fecha(fechacontratacion);
//					boolean result2 = fcont.comprovaFecha();
//					if (result2 == true) {
//						antiguedad = fcont.Restafecha();
//						// compara/controla fechas contratacion y nacimiento
//						resultado = fcont.Comparafecha(fnac);
//						if (resultado == 2) {
//
//							continuar = true;
//						} else {
//							continuar = false;
//						}
//						// comprueba que la Fecha de contratacion no sea
//						// superior a
//						// la
//						// actual
//						Fecha = fcont.fechaActual();
//						Fecha comparador = new Fecha(Fecha);
//						resultado1 = fcont.Comparafecha(comparador);
//						if (resultado1 == 1) {
//							continuar = true;
//
//						}
//						if (resultado1 == 2) {
//							continuar = false;
//							JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("error"));
//						}
//						if (resultado1 == 3) {
//							continuar = true;
//						}
//						// comprueba que sea mayor de edad para poder ser
//						// contratado;
//						edad = fnac.Restafecha();
//						valor = edad - antiguedad;
//						if (valor < 18) {
//							JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("error"));
//							continuar = false;
//						} else {
//							continuar = true;
//						}
//					} else {
//						JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("error"));
//						continuar = false;
//
//					}
//
//				}
//
//			} while (continuar == false);
//			break;
//		case "yyyy/mm/dd":
//			do {
//				String fechacontratacion = Funcions.askstring(Llenguatge.getInstance().getProperty("compara_fecha2"), "");
//				boolean result1 = Validate.formatfecha3(fechacontratacion);
//				if (result1 == false) {
//					JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("error"));
//					continuar = false;
//				} else {
//					// valida formato y saca antiguedad
//					fcont = new Fecha(fechacontratacion);
//					boolean result2 = fcont.comprovaFecha();
//					if (result2 == true) {
//						antiguedad = fcont.Restafecha();
//						// compara/controla fechas contratacion y nacimiento
//						resultado = fcont.Comparafecha(fnac);
//						if (resultado == 2) {
//
//							continuar = true;
//						} else {
//							continuar = false;
//						}
//						// comprueba que la Fecha de contratacion no sea
//						// superior a
//						// la
//						// actual
//						Fecha = fcont.fechaActual();
//						Fecha comparador = new Fecha(Fecha);
//						resultado1 = fcont.Comparafecha(comparador);
//						if (resultado1 == 1) {
//							continuar = true;
//
//						}
//						if (resultado1 == 2) {
//							continuar = false;
//							JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("error"));
//						}
//						if (resultado1 == 3) {
//							continuar = true;
//						}
//						// comprueba que sea mayor de edad para poder ser
//						// contratado;
//						edad = fnac.Restafecha();
//						valor = edad - antiguedad;
//						if (valor < 18) {
//							JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("error"));
//							continuar = false;
//						} else {
//							continuar = true;
//						}
//					} else {
//						JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("error"));
//						continuar = false;
//
//					}
//
//				}
//
//			} while (continuar == false);
//			break;
//		case "yyyy-mm-dd":
//			do {
//				String fechacontratacion = Funcions.askstring(Llenguatge.getInstance().getProperty("compara_fecha2"), "");
//				boolean result1 = Validate.formatfecha4(fechacontratacion);
//				if (result1 == false) {
//					JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("error"));
//					continuar = false;
//				} else {
//					// valida formato y saca antiguedad
//					fcont = new Fecha(fechacontratacion);
//					boolean result2 = fcont.comprovaFecha();
//					if (result2 == true) {
//						antiguedad = fcont.Restafecha();
//						// compara/controla fechas contratacion y nacimiento
//						resultado = fcont.Comparafecha(fnac);
//						if (resultado == 2) {
//
//							continuar = true;
//						} else {
//							continuar = false;
//						}
//						// comprueba que la Fecha de contratacion no sea
//						// superior a
//						// la
//						// actual
//						Fecha = fcont.fechaActual();
//						Fecha comparador = new Fecha(Fecha);
//						resultado1 = fcont.Comparafecha(comparador);
//						if (resultado1 == 1) {
//							continuar = true;
//
//						}
//						if (resultado1 == 2) {
//							continuar = false;
//							JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("error"));
//						}
//						if (resultado1 == 3) {
//							continuar = true;
//						}
//						// comprueba que sea mayor de edad para poder ser
//						// contratado;
//						edad = fnac.Restafecha();
//						valor = edad - antiguedad;
//						if (valor < 18) {
//							JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("error"));
//							continuar = false;
//						} else {
//							continuar = true;
//						}
//					} else {
//						JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("error"));
//						continuar = false;
//
//					}
//
//				}
//
//			} while (continuar == false);
//			break;
//		}
//		return fcont;
//
//	}
	
	
	public static Fecha ask_FechaContratacio1(Fecha fnac) {
		int antiguedad = 0;
		int resultado = 0;
		int resultado1 = 0;
		int edad = 0;
		int valor = 0;
		boolean continuar = true;
		String Fecha = "";
		Fecha fcont = new Fecha();
		String formato = Settings.getInstance().getformat_fecha();
		switch (formato) {
		case "dd/mm/yyyy":
			do {
				String fechacontratacion =Funcions.askstring(Llenguatge.getInstance().getProperty("compara_fecha2"), "");
				boolean result1 = Validate.formatfecha(fechacontratacion);
				if (result1 == false) {
					JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("error"));
					continuar = false;
				} else {
					// valida formato y saca antiguedad
					fcont = new Fecha(fechacontratacion, formato);
					boolean result2 = fcont.comprovaFecha();
					if (result2 == true) {
						antiguedad = fcont.Restafecha();
						// compara/controla fechas contratacion y nacimiento
						resultado = fcont.Comparafecha(fnac);
						if (resultado == 2) {

							continuar = true;
						} else {
							continuar = false;
						}
						// comprueba que la Fecha de contratacion no sea
						// superior a
						// la
						// actual
						Fecha = fcont.fechaActual();
						Fecha comparador = new Fecha(Fecha);
						resultado1 = fcont.Comparafecha(comparador);
						if (resultado1 == 1) {
							continuar = true;

						}
						if (resultado1 == 2) {
							continuar = false;
							JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("error"));
						}
						if (resultado1 == 3) {
							continuar = true;
						}
						// comprueba que sea mayor de edad para poder ser
						// contratado;
						int anyo_actual=fnac.anyActual();
						int anyo_fnac=fnac.getyear();
						edad=anyo_actual-anyo_fnac;
						//edad = fnac.RestaFechas();
						
						valor = edad - antiguedad;
						if (valor < 18) {
							JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("error"));
							continuar = false;
						} else {
							continuar = true;
						}
					} else {
						JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("error"));
						continuar = false;

					}

				}

			} while (continuar == false);
			break;
		case "dd-mm-yyyy":
			do {
//			
				String fechacontratacion =Funcions.askstring(Llenguatge.getInstance().getProperty("compara_fecha2"), "");
				boolean result1 = Validate.formatfecha2(fechacontratacion);
				if (result1 == false) {
					JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("error"));
					continuar = false;
				} else {
					// valida formato y saca antiguedad
					fcont = new Fecha(fechacontratacion, formato);
					boolean result2 = fcont.comprovaFecha();
					if (result2 == true) {
						
						// compara/controla fechas contratacion y nacimiento
						int edad_fnac=fnac.getyear();
						int edad_fnac_mayor_edad=edad_fnac+18;
						int anyo_fcont=fcont.getyear();
						if(anyo_fcont>edad_fnac_mayor_edad) {
							continuar = true;
						}else {
							continuar = false;
						}						
						if (result2 == true) {
							int anyo_actual=fnac.anyActual();
							int anyo_fnac=fcont.getyear();
							antiguedad=anyo_actual-anyo_fnac;
							// compara/controla fechas contratacion y nacimiento
							int edad_fnac2=fnac.getyear();
							int edad_fnac_mayor_edad2=edad_fnac2+18;
							int anyo_fcont2=fcont.getyear();
							if(anyo_fcont2>edad_fnac_mayor_edad2) {
								continuar = true;
							}else {
								continuar = false;
							}
							int anyo_actual1=fnac.anyActual();
							int anyo_fnac1=fnac.getyear();
							edad=anyo_actual1-anyo_fnac1;
						
							valor = edad - antiguedad;
							if (valor < 18) {
								JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("error"));
								continuar = false;
							} else {
								continuar = true;
							}
						}
					} else {
						JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("error"));
						continuar = false;

					}
					

				}
				//comprueba que la Fecha introducida no sea superior a la actual

			} while (continuar == false);

			break;
		case "yyyy/mm/dd":
			do {
				String fechacontratacion =Funcions.askstring(Llenguatge.getInstance().getProperty("compara_fecha2"), "");
				boolean result1 = Validate.formatfecha3(fechacontratacion);
				if (result1 == false) {
					JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("error"));
					continuar = false;
				} else {
					// valida formato y saca antiguedad
					fcont = new Fecha(fechacontratacion, formato);
					boolean result2 = fcont.comprovaFecha();
					if (result2 == true) {
						// compara/controla fechas contratacion y nacimiento
						int edad_fnac=fnac.getyear();
						int edad_fnac_mayor_edad=edad_fnac+18;
						int anyo_fcont=fcont.getyear();
						if(anyo_fcont>edad_fnac_mayor_edad) {
							continuar = true;
						}else {
							continuar = false;
						}

						if (result2 == true) {
							int anyo_actual=fnac.anyActual();
							int anyo_fnac=fcont.getyear();
							antiguedad=anyo_actual-anyo_fnac;
							
							//antiguedad = fcont.RestaFechas();
							// compara/controla fechas contratacion y nacimiento
							int edad_fnac2=fnac.getyear();
							int edad_fnac_mayor_edad2=edad_fnac2+18;
							int anyo_fcont2=fcont.getyear();
							if(anyo_fcont2>edad_fnac_mayor_edad2) {
								continuar = true;
							}else {
								continuar = false;
							}

							int anyo_actual1=fnac.anyActual();
							int anyo_fnac1=fnac.getyear();
							edad=anyo_actual1-anyo_fnac1;
							//edad = fnac.RestaFechas();
							valor = edad - antiguedad;
							if (valor < 18) {
								JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("error"));
								continuar = false;
							} else {
								continuar = true;
							}
						}
					} else {
						JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("error"));
						continuar = false;

					}

				}
			} while (continuar == false);
			break;
		case "yyyy-mm-dd":
			do {
				String fechacontratacion =Funcions.askstring(Llenguatge.getInstance().getProperty("compara_fecha2"), "");
				boolean result1 = Validate.formatfecha4(fechacontratacion);
				if (result1 == false) {
					JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("error"));
					continuar = false;
				} else {
					// valida formato y saca antiguedad
					fcont = new Fecha(fechacontratacion, formato);
					boolean result2 = fcont.comprovaFecha();
					if (result2 == true) {
						//antiguedad = fcont.RestaFechas();
						
						// compara/controla fechas contratacion y nacimiento
						int edad_fnac=fnac.getyear();
						int edad_fnac_mayor_edad=edad_fnac+18;
						int anyo_fcont=fcont.getyear();
						if(anyo_fcont>edad_fnac_mayor_edad) {
							continuar = true;
						}else {
							continuar = false;
						}					
						
						if (result2 == true) {
							int anyo_actual=fnac.anyActual();
							int anyo_fnac=fcont.getyear();
							antiguedad=anyo_actual-anyo_fnac;
							
							//antiguedad = fcont.RestaFechas();
							// compara/controla fechas contratacion y nacimiento
							int edad_fnac2=fnac.getyear();
							int edad_fnac_mayor_edad2=edad_fnac2+18;
							int anyo_fcont2=fcont.getyear();
							if(anyo_fcont2>edad_fnac_mayor_edad2) {
								continuar = true;
							}else {
								continuar = false;
							}

							// comprueba que sea mayor de edad para poder ser
							// contratado;
							int anyo_actual1=fnac.anyActual();
							int anyo_fnac1=fnac.getyear();
							edad=anyo_actual1-anyo_fnac1;
							//edad = fnac.RestaFechas();
							valor = edad - antiguedad;
							if (valor < 18) {
								JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("error"));
								continuar = false;
							} else {
								continuar = true;
							}
						}
					} else {
						JOptionPane.showMessageDialog(null, Llenguatge.getInstance().getProperty("error"));
						continuar = false;

					}

				}
			} while (continuar == false);

			break;
		}
		return fcont;

	}

	
	
	
}
