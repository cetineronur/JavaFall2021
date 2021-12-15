	package tag41_Errors_garbageCollector;

	class Vehicle {
		Vehicle (){
		System.out.println("Vehicle");
			}
		}
	class Bus extends Vehicle{
		Bus(){
		System.out.println("Bus");
		}
		}
	public class Transport {
	
	public static void main(String[] args) {
		Vehicle v = new Bus();

			}

		}
