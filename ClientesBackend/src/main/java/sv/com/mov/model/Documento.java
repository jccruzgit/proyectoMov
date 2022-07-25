package sv.com.mov.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "documentos")
public class Documento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int doc_id;
	
	@Column
	private String doc_codigo;
	
	@Column
	private String doc_descripcion;
	
	public Documento() {

	}
	
	public int getDoc_id() {
		return doc_id;
	}

	public void setDoc_id(int doc_id) {
		this.doc_id = doc_id;
	}

	public String getDoc_codigo() {
		return doc_codigo;
	}

	public void setDoc_codigo(String doc_codigo) {
		this.doc_codigo = doc_codigo;
	}

	public String getDoc_descripcion() {
		return doc_descripcion;
	}

	public void setDoc_descripcion(String doc_descripcion) {
		this.doc_descripcion = doc_descripcion;
	}

	@Override
	public String toString() {
		return "Documento [doc_id=" + doc_id + ", doc_codigo=" + doc_codigo + ", doc_descripcion=" + doc_descripcion
				+ "]";
	}
	
}
