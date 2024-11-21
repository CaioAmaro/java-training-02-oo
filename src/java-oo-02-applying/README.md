# 🎵 Desafio: Cadastro de Músicas e Podcasts

Vamos implementar uma aplicação para cadastrar nossas músicas e podcasts preferidos, modelando as classes utilizando os conceitos de orientação a objetos: **abstração, herança, encapsulamento e polimorfismo**.

---

## 🔨 Objetivos do projeto

### 1. Criar uma classe `Audio`
- Atributos:
  - `titulo`
  - `totalReproducoes`
  - `totalCurtidas`
  - `classificacao`
- Utilizar **encapsulamento**:
  - Deixar os atributos privados.
  - Criar **getters e setters** para acessar e modificar os atributos.
- Criar dois métodos:
  - `curte()`: incrementa `totalCurtidas`.
  - `reproduz()`: incrementa `totalReproducoes`.

---

### 2. Organizar o código em pacotes

- Estruturar as classes em diferentes pacotes para organização do projeto.

---

### 3. Criar a classe `Musica` (herança)
- Extender a classe `Audio`.
- Atributos adicionais:
  - `album`
  - `cantor`
  - `genero`.

---

### 4. Criar a classe `Podcast` (herança)
- Extender a classe `Audio`.
- Atributos adicionais:
  - `apresentador`
  - `descricao`.

---

### 5. Criar a classe `Principal`
- Instanciar um objeto do tipo `Musica` e outro do tipo `Podcast`.
- Preencher os atributos desses objetos.
- Criar um **loop** para simular um número grande de:
  - Curtidas (`curte()`).
  - Reproduções (`reproduz()`).

---

### 6. Sobrescrever o método `getClassificacao`
- **Na classe `Musica`:**
  - Classificação será **10** se `totalReproducoes > 2000`.
  - Classificação será **8** para valores inferiores.
- **Na classe `Podcast`:**
  - Classificação será **10** se `totalCurtidas > 500`.
  - Classificação será **7** para valores inferiores.

---

### 7. Criar a classe `Preferencias` (ou `MusicasPreferidas`)
- Criar um método sem retorno (`void`) chamado `inclui`:
  - Receberá um objeto do tipo `Audio` como parâmetro.
  - Utilizar **polimorfismo** para chamar o método `getClassificacao`:
    - Exibir uma mensagem no terminal com base na classificação:
      - **Classificação >= 9**: "Essa é uma das favoritas!"
      - **Classificação < 9**: "Precisa melhorar para entrar nas favoritas."

---

### 8. Finalizar o projeto
- Instanciar um objeto do tipo `Preferencias`.
- Incluir os objetos de `Musica` e `Podcast` criados anteriormente.

---

## 💡 Exemplo/Sugestão de Mensagens
- **Classificação >= 9**: `"Essa é uma das favoritas!"`
- **Classificação < 9**: `"Precisa melhorar para entrar nas favoritas."`

---

🎉 **Bom desafio!**
