class RnaTranscription {

    String transcribe(String dnaStrand) {
        String RNA = "";
        if(dnaStrand.isEmpty()) {
        	return "";
        }
        else 
        {
          for (int i = 0 ; i < dnaStrand.length(); i++ )
          {
        	  if(dnaStrand.charAt(i) == 'C')
        	  {
        		 RNA +="G";
        	  }
        	  else if (dnaStrand.charAt(i)== 'G') 
        	  {
        		 RNA +="C";
        	  }
        	  else if (dnaStrand.charAt(i)== 'A')
        	  {
        		  RNA += "U";
        	  }
        	  else if (dnaStrand.charAt(i)=='T')
        	  {
        		  RNA += "A";
        	  }
        	  else {
        		  System.out.println(" mistake in the DNA sequence");
        		  break;
        	  }
          }
        }
        return RNA;
    }
}
