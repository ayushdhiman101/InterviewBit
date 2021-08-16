//Given a list of non negative integers, arrange them such that they form the largest number.

//For example:

//Given [3, 30, 34, 5, 9], the largest formed number is 9534330.

//Note: The result may be very large, so you need to return a string instead of an integer.

//Note:You only need to implement the given function. Do not read input, instead use the arguments to the function. Do not print the output, instead return values as specified. Still have a doubt? Checkout Sample Codes for more details.



class Solution {
    public String largestNumber(int[] nums) {
    String[] arr=new String[nums.length];
    
    for(int i=0;i<nums.length;i++)
    arr[i]=Integer.toString(nums[i]);

    //Anonymous function
    Arrays.sort(arr,new Comparator<String>(){
    @Override public int compare(String x,String y){
            String one=x+y;
            String two=y+x;
            return one.compareTo(two)>0?-1:1;
        }
    });

    StringBuilder sb=new StringBuilder("");
    for(String s:arr)
    sb.append(s);
    if(sb.charAt(0)=='0')
        return "0";
    return sb.toString();
    }
}
