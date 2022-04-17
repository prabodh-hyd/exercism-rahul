class ResistorColorDuo {
    int value(String[] colors) {
       String  sum = "";
        for (int i = 0 ; i <=1; i++ )
        {
         switch (colors[i]){
             case "black" : 
                 sum += "0" ; 
                 break;
            case "brown" :
                 sum += "1";
                 break;
            case "red" :
                  sum += "2" ; 
                 break;
             case "orange" :
                  sum += "3" ; 
                 break;
             case "yellow" : 
                 sum += "4" ; 
                 break;
            case "green" :
                 sum += "5";
                 break;
            case "blue" :
                 sum += "6";
                 break;
             case "violet" :
                 sum += "7";
                 break;
             case "grey" :
                 sum += "8";
                 break;
             default : 
                 sum += "9";
                 break;
         }
        }
      return Integer.parseInt(sum) ;
    }
}