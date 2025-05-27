// Espera o carregamento completo do DOM antes de executar o código
document.addEventListener("DOMContentLoaded", () => {
   
    // Obtém os parâmetros da URL
    const urlParams = new URLSearchParams(window.location.search);
   
    // Pega o valor do parâmetro "id"
    const produtoId = urlParams.get("id");
   
    // Se houver um ID de produto na URL
    if (produtoId) {
       
        // Faz uma requisição ao backend para buscar os dados do produto
        fetch(`http://localhost:8080/cadastroproduto/${produtoId}`)
            .then(response => response.json()) // Converte a resposta para JSON
            .then(produto => {
                // Atualiza a imagem do produto
                document.getElementById("produto-img").src = produto.imgUrl;
                document.getElementById("produto-img").alt = produto.nomeProduto;

                // Atualiza o nome do produto
                document.getElementById("produto-nome").textContent = produto.nomeProduto;
               
                // Atualiza a descrição do produto
                document.getElementById("produto-descricao").textContent = produto.descricao;
               
                // Atualiza o preço do produto formatado
                document.getElementById("produto-preco").textContent = `R$ ${produto.preco.toFixed(2)}`;
            })
            // Exibe erro no console se a requisição falhar
            .catch(error => console.error("Erro ao carregar produto:", error));
    }
});
