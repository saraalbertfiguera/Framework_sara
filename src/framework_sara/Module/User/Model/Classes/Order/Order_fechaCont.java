package framework_sara.Module.User.Model.Classes.Order;

import java.util.Comparator;

import framework_sara.Module.User.Model.Classes.Admin;
import framework_sara.Module.User.Model.Classes.User;




	public class Order_fechaCont implements Comparator <User>{

		public int compare (User u1, User u2) {
			return ((Admin)u1).getFechaContratacion().Comparafecha(((Admin)u2).getFechaContratacion());
		}
	}

