// Aguarda o carregamento completo do DOM
document.addEventListener("DOMContentLoaded", () => {
	const form = document.getElementById("cadastroProdutoForm");

	// Adiciona um listener para o envio do formulário
	form.addEventListener("submit", async (event) => {
		event.preventDefault(); // Impede o envio padrão do formulário

		// Captura os valores dos campos do formulário
		const nomeProduto = document.getElementById("nomeProduto").value;
		const preco = document.getElementById("preco").value;
		const descricao = document.getElementById("descricao").value;
		const imgUrl = document.getElementById("imgUrl").value;
		const categoriaProduto = document.getElementById("categoriaProduto").value;
		const tipoProduto = document.getElementById("tipoProduto").value;
		const ornamentoProduto = document.getElementById("ornamento").value;
		
		try { 
			// Envia os dados para o backend via POST
			const response = await fetch("http://localhost:8080/cadastroproduto", { 
				method: "POST",
				headers: {
					"Content-Type": "application/json" 
				},
				body: JSON.stringify({ 
					nomeProduto,
					preco,
					descricao,
					imgUrl,
					categoria: {
						idCategoria: categoriaProduto // ID da categoria selecionada
					}, 
					tipo: {
						idTipo: tipoProduto // ID do tipo selecionado
					},
					ornamentoProduto: {
						idOrnamentoProduto: ornamentoProduto // ID do ornamento selecionado
					}
				}),
			});

			// Verifica se a resposta foi bem-sucedida
			if (response.ok) {
				alert("Produto cadastrado com sucesso!");
				window.location.href = "index.html"; // Redireciona para a página inicial
			} else {
				alert("Erro ao cadastrar o produto :(");
			}
		} catch (error) { 
			// Em caso de erro, exibe no console
			console.error("Erro ao cadastrar o produto", error);
		}
	});
});
