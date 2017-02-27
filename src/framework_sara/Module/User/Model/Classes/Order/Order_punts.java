package framework_sara.Module.User.Model.Classes.Order;

import java.util.Comparator;

import framework_sara.Module.User.Model.Classes.Normal;
import framework_sara.Module.User.Model.Classes.User;




	public class Order_punts implements Comparator <User>{
		
		public int compare(User u1, User u2) {
			
			if(((Normal)u1).getpunts() > ((Normal)u2).getpunts())
				return 1;
			if(((Normal)u1).getpunts() < ((Normal)u2).getpunts())
				return -1;
			return 0;
		}
	}

