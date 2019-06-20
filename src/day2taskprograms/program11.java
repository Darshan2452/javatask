package day2taskprograms;

import java.util.HashMap;
import java.util.Map;

public class program11 {
    public static void main(String[] args) {
        String str= "this is sample enquero company training java program";
        Map<String,Integer> co=new HashMap<>();
        String[] words = str.split(" ");
        for(String word : words){
            Integer integer=co.get(word);
            if(integer==null)
            {
                co.put(word,1);
            }
            else{
                co.put(word,integer+1);
            }
        }
        System.out.println(co);
    }
}