			public class student1 extends Person {
			private static final String PREFIX = "R/BCA-2019-";
			Results data = new Results();
			private String rollno;
			private char grade;
			String joinyear;
			student1(String name, String rollno, int [] marks)
			
			{
			this.name = name;
			this.rollno = rollno;
			this.data.marks = marks;
			}
			
			void display_results()
			
			{
				
			float avg = computeAvg();
			
			//compute grade
			grade = computeGrade(avg);
			System.out.println("Result of " + name.toUpperCase());
			System.out.println("Roll no is " + PREFIX + rollno);
			System.out.println("Grade is " + grade);
			}

			public char computeGrade(float avg) {
				char grade;
				
				boolean bRangeForGradeA = avg >80;
				boolean bRangeForGradeB = avg >60 && avg <=80;
				boolean bRangeForGradeC = avg >50 && avg <=60;
				boolean bRangeForGradeD = avg >40 && avg <=50;
				
				if(bRangeForGradeA)	
				grade = 'A';
				else 
				{
					if (bRangeForGradeB)
					grade = 'B';
					else {
						
						if (bRangeForGradeC)
						grade = 'C';
						else {
							
							if (bRangeForGradeD)
							grade = 'D';
							else
							grade = 'F';
						}
					}
				}
				return grade;
			}

			public float computeAvg() {
				int sum=0;
				float avg=0;
				char grade;
				for (int i=0; i< data.marks.length;i++)
				sum+= data.marks[i];
				avg = sum/data.marks.length;
				return avg;
			}
			
			public static void main(String[] args) 
			
			{
			// TODO Auto-generated method stub
			int[] marks = {90,80,70,56,89};
			student1 sue = new student1("Alex", "222", marks);
			sue.display_results();
			
			}
			
			}