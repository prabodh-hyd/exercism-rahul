
class Acronym {
   String phrase;
     String res = "";
    Acronym(String phrase) {
        this.phrase=phrase;
    }
    String get() {
    	res+=Character.toUpperCase(phrase.charAt(0));
            for (int i=1 ; i<phrase.length()-1;i++) {
                if ((phrase.charAt(i-1)=='-' || phrase.charAt(i-1)==' ' || phrase.charAt(i-1)=='_') && Character.isLetter(phrase.charAt(i))) {
                	res+=Character.toUpperCase(phrase.charAt(i));
            }
        }
        return res;    
        }
}
