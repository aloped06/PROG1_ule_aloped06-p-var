package es.unileon.prg.tema5;

/**
 * Programacion I G2
 * 
 * @author Asier Lopez
 * @version 1.1
 */
public class Alumno {
	/**
	 * aloped06
	 * 
	 * @see String
	 */
	private String niu;
	/**
	 * Asier Lopez
	 * 
	 * @see String
	 */
	private String nombre;
	/**
	 * Nota del alumno
	 */
	private float nota;

	/**
	 * Constructor de la clase. Crea un alumno con la informacion recibida
	 * 
	 * @param niu
	 *            aloped06
	 * @param nombre
	 *            Asier Lopez
	 */
	public Alumno(String niu, String nombre) {
		this.niu = niu;
		this.nombre = nombre;
	}

	/**
	 * Asigna la calificacion del alumno
	 * 
	 * @param nota
	 *            Nota del alumno
	 */
	public void asignarNota(float nota) {
		this.nota = nota;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	/*
	public String toString() {
		StringBuffer salida = new StringBuffer();
		
		salida.append("NIU: " + this.niu + " ");
		salida.append("Nombre: " + this.nombre + " ");
		salida.append("Nota: " + this.nota + " ");
		
		return salida.toString();
	}
	*/
}
