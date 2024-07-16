package Tasca1.Nivell3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Redactor> redactors = new ArrayList<Redactor>();


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcio;

        do {
            System.out.println("\nMenú:");
            System.out.println("1.- Introduir redactor.");
            System.out.println("2.- Eliminar redactor.");
            System.out.println("3.- Introduir notícia a un redactor.");
            System.out.println("4.- Eliminar notícia.");
            System.out.println("5.- Mostrar totes les notícies per redactor.");
            System.out.println("6.- Calcular puntuació de la notícia.");
            System.out.println("7.- Calcular preu-notícia.");
            System.out.println("8.- Sortir.");
            System.out.print("Selecciona una opció: ");
            opcio = scanner.nextInt();
            scanner.nextLine(); // Consumir newline

            switch (opcio) {
                case 1:
                    introduirRedactor(scanner);
                    break;
                case 2:
                    eliminarRedactor(scanner);
                    break;
                case 3:
                    introduirNoticia(scanner);
                    break;
                case 4:
                    eliminarNoticia(scanner);
                    break;
                case 5:
                    mostrarNoticiesPerRedactor(scanner);
                    break;
                case 6:
                    calcularPuntuacioNoticia(scanner);
                    break;
                case 7:
                    calcularPreuNoticia(scanner);
                    break;
                case 8:
                    System.out.println("Sortint...");
                    break;
                default:
                    System.out.println("Opció no vàlida.");
            }
        } while (opcio != 8);

        scanner.close();
    }

    private static void introduirRedactor(Scanner scanner) {

        System.out.print("Introdueix el DNI del redactor: ");
        String DNI = scanner.nextLine();

        if(trobarRedactor(DNI)==null){
            System.out.print("Introdueix el nom del redactor: ");
            String nom = scanner.nextLine();
            redactors.add(new Redactor(nom, DNI));
            System.out.println("Redactor introduït correctament.");
        }else{
            System.out.println("Ja existeix un redactor amb aquest DNI.");
        }

    }

    public static Redactor trobarRedactor(String dni) {
        Redactor trobarRedactor = null;
        for(int i = 0; i < redactors.size() && trobarRedactor == null; i++) {
            if(dni.equals(redactors.get(i).getDNI())) {
                trobarRedactor = redactors.get(i);
            }
        }
        return trobarRedactor;
    }

    private static void eliminarRedactor(Scanner scanner) {
        System.out.print("Introdueix el DNI del redactor a eliminar: ");
        String DNI = scanner.nextLine();

        Redactor trobatRedactor=trobarRedactor(DNI);
        if(trobatRedactor!=null){
            redactors.removeIf(redactor -> redactor.getDNI().equalsIgnoreCase(DNI));
            System.out.println("Redactor eliminat correctament.");
        }else{
            System.out.println("No existeix el redactor amb aquest DNI");

        }

    }

    private static Noticia trobarNoticia(String titular, ArrayList<Noticia> newsArray) {
        Noticia trobatNoticia=null;
            for(int i=0; i<newsArray.size() && trobatNoticia == null; i++){
                if (titular.equals(newsArray.get(i).getTitular())) {
                    trobatNoticia = newsArray.get(i);
                }
        }
        return trobatNoticia;
    }

    private static void introduirNoticia(Scanner scanner) {
        Noticia novaNoticia=null;

       // System.out.print("Introdueix el DNI del redactor: ");
       // String DNI = Main.scanner.nextLine();
       // Redactor redactor = redactors.stream().filter(r -> r.getDNI().equalsIgnoreCase(DNI)).findFirst().orElse(null);

        //if (redactor != null) {

            System.out.print("Selecciona el tipus de notícia " +
                    "(1. Futbol, " +
                    "2. Bàsquet, " +
                    "3. Tenis, " +
                    "4. F1, " +
                    "5. Motociclisme): ");

            int tipusNoticia = Main.scanner.nextInt();
            Main.scanner.nextLine(); // Consumir newline

            switch (tipusNoticia) {
                case 1:
                    novaNoticia = crearNoticiaFutbol();
                    break;
                case 2:
                    novaNoticia = crearNoticiaBasquet();
                    break;
                case 3:
                    novaNoticia = crearNoticiaTenis();
                    break;
                case 4:
                    novaNoticia = crearNoticiaF1();
                    break;
                case 5:
                    novaNoticia = crearNoticiaMotociclisme();
                    break;

                // Implementa de manera similar per altres tipus de notícies
                default:
                    System.out.println("Tipus de notícia no vàlid.");
            }

            if(novaNoticia!=null) {
                System.out.println("Introdueix el DNI del redactor que s'encarrega d'aquesta noticia: ");
                String DNI = scanner.nextLine();
                Redactor trobatRedactor=trobarRedactor(DNI);
                if (trobatRedactor != null) {
                    trobatRedactor.afegirNoticia(novaNoticia);
                    System.out.println("Noticia asignada satisfactoriamente.");
                } else {
                    System.out.println("No se ha encontrado ningún redactor con el dni introducido.");
                }
    }
            }

    public static NoticiaFutbol crearNoticiaFutbol(){
        System.out.print("Introdueix el titular de la notícia: ");
        String titular = scanner.nextLine();
        System.out.print("Introdueix la competició: ");
        String competicioFutbol = scanner.nextLine();
        System.out.print("Introdueix el club: ");
        String clubFutbol = scanner.nextLine();
        System.out.print("Introdueix el jugador: ");
        String jugadorFutbol = scanner.nextLine();
        return new NoticiaFutbol(titular, competicioFutbol, clubFutbol, jugadorFutbol);

    }
    public static NoticiaBasquet crearNoticiaBasquet(){
        System.out.print("Introdueix el titular de la notícia: ");
        String titular = scanner.nextLine();
        System.out.print("Introdueix la competició: ");
        String competicioBasquet = scanner.nextLine();
        System.out.print("Introdueix el club: ");
        String clubBasquet = scanner.nextLine();
        return new NoticiaBasquet(titular, competicioBasquet, clubBasquet);
    }
    public static NoticiaTenis crearNoticiaTenis(){
        System.out.print("Introdueix el titular de la notícia: ");
        String titular = scanner.nextLine();
        System.out.print("Introdueix la competició: ");
        String competicioTenis = scanner.nextLine();
        System.out.print("Introdueix el club: ");
        String clubTenis = scanner.nextLine();
        return new NoticiaTenis(titular, competicioTenis, clubTenis);
    }
    public static NoticiaF1 crearNoticiaF1(){
        System.out.print("Introdueix el titular de la notícia: ");
        String titular = scanner.nextLine();
        System.out.print("Introdueix la escuderia: ");
        String escuderiaF1 = scanner.nextLine();
        return new NoticiaF1(titular, escuderiaF1);
    }
    public static NoticiaMotociclisme crearNoticiaMotociclisme(){
        System.out.print("Introdueix el titular de la notícia: ");
        String titular = scanner.nextLine();
        System.out.print("Introdueix el equip: ");
        String equipMotociclisme = scanner.nextLine();
        return new NoticiaMotociclisme(titular, equipMotociclisme);
    }


    private static void eliminarNoticia(Scanner scanner) {
        System.out.print("Introdueix el DNI del redactor: ");
        String DNI = scanner.nextLine();
        Redactor redactor = redactors.stream().filter(r -> r.getDNI().equalsIgnoreCase(DNI)).findFirst().orElse(null);

        if (redactor != null) {
            System.out.print("Introdueix el titular de la notícia a eliminar: ");
            String titular = scanner.nextLine();
            redactor.eliminarNoticia(titular);
            System.out.println("Notícia eliminada correctament.");
        } else {
            System.out.println("Redactor no trobat.");
        }
    }

    private static void mostrarNoticiesPerRedactor(Scanner scanner) {
        System.out.print("Introdueix el DNI del redactor: ");
        String DNI = scanner.nextLine();
        Redactor redactor = redactors.stream().filter(r -> r.getDNI().equalsIgnoreCase(DNI)).findFirst().orElse(null);
        Redactor trobatRedactor=trobarRedactor(DNI);
        if (redactor != null) {
            ArrayList<Noticia> noticies = redactor.getNoticies();
            if (noticies.isEmpty()) {
                System.out.println("Aquest redactor no té notícies.");
            } else {
                System.out.println("Notícies del redactor " + redactor.getName() + " :");
                for (Noticia noticia : noticies) {
                    System.out.println("Titular: " + noticia.getTitular());
                    System.out.println("Text: " + noticia.getText());
                    System.out.println("Puntuació: " + noticia.getPuntuacio());
                    System.out.println("Preu: " + noticia.getPreu());
                    System.out.println();
                }
            }
        } else {
            System.out.println("Redactor no trobat.");
        }
    }

    private static void calcularPuntuacioNoticia(Scanner scanner) {
        System.out.print("Introdueix el DNI del redactor: ");
        String DNI = scanner.nextLine();
        Redactor redactor = redactors.stream().filter(r -> r.getDNI().equalsIgnoreCase(DNI)).findFirst().orElse(null);

        if (redactor != null) {
            System.out.print("Introdueix el titular de la notícia: ");
            String titular = scanner.nextLine();
            Noticia noticia = redactor.getNoticies().stream().filter(n -> n.getTitular().equalsIgnoreCase(titular)).findFirst().orElse(null);

            if (noticia != null) {
                noticia.calcularPuntuacioNoticia();
                System.out.println("Puntuació de la notícia: " + noticia.getPuntuacio());
            } else {
                System.out.println("Notícia no trobada.");
            }
        } else {
            System.out.println("Redactor no trobat.");
        }
    }

    private static void calcularPreuNoticia(Scanner scanner) {
        System.out.print("Introdueix el DNI del redactor: ");
        String DNI = scanner.nextLine();
        Redactor redactor = redactors.stream().filter(r -> r.getDNI().equalsIgnoreCase(DNI)).findFirst().orElse(null);

        if (redactor != null) {
            System.out.print("Introdueix el titular de la notícia: ");
            String titular = scanner.nextLine();
            Noticia noticia = redactor.getNoticies().stream().filter(n -> n.getTitular().equalsIgnoreCase(titular)).findFirst().orElse(null);

            if (noticia != null) {
                noticia.calcularPreuNoticia();
                System.out.println("Preu de la notícia: " + noticia.getPreu());
            } else {
                System.out.println("Notícia no trobada.");
            }
        } else {
            System.out.println("Redactor no trobat.");
        }
    }
}