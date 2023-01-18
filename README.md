## 📝 Exercicio ModelaAi

Objetivo deste exercício é introduzir alguns conteúdos básicos de Java

## Enunciado

Crie uma api Spring que seja capaz de receber os seguintes dados via POST

```json
{
	"modelo": "Fiat Argo 1.3",
	"fabricante": "Fiat",
	"dataFabricacao": "10/02/2006",
	"valor": 1000000,
	"anoModelo": 2023,
}
```

- [x]  Criar um controller que represente o formato dos dados fornecidos
- [x]  Criar uma rota de api que possa ser consumida via POST
- [x]  Criar um DTO que represente os dados recebidos
- [x]  Criar um Model que representa o Carro
- [x]  Criar um Repository para camada de persistência

## 🔀 Rotas

- **POST** `/car` - Cria um novo carro
  - headers: none
  - body:
		```json
		{
			"modelo": "modelocarro",
			"fabricante": "fabricantecarro",
			"dataFabricacao": "DD/MM/AAAA",
			"valor": 1000000,
			"anoModelo": 2023,
		}
		```
		
### Detalhes do Body
  - `modelo` : 
    - No máximo 50 caracteres
  - `fabricante`: 
    - No máximo 50 caracteres
  - `dataFabricacao`: 
    - No máximo 10 caracteres
  - `valor`: 
    - No máximo 50 caracteres
    - Tipo inteiro
    - Ultimos dois algorismos representa os centavos
  - `anoModelo`
    - No máximo 50 caracteres
    - Tipo inteiro
  - Todo as entradas precisam ser preenchidas
  
## 💽 Banco de dados

Esse projeto usa um banco de dados em memória: [H2Database](https://www.h2database.com/html/main.html).
- **`Tables`:**
  - **`Car`:** Armazena os dados dos carros