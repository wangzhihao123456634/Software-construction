package ruangou;

public class Suijishu {
	static int[] left_operand=new int[100];
	static char[] operator=new char[100];
	static int[] right_operand=new int[100];
	public  static void suijishu()
	{   int k,m;
		for(int i=0;i<50;i++) {
		int n=(int)(Math.random()*2)+1;//�������һ����1��2������ӷ������
		if(n==1) {
			k=(int)(Math.random()*51);//�������0~50����
		    m=(int)(Math.random()*51);//�������0~50����
		    left_operand[i]=k;operator[i]='+';right_operand[i]=m;
	             }
		    else {
			k=(int)(Math.random()*101);//�������0~100����
		    m=(int)(Math.random()*k+1);//�������С��k����
		    left_operand[i]=k;operator[i]='-';right_operand[i]=m;
                 }
		if(i!=0)//�ó�������û���ظ���ʽ��ϰ��
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
