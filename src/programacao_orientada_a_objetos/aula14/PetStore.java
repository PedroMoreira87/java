package programacao_orientada_a_objetos.aula14;

import java.io.*;
import java.util.ArrayList;

public class PetStore {

    private ArrayList<Mamifero> mamiferos;

    public PetStore() {
        this.mamiferos = new ArrayList<Mamifero>();
    }

    public void adicionaAnimal(Mamifero mani){
       mamiferos.add(mani);
    }

    public void listarAnimais(){
        int cont = 0;
        for (Mamifero m: mamiferos){
            System.out.println(m);
            cont += 1;
        }
        System.out.println("Total = " + cont + " animais listados com sucesso!\n");
    }

    public void excluirAnimal(Mamifero mani){
        if (this.mamiferos.contains(mani)){
            this.mamiferos.remove(mani);
            System.out.println("[" + mani.toString() + "excluido com sucesso!]\n");
        }else{
            System.out.println("Animal inexistente!\n");
        }
    }

    public void excluirAnimais(){
        mamiferos.clear();
        System.out.println("Animais excluidos com sucesso!\n");
    }

    public void gravarAnimais() {
        ObjectOutputStream outputStream = null;
        try{
            outputStream = new ObjectOutputStream(new FileOutputStream("src/programacao_orientada_a_objetos/aula14/animais.dat"));
            for (Mamifero mani:mamiferos) {
                outputStream.writeObject(mani);
            }
        }catch (FileNotFoundException ex){
            System.out.println("Arquivo nao encontrado!");
        }catch (IOException ex){
        }finally {
            try {
                if (outputStream != null){
                    outputStream.flush();
                    outputStream.close();
                }
            }catch (IOException ex){
                System.out.println(ex);
            }
        }
    }

    public void recuperarAnimais(){
        ObjectInputStream inputStream = null;
        try {
            inputStream = new ObjectInputStream (new FileInputStream ("src/programacao_orientada_a_objetos/aula14/animais.dat"));
            Object obj = null;
            while ((obj = inputStream.readObject ())!= null){
                if (obj instanceof Gato){
                    this.mamiferos.add((Gato)obj);
                }else if (obj instanceof Cao){
                    this.mamiferos.add((Cao)obj);
                }

            }
        }catch (EOFException ex){   // when EOF is reached
            System.out.println("End of file reached");
        }catch (ClassNotFoundException ex){
            System.out.println(ex);
        }catch (FileNotFoundException ex){
            System.out.println(ex);
        }catch (IOException ex){
            System.out.println(ex);
        }finally {
            try {
                if (inputStream != null){
                    inputStream.close();
                    System.out.println("Animais recuperados com sucesso!\n");
                }
            }catch (IOException ex){
                System.out.println(ex);
            }
        }
    }

    public static void main(String[] args) {

        PetStore pet = new PetStore();

        Gato felix = new Gato("Felix", 3, "Maria");
        Gato garfield = new Gato("Garfield", 7, "Maria");
        Cao rex = new Cao("Rex", 2, "Jose");
        Cao toto = new Cao("Toto", 5, "Jose");


        pet.adicionaAnimal(felix);
        pet.adicionaAnimal(garfield);
        pet.adicionaAnimal(rex);
        pet.adicionaAnimal(toto);
        pet.listarAnimais();
        pet.gravarAnimais();
        pet.excluirAnimal(garfield);
        pet.listarAnimais();
        pet.excluirAnimais();
        pet.listarAnimais();
        pet.recuperarAnimais();
        pet.listarAnimais();

    }

}
