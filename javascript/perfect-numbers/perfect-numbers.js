//
// This is only a SKELETON file for the 'Perfect Numbers' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

export const classify = (number) => {
 const input = number ;
 let sum = 0;
 for(let count= 1; count < input; count++){ 
   if(input% count == 0){
     sum += count ;
   }
 }if(sum == input){
   return sum ;
 }else if (sum < input){
   return sum ;
 }else{
   return sum ;
 }

};
