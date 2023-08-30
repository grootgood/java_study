package java_study.chapter07.sec07;

public class Singleton {
	private static Singleton single = new Singleton();

	private Singleton() {

	}

	public static Singleton getInstance() {
		return single;
	}

	private String dbname = "bbs 데이터베이스";

	public void open() {
		System.out.println(dbname + " 열기");
	}

	public void close() {
		System.out.println(dbname + " 닫기");
	}
}
