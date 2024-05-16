package entities;

 public class Cadeira {	
		private int num;
		private String status;

		public Cadeira(int num, String status) {
			this.num = num;
			this.status = status;
		}
		
		public int getNumCadeira(){
			return num;
		}
		
		public void setNumCadeira(int num) {
			this.num = num;
		}
		
		public String getStatus() {
			return status;
		}
		
		public void setStatus(String status) {
			this.status= status;
		}
		
		
    }

