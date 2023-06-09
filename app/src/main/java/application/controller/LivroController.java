package application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;

import application.model.LivroRepository;
import application.model.Livro;

@Controller
public class LivroController {

    @Autowired
    private LivroRepository livroRepo;

    @RequestMapping("/livro")
    public String list(Model model) {
        model.addAttribute("livros", livroRepo.findAll());
        return "WEB-INF/list.jsp";
    }

    @RequestMapping("/insert")
    public String insert(){
        return "WEB-INF/insert.jsp";
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String insert(@RequestParam("titulo") String titulo){
        
       Livro livro = new Livro();
       livro.setTitulo(titulo);

        livroRepo.save(livro);         
        return "redirect:/livro";
    }

    @RequestMapping("/update/{id}")
    public String update(@PathVariable int id){
        return "";
    }

}
