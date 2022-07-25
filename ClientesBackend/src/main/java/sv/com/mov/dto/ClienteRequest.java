package sv.com.mov.dto;

import sv.com.mov.model.Cliente;


public class ClienteRequest {
	
	private Cliente cliente;

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ClienteRequest() {
	}

	@Override
	public String toString() {
		return "ClienteRequest [cliente=" + cliente + "]";
	}
	
	

}
