class Solution {
    public boolean isValid(String s) {
        String javaString = s; 
        int bf=0, brf=0, cbrf=0,bb=0, brb=0, cbrb=0;
        int n= javaString.length();
        char [] ch =  new char [n];
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == '('){
               bf++; 
            }
            else if(s.charAt(i) == '['){
               brf++; 
            }
            else if(s.charAt(i) == '{'){
               cbrf++; 
            }
            else if(s.charAt(i) == ')'){
               bb++; 
            }
            else if(s.charAt(i) == ']'){
               brb++; 
            }
            else if(s.charAt(i) == '}'){
               cbrb++; 
            }
           ch[i] = s.charAt(i);
        }
        int nm1 = n-1, nh = n/2, d = 0, e = 0;
        if(n>2){
        for(int i =0; i<nh; i++){
            if((s.charAt(i) != '(' &&  s.charAt(nm1-i) == ')') ||(s.charAt(i) == '(' &&  s.charAt(nm1-i) != ')') || (s.charAt(i) == '[' &&  s.charAt(nm1-i) != ']') || (s.charAt(i) != '[' &&  s.charAt(nm1-i) == ']') || (s.charAt(i) == '{' &&  s.charAt(nm1-i) != '}') || (s.charAt(i) != '{' &&  s.charAt(nm1-i) == '}') )
            {
                d++;
            }
        }
          for(int i =0; i<n; i++){
            if((s.charAt(i) == '(' &&  s.charAt(i+1) != ')') || (s.charAt(i) != '(' &&  s.charAt(i+1) == ')') || (s.charAt(i) != '[' &&  s.charAt(i+1) == ']') || (s.charAt(i) == '[' &&  s.charAt(i+1) != ']') || (s.charAt(i) != '{' &&  s.charAt(i+1) == '}') || (s.charAt(i) == '{' &&  s.charAt(i+1) != '}') ){
                e++;
            }
              ++i;
              
        }  
        }
        else{
            e++;
        }
        
        System.out.println(d+","+e);
        
        for (char c : ch) {
            System.out.println(c);
        }
        if(bf == bb && brf == brb && cbrf == cbrb && (e == 0 || d == 0)){
          return true;
        }
        else{
          return false;
        }
    }
}
