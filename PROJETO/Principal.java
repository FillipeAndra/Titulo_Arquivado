package PROJETO;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.List;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) throws IOException {
      Gson gson = new GsonBuilder()
        .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
        .setPrettyPrinting()
        .create();
      Scanner leitor = new Scanner(System.in);
      FileWriter arquivador = new FileWriter("arquivo.json");
      String nome = "";
      List<Titulo> lista = new ArrayList<>();
      try{
        
        while(!nome.equalsIgnoreCase("sair")){
            System.out.println("Digite o nome do título: ");
            nome = leitor.nextLine();
            if(nome.equalsIgnoreCase("sair")){
                break;
            }
            System.out.println("Digite o ano de lançamento: ");
            int ano = leitor.nextInt();
            System.out.println("Digite a duração em minutos do filme: ");
            int duracao = leitor.nextInt();
            lista.add(new Titulo(nome,duracao,ano));
            leitor.nextLine();
        }
      }catch(NullPointerException e){
          System.out.println("erro no que foi escrito");
      }
      leitor.close();
      arquivador.write(gson.toJson(lista));
      arquivador.close();
      
      
    }
}