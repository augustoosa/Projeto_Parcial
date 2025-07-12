# Projeto Pessoal de POO - Entrega Parcial

**Aluno:** Augusto da Silva de Sá 
**RA:** 2564319
**Disciplina:** Programação Orientada a Objetos (POO)  
**Entrega:** Parcial  
**Tema do Projeto:** Sistema de Gestão de Funcionários

---

## 📌 Descrição Geral

Este projeto tem como objetivo simular um sistema interno utilizado por uma **empresa de desenvolvimento de software** para gerenciar diferentes **tipos de funcionários**, como **gerentes, programadores e analistas de dados**.

A proposta busca modelar os dados reais desses profissionais e permitir a manipulação de informações como **nome**, **salário**, **departamento**, entre outros atributos específicos de cada categoria.

---

## ✅ Conceitos Aplicados

### 📋 Estrutura do Projeto
- **Classe Principal:** Interface textual com menu de opções implementado via `switch/case`.
- **Entrada de Dados:** Utilização da classe Leitura para entrada de dados via teclado.
- **Encapsulamento:** Todos os atributos das classes entidade são `private`, com acesso e modificação via getters e setters.
- **Getters e Setters:** Atribuições feitas exclusivamente através dos métodos setters (construtores não fazem atribuições diretas).

### 👨‍👩‍👧‍👦 Herança
- Classe-mãe: `Funcionario`  
- Subclasses:
  - `Gerente`
  - `Programador`
  - `Analista de Dados`
- Cada subclasse possui **atributos únicos** e **comportamentos distintos**, respondendo à relação "É UM TIPO DE Funcionário".

### 🔁 Polimorfismo
- **Sobrecarga:** Métodos com o mesmo nome mas assinaturas diferentes. Ex: `//Sobrecarga`
- **Sobrescrita:** Métodos herdados da superclasse são redefinidos nas subclasses. Ex: `//Sobrescrita`

### 📦 Interface (Estrutura de Dados)
- Implementação de uma interface com métodos para serem sobrescritos

### ⚠️ Tratamento de Exceções
- Criadas **duas exceções personalizadas**, como por exemplo:
  - `QtdEquipesInvException`
  - `NivelSenioridadeInvException`
- Métodos específicos lançam essas exceções e são tratados com `try/catch`.
- **Não foi utilizado multicatching** ou exceções nativas como `NullPointerException`.

---

## 📊 Diagrama de Classes

<img width="1381" height="1433" alt="Diagrama" src="https://github.com/user-attachments/assets/bf7bce35-ba20-47ca-a631-4886b3548f3c" />

---

## 🚀 Execução

O projeto está funcional, compila corretamente e permite:
- Cadastro e exibição de funcionários (gerentes, programadores, eanalistas)
- Tratamento de erros ao tentar ações inválidas
- Navegação via menu de opções no terminal

---

## 📁 Estrutura de Arquivos

- Cada classe ou interface foi salva em seu próprio arquivo `.java`
- O nome e RA estão comentados no início de cada arquivo
---

## 📝 Observações Finais

- **Sem uso de banco de dados**
- **Sem interface gráfica (será utilizada no projeto final)**
- **Sem validação de dados como CPF, senhas, etc.**
---
