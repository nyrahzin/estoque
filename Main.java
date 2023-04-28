package exerc;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        estoque.adicionarProduto(new Produto("001", "Produto 1", 50.00, 100));
        estoque.adicionarProduto(new Produto("002", "Produto 2", 30.00, 50));
        estoque.adicionarProduto(new Produto("003", "Produto 3", 80.00, 200));

        estoque.listarProdutos("nome").forEach(System.out::println);

        Produto produtoBuscado = estoque.buscarProduto("002");
        if (produtoBuscado != null) {
            System.out.println("Produto encontrado: " + produtoBuscado);
        } else {
            System.out.println("Produto não encontrado.");
        }

        estoque.atualizarProduto("003", "Produto 3 atualizado", 90.00, 150);
        estoque.listarProdutos("nome").forEach(System.out::println);

        estoque.removerProduto("001");
        estoque.listarProdutos("preco").forEach(System.out::println);
    }
}