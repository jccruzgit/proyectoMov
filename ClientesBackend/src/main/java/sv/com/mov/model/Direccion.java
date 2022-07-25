package sv.com.mov.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "direcciones")
public class Direccion {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	@Column
	private int dir_id;	
	@Column
	private String dir_codigo;
	@Column
	private String dir_descripcion;		
		
	public Direccion() {	
		
	}
	
	public int getDir_id() {
		return dir_id;
	}
	public void setDir_id(int dir_id) {
		this.dir_id = dir_id;
	}
	public String getDir_codigo() {
		return dir_codigo;
	}
	public void setDir_codigo(String dir_codigo) {
		this.dir_codigo = dir_codigo;
	}
	public String getDir_descripcion() {
		return dir_descripcion;
	}
	public void setDir_descripcion(String dir_descripcion) {
		this.dir_descripcion = dir_descripcion;
	}
	@Override
	public String toString() {
		return "Direccion [dir_id=" + dir_id + ", dir_codigo=" + dir_codigo + ", dir_descripcion=" + dir_descripcion
				+ "]";
	}	
	
	
}
