package xworkz.com.array1;

public class plantArray {
		public static void main(String args[]) {
			System.out.println(" start program...");
			plant[] plantArray=new plant[3];
			plant mango=new plant();
			mango.viewDetails();
			plantArray[0]=mango;
			
			plant coconut=new plant(" long", 450,100);
			coconut.viewDetails();
			plantArray[1]=coconut;
			
			plant jack=new plant(" broad", 700,200);
			jack.viewDetails();
			plantArray[2]=jack;
			for(int i=0;i<plantArray.length;i++) {
				if(plantArray[i]!=null)
				{
					plant p=plantArray[i];
				}
				
			}
			System.out.println(" print using for each");
			for(plant p:plantArray) {
				if(p!=null)
					p.viewDetails();
				
			}
			
		}

	}



