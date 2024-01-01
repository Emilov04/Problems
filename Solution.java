import RockPaperScissors.Main;

import javax.swing.*;
import java.math.BigDecimal;
import java.security.KeyPair;
import java.sql.SQLOutput;
import java.sql.Struct;
import java.util.*;
import java.util.logging.Filter;

public class Solution{

    public static void main(String[] args) {
        int[] nums = {7,9,3};
        int target = 13;
        Stack<Integer> i = new Stack<>();
        System.out.println(Solution.generateParenthesis(10));
    }

    public static boolean check(int[] nums, int target, int total, int index){


        if(index == nums.length){
            return total == target;
        }
        return  false;
    }
    public static List<String> generateParenthesis(int n) {

        ArrayList<String> list = new ArrayList<>();

        check(list,"", n,0,0);
        return list;
    }
    public static void check(ArrayList<String> list, String res, int n, int r, int l ){
        if(res.length() == n * 2){
            list.add(res);
            return;
        }
        if(r < n){
            check(list, res + "(", n ,r + 1, l);

        }
        if(l < r){
            check(list, res + ")", n, r, l + 1);
        }

    }
}