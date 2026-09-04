public class Duplicate {
    public static void removeDuplicate(String str,int idx,StringBuilder newstr,boolean map[]){
        if(idx == str.length()){
        
            System.out.println(newstr);
            return;
        }

        char ch=str.charAt(idx);
        if(map[ch-'a'] == true){
          removeDuplicate(str,idx+1,newstr,map);
        }else{
            map[ch-'a'] = true;
          removeDuplicate(str,idx+1,newstr.append(ch),map);
            
        }
  }
    public static void main(String[] args) {
        String str="rrrriiiiyyyaaaaaa";
        removeDuplicate(str,0,new StringBuilder(""),new boolean[26]);
    }
}
