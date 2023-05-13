package projeto.testexbrain.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import projeto.testexbrain.api.venda.DadosCadastroVenda;
import projeto.testexbrain.api.venda.Venda;
import projeto.testexbrain.api.venda.VendaRepository;

@RestController
@RequestMapping("vendas")
public class VendaController {

    @Autowired
    private VendaRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody DadosCadastroVenda dados) {
        repository.save(new Venda(dados));
    }

}
