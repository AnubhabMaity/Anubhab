package JavaAssignment;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GetOccurenceOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetOccurenceOfString a=new GetOccurenceOfString();
		//a.OccurenceOfaString("I am a jk ahhb hh jkjkjkjhkd jdh hi     xbj", "jkjk");
		//System.out.println(a.Fibo(10));
		//a.Fact(5);
		//a.Swap(12, 17);
		//a.Terneary(50, 27, 100);
		//a.LeapYear(400);
		//System.out.println(a.ReverseNumber(12345));
		//a.SumOfArrayElement(new double [] {5,8,7,6,4});
		//System.out.println(a.Prime(17));
		//System.out.println(a.EvenOdd(15));
		//a.Random(5);
		//a.Palindorm("Anubhab");
		//System.out.println(a.NthLargestNumber(new Integer[]{5,10,15,7,1,99,105,10},4));
		//a.occuranceOfEachUniqueString(new String [] {"anu","panchu","hmm","anu","ag ","bx"," ","  "});
	 //  System.out.println(a.ReverseString("Anubhab"));
		System.out.println(a.getNthNumberFormString("Anubguyg 12154 hfu142 hgu4 hgug57jg", 4));
	}
	public int OccurenceOfaString(String actual,String find) {
		int occ=0;
		int index=0;
		int findindex=0;
		while(findindex!=-1) {
			findindex=actual.indexOf(find, index);
			if(findindex!=-1) {
				occ++;
				index=findindex+1;
			}
		}
		return occ;
	}
	public ArrayList Fibo(int num) {
		ArrayList list=new ArrayList();
		int sum=0;
		int count=0;
		int num1=0;
		int num2=1;
		while(count<num) {
			
			//System.out.println(num1+" ");
			list.add(num1);
			sum=num1+num2;
			num1=num2;
			num2=sum;
			
			count++;
			
		}
		return list;
	}
	public int Fact(int num) {
		int sum=1;
		if(num==0) {
			return 1;
		}
		
		for(int i=num;i>0;i--) {
			sum=sum*i;
		}
		return sum;
		
	}
	public void Swap(int num,int num1) 
	{
		System.out.println("Before Swap "+num+"and "+num1);
		num=num+num1;
		num1=num-num1;
		num=num-num1;
		System.out.println("After Swap "+num+"and "+num1);
	}
	public int Terneary(int a,int b,int c) {
		
		 int largest=(a>b && a>c)?a:(b>a && b>c)?b:c;
		 return largest;
	}
	public boolean LeapYear(int year) {
		if((year%4==0&& year%100!=0)||(year%400==0))
				{
				return true;
		}
		else {
			return false;
		}
	}
	public int ReverseNumber(Integer num) {
		String afterrev="";
		String rev=num.toString();
		char ch[]=new char[rev.length()];
		ch=rev.toCharArray();
		for(int i=rev.length()-1;i>=0;i--) 
		{
			afterrev+=ch[i];
		}
		return Integer.parseInt(afterrev);
	}
	public double SumOfArrayElement(double arr[]) 
	{
		double sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
	}
	public boolean Prime(int num) {
		boolean flag=true;
		if(num==0||num==1) {
			flag= true;
		}
		else {
			for(int i=2;i<=num/2;i++) {
				if(num%i==0) {
					flag= false;
					break;
				}
			}
		
	}
		return flag;
	}
	public String EvenOdd(int num) {
		
	String result=	(num%2==0)? ""+num+" is Even number":""+num+" is Odd number";
	return result;
	}
	public void Random(int range) {
		Random rnd=new Random();
		int num=rnd.nextInt(5);
		System.out.println(num);
	}
	public boolean Palindorm(String actual) {
		String Rev="";
		actual=actual.toLowerCase();
		for(int i=actual.length()-1;i>=0;i--) {
			Rev+=actual.charAt(i);
		}
		if(actual.equals(Rev)) {
			return true;
		}
		else {
			return false;
		}
		}
	public int NthLargestNumber(Integer[] arr, int k) {
		
		for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] > arr[index]){  
                    index = j;  
                }  
            }  
            int bignumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = bignumber;  
	}
		
		return arr[k-1];
	}
	
	public void occuranceOfEachUniqueString(String str[]) 
	{
		int k=1;
		for(int i=0;i<str.length;i++) {
			if(str[i]!="") {
				for(int j=i+1;j<str.length;j++) {
					if(str[i].equals(str[j])) {
						k++;
						str[j]="";
						
					}
				}
				System.out.println(str[i]+ " is "+k );
				k=1;
			}
		}
	}
	public void generateRandomNumber(int length)
	{
		int num;
		String random = "";
		for(int i = 1 ; i<= length ; i++)
		{
			num = (int) ((Math.random()+1)*i);
			String str = Integer.toString(num);
			random = random.concat(str);
		}
		
		if(random.length() > length)
			random = random.substring(0, length);

		System.out.println("The random number generated is : "+random);
	}
	public String ReverseString(String num) {
		String afterrev="";
		char ch[]=new char[num.length()];
		ch=num.toCharArray();
		for(int i=num.length()-1;i>=0;i--) 
		{
			afterrev+=ch[i];
		}
		return afterrev;
	}
	public int getNthNumberFormString(String str,int position) {
		String prttern="[0-9]+";
		Pattern p= Pattern.compile(prttern);
		Matcher m=p.matcher(str);
		int occ=1;
		int val=0;
		while(m.find()) {
			if(occ==position) {
				val=Integer.parseInt(m.group());
			}
			occ++;
		}
		return val;
	}
}
