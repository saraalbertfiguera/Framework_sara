package framework_sara.Module.User.Model.Classes.Order;

import java.util.Comparator;

import framework_sara.Module.User.Model.Classes.Normal;
import framework_sara.Module.User.Model.Classes.User;




	public class Order_cognoms_normal implements Comparator <User>{

		public int compare (User u1, User u2) {
			if(((Normal) u1).getcognoms().compareTo(((Normal) u2).getcognoms())>0)
				return 1;
			if(((Normal) u1).getcognoms().compareTo(((Normal) u2).getcognoms())<0)
				return -1;
			return 0;
		}
	}

