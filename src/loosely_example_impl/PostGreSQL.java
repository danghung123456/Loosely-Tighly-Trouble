package loosely_example_impl;

import loosely_example_interface.Database_Interface;

public class PostGreSQL implements Database_Interface{

	@Override
	public void connectDB() {
		// TODO Auto-generated method stub
		System.out.println("PostgreSQL connecting...");
	}

}
