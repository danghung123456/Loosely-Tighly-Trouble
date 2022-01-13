package tightly_example;

public class Driver {
/* SQLServerDriver dang duoc khoi tao new o trong class nay`
 * va` class Driver nay dang phu thuoc vao class sql
 * vay gia su neu muon doi sang mySQL hay postgreeSQL thi sao
 * phai thay doi toan bo code o trong lop Driver 
 * cach giai quyet do la su dung ky thuat loosely -> package loosely couple
 * **/
	private SQLServerDriver sql ;


	public Driver() {
		sql = new SQLServerDriver("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	}

	public SQLServerDriver getSql() {
		return sql;
	}

	public void setSql(SQLServerDriver sql) {
		this.sql = sql;
	}

	public void activateDriver() {
		sql.sqlDriver();
	}

}
