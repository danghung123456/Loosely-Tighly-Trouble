package loosely_example;

import loosely_example_impl.Driver_Impl;
import loosely_example_impl.MySQL;
import loosely_example_impl.PostGreSQL;
import loosely_example_impl.SQLServer;
import loosely_example_interface.Database_Interface;
import loosely_example_interface.Driver_Interface;

public class Main {
	public static void main(String[] args) {
/* khi minh lam viec voi nhau bang interface 
 * se giup khong phai chinh sua code va anh huong toi cac module khac
 * **/
		Database_Interface sql = new SQLServer();
		Database_Interface postgree = new PostGreSQL();
		Database_Interface mySQL = new MySQL();
		Driver_Interface driver = new Driver_Impl(sql);
		Driver_Interface driver1 = new Driver_Impl(postgree);
		Driver_Interface driver2 = new Driver_Impl(mySQL);
		driver.connection();
		driver1.connection();
		driver2.connection();
	}
}
