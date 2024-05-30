package iphone;

import java.util.Scanner;

import iphone.apps.Navegador;
import iphone.apps.Reprodutor;
import iphone.apps.Telefone;

public class Iphone implements Telefone, Navegador, Reprodutor{
    Boolean tocando;
    Scanner scan = new Scanner(System.in);

    public void tocar() {
        System.out.println("Tocando música");
        tocando = true;
    }

    public void pausar() {
        if (tocando = true){
            System.out.println("Música pausada");
        } else {
            System.out.println("Nenhuma música tocando");
        }
        
    }

    public void selecionarMusica(String musica) {
        System.out.println("Qual música deseja escutar?");
        musica = scan.nextLine();
        System.out.println("Música " +musica+ " selecionada");
    }

    public void exibirPagina(String url) {
        System.out.println("Digite o url");
        url = scan.nextLine();
        System.out.println("Exibindo a página " +url);
    }

    public void adicionarNovaAba() {
        System.out.println("Nova aba aberta");
    }

    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }

    public void ligar(String numero) {
        System.out.println("Digite o número");
        numero = scan.nextLine();
        System.out.println("Ligando para o número " +numero);
    }

    public void atender() {
        System.out.println("Ligação atendida");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado");
    }
    
}
