document.addEventListener("DOMContentLoaded", () => {
	const form = document.getElementById("cadastroProdutoForm");

	form.addEventListener("submit", async (event) => {
		event.preventDefault();

		const nomeProduto = document.getElementById("nome").value;
		const preco = document.getElementById("preco").value;
		const descricao = document.getElementById("descricao").value;
		const imgUrl = document.getElementById("imgUrl").value;
		const categoriaProduto = parseInt(document.getElementById("categoriaProduto").value);
		const tipoProduto = parseInt(document.getElementById("tipoProduto").value);
		

		try { 

			const response = await fetch("http://localhost:8080/produtos", { 
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
						id:  categoriaProduto
					}, 
					tipo :{
						id: tipoProduto
					}
				}),

			});

			if (response.ok) {
				alert("Produto cadastrado com sucesso!");
			} else {
				alert("Erro ao cadastrar o produto :(");
			}
		} catch (error) { 
			console.error("Erro ao cadastrar o produto :(", error);
		}

	});
});