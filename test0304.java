/*
 * 自除数 是指可以被它包含的每一位数除尽的数。

例如，128 是一个自除数，因为 128 % 1 == 0，128 % 2 == 0，128 % 8 == 0。

还有，自除数不允许包含 0 。

给定上边界和下边界数字，输出一个列表，列表的元素是边界（含边界）内所有的自除数。

示例 1：

输入： 
上边界left = 1, 下边界right = 22
输出： [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
*/

package lianxi0304;

import java.util.*;

public class test0304 {
	public static void main(String[] args) {
		Solution S = new Solution();
		int left = 1;
		int right = 22;
		List<Integer> list = S.selfDividingNumbers(left, right);
		System.out.println(list);
	}
}


class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for(int i = left; i <= right; i++ ){
            if(detection(i)){
                list.add(i);
            }
        }
        return list;
    }
    public boolean detection(int num){
        int a = num;
        while(a != 0){
            int b = a % 10;
            if( b == 0 || (num % b) != 0){
                return false;
            }
            a /= 10;
        }
        return true;
    }
}