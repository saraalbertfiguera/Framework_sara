package framework_sara.Module.User.Model.Classes.Order;

import java.util.Comparator;

import framework_sara.Module.User.Model.Classes.Normal;
import framework_sara.Module.User.Model.Classes.User;

public class Order_comentaris implements Comparator<User> {

	public int compare(User u1, User u2) {

		if (((Normal) u1).getcomentaris() > ((Normal) u2).getcomentaris())
			return 1;
		if (((Normal) u1).getcomentaris() < ((Normal) u2).getcomentaris())
			return -1;
		return 0;
	}
}
