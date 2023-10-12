package basico.apirestsimples.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    // Construtor SEM argumentos, para que possamos
    // instanciar a classe SEM passar as informações "diretamente" ...
    public Department() {

    }

    // Construtor COM argumentos, para que possamos
    // instanciar a classe passando as informações "diretamente" ...
    public Department(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
