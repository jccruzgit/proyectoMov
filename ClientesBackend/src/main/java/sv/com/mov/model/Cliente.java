package sv.com.mov.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cli_id;	
	@Column
	private String cli_nombres;
	@Column
	private String cli_apellidos;
	@Column
	private String cli_telefono;
	
	@OneToMany(targetEntity = Direccion.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "cd_fk", referencedColumnName = "cli_id")
	List<Direccion> direccionList;
	
	public List<Direccion> getDireccionList() {
		return direccionList;
	}
	public void setDireccionList(List<Direccion> direccionList) {
		this.direccionList = direccionList;
	}
	public int getCli_id() {
		return cli_id;
	}
	public void setCli_id(int cli_id) {
		this.cli_id = cli_id;
	}
	public String getCli_nombres() {
		return cli_nombres;
	}
	public void setCli_nombres(String cli_nombres) {
		this.cli_nombres = cli_nombres;
	}
	public String getCli_apellidos() {
		return cli_apellidos;
	}
	public void setCli_apellidos(String cli_apellidos) {
		this.cli_apellidos = cli_apellidos;
	}
	public String getCli_telefono() {
		return cli_telefono;
	}
	public void setCli_telefono(String cli_telefono) {
		this.cli_telefono = cli_telefono;
	}
	@Override
	public String toString() {
		return "Cliente [cli_id=" + cli_id + ", cli_nombres=" + cli_nombres + ", cli_apellidos=" + cli_apellidos
				+ ", cli_telefono=" + cli_telefono + ", direccionList=" + direccionList + "]";
	}

	
}
