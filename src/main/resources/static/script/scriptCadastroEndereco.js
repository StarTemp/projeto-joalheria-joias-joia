document.addEventListener("DOMContentLoaded", () => {	  
	  
	document.getElementById("cep").addEventListener("input", async function(){
		const cep = this.value.replace(/\D/g, "");
		
		if(cep.length === 8){ 
			try{
				const response = await fetch(`https://viacep.com.br/ws/${cep}/json/`); 
				
				if(!response.ok) throw new Error("Erro ao buscar o CEP");
				
				const dados = await response.json();
				
				if(dados.erro){
					alert("CEP não encontrado.")
					return;
				}
				
				document.getElementById("rua").value = dados.logradouro; 
				document.getElementById("bairro").value = dados.bairro;
				document.getElementById("cidade").value = dados.localidade;
				document.getElementById("estado").value = dados.estado;
			
			} catch (error){
				alert("Erro ao buscar o endereço: " + error.message);
			}
		}
	})
	
	const form = document.getElementById("cadastroEndereco");
	
	const pessoaId = localStorage.getItem('pessoaId');

		  if (!pessoaId) {
		      alert("Pessoa não encontrada. Por favor, cadastre uma pessoa primeiro.");
		      window.location.href = "cadastrocliente.html";
		      return;
		  }

	form.addEventListener("submit", async (event) => {
		event.preventDefault();

		const estado = document.getElementById("estado").value;
		const cidade = document.getElementById("cidade").value;
		const bairro = document.getElementById("bairro").value;
		const numero = document.getElementById("numero").value;
		const cep = document.getElementById("cep").value;
		const rua = document.getElementById("rua").value;
		const complemento = document.getElementById("complemento").value;

			const response = await fetch("http://localhost:8080/cadastroenderecos", { 
				method: "POST",
				headers: {
					"Content-Type": "application/json" 
				},

				body: JSON.stringify({ 
					estado,
					cidade,
					bairro,
					rua,
					cep,
					numero,
					complemento,
					pessoa:{
						id_usuario: pessoaId
					}
				})
			})
			.then(response => {
			if (!response.ok) {
				throw new Error('Erro ao cadastrar endereço');
			}
				return response.json();
			})

			.then(data => {
				alert("Cadastro de endereço realizado com sucesso!");
				localStorage.removeItem('pessoaId');
				window.location.href = './index.html';
			})
			
			 .catch (error => {
				console.error('Erro no cadastro:', error);
				alert('Falha ao cadastrar endereço. Tente novamente.');
			});
	    });	
	});