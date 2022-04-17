class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
    String num = String.valueOf(numberToCheck);
    int sum = 0;
    int len = num.length();
    int value= numberToCheck;
    while(numberToCheck > 0){
       int digits = numberToCheck % 10;
        sum += Math.pow( digits, len) ;
        numberToCheck = numberToCheck /10;
        }
    return sum == value;
    }
}