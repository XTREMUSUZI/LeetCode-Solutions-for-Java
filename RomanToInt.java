import java.util.HashMap;
class Solution {
    public int romanToInt(String s) {
        HashMap <Character, Integer> nums= new HashMap<Character, Integer>();
        nums.put('I',1);
        nums.put('V',5);
        nums.put('X',10);
        nums.put('L',50);
        nums.put('C',100);
        nums.put('D',500);
        nums.put('M',1000);
        int num =0;
        for(int i=0;i<s.length()-1;i++){
            if(nums.get(s.charAt(i))<nums.get(s.charAt(i+1))){
                num-=nums.get(s.charAt(i));
            }else{
                num+=nums.get(s.charAt(i));
            }
        }
        num+=nums.get(s.charAt(s.length()-1));
        return num;
        
    }
}
