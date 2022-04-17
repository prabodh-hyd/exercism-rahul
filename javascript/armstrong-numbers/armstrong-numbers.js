//
// This is only a SKELETON file for the 'Armstrong Numbers' exercise. It's been provided as a
// convenience to get you started writing code faster.
// 

export const isArmstrongNumber = (number) => {
  
 let num= number;
 let  sum = 0 ;
 let temp;
 let  valueLength= num.length;
 for(temp=num;num!=0;num=num/10){
   let digits = number % 10;
   sum = sum + digits ** valueLength;
 }
   return ( sum == number )
};