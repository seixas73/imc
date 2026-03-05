package controller;

import dtos.ResponseImcDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Scanner;

@Controller
@RequestMapping("/calcular-imc")
@CrossOrigin

public class calculoIMC {
    Scanner scan = new Scanner(System.in);

    @GetMapping("/imc")
    public ResponseEntity<ResponseImcDTO>imc (@RequestParam double peso, @RequestParam double altura){
        ResponseImcDTO resultado = new ResponseImcDTO();
        resultado.setResultado(peso/altura);
        return ResponseEntity.ok(resultado);
    }

}
