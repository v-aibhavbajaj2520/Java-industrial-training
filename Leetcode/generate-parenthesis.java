//22 -> Generate Parentheses
// https://leetcode.com/problems/generate-parentheses/
import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> res= new ArrayList<>();
        solve(n, 0,0,new StringBuilder(),res);
        return res;
    }
    void solve(int n, int l, int r, StringBuilder s, List<String> res){
        if(s.length()==2*n){
            res.add(s.toString());
            return;
        }
        if(l<n){
            s.append('(');
            solve(n, l+1, r, s, res);
            s.deleteCharAt(s.length()-1);
        }
        
        if(r<l){
            s.append(')');
            solve(n, l, r+1, s, res);
            s.deleteCharAt(s.length()-1);
        }

    }
}