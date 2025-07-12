# Projeto Pessoal de POO - Entrega Parcial

**Aluno:** Augusto da Silva de Sá 
**RA:** 2564319
**Disciplina:** Programação Orientada a Objetos (POO)  
**Entrega:** Parcial  
**Tema do Projeto:** Sistema de Gestão de Funcionários

---

## 📌 Descrição Geral

Este projeto tem como objetivo simular um sistema interno utilizado por uma **empresa de desenvolvimento de software** para gerenciar diferentes **tipos de funcionários**, como **gerentes, programadores e estagiários**.

A proposta busca modelar os dados reais desses profissionais e permitir a manipulação de informações como **nome**, **salário**, **departamento**, entre outros atributos específicos de cada categoria.

---

## ✅ Conceitos Aplicados

### 📋 Estrutura do Projeto
- **Classe Principal:** Interface textual com menu de opções implementado via `switch/case`.
- **Entrada de Dados:** Utilização da classe `Scanner` para leitura de dados via teclado.
- **Reflexividade:** Aplicada e marcada com `//Reflexividade` no código.
- **Encapsulamento:** Todos os atributos das classes entidade são `private`, com acesso e modificação via getters e setters.
- **Setters:** Atribuições feitas exclusivamente através dos métodos setters (construtores não fazem atribuições diretas).

### 👨‍👩‍👧‍👦 Herança
- Classe-mãe: `Funcionario`  
- Subclasses:
  - `Gerente`
  - `Programador`
  - `Estagiario`
- Cada subclasse possui **atributos únicos** e **comportamentos distintos**, respondendo à relação "É UM TIPO DE Funcionário".

### 🔁 Polimorfismo
- **Sobrecarga:** Métodos com o mesmo nome mas assinaturas diferentes. Ex: `//Sobrecarga`
- **Sobrescrita:** Métodos herdados da superclasse são redefinidos nas subclasses. Ex: `//Sobrescrita`

### 📦 Interface (Estrutura de Dados)
- Implementação de uma interface com métodos para:
  - Cadastrar funcionários
  - Listar funcionários
  - Remover funcionários
  - Buscar funcionários por nome

### ⚠️ Tratamento de Exceções
- Criadas **duas exceções personalizadas**, como por exemplo:
  - `SalarioInvalidoException`
  - `FuncionarioNaoEncontradoException`
- Métodos específicos lançam essas exceções e são tratados com `try/catch`.
- **Não foi utilizado multicatching** ou exceções nativas como `NullPointerException`.

---

## 📊 Diagrama de Classes

![Diagrama de Classes]("C:\Users\augus\Downloads\POO 1\Entrega Parcial\src\Diagrama.png")

---

## 🚀 Execução

O projeto está funcional, compila corretamente e permite:
- Cadastro e exibição de funcionários (gerentes, programadores, estagiários)
- Tratamento de erros ao tentar ações inválidas
- Navegação via menu de opções no terminal

---

## 📁 Estrutura de Arquivos

- Cada classe ou interface foi salva em seu próprio arquivo `.java`
- O nome e RA estão comentados no início de cada arquivo
- Os arquivos foram compactados conforme solicitado, contendo apenas `.java` e o diagrama

---

## 📝 Observações Finais

- **Sem uso de banco de dados**
- **Sem interface gráfica**
- **Sem validação de dados como CPF, senhas, etc.**
- Projeto está de acordo com as regras da entrega parcial

---
