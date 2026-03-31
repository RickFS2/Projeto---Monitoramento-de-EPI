package br.com.senai.infob.biblioteca.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.infob.biblioteca.models.UsuarioSetor;
import br.com.senai.infob.biblioteca.services.UsuarioSetorService;


@RestController
@RequestMapping("/UsuarioSetor")
public class UsuarioSetorController  {
    @Autowired //injção de dependencia
    public UsuarioSetorService UsuarioSetorService;
    @GetMapping("/count")
    public Long count(){
        return UsuarioSetorService.count();
    }
    @PostMapping("/salvar")
    public UsuarioSetor salvar(@RequestBody UsuarioSetor UsuarioSetor){
        return UsuarioSetorService.salvar(UsuarioSetor);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id){
    boolean deletou = UsuarioSetorService.delete(id);
        if (deletou){
            return "user removido";
        }
        return " falha ao remover";
    }

   @PutMapping("/atualizar/{id}")
    public UsuarioSetor atualizar(@PathVariable Integer id, @RequestBody UsuarioSetor UsuarioSetor){
        return UsuarioSetorService.atualizar(UsuarioSetor, id);
    }

    @GetMapping("/search/{id}")
    public UsuarioSetor buscar(@PathVariable Integer id){
        return UsuarioSetorService.buscar(id);
    }
    @GetMapping("/listar")
    public List<UsuarioSetor> Listar(){
        return UsuarioSetorService.Listar();
    }

}
