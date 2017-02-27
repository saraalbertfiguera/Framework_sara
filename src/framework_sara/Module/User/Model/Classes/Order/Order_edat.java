package framework_sara.Module.User.Model.Classes.Order;

import java.util.Comparator;

import framework_sara.Module.User.Model.Classes.User;





	public class Order_edat implements Comparator <User>{

		public int compare (User u1, User u2) {
			if(u1.getedat()>u2.getedat())
				return 1;
			if(u1.getedat()<u2.getedat())
				return -1;
			return 0;
		}
	}

