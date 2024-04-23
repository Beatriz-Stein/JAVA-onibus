package entities;

public class Usuario {
		private String nome;
		private String email;
		private String numero;
	
		public Usuario (String nome, String email, String numero) {
			this.nome = nome;
			this.email = email;
			this.numero = numero;
		}
		
		public String getNomeUsuario() {
			return nome;
		}
		
		public void setNomeUsuario(String nome) {
			this.nome = nome;
		}
		
		public String getEmail() {
			return email;
		}
		
		public void setEmail(String email) {
			this.email = email;
		}
		
		public String getNumUsuario() {
			return numero;
		}
		
		public void setNumUsuario(String numero) {
			this.numero = numero;
		}
	}

