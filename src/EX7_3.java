
public class EX7_3 {

	public static void main(String[] args) {
		class Product {
			int price; 
			int bonusPoint; 

			Product(int price) {
				this.price = price;
				bonusPoint = (int) (price / 10.0);
			}
		}

		class Tv extends Product {
			Tv() {
				super(1);
			}

			public String toString() {
				return "Tv";
			}
		}

		class Exercise7_5 {
			public static void main(String[] args) {
				Tv t = new Tv();
			}
		}

	}

}
