import java.util.stream.IntStream;

class NaturalNumber{
	private int number;
    private String msg = "You must supply a natural number (positive integer)";
    
    NaturalNumber(int number){
    	if(number < 1) throw new IllegalArgumentException(msg);
    	this.number = number;  	
    }
    
    Classification getClassification() {
    	int sum = IntStream.rangeClosed(1, number/2).filter(n -> number % n == 0 ).sum();
    	if(sum == number ) { return Classification.PERFECT;
    }else if (sum > number) { return Classification.ABUNDANT;
    }else return Classification.DEFICIENT;
    }
}