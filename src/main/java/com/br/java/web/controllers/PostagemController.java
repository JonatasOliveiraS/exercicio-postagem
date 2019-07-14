package com.br.java.web.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.br.java.web.models.PostagemModel;
import com.br.java.web.services.PostagemService;

@Controller
public class PostagemController {

	@Autowired
	PostagemService listaService;
	private PostagemController postagemService;

	@RequestMapping
	@ResponseBody
	public List<String> showLista() {
		return listaService.mostrarLista();
	}

	@RequestMapping("/{nome}")
	@ResponseBody
	public String buscarNome(@PathVariable String nome) {
		return listaService.buscarNome(nome);

	}

	@RequestMapping("/delete/{nome}")
	@ResponseBody
	public String deletarName(@PathVariable String nome) {
		return listaService.deletarNome(nome);
	}

	@RequestMapping("/adicionar/{nome}")
	@ResponseBody
	public String adicionarNome(@PathVariable String nome) {
		return listaService.adicionarNome(nome);
	}
	
	@RequestMapping
	@ResponseBody
	public Map<Integer, PostagemModel> visualizarPostagens(){
		return postagemService.visualizarPostagens();
	}

	@RequestMapping("/postagem/{local}/{nome}")
	@ResponseBody
	public PostagemModel procurarPostagem(@PathVariable int local) {
		return postagemService.procurarPostagem(local);
	
	}
}
