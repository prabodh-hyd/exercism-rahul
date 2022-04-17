public class PangramChecker {

    public boolean isPangram(String input) {
    	String inputStr = input.toLowerCase();
    	String smallalphabet = "abcdefghijklmnopqrstuvwxyz";
    	char[] alphabet= smallalphabet.toCharArray();
        for (int i=0; i<alphabet.length; i++) {
            if (inputStr.indexOf(alphabet[i]) == -1) {
                return false;
            }
        }
    return true;
}
}