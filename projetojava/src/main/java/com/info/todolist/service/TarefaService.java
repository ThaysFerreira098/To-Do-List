/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.info.todolist.service;

import com.info.todolist.model.Tarefa;
import com.info.todolist.repository.TarefaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TarefaService {

    @Autowired
    TarefaRepository tarefaRepository;

    public Tarefa criarTarefa(Tarefa tarefa) {
        tarefaRepository.save(tarefa);
        return tarefa;
    }

    ;
    public void excluirTarefa(int id) {
        tarefaRepository.deleteById(id);
    }

    ;
    public List<Tarefa> pesquisar() {
        return tarefaRepository.findAll();
    };
    public Tarefa localizar(int id){
        
        Optional<Tarefa> verifica =  tarefaRepository.findById(id);
        if(verifica.isPresent()){
            return verifica.get();
            
        }else{
            return null;
        }
        
    };
}
