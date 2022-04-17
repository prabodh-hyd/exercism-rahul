class ReverseString {

    String reverse(String inputString) {
    	StringBuilder revStr = new StringBuilder(inputString);
    	revStr.reverse();
    	return revStr.toString();
    	}
  
}
