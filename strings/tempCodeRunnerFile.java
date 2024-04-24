static boolean isP(String s,String a){
        int n=s.length();
        int m=a.length();
        if(m<n) return false;

        int i=0;
        int j=0;


        while(i<n && j<m){
            if(s.charAt(i)==a.charAt(j)){
                i++;
                j++;

            }
            else if(i>0 && s.charAt(i-1)==a.charAt(j)){
                j++;
            }else {
                return false;
            }
        }

        while(j<m){
            if(s.charAt(i-1)!=a.charAt(j)) return false;
        }

        return i<n?false:true;
    }