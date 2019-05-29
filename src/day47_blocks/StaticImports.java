package day47_blocks;
import static java.lang.Math.*;
import static java.lang.Character.*;
import static java.util.Arrays.sort;
import java.util.*;
import static java.time.LocalDateTime.now;




public class StaticImports {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(PI);
System.out.println(max(10, 10));
System.out.println(min(10, 100));

System.out.println(round(12.56));
System.out.println(abs(-19));
System.out.println(pow(10.2, 2));

//===============================

System.out.println(isDigit('4'));
System.out.println(isAlphabetic('J'));



int []nums = {34,23,44};

sort(nums);
System.out.println(Arrays.toString(nums));


System.out.println(now());
	}

}
