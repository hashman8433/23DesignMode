package behavior.template;

public class MethodBenchmark extends Benchmark{

	@Override
	public void benchmark() {
		for (int i = 0; i < 5000; i++) {
			System.out.println("i = " + i);
		}
	}
	
	public static void main(String[] args) {
		Benchmark operation = new MethodBenchmark();
		long duration = operation.repeat(5);
		System.out.println("The operation took " + duration + " milliseconds");
	}
	
}
