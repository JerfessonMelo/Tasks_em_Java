package TaskArray10PosicoesFor;

import java.util.ArrayList;

public class ArraaysList {

        public static void main(String[] args) {
        
        ArrayList<String> nomesArray = new ArrayList<>();
        nomesArray.add("Rony Weasly");
        nomesArray.add("Harry Potter");
        nomesArray.add("Hermione Granger");
        nomesArray.add("Severo Snape");
        nomesArray.add("Albus Dumbledore");
        System.out.println("Array List Com 5 Nomes: " + nomesArray);
        nomesArray.remove(1);
        System.out.println("Removendo Segundo Nome: " + nomesArray);
        nomesArray.remove(2);
        boolean Talles = false;
        for(int i = 0; i < nomesArray.size(); i++){
            System.out.println("Imprimindo os Valores do Array: " + i);
            if (nomesArray.get(0).equals("Talles")) {
                System.out.println("Talles esta na Primeira Posição" + i);
                Talles = true;                
            }
        }
                if(!Talles){
                System.out.println("Talles Não esta na Primeira Posição");
                }
    }
}
