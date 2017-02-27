package framework_sara.Module.User.Model.Classes.Order;

import java.util.Comparator;

import framework_sara.Module.User.Model.Classes.User;




	public class Order_fechaNaixement implements Comparator <User>{

		public int compare (User u1, User u2) {
			return u1.getfechaNaixement().Comparafecha(u2.getfechaNaixement());
		}
	
}
