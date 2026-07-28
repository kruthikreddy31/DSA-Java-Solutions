class Solution {
    public String interpret(String command) {
        String s=new String();
     for(int i=0;i<command.length();i++)
     {
        if('G'==command.charAt(i) || 'a'==command.charAt(i) || 'l'==command.charAt(i)){
            s+=command.charAt(i);
        }
        else if('('==command.charAt(i)){
            continue;
        }
        else if(')'==command.charAt(i) && command.charAt(i-1)=='l'){
            continue;
        }
        else{
            s+='o';
        }

     }  
     return s; 
    }
}