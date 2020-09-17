
public class test {
	
	public static void main(String[] args) {
		int maxPeople = 1000;
		int maxCapacity = 100;
		
		int count1 = 0;
		int count2 = 0;
		
		for(int i = 0; i < maxPeople; i++) {
			for(int j = 1; j < maxCapacity; j++) {
				
				double totalPeople = i;
				int capacity = j;
		        double busesNeed1 = totalPeople / (double) capacity;
		        double overflowCapacity1 = (capacity * ((((totalPeople - .5) % capacity) + .5) / (double) capacity)) + .0000000000000001;
		        /*
		        System.out.println(overflowCapacity);
		        System.out.println((capacity - (int) overflowCapacity) % capacity);
		        System.out.println(busesNeed);
		         */
		        busesNeed1 += ((((capacity - (int) overflowCapacity1) % capacity) / (double) capacity));
		        busesNeed1 = (int) (busesNeed1);
		        overflowCapacity1 = (int) overflowCapacity1;
				
		        double busesNeed2 = totalPeople / (double)capacity;
		        busesNeed2 = Math.ceil(busesNeed2);
		        double overflowCapacity2 = (int) ((totalPeople%capacity==0) ? Math.min(totalPeople, capacity) : (totalPeople%capacity));
		        
		        if(busesNeed1 != busesNeed2 || overflowCapacity1 != overflowCapacity2) {
		        	System.out.println("ERROR: People " + i + ", Capacity " + j);
		        	System.out.println("\tEstimate: Buses Needed " + busesNeed1 + ", Overflow " + overflowCapacity1);
		        	System.out.println("\tActual  : Buses Needed " + busesNeed2 + ", Overflow " + overflowCapacity2);
		        	count2 ++;
		        }
		        count1++;
		        
			}
		}
		
		double percentwrong = ((double)count2) / ((double) count1);
		System.out.println("Total " + count1 + ", Total Wrong " + count2 + ", Percent Wrong " + percentwrong);
		
		
	}

}
