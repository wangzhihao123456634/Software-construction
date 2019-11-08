package ruangou;

public class Suijishu {
	static int[] left_operand=new int[100];
	static char[] operator=new char[100];
	static int[] right_operand=new int[100];
	public  static void suijishu()
	{   int k,m;
		for(int i=0;i<50;i++) {
		int n=(int)(Math.random()*2)+1;//随机产生一个数1或2来输出加法或减法
		if(n==1) {
			k=(int)(Math.random()*51);//随机生成0~50的数
		    m=(int)(Math.random()*51);//随机生成0~50的数
		    left_operand[i]=k;operator[i]='+';right_operand[i]=m;
	             }
		    else {
			k=(int)(Math.random()*101);//随机生成0~100的数
		    m=(int)(Math.random()*k+1);//随机生成小于k的数
		    left_operand[i]=k;operator[i]='-';right_operand[i]=m;
                 }
		if(i!=0)//让程序生成没有重复算式的习题
		{
			for(int j=0;j<i;j++)
					{
				        if(k==left_operand[j]&&m==right_operand[j])
				        {
				        	i--;
				        }
					}
		}
		                        }
      }
                        }
