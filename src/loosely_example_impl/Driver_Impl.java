package loosely_example_impl;

import loosely_example_interface.Database_Interface;
import loosely_example_interface.Driver_Interface;

public class Driver_Impl implements Driver_Interface {
	private Database_Interface database;

	public Driver_Impl(Database_Interface database) {
		// TODO Auto-generated constructor stub
		this.database = database;
	}

	@Override
	public void connection() {
		// TODO Auto-generated method stub
		database.connectDB();
	}

}
