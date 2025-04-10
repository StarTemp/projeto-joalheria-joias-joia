document.addEventListener("DOMContentLoaded", () => {
	const form = document.getElementById("cadastroProdutoForm");

	form.addEventListener("submit", async (event) => {
		event.preventDefault();

		const nomeProduto = document.getElementById("nomeProduto").value;
		const preco = document.getElementById("preco").value;
		const descricao = document.getElementById("descricao").value;
		const imgUrl = document.getElementById("imgUrl").value;
		
		
		try { 

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
					categoriaProduto: {
						idCategoria:  categoriaProduto
					}, 
					tipoProduto:{
						idTipo: tipoProduto
					},
					ornamentoProduto: {
						idOrnamentoProduto: ornamentoProduto
					}
				}),

			});

			if (response.ok) {
				alert("Produto cadastrado com sucesso!");
			} else {
				alert("Erro ao cadastrar o produto :(");
			}
		} catch (error) { 
			console.error("Erro ao cadastrar o produto", error);
		}

	});
});