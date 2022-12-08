public class Client {

	private Articulo artDefectuoso;

	public void main() {
		DptoUser du=new DptoUser();
		DptoTecnico dt=new DptoTecnico();
		Inventario inv=new Inventario();
		Gerente ger=new Gerente();
		boolean periodoGarantia= du.verificar(artDefectuoso);
		boolean daniosCubiertos= dt.verificar(artDefectuoso);
		boolean existenciaEnBodega= inv.verificar(artDefectuoso);
		boolean valorMayor= ger.verificar(artDefectuoso);
		
		if(periodoGarantia==true) {
			if(daniosCubiertos==true) {
				if(existenciaEnBodega==true) {
					if(valorMayor==true) {
						ger.desicion();
					}
				}else {
					System.out.println("No se pudo realizar el cambio ");
				}
			}else {
				System.out.println("No se pudo realizar el cambio ");
			}
		}else {
			System.out.println("No se pudo realizar el cambio ");
		}
		
	}

}