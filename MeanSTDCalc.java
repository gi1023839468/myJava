import java.io.*;

class MeanSTDCalc{
	public static void main (String [] args) throws IOException {
		BufferedReader data =
				new BufferedReader (new InputStreamReader(System.in));
		
		String input = data.readLine();	
		String [] stringArray = input.split(" ");
		double [] dataArray = new double [stringArray.length];
		
		for (int i =0; i < stringArray.length; i++){
			dataArray[i] = Double.parseDouble(stringArray[i]);
			System.out.println(dataArray[i]);
		}
		
		CalcMeanSTD calc = new CalcMeanSTD ();
		System.out.println("The data mean is: "+ String.format("%.2f", calc.getMean(dataArray)) + "\nThe data variance is: " + String.format("%.2f", calc.getVariance(dataArray)) + "\nThe data standard deviation is: " + String.format("%.2f", calc.getSTD()));
	}
}

class CalcMeanSTD {
	private int numbers;
	private double sum;
	private double mean;
	private double var;
	
	public CalcMeanSTD(){
		numbers = 0;
		sum = 0;
		mean = 0;
		var = 0;
	}
	
	public double getMean(double dataArray []){
		numbers = dataArray.length;
		for (int i = 0; i < numbers; i++) {
			sum += dataArray[i];
		}
		mean = sum / numbers;
		return mean;
	}
	
	public double getVariance (double dataArray []){
		double difference;
		double total = 0;
		
		for (int i = 0; i < dataArray.length; i ++) {
			difference = dataArray[i] - mean;
			total += Math.pow(difference, 2);
		}
		var = total / (numbers - 1);
		return var;
	}
	
	public double getSTD(){
		return Math.sqrt(var);
	}
}