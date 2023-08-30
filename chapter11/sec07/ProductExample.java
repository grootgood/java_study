package java_study.chapter11.sec07;

public class ProductExample {

	public static void main(String[] args) {
		Product<Tv, String> product1 = new Product<Tv, String>(); // new Product<>();로 생략 가능
		product1.setKind(new Tv());
		product1.setModel("스마트Tv");
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();

		Product<Car, String> product2 = new Product<Car, String>(); // new Product<>();로 생략 가능
		product2.setKind(new Car());
		product2.setModel("디젤");
		Car car = product2.getKind();
		String CarModel = product2.getModel();
	}
}
