/*
 * �Գ��� ��ָ���Ա���������ÿһλ������������

���磬128 ��һ���Գ�������Ϊ 128 % 1 == 0��128 % 2 == 0��128 % 8 == 0��

���У��Գ������������ 0 ��

�����ϱ߽���±߽����֣����һ���б��б��Ԫ���Ǳ߽磨���߽磩�����е��Գ�����

ʾ�� 1��

���룺 
�ϱ߽�left = 1, �±߽�right = 22
����� [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
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