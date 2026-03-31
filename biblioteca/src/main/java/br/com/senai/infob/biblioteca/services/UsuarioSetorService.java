package br.com.senai.infob.biblioteca.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.infob.biblioteca.models.UsuarioSetor;
import br.com.senai.infob.biblioteca.repositories.UsuarioSetorRepository;

@Service
public class UsuarioSetorService {
    @Autowired
    public UsuarioSetorRepository UsuarioSetorRepository;

    public Long count() {
        return UsuarioSetorRepository.count();// o . expande oque esta dentro
    }
     public UsuarioSetor salvar(UsuarioSetor  UsuarioSetor){
        return UsuarioSetorRepository.save(UsuarioSetor);
     }

     //public void delete(Integer id){
        //UsuarioSetorRepository.deleteBy(id);
     //}
     public boolean delete(Integer id){
      UsuarioSetor UsuarioSetor = UsuarioSetorRepository.findById(id).get();
      if(UsuarioSetor!= null){
         UsuarioSetorRepository.deleteById(id);
         return true;
      }
      return false;
   }

      public boolean update(UsuarioSetor UsuarioSetor) {
      UsuarioSetorRepository.save(UsuarioSetor);
      return true;
   }
      public UsuarioSetor atualizar(UsuarioSetor UsuarioSetor, Integer id) {
      UsuarioSetor e = buscar(id);
      if (e != null) {
         UsuarioSetor.setUsuarioSetorId(id);
         return UsuarioSetorRepository.save(UsuarioSetor);
      }
      return null;
   }
      public UsuarioSetor buscar(Integer id){
      return UsuarioSetorRepository.findById(id).get();
   }

   public List<UsuarioSetor> Listar(){
      return UsuarioSetorRepository.findAll();
   }
}
