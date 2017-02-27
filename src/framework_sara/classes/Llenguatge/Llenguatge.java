package framework_sara.classes.Llenguatge;
import java.io.IOException;
import java.util.Properties;

import framework_sara.classes.Settings;




public class Llenguatge extends Properties{
	
	private static Llenguatge instance;
	
		private static final long serialVersionUID = 1L;
		private String idioma=Settings.getInstance().getidioma();
		
		public Llenguatge (){
		    switch(idioma){
		    case "angles":
		        getProperties("angles.properties");
		        break;
		    case "castella":
		        getProperties("castella.properties");
		        break;
		    case "valencia":
		        getProperties("valencia.properties");
		    }
		}
		public String getIdioma() {
			return idioma;
		}
		
		
		public static Llenguatge getInstance () {
			if (instance==null){
				instance=new Llenguatge();
			
			}
			return instance;
		}

		public void setIdioma(String idioma) {
			this.idioma = idioma;
			switch(idioma){
		    case "angles":
		        getProperties("angles.properties");
		        Settings.getInstance().setidioma("angles");
		        break;
		    case "castella":
		        getProperties("castella.properties");
		        Settings.getInstance().setidioma("castella");
		        break;
		    case "valencia":
		        getProperties("valencia.properties");
		        Settings.getInstance().setidioma("valencia");
			}
		}

		public void getProperties(String idioma) {
	        try {
	            this.load( getClass().getResourceAsStream(idioma) );
	        } catch (IOException ex) {
	        }
	    }
	
	}

