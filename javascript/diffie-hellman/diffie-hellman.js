//
// This is only a SKELETON file for the 'Diffie Hellman' exercise. It's been provided as a
// convenience to get you started writing code faster.
//
export class DiffieHellman {
  g;
  p;
  constructor(p, g) {
      if(!isPrime(p) || !isPrime(g)) throw new Error('Constructor Arguments Are not Prime');
      this.g = g;
      this.p = p;
      function isPrime(num) {
          if(num == 1 || num <= 0) return false;
          if(num == 2) return true;
      
          for(let x = 2; x < Math.sqrt(num) + 1; x++){
              if(num % x === 0){
                  return false;
              }
          }
          return true;
      }
  }
  getPublicKey(privateKey) {
      if(privateKey <= 1 || privateKey >= this.p) throw new Error("Not Number Minor To 1");
      else return this.g**privateKey % this.p;
  }
  getSecret(theirPublicKey, myPrivateKey){
      return (theirPublicKey**myPrivateKey) % this.p;
  }
}
