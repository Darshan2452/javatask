package day2taskprograms;

import java.util.HashMap;

public class setiterface {
    public static void main(String[] args){
//        String name="helloworld";
//        String name1=new String("helloworld");
//        String name3="helloworld";
//        System.out.println(name);
        String name="helloworld";
        HashMap<Character,Integer> ci=new HashMap<>();
            String temp = "";
            final char[] chars=name.toCharArray();
            for(int i = 0; i<chars.length; i++){
                if(ci.containsKey(chars[i])) {
                    ci.put(chars[i], ci.get(chars[i]) + 1);
                }else{
                    ci.put(chars[i],1);
                }
            }
        System.out.println(temp);

    }
}
