package exerc;

public class estoque {
    private List<produto> produtos;

    public estoque() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(produto produto) {
        produtos.add(produto);
    }

    public void atualizarProduto(String codigo, String nome, double preco, int quantidade) {
        for (produto p : produtos) {
            if (p.getCodigo().equals(codigo)) {
                p.setNome(nome);
                p.setPreco(preco);
                p.setQuantidade(quantidade);
                break;
            }
        }
    }

    public void removerProduto(String codigo) {
        for (produto p : produtos) {
            if (p.getCodigo().equals(codigo)) {
                produtos.remove(p);
                break;
            }
        }
    }

    public produto buscarProduto(String termoBusca) {
        for (produto p : produtos) {
            if (p.getCodigo().equals(termoBusca) || p.getNome().equals(termoBusca)) {
                return p;
            }
        }
        return null;
    }

    public List<produto> listarProdutos(String criterioOrdenacao) {
        switch (criterioOrdenacao) {
            case "preco":
                produtos.sort((p1, p2) -> Double.compare(p1.getPreco(), p2.getPreco()));
                break;
            case "nome":
                produtos.sort((p1, p2) -> p1.getNome().compareToIgnoreCase(p2.getNome()));
                break;
            case "quantidade":
                produtos.sort((p1, p2) -> Integer.compare(p1.getQuantidade(), p2.getQuantidade()));
                break;
            default:
                System.out.println("Criterio de ordenação inválido.");
                break;
        }
        return produtos;
    }
}