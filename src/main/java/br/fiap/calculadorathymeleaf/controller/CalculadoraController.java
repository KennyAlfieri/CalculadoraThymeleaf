package br.fiap.calculadorathymeleaf.controller;

import br.fiap.calculadorathymeleaf.service.CalculadoraService;
import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("calculadora")
public class CalculadoraController {


        private final CalculadoraService service;


    @GetMapping("calcular")
    public double calcular(int a, int b, String operacao, Model model) {}
}
