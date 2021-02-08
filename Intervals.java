// 13707293
// robertjohnhill1@gmail.com

import java.io.*;
import java.util.*;

public class Intervals {

	public static String intersect(int a1, int b1, int a2, int b2) {
		String g = "test";
		ArrayList<Integer> first = new ArrayList<Integer>();
		ArrayList<Integer> second = new ArrayList<Integer>();
		ArrayList<Integer> ret_lst = new ArrayList<Integer>();
		int x = 0;
		for (x = a1; x <= b1; x++){
			first.add(x);
			//System.out.println(first);
		}
		for (x = a2; x <= b2; x++ ){
			second.add(x);
			//System.out.println(second);
		}
		for (int i : first) {
			for (int j : second) {
				if (i == j){
					ret_lst.add(i);
					//System.out.println(ret_lst);
				}
			}
		}
		//String.valueOf(ret_lst[0]);
		Integer[] empt_int_arr = {};
		if (ret_lst.isEmpty()){
			String r = Arrays.toString(empt_int_arr);
			return r;
		}
		else {
			int fst_el = ret_lst.get(0);
			int k = ret_lst.size();
			int snd_el = ret_lst.get(k - 1);

			Integer[] fin_array = {fst_el, snd_el};
			String df = Arrays.toString(fin_array);
			df = df.replaceAll("\\s+", "");
			return df;
			// issue is on second input, need to check if is empty
		}
	}

	public static void main(String[] args) {

	}
}