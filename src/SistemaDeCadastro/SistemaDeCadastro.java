package SistemaDeCadastro;

import java.util.HashSet;
import java.util.Set;

public class SistemaDeCadastro {
    public static void main(String[] args) {
        // HashSet<Pessoa>, com algumas instâncias de Pessoa adicionadas propositalmente com dados repetidos
        Set<Pessoa> usuarios = new HashSet<>();

        // Adicionando instâncias - USUÁRIOS - (incluindo duplicatas exatas de nome e idade)
        usuarios.add(new Pessoa("Ana Silva", 28));
        usuarios.add(new Pessoa("Carlos Souza", 35));
        usuarios.add(new Pessoa("Mariana Costa", 22));
        usuarios.add(new Pessoa("Ana Silva", 28)); // Duplicada (mesmo nome e idade)
        usuarios.add(new Pessoa("Carlos Souza", 35));  // Duplicada (mesmo nome e idade)
        usuarios.add(new Pessoa("Ana Silva", 30)); // Diferente (mesmo nome, mas idade distinta)

        // Impressão de quantidade final e dos dados (lista de usuários)
        System.out.println("=== CADASTRO DE USUARIOS NA REDE SOCIAL ===");
        System.out.println("Quantidade final de pessoas na rede: " + usuarios.size());
        System.out.println("\nLista de usuários únicos da rede: ");
        for (Pessoa p: usuarios) {
            System.out.println("- " + p);
        }

        // Explicação técnica impressa no console
        System.out.println("\n=== EXPLICAÇÃO DO COMPORTAMENTO ===");
        System.out.println("Foram adicionadas 6 instâncias ao HashSet, mas apenas 4 permaneceram.");
        System.out.println("Isso ocorre porque o HashSet não permite elementos duplicados e utiliza dois métodos para verificar a igualdade:");
        System.out.println("1. hashCode(): Ao inserir um objeto, o HashSet calcula seu código hash (baseado em nome e idade) para encontrar o 'balde' (bucket) de memória correspondente.");
        System.out.println("2. equals(): Quando dois objetos geram o mesmo hashCode (como as duplicatas de 'Ana Silva, 28' e 'Carlos Souza, 35'), o HashSet chama o método equals() para confirmar se possuem os mesmos valores de nome e idade.");
        System.out.println("Como o equals() retornou 'true' para as cópias, o HashSet ignorou a inserção das duplicatas, mantendo apenas o registro original. Já 'Ana Silva, 30' foi mantida por ter idade diferente.");
    }
}