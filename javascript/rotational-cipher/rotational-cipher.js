//
// This is only a SKELETON file for the 'Rotational Cipher' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

export const rotate = (string , rotate) => {
  let upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  let lowerCase = "abcdefghijklmonpqrstuvwxyz";

  let result ='';

  for (let cipher of string ){
    if(upperCase.indexOf(cipher) > -1 ){
      result += upperCase[(upperCase.indexOf(cipher)+rotate % upperCase.length)]
    }
    else if(lowerCase.indexOf(cipher) > -1 ){
      result += lowerCase[(lowerCase.indexOf(cipher)+rotate % lowerCase.length)]
    }else{
      result += cipher;
    }
  }
   return result;
};
