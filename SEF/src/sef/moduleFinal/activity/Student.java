package sef.moduleFinal.activity;

public class Student {
		private String schoolName;
				
		public void Person(String schoolName){
			this.schoolName = schoolName;
		}
		
		public String getschoolName() {
			return schoolName;
		}
		
		// setter for String schoolName
		public void setschoolName(String schoolName) {
			this.schoolName = schoolName;
		}

	public static void  main(String[] args) {
		Student st = new Student();
		st.setschoolName("University of Latvia");
		
		System.out.printf("I am studiying in "+ st.getschoolName()) ;		
	}
	
}
