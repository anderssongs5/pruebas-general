package co.pruebasgeneral.texto;

public class Completar {

    private static final int CERO = 0;
    private static final String D_PORCT_S = "d%s";
    private static final String PORCT_0 = "%0";

    public static void completarIzquierda() {

        String palabraCompletar1 = "Apple   ";
        String palabraCompletar2 = "Hi";
        int longitudPalabra = 8;

        System.out.println(String.format(PORCT_0 + (longitudPalabra - palabraCompletar1.trim().length()) + D_PORCT_S,
                CERO, palabraCompletar1.trim()));
        System.out.println(String.format(PORCT_0 + (longitudPalabra - palabraCompletar2.trim().length()) + D_PORCT_S,
                CERO, palabraCompletar2.trim()));

        String nombre1 = "fdsaf afasdf";
        String nombre2 = null;
        String nombre3 = "";
        String nombre4 = "  d   ";
        String nombre5 = "    ";

        System.out.println(nombre1 != null && nombre1.trim().length() > CERO ? nombre1.trim().toUpperCase() : nombre1);
        System.out.println(nombre2 != null && nombre2.trim().length() > CERO ? nombre2.trim().toUpperCase() : nombre2);
        System.out.println(nombre3 != null && nombre3.trim().length() > CERO ? nombre3.trim().toUpperCase() : nombre3);
        System.out.println(nombre4 != null && nombre4.trim().length() > CERO ? nombre4.trim().toUpperCase() : nombre4);
        System.out.println(nombre5 != null && nombre5.trim().length() > CERO ? nombre5.trim().toUpperCase() : nombre5);

        String tipoAfiliado1 = null;
        String tipoAfiliado2 = "1";
        String tipoAfiliado3 = "01";
        String tipoAfiliado4 = "0001";
        String tipoAfiliado5 = "dfasdf0154154";
        String tipoAfiliado6 = "        2                              ";
        String tipoAfiliado7 = "   ";
        String tipoAfiliado8 = "";
        String tipoAfiliado9 = "-1";
        int longitudTipoAfiliado = 2;

        System.out.println(tipoAfiliado1 != null && tipoAfiliado1.trim().length() < longitudTipoAfiliado
                ? String.format(PORCT_0 + (longitudTipoAfiliado - tipoAfiliado1.trim().length()) + D_PORCT_S, CERO,
                        tipoAfiliado1.trim())
                : tipoAfiliado1);
        System.out.println(tipoAfiliado2 != null && tipoAfiliado2.trim().length() < longitudTipoAfiliado
                ? String.format(PORCT_0 + (longitudTipoAfiliado - tipoAfiliado2.trim().length()) + D_PORCT_S, CERO,
                        tipoAfiliado2.trim())
                : tipoAfiliado2);
        System.out.println(tipoAfiliado3 != null && tipoAfiliado3.trim().length() < longitudTipoAfiliado
                ? String.format(PORCT_0 + (longitudTipoAfiliado - tipoAfiliado3.trim().length()) + D_PORCT_S, CERO,
                        tipoAfiliado3.trim())
                : tipoAfiliado3);
        System.out.println(tipoAfiliado4 != null && tipoAfiliado4.trim().length() < longitudTipoAfiliado
                ? String.format(PORCT_0 + (longitudTipoAfiliado - tipoAfiliado4.trim().length()) + D_PORCT_S, CERO,
                        tipoAfiliado4.trim())
                : tipoAfiliado4);
        System.out.println(tipoAfiliado5 != null && tipoAfiliado5.trim().length() < longitudTipoAfiliado
                ? String.format(PORCT_0 + (longitudTipoAfiliado - tipoAfiliado5.trim().length()) + D_PORCT_S, CERO,
                        tipoAfiliado5.trim())
                : tipoAfiliado5);
        System.out.println(tipoAfiliado6 != null && tipoAfiliado6.trim().length() < longitudTipoAfiliado
                ? String.format(PORCT_0 + (longitudTipoAfiliado - tipoAfiliado6.trim().length()) + D_PORCT_S, CERO,
                        tipoAfiliado6.trim())
                : tipoAfiliado6);
        System.out.println(tipoAfiliado7 != null && tipoAfiliado7.trim().length() < longitudTipoAfiliado
                ? String.format(PORCT_0 + (longitudTipoAfiliado - tipoAfiliado7.trim().length()) + D_PORCT_S, CERO,
                        tipoAfiliado7.trim())
                : tipoAfiliado7);
        System.out.println(tipoAfiliado8 != null && tipoAfiliado8.trim().length() < longitudTipoAfiliado
                ? String.format(PORCT_0 + (longitudTipoAfiliado - tipoAfiliado8.trim().length()) + D_PORCT_S, CERO,
                        tipoAfiliado8.trim())
                : tipoAfiliado8);
        System.out.println(tipoAfiliado9 != null && tipoAfiliado9.trim().length() < longitudTipoAfiliado
                ? String.format(PORCT_0 + (longitudTipoAfiliado - tipoAfiliado9.trim().length()) + D_PORCT_S, CERO,
                        tipoAfiliado9.trim())
                : tipoAfiliado9);
    }
}
