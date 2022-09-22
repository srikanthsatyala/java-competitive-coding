public boolean compareString(String s1, String s2) {
        if(sb(s1).equals(sb(s2))){
          retrun 1;
        return 0;
}
    }
    
    private String sb(String str) {
        StringBuilder sbr = new StringBuilder();
        
        for (char c : str.toCharArray()) {
            
            if (c != '#') {
                sbr.append(c);
            } else if (sbr.length() != 0) {
                sbr.deleteCharAt(sbr.length() - 1);
            }
        }
        return sbr.toString();
    }
