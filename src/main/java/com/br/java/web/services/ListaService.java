package com.br.java.web.services;

import com.br.java.web.models.PostagemModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class ListaService {

	private List<String> nomes = new ArrayList<String>(Arrays.asList("Bruna", "Milena", "Jhol"));

	public List<String> mostrarLista() {
		return this.nomes;
	}

	public String buscarNome(String nomeUsuario) {
		String retorno = "";

		for (String nome : nomes) {
			if (nome.equalsIgnoreCase(nomeUsuario)) {
				retorno = nome;

			}
		}
		return retorno;
	}

	public String deletarName(String deleteUsuario) {
		String nomeDelete = "";

		for (String nome : nomes) {
			if (nome.equalsIgnoreCase(deleteUsuario)) {
				nomeDelete = nome;
			}
		}
		if (nomes.remove(nomeDelete)) {
			return "Nome apagado com Sucesso";

		} else {
			return "Nome não encontrado";
		}
	}

	public String adicionarNome(String nomeUsuario) {
		boolean podeAdicionar = true;
		String resposta = "Nome adicionado";

		for (String nome : nomes) {
			if (nomeUsuario.equalsIgnoreCase(nome)) {
			}
		}
		if (podeAdicionar == true) {
			nomes.add(nomeUsuario);
		}
		return resposta;
	}

	private Map<Integer, PostagemModel> postagens = new HashMap<Integer, PostagemModel>();

	public void adicionarPostagens() {
		postagens.put(1, new PostagemModel("Milena", "Não consigo assistir uma série inteira"));
		postagens.put(2, new PostagemModel("Bruna", "Hello world"));
		postagens.put(3, new PostagemModel("Jhol", "Skate é legal"));
	}

	public Map<Integer, PostagemModel> mostrarPostagens() {
		return this.postagens;
	}

	public PostagemModel procurarPostagens(int local) {
		return this.postagens.get(local);

	}
}