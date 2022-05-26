package java_20220526;

public class Java01 {
	public static void main(String[] args) {//throws Exception{
		
		int num1=26;
		int num2=0;
//		int result=num1/num2;
//		int result=0;
		int result=(int)(Math.random()*10)-1;
		try {
			if(num2 ==0) {
				throw new Exception("오류발생");
			}
			result=num1/num2;
		} catch (Exception e) {
			System.err.println("errr msg:"+e);
			System.out.println("errr msg:"+e.toString());
			System.out.println("errr msg:"+e.getMessage());
			e.printStackTrace();
			num2=(int)(Math.random()*10)-1==0?1:
				(int)(Math.random()*10)-1;
		}finally {
			System.out.println("예외처리 마무리 ");
		}
		System.out.println(result);
	}

}
