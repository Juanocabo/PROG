package tema5;

public class NombreAleatorios {
	public  String[] NomAl(int c) {
		String[] nombresAleatorios = new String[c];

		String[] nombres = { "Andrea", "David", "Baldomero", "Balduino", "Baldwin", "Baltasar", "Barry", "Bartolo",
				"Bartolomé", "Baruc", "Baruj", "Candelaria", "Cándida", "Canela", "Caridad", "Carina", "Carisa",
				"Caritina", "Carlota", "Baltazar"};
		String[] apellidos = { "Gomez", "Guerrero", "Cardenas", "Cardiel", "Cardona", "Cardoso", "Cariaga", "Carillo",
				"Carion", "Castiyo", "Castorena", "Castro", "Grande", "Grangenal", "Grano", "Grasia", "Griego",
				"Grigalva" };

		for (int i = 0; i < c; i++) {
			nombresAleatorios[i] = nombres[(int) (Math.random() * ((nombres.length - 1) + 1))] + " "
					+ apellidos[(int)(Math.random() * ((apellidos.length - 1) + 1))];
		}
		return nombresAleatorios;
	}
}