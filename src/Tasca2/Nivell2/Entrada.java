package Tasca2.Nivell2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {
    private static Scanner scanner = new Scanner(System.in);

    public static byte llegirByte(String missatge) {
        byte resultat = 0;
        boolean correcte = false;
        while (!correcte) {
            System.out.println(missatge);
            try {
                resultat = scanner.nextByte();
                correcte = true;
            } catch (InputMismatchException e) {
                System.out.println("Error de format. Si us plau, introdueix un byte vàlid.");
                scanner.next(); // Neteja l'entrada incorrecta
            }
        }
        return resultat;
    }

    public static int llegirInt(String missatge) {
        int resultat = 0;
        boolean correcte = false;
        while (!correcte) {
            System.out.println(missatge);
            try {
                resultat = scanner.nextInt();
                correcte = true;
            } catch (InputMismatchException e) {
                System.out.println("Error de format. Si us plau, introdueix un enter vàlid.");
                scanner.next(); // Neteja l'entrada incorrecta
            }
        }
        return resultat;
    }

    public static float llegirFloat(String missatge) {
        float resultat = 0;
        boolean correcte = false;
        while (!correcte) {
            System.out.println(missatge);
            try {
                resultat = scanner.nextFloat();
                correcte = true;
            } catch (InputMismatchException e) {
                System.out.println("Error de format. Si us plau, introdueix un float vàlid.");
                scanner.next(); // Neteja l'entrada incorrecta
            }
        }
        return resultat;
    }

    public static double llegirDouble(String missatge) {
        double resultat = 0;
        boolean correcte = false;
        while (!correcte) {
            System.out.println(missatge);
            try {
                resultat = scanner.nextDouble();
                correcte = true;
            } catch (InputMismatchException e) {
                System.out.println("Error de format. Si us plau, introdueix un double vàlid.");
                scanner.next(); // Neteja l'entrada incorrecta
            }
        }
        return resultat;
    }

    public static char llegirChar(String missatge) {
        char resultat = '\0';
        boolean correcte = false;
        while (!correcte) {
            System.out.println(missatge);
            try {
                String entrada = scanner.next();
                if (entrada.length() == 1) {
                    resultat = entrada.charAt(0);
                    correcte = true;
                } else {
                    throw new Exception("Error de format. Si us plau, introdueix un sol caràcter.");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return resultat;
    }

    public static String llegirString(String missatge) {
        String resultat = "";
        boolean correcte = false;
        while (!correcte) {
            System.out.println(missatge);
            try {
                resultat = scanner.next();
                correcte = true;
            } catch (Exception e) {
                System.out.println("Error de format. Si us plau, introdueix una cadena vàlida.");
            }
        }
        return resultat;
    }

    public static boolean llegirSiNo(String missatge) {
        boolean resultat = false;
        boolean correcte = false;
        while (!correcte) {
            System.out.println(missatge + " (s/n)");
            try {
                String entrada = scanner.next().toLowerCase();
                if (entrada.equals("s")) {
                    resultat = true;
                    correcte = true;
                } else if (entrada.equals("n")) {
                    resultat = false;
                    correcte = true;
                } else {
                    throw new Exception("Error de format. Si us plau, introdueix 's' o 'n'.");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return resultat;
    }
}
