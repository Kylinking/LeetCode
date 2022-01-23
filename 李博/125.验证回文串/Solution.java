class Solution {
    public boolean isPalindrome(String s) {
        String news=s.replace(" ","").replace(",","").replace(":","").replace(".","")
		        .replace("@","").replace("%","").replace("$","").replace("#","").replace("^","")
		        .replace("*","").replace("(","").replace(")","").replace("_","").replace("'","")
		        .replace("[","").replace("]","").replace("{","").replace("}","").replace("|","")
		        .replace("!","").replace("\"","").replace("-","").replace("+","").replace("=","")
		        .replace("\\","").replace("?","").replace("<","").replace(">","").replace("/","")
		        .replace("`","").replace("~","").replace(";","");
		        StringBuilder sb=new StringBuilder(news);
		        String st=sb.reverse().toString();
		        boolean falg=false;
		        if(news.equalsIgnoreCase(st)||news.length()==0) {
		        	falg=true;
		        }else falg=false;
		        return falg;
    }
}