import edu.princeton.cs.algs4.*;
public class Ex35 {
	public static void main(String[] args) {
		int SIDES = 6;
		double[] dist = new double[2 * SIDES + 1];
		for (int i = 1; i <= SIDES; i++) {
				for (int j = 1; j <= SIDES; j++) {
					dist[i + j] += 1.0;
			}
		}

		for (int k = 2; k <= 2 * SIDES; k++) {
				dist[k] /= 36.0;
		}
		//此时disk[2] ~ disk[12]保存的两个骰子和为下标对应的概率
		for (int i = 2; i <= 12 ; i++) {
			StdOut.printf("the count is " + i + ": "  + "%.5f\n", dist[i]);
		}
		StdOut.println();
		simulation(Integer.valueOf(args[0]));
	}

	public static void simulation(int N) {
		
		double[] myDist = new double[13];
		for (int i = 0; i < N; i++) {
			int num1 = StdRandom.uniform(1, 7);
			int num2 = StdRandom.uniform(1, 7);
			int sum = num1 + num2;
			myDist[sum] += 1.0;
		}
		for (int k = 2; k <= 12; k++) {
				myDist[k] /= N;
		}

		for (int j = 2; j <= 12; j++) {
			StdOut.println("the count is " + j + ": " + myDist[j]);
		}
	}
}

/*
N = 50000        
the count is 2: 0.02778  
the count is 3: 0.05556  
the count is 4: 0.08333  
the count is 5: 0.11111  
the count is 6: 0.13889  
the count is 7: 0.16667  
the count is 8: 0.13889  
the count is 9: 0.11111  
the count is 10: 0.08333 
the count is 11: 0.05556 
the count is 12: 0.02778 
                         
the count is 2: 0.02782  
the count is 3: 0.05618  
the count is 4: 0.08194  
the count is 5: 0.1116   
the count is 6: 0.13772  
the count is 7: 0.1656   
the count is 8: 0.14132  
the count is 9: 0.11246  
the count is 10: 0.08336 
the count is 11: 0.05544 
the count is 12: 0.02656 

N =100000        
the count is 2: 0.02778   
the count is 3: 0.05556   
the count is 4: 0.08333   
the count is 5: 0.11111   
the count is 6: 0.13889   
the count is 7: 0.16667   
the count is 8: 0.13889   
the count is 9: 0.11111   
the count is 10: 0.08333  
the count is 11: 0.05556  
the count is 12: 0.02778  
                          
the count is 2: 0.02738   
the count is 3: 0.05437   
the count is 4: 0.08278   
the count is 5: 0.11172   
the count is 6: 0.13868   
the count is 7: 0.16735   
the count is 8: 0.14025   
the count is 9: 0.11076   
the count is 10: 0.08282  
the count is 11: 0.05579  
the count is 12: 0.0281 


N = 1000000	
the count is 2: 0.02778    
the count is 3: 0.05556    
the count is 4: 0.08333    
the count is 5: 0.11111    
the count is 6: 0.13889    
the count is 7: 0.16667    
the count is 8: 0.13889    
the count is 9: 0.11111    
the count is 10: 0.08333   
the count is 11: 0.05556   
the count is 12: 0.02778   
                           
the count is 2: 0.027663   
the count is 3: 0.056016   
the count is 4: 0.083334   
the count is 5: 0.11164    
the count is 6: 0.13929    
the count is 7: 0.165716   
the count is 8: 0.138331   
the count is 9: 0.111268   
the count is 10: 0.083354  
the count is 11: 0.055469  
the count is 12: 0.027919  
*/