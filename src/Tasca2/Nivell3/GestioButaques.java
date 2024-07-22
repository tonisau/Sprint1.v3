package Tasca2.Nivell3;

import java.util.ArrayList;

public class GestioButaques {
    private ArrayList<Butaca> butaques;

    public GestioButaques() {
        butaques = new ArrayList<>();
    }

    public ArrayList<Butaca> getButaques() {
        return butaques;
    }

    public void afegirButaca(Butaca butaca) throws ExcepcioButacaOcupada {
        int posicio = cercarButaca(butaca.getFila(), butaca.getSeient());
        if (posicio != -1) {
            throw new ExcepcioButacaOcupada("La butaca ja està ocupada.");
        }
        butaques.add(butaca);
    }

    public void eliminarButaca(int fila, int seient) throws ExcepcioButacaLliure {
        int posicio = cercarButaca(fila, seient);
        if (posicio == -1) {
            throw new ExcepcioButacaLliure("La butaca ja està lliure.");
        }
        butaques.remove(posicio);
    }

    public void eliminarButacaPersona(String persona) {
        butaques.removeIf(b -> b.getPersona().equals(persona));
    }

    public int cercarButaca(int fila, int seient) {
        for (int i = 0; i < butaques.size(); i++) {
            Butaca butaca = butaques.get(i);
            if (butaca.getFila() == fila && butaca.getSeient() == seient) {
                return i;
            }
        }
        return -1;
    }
}
