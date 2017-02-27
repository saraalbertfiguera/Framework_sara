package framework_sara.Module.User.Model.Classes.Order;
import java.util.Comparator;

import framework_sara.Module.User.Model.Classes.User;


public class Order_nom implements Comparator <User>{



		public int compare (User u1, User u2) {
			if(u1.getnom().compareTo(u2.getnom())>0)
				return 1;
			if(u1.getnom().compareTo(u2.getnom())<0)
				return -1;
			return 0;
		}
	

}
