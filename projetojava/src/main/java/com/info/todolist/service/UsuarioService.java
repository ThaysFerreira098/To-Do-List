/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.info.todolist.service;

import com.info.todolist.model.Usuario;
import com.info.todolist.repository.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository userRepository;
    public Usuario criarUsuario(Usuario usuario){
        userRepository.save(usuario);
        return usuario;
    };
    public void excluirUsuario(int id){
        userRepository.deleteById(id);
    };
    public List<Usuario> pesquisar(){
        return userRepository.findAll();
    };
}
