import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class memory {

	/**
	 * @param args
	 */
	static int x1=0,y1=0, x2=0, y2=0;
 static int pa;
static int pb;
static	int i;
	static int j;
static int step;
	final static ImageIcon im[][]=new ImageIcon[4][4];
	static JFrame f;
	static int bit;
static JPanel p1;
JPanel p2;
JPanel p3;
static JButton b[][]=new JButton[4][4];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
f=new JFrame();
p1=new JPanel();
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.add(p1);
f.setSize(400,400);
p1.setLayout(new GridLayout(4,4));

/*im[0][0]=new ImageIcon("picture001.jpg");
b[0][0]=new JButton(im[0][0]);
//p1.add(b[0][0]);

ImageIcon water = new ImageIcon("src/picture001.jpg");
JButton button = new JButton(water);
p1.add(button);
*/
String[] str={"src/116.jpg","src/download.jpg","src/op.jpg","src/ui.jpg","src/yu.jpg","src/yt.jpg","src/images.jpg","src/im.jpg","src/be.jpg","src/kl.jpg","src/mb.jpg","src/io.jpg","src/bru.jpg","src/you.jpg"};
/*File imageCheck = new File("src/op.jpg");

if(imageCheck.exists()) 
    System.out.println("Image file found!");
else 
    System.out.println("Image file not found!");
*/int k=0;
int u=0,p=0;
int[] tarr = new int[20];
int flag=0;

for( i = 0;i<4;i++)
{
if(i==2)
	break;
	for(j=0;j<4;j++)
	{
	//System.out.println("i"+i+"j"+j);
		Random r=new Random();
		do
		{
		 u=r.nextInt()%13;
		 if(u<0)
			 u=-u;
	  //System.out.println(u);
		//im[0][0]=new ImageIcon("src/116.jpg");
		flag=0;
		for(int o = 0;o<p;o++)
		{//	System.out.println("u"+u+"tarr"+tarr[o]);
			if(tarr[o]==u)
			{
	//			System.out.println(u+""+tarr[o]);
				flag++;
			}
		}
	//	System.out.println("flg"+flag);
		if(flag<2)
			{
		//	System.out.println("ass");
			tarr[p++]=u;
			break;
			}
//System.out.println("repeat");
		}while(true);
//		System.out.println("out");
	im[i][j]=new ImageIcon(str[u]);
/*		b[i][j]=new JButton(im[i][j]);
	b[i][j].set);
		p1.add(b[i][j]);*/
		if(k<9)
			k++;
	}
}
int t;
for(i=2;i<4;i++)
{
	for(j=0;j<4;j++)
	{
		for(t=0;t<p;t++)
		{
		for(k=0;k<p;k++)
		{
			if((tarr[t]==tarr[k])&&(k!=t))
			{
				break;
			}
		}
		if(k==p)
			break;
		}
		if(t!=p)
		{
		int	tw=tarr[t];
		tarr[p++]=tw;	
		im[i][j]=new ImageIcon(str[tarr[t]]);
	/*		b[i][j]=new JButton(im[i][j]);
			p1.add(b[i][j]);
			*/
		}
		else
		{
//copy
			
			Random r=new Random();
			do
			{
			 u=r.nextInt()%13;
			 if(u<0)
				 u=-u;
//		  System.out.println(u);
			//im[0][0]=new ImageIcon("src/116.jpg");
			flag=0;
			for(int o = 0;o<p;o++)
			{	//System.out.println("u"+u+"tarr"+tarr[o]);
				if(tarr[o]==u)
				{
				//	System.out.println(u+""+tarr[o]);
					flag++;
				}
			}
			//System.out.println("flg"+flag);
			if(flag<2)
				{
			//	System.out.println("ass");
				tarr[p++]=u;
				break;
				}
	//System.out.println("repeat");
			}while(true);
			//System.out.println("out");
		im[i][j]=new ImageIcon(str[u]);
			/*b[i][j]=new JButton(im[i][j]);
			p1.add(b[i][j]);
*/
//end			
			
			
		}
		}
	}
shuffle(im);
final ImageIcon def=new ImageIcon("src/def.jpg");
for(i=0;i<4;i++)
{
	for(j=0;j<4;j++)
	{
		b[i][j]=new JButton();
	//	b[i][j].setBorderPainted(true);
		//b[i][j].setIcon(im[i][j]);
		p1.add(b[i][j]);
b[i][j].setIcon(def);
final int r1=i;
final int r2=j;

		b[i][j].addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	if(b[r1][r2].getIcon().toString().equals("src/def.jpg"))
	{	
		step++;
		b[r1][r2].setIcon(im[r1][r2]);
	if(bit==2)
	{
	//	System.out.println("bit 2"+x1+""+y1+""+x2+""+y2);
		bit=0;
	//	System.out.println(b[x1][y1].getIcon()+","+b[x2][y2].getIcon());
//		String s1=b[x2][y2].getIcon();
		if(b[x1][y1].getIcon().toString()==(b[x2][y2].getIcon().toString()))
		{
	//		System.out.println("equal");
		}
		else
		{
b[x1][y1].setIcon(def);
b[x2][y2].setIcon(def);
		}
x1=r1;
y1=r2;
	}
	else if(bit==0)
	{
	//	System.out.println("bit 0");
		x1=r1;
		y1=r2;
	}
	else
	{
	//	System.out.println("bit 1");
		x2=r1;
		y2=r2;
		
		for(i=0;i<4;i++)
		{
			for(j=0;j<4;j++)
			{
				if(b[i][j].getIcon().toString().equals("src/def.jpg"))
				{
					break;
				}
			}
			if(j!=4)
				break;
		}
		int res = JOptionPane.YES_NO_OPTION;
		if(i==4)
		{
			res=JOptionPane.showConfirmDialog(f, "CONGRATS you won by "+step+" moves!!!Would u like to continue??");	
			if(res==JOptionPane.YES_OPTION)
			{
				for(i=0;i<4;i++)
					for(j=0;j<4;j++)
					{
				//		b[i][j].setForeground(Color.BLACK);
						b[i][j].setIcon(def);
					}
				step=0;
				shuffle(im);
				bit=0;
			}
			else
			{
				//int p1=(Integer.parseInt(l3.getText())+Integer.parseInt(l4.getText())+Integer.parseInt(l6.getText()));
				JOptionPane.showMessageDialog(f, "thanks for playing!!!");
			f.setVisible(false);
			}
		}

		
	}
	bit++;
	}
	}
});
}
}
}
	private static void shuffle(ImageIcon[][] im2) {
		// TODO Auto-generated method stub
	for(i=0;i<500;i++)
	{
		
		Random r=new Random();
		int y1=r.nextInt()%4;
		int x1=r.nextInt()%4;
		int y2=r.nextInt()%4;
		int x2=r.nextInt()%4;
	
		if(x1<0)
			x1=-x1;
		if(y1<0)
			y1=-y1;
		if(x2<0)
			x2=-x2;
		if(y2<0)
			y2=-y2;
	
		ImageIcon t=im2[x1][y1];
		im2[x1][y1]=im2[x2][y2];
		im2[x2][y2]=t;
	}
	//System.out.println("arry");
	
	}
}
