package arithmetic;
import java.util.*;

public class demo {
	public static void main(String[] args) {
		
		System.out.println("���ֵ");
		Scanner shu = new Scanner(System.in);
		int imax = shu.nextInt();
		System.out.println("�Ƿ����ɸ���1Ϊ����2Ϊ������");
		Scanner fu = new Scanner(System.in);
		int fushu = fu.nextInt();
		System.out.println("1�Ӽ���2�Ӽ��˳���3�˳�");
		Scanner suan = new Scanner(System.in);
		int suanfa = suan.nextInt();
		System.out.println("Ҫ���������");
		Scanner he = new Scanner(System.in);
		int num = he.nextInt();
		
		for(int i=0;i<num;i++){
			double x = Math.random() * imax; //���ɵ�һ���� 
			double y = Math.random() * imax; //���ɵڶ����� 
			double m = 1; 
			char l = 1; //���ɸ��� 
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
				z = Math.random() * 2; //���ɼӼ��� 
			}else if(suanfa == 2){ 
				z = Math.random() * 4; //���ɼӼ��˳��� 
			}else if(suanfa == 3){ 
				double n = 1; 
				n = Math.random() * 2; //���ɳ˳� 
				z = n+2; 
			} 
				int one = (int)x; //���ɵ�һ���� 
				int two = (int)y; //���ɵڶ����� 
				int three = (int)z; //���ɼӼ����� 
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
					System.out.println("���Լӷ�"+one+" "+four+" "+two+"="+five); 
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
					System.out.println("���Լ���"+one+" "+four+" "+two+"="+five); 
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
					System.out.println("���Գ˷�"+one+" "+four+" "+two+"="+five); 
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
					System.out.println("���Գ���"+one+" "+four+" "+two+"="+six); 
				}else{ 
					i--; 
				} 
			} 
		} 
	}
}
//��a�����������쳣�������⣬����������Ŀ���ɷ�Χ������ʱ�������ˡ�abc�����ַ����ݣ�������δ���

//��b��������ʽ�������ķ�Χ���������治�µ�������������δ���