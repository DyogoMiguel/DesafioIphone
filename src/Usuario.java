import java.util.Scanner;

import iphone.Iphone;

public class Usuario {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        Scanner scan = new Scanner(System.in);

        iphone.selecionarMusica(null);
        iphone.tocar();
        iphone.pausar();

        iphone.exibirPagina(null);
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        iphone.ligar(null);
        iphone.atender();
        iphone.iniciarCorreioVoz();

        scan.close();
    }
}
