package behavior.template;

public abstract class Benchmark {
	
	public abstract void benchmark();
	
	public final long repeat (int count) {
		if (count <= 0)
			return 0;
		else {
			long startTime = System.currentTimeMillis();
			
			for (int i = 0; i < count; i++) {
				benchmark();
			}
			
			long stopTime = System.currentTimeMillis();
			return startTime - stopTime;
		}
	}
}
