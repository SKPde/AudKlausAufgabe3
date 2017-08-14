
public class AutoListe {

	private Auto kopf = null; // Kopf der Liste, sie ist leer wenn Kopf == null

	public void enter(Auto neu) {
		if (kopf == null) {
			kopf = neu;
			return;
		}
		Auto temp = kopf;
		while (temp != null) {
			
			
			if(temp.naechstes != null && temp.naechstes.zeit < neu.zeit) {
				temp = temp.naechstes;
			} else {
				break;
			}
			
		}
		neu.naechstes = temp.naechstes;
		temp.naechstes = neu;

	}

	public void print() {

		Auto temp = kopf;

		while (temp != null) {
			System.out.println(temp.fahrer + " (" + temp.zeit + ")");
			temp = temp.naechstes;
		}

	}

}
