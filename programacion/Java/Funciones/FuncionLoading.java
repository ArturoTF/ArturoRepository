package funciones;

public class FuncionLoading {

	public static void main(String[] args) {
		
		/*
		 ***************************** 
		 * Asi se llama a la funcion * 
		 ***************************** 
		 */
		FuncionLoading.loading();
		

	}
	/*
	 **************************************************************************************** 
	 * Funcion que escribe "Saliendo" y pone 1 punto al lado cada 1 segundo (un total de 5) *
	 ****************************************************************************************
	 */
	
	
	public static void loading() {
		
		System.out.print("Saliendo");
		
		try {
			for (int i = 0; i<5; i++) {
				
				Thread.sleep(1000);
				System.out.print(".");
			}
			System.out.println();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
