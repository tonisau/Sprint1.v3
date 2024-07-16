package Tasca1.Nivell3;

public class NoticiaMotociclisme extends Noticia {
    private String equip;

    public NoticiaMotociclisme(String titular, String equip) {
        super(titular);
        this.equip = equip;

    }

    @Override
    public void calcularPreuNoticia() {
        double preu = 100;
        if (equip.equalsIgnoreCase("Honda") || equip.equalsIgnoreCase("Yamaha"))
            preu += 50;
        setPreu(preu);
    }

    @Override
    public void calcularPuntuacioNoticia() {
        int punts = 3;
        if (equip.equalsIgnoreCase("Honda") || equip.equalsIgnoreCase("Yamaha"))
            punts += 3;
        setPuntuacio(punts);
    }
}