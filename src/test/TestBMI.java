package test;

 class TestBMI {
	
	public static void main(String[]args) {
		double weight=72,high=1.76;	//體重(kg),身高(m)
		double bmi=weight/(high*high);	
		System.out.printf("BMI=%.3f\n",bmi);
		if(bmi<18)
			System.out.println("過瘦");
		else if(bmi>=24)
			System.out.println("過胖");
		else
			System.out.println("正常");
	}
}