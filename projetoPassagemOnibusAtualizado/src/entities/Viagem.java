package entities;

public class Viagem {
	private String lugarPartida;
	private String lugarDestino;
	private String horarioPartida;
	private String horarioChegada;

	public Viagem(String lugarPartida, String lugarDestino, String horariosPartida, String horariosChegada) {
		this.lugarPartida = lugarPartida;
		this.lugarDestino = lugarDestino;
		this.horarioPartida = horariosPartida;
		this.horarioChegada = horariosChegada;

	}

	public static final String[] lugaresPartida = { "RodoviariaVitoria-ES" };
	public static final String[] lugaresChegada = { "Buzios-RJ", "Porto Seguro-BH", "Gramado-RS","Fernando de Noronha-PE" };

	public String getLugarPartida() {
		return lugarPartida;
	}

	public void setLugarPartida(String lugarPartida) {
		this.lugarPartida = lugarPartida;
	}

	public String getLugarDestino() {
		return lugarDestino;
	}

	public void setLugarDestino(String lugarDestino) {
		this.lugarDestino = lugarDestino;
	}

	public String getHorarioPartida() {
		return horarioPartida;
	}

	public void setHorarioPartida(String horarioPartida) {
		this.horarioPartida = horarioPartida;
	}

	public String getHorarioChegada() {
		return horarioChegada;
	}

	public void setHorarioChegada(String horarioChegada) {
		this.horarioChegada = horarioChegada;
	}
}
