package classe;

	import classe.Cachorro;
	import classe.Cavalo;
	import classe.Preguica;

	public class TesteBichos {

		public static void main(String[] args) {
				
			Cachorro dog1 = new Cachorro("CARAMELO",5);
			Cavalo panga1 = new Cavalo("PÉ-DE-PANO",8);
			Preguica bicho1 = new Preguica ("THE FLASH",6);
		
			panga1.emitirSom();
			panga1.emDuasPatas();
			
			dog1.emitirSom();
			dog1.emDuasPatas();
			
			bicho1.emitirSom();
			bicho1.subirArvore();
			
			/*
			System.out.println(panga1.toString());
			panga1.emitirSom();
			*/
		}
	}