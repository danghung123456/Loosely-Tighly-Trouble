package tightly_example;

public class SQLServerDriver {
	private String url;

	public SQLServerDriver(String url) {
		super();
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void sqlDriver() {
		System.out.println("This is sql driver");
	}

}
