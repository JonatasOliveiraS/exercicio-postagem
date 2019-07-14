package com.br.java.web.services;

import com.br.java.web.models.PostagemModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class PostagemService {

	private List<String> nomes = new ArrayList<String>(Arrays.asList("Jonatas", "Bruna", "Milena"));

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

	public String deletarNome(String deleteUsuario) {
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
		postagens.put(1, new PostagemModel("Jonatas", "blá blá blá"));
		postagens.put(2, new PostagemModel("Bruna", "olá mundo kkk"));
		postagens.put(3, new PostagemModel("Milena", "eu sei lá"));
	}

	public Map<Integer, PostagemModel> mostrarPostagens() {
		return this.postagens;
	}

	public PostagemModel procurarPostagens(int local) {
		return this.postagens.get(local);

	}
}