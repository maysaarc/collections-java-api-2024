package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    //atributo
    private List<Item> itemList;

    public CarrinhoDeCompras() { this.itemList = new ArrayList<>(); }
    public void adicionarItem(String nome, double preco, int quantidade) {
        this.itemList.add(new Item(nome, preco, quantidade));

    }
    public void removerItem(String nome) {
        for (Item item : this.itemList) {
            if (item.getNome().equals(nome)) {
                this.itemList.remove(item);
            }
        }
    }
    public void calcularValorTotal() {
        double total = 0;
        for (Item item : this.itemList) {
            total += item.getPreco();
        }
        System.out.println("Total: " + total);
    }
    public void exibirItems() {
        for (Item item : this.itemList) {
            System.out.println(item);
        }
    }
    public static void main(String[] args) {
        CarrinhoDeCompras lista = new CarrinhoDeCompras();
        System.out.println("Lista: " + lista.itemList);

        lista.adicionarItem("Arroz", 25.25, 2);
        lista.adicionarItem("Feijão", 5.20, 3);
        lista.adicionarItem("Macarrão", 2.50, 2);
        lista.adicionarItem("Café", 10.30, 1);
        lista.adicionarItem("Leite", 7.40, 4);
        lista.adicionarItem("Biscoito", 4.85, 2);

        System.out.println("Lista: " + lista.itemList);

        lista.calcularValorTotal();

        lista.removerItem("Leite");

        System.out.println("Lista: " + lista.itemList);

        lista.calcularValorTotal();




    }
}
