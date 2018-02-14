import java.util.*;

public class Package{
	int client;
	String proveedor, estado;

	public void setClient(int client){
		this.client = client;
	}
	public int getClient(){
		return client;
	}
	public void setEstado(String estado){
		this.estado = estado;
	}
	public String getEstado(){
		return(estado);
	}
	public void setProveedor(String proveedor){
		this.proveedor = proveedor;
	}
	public String getProveedor(){
		return(proveedor);
	}
}