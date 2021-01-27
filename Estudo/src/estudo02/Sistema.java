package estudo02;

import java.util.ArrayList;
import java.util.Scanner;


public class Sistema {

    private static final ArrayList<Usuario> usuarios = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("-+- Menu -+-");
            System.out.println(" 1 - Cadastrar");
            System.out.println(" 2 - Login");
            System.out.println(" 3 - Alterar Senha");
            System.out.println(" 4 - Deletar");
            System.out.println(" 5 - Ver todos os usuários cadastrados");
            int opcaoEscolhida = scanner.nextInt();
            switch (opcaoEscolhida){
                case 1:
                    // cadastrar
                    System.out.println("Digite seu nome: ");
                    String nome = scanner.next();
                    System.out.println("Digite seu email: ");
                    String email = scanner.next();
                    System.out.println("Digite seu senha: ");
                    String senha = scanner.next();

                    cadastrar(nome, email, senha);
                    break;
                case 2:
                    // login
                    System.out.println("Digite");
                    break;
                case 3:
                    // alterar senha
                    System.out.println("Digite");
                    break;
                case 4:
                    // deletar
                    System.out.println("Digite");
                    break;
                case 5:
                    // ver usuarios cadastrados
                    System.out.println("Digite");
                    mostrarUsuariosCadastrados();
                    break;
                default:
                    System.out.println("Opção Invalida");
                    break;
            }
        }

    }

    public static boolean realizarLogin(String email, String senha){

        for (Usuario usuario : usuarios){
            if(usuario.getEmail().equals(email) && usuario.getSenha().equals(senha)){
                return true;
            }
        }
        return false;
    }

    public static void cadastrar(String nome, String email, String senha){
        Usuario novoUsuario = new Usuario(nome, email, senha);
        usuarios.add(novoUsuario);
    }

    public static void alterarSenha(String email, String novaSenha){
        for (Usuario usuario : usuarios){
            if (usuario.getEmail().equals(email)){
                usuario.setSenha(novaSenha);
            }
        }
    }

    public static void deletarUsuario(String email){
        Usuario usuarioARemover = null;
        for (Usuario usuario : usuarios){
            if (usuario.getEmail().equals(email))
                usuarioARemover = usuario;
        }
        usuarios.remove(usuarioARemover);
    }

    public static void mostrarUsuariosCadastrados(){
        System.out.println("Lista de usuarios cadastrados: ");
        System.out.println();
        for (Usuario usuario : usuarios){
            System.out.println(usuario.getNome());
        }
    }
}
