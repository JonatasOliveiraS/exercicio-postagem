package com.br.java.web.models;
public class PostagemModel {

	private String usuario;
	private String postagem;

	public PostagemModel() {
	}

	public PostagemModel(String usuario, String postagem) {
		this.usuario = usuario;
		this.postagem = postagem;
	}

	public String getUsuario() {
		return usuario;
	}

	public String getPostagem() {
		return postagem;
	}

	public void setPostagem(String postagem) {
		this.postagem = postagem;
	}

	@Override
	public String toString() {
		StringBuilder modelo = new StringBuilder();

		modelo.append("Usuario:" + this.usuario);
		modelo.append("\nPostou:" + this.postagem);
		modelo.append("\n");

		return modelo.toString();

	}
}
