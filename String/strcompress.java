public class strcompress{
    public static String compress(String str){
        StringBuilder sb=new StringBuilder("");
        char ch=str.charAt(0);
        sb.append(ch);
        int count=1;

        for(int i=1;i<str.length();i++){
            if(str.charAt(i) == str.charAt(i-1) ){
               count++; 
               
            }else{
             sb.append(count);   
            sb.append(str.charAt(i));
            count=1;
        }
    }
    sb.append(count);
    return sb.toString();
}
    public static void main(String args[]){
        String str="aaaabbbccdddd";
        System.out.println(compress(str));
    }

}

