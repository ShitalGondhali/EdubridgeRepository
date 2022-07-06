
public class PerFectSquare {
		
		
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n=16,prod=1;
			boolean flag = false;
			for(int i=1;i<n/2;i++) {
				prod=i*i;
				if(prod==n) {
					flag=true;
					break;
				}
				
			}if(flag) {
				System.out.println("yes");
			}else {
				System.out.println("no");
				
			}
			
		}
	}

