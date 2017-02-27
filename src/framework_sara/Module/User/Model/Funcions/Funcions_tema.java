package framework_sara.Module.User.Model.Funcions;

import javax.swing.JOptionPane;
import javax.swing.UIManager;


import framework_sara.classes.Settings;
import framework_sara.classes.Llenguatge.Llenguatge;

public class Funcions_tema {

	
	
public static void theme (){
		
		//Obtener lista look&feel disponibles en el SO
		//http://www.codigofantasma.com/blog/java-look-feel-parte-1/
		try {
			switch (Settings.getInstance().gettema()){
			case "METAL":// Metal - Predeterminado JAVA
				UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
				break;

			case "GTK":// GTK
				UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				break;

			case "MOTIF":// Motif
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
				break;

			case "NINBUS":// Nimbus - JAVA
				
				UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
				break;	
				
			case "WINDOWS95":// WINDOWS 95
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
				break;
				
			case "WINDOWS":// WINDOWS
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
				break;
				
			case "MAC OS":// MAC OS
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.mac.MacLookAndFeel");
				break;
				
			case "MAC OS X":// MAC OS X
				UIManager.setLookAndFeel("com.apple.laf.AquaLookAndFeel");
				break;
			}
		}catch (Exception e){
			JOptionPane.showMessageDialog(null,  Llenguatge.getInstance().getProperty("error"),  Llenguatge.getInstance().getProperty("error"), JOptionPane.ERROR_MESSAGE);
		}
	}
}
