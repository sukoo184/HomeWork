package tr.gov.nvi.tckimlik.WS;

import java.rmi.RemoteException;

public class Main {

	public static void main(String[] args) throws RemoteException {
		KPSPublicSoapProxy kpsPublic =new KPSPublicSoapProxy();
				
				boolean result =kpsPublic.TCKimlikNoDogrula(
						Long.parseLong("22222222222"),
						"��KRAN","KARAKAYA",
						2001
						
						);

		System.out.println("dogrulama : "+ (result ? "Ba�ar�l�":"Ba�ar�s�z"));
	}

	


}
