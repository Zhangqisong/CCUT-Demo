package arithmetic;
import java.util.*;

public class demo {
	public static void main(String[] args) {
		
		System.out.println("最大值");
		Scanner shu = new Scanner(System.in);
		int imax = shu.nextInt();
		System.out.println("是否生成负数1为生成2为不生成");
		Scanner fu = new Scanner(System.in);
		int fushu = fu.nextInt();
		System.out.println("1加减，2加减乘除，3乘除");
		Scanner suan = new Scanner(System.in);
		int suanfa = suan.nextInt();
		System.out.println("要输出多少题");
		Scanner he = new Scanner(System.in);
		int num = he.nextInt();
		
		for(int i=0;i<num;i++){
			double x = Math.random() * imax; //生成第一个数 
			double y = Math.random() * imax; //生成第二个数 
			double m = 1; 
			char l = 1; //生成负数 
			for(int p=0;p<2;p++){ 
				if(fushu == 1){ 
					m = (int)Math.random() * 2; 
					if( m == 0){ 
						l = (char)'-'; 
					} 
				} 
			} 
			double z = 1; 
			if(suanfa == 1){ 
				z = Math.random() * 2; //生成加减法 
			}else if(suanfa == 2){ 
				z = Math.random() * 4; //生成加减乘除法 
			}else if(suanfa == 3){ 
				double n = 1; 
				n = Math.random() * 2; //生成乘除 
				z = n+2; 
			} 
				int one = (int)x; //生成第一个数 
				int two = (int)y; //生成第二个数 
				int three = (int)z; //生成加减符号 
				char four = 1; 
				int five = 1; 
			if(three==0){ 
				if(one+two<=imax){ 
					four = (char)'+'; 
					if(m==0){ 
						one = -one; 
						two = -two; 
					} 
					five = one+two; 
					System.out.println("测试加法"+one+" "+four+" "+two+"="+five); 
				}else{ 
					i--; 
				} 
			}else if(three==1){ 
				if(one-two>=0){ 
					four = (char)'-'; 
					if(m==0){ 
						one = -one; 
						two = -two; 
					} 
					five = one-two; 
					System.out.println("测试减法"+one+" "+four+" "+two+"="+five); 
				}else{ 
					i--; 
				} 
			}else if(three==2){ 
				if(one*two<=imax){ 
					four = (char)'*'; 
					if(m==0){ 
						one = -one; 
						two = -two; 
					} 
					five = one*two; 
					System.out.println("测试乘法"+one+" "+four+" "+two+"="+five); 
				}else{ 
					i--; 
				} 
			}else if(three==3){ 
				if(one/two>=0){ 
					four = (char)'/'; 
					if(m==0){ 
						one = -one; 
						two = -two; 
					} 
					float six = (float)one/two; 
					System.out.println("测试除法"+one+" "+four+" "+two+"="+six); 
				}else{ 
					i--; 
				} 
			} 
		} 
	}
}
//（a）考虑数据异常处理问题，如在输入题目生成范围的数据时，输入了“abc“等字符数据，程序如何处理。

//（b）增大算式生成数的范围（如整数存不下的数），程序如何处理。