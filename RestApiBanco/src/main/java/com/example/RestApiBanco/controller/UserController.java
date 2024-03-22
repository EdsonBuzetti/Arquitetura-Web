package com.example.RestApiBanco.controller;

import com.example.RestApiBanco.model.UserEntity;
import com.example.RestApiBanco.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserEntity> obterTodos() {
        return userService.obterTodos();
    }

    @GetMapping("/{id}")
    public UserEntity obterPorId(@PathVariable String id) {
        return userService.obterPorId(id);
    }

    @PostMapping
    public UserEntity inserir(@RequestBody UserEntity user) {
        return userService.inserir(user);
    }

    @PutMapping("/{id}")
    public UserEntity atualizar(@PathVariable String id, @RequestBody UserEntity user) {
        return userService.atualizar(id, user);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable String id) {
        userService.excluir(id);
    }

    @GetMapping("/buscarPorNome/{nome}")
    public List<UserEntity> buscarUsuariosPorNome(@PathVariable String nome) {
        return userService.buscarPorNome(nome);
    }

    @GetMapping("/buscarPorEmail/{email}")
    public List<UserEntity> buscarUsuariosPorEmail(@PathVariable String email) {
        return userService.buscarPorEmail(email);
    }
    //http://localhost:8080/users/buscarPorNomeEEmail?nome=joao&email=joao@gmail.com usar para achar email

    @GetMapping("/buscarPorNomeEEmail")
    public List<UserEntity> buscarUsuariosPorNomeEEmail(@RequestParam("nome") String nome,@RequestParam("email") String email) {
        return userService.buscarPorNomeEEmail(nome, email);
    }
    @GetMapping("/buscarPorNomeQueComecaCom/{prefixo}")
    public List<UserEntity> buscarUsuariosPorNomeQueComecaCom(@PathVariable String prefixo) {
        return userService.buscarPorNomeQueComecaCom(prefixo);
    }
    @GetMapping("/buscarPorNomeQueContem/{contem}")
    public List<UserEntity> buscarUsuariosPorNomeQueContem(@PathVariable String contem) {
        return userService.buscarPorNomeQueContem(contem);
    }
}

