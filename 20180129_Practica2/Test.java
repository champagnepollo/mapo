public class Test{
	public static void main(String[] args) {
		Formulario form = new Formulario();
		
		form.register();

		if(form.save()){
			System.out.println("Se han registrado exitosamente los datos");
		} else {
			System.out.println("No se registraron los datos");
		}
	}
}