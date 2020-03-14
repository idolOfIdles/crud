package template.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/todos", produces = "application/json")
public class TodoController {

    @GetMapping()
    public void getAllTodos() {
        System.out.println("Hello");
    }

}
