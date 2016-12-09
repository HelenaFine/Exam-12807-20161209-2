import java.util.Scanner;
public class Exam_two {
	

	
		public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入您的工资：");
		double salary = scanner.nextDouble();
		double num=salary-3500;
			if(num<=0){
				System.out.println("所需要缴纳的税费为:"+0+"元");
			}
			if(num>0&&num<1500){
				System.out.println("所需要缴纳的税费为:"+num*0.03+"元");
			}
			if(num>1500&&num<4500){
				System.out.println("所需要缴纳的税费为:"+1500*0.03+(num-1500)*0.1+"元");
			}
			if(num>4500&&num<9000){
				System.out.println("所需要缴纳的税费为:"+1500*0.03+3000*0.1+(num-4500)*0.2+"元");
			}
			if(num>9000&&num<35000){
				System.out.println("所需要缴纳的税费为:"+1500*0.03+3000*0.1+4500*0.2+(num-9000)*0.25+"元");
			}
			if(num>35000&&num<55000){
				System.out.println("所需要缴纳的税费为:"+1500*0.03+3000*0.1+4500*0.2+26000*0.25+(num-35000)*0.3+"元");
			}
			if(num>55000&&num<80000){
				System.out.println("所需要缴纳的税费为:"+1500*0.03+3000*0.1+4500*0.2+26000*0.25+20000*0.3+(num-55000)*0.35+"元");
			}
			if(num>80000){
				System.out.println("所需要缴纳的税费为:"+1500*0.03+3000*0.1+4500*0.2+26000*0.25+20000*0.3+25000*0.35+(num-80000)*0.45+"元");
			}
		
	}
		

}
