// Given an array A containing N integers.

// You need to find the maximum sum of triplet ( Ai + Aj + Ak ) such that 0 <= i < j < k < N and Ai < Aj < Ak.

// If no such triplet exist return 0.



// O(N^3) Solution to the problem 
public class Solution {
    public int solve(ArrayList<Integer> A) {
        int sum=-99999;

        for(int i=0;i<A.size()-2;i++){
            for(int j=i+1;j<A.size()-1;j++){
                for(int k=j+1;k<A.size();k++){
                
                    if(A.get(i)<A.get(j)&&A.get(j)<A.get(k)&& A.get(i)<A.get(k)){
                        int temp=A.get(i)+A.get(j)+A.get(k);
                        if(temp>sum) sum=temp;

                    }

                }
            }
        }

    return sum;
    }
}

//O(N^2) Time Complexity 

public class Solution {
    public int solve(ArrayList<Integer> A) {
        int sum=0;
        

        for(int i=1;i<A.size()-1;i++){
            int rmax=-99999;
            int lmax=-99999;

            for(int j=i+1;j<A.size();j++){
                if(A.get(j)>rmax && A.get(j)>A.get(i)) rmax=A.get(j);
            }
             for(int j=0;j<i;j++){
                 if(A.get(j)>lmax && A.get(i)>A.get(j)) lmax=A.get(j);
  
            }

            if(rmax+lmax+A.get(i)>sum) sum=rmax+lmax+A.get(i);
        }

    return sum;
    }
}

//O(NLog(N) Time Complexity

public class Solution {
    public int solve(ArrayList<Integer> A) {
    
    int n= A.size();
    int maxSuffArr[] = new int[n + 1];
 
    maxSuffArr[n] = 0;
 
    for(int i = n - 1; i >= 0; --i)
        maxSuffArr[i] = Math.max(maxSuffArr[i + 1],
                                        A.get(i));
 
    int ans = 0;
 
    TreeSet<Integer> lowValue = new TreeSet<Integer>();
 

    lowValue.add(Integer.MIN_VALUE);
 
    for(int i = 0; i < n - 1; ++i)
    {
        if (maxSuffArr[i + 1] >A.get(i))
        {
            ans = Math.max(ans, lowValue.lower(A.get(i)) +
                           A.get(i) + maxSuffArr[i + 1]);
                           
            lowValue.add(A.get(i));
        }
    }
    return ans;
    }
}



