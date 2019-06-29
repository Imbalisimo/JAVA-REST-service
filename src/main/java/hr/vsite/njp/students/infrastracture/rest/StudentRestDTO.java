package hr.vsite.njp.students.infrastracture.rest;

public class StudentRestDTO {
    private Long id;
    private String name;

    public StudentRestDTO(){
    }

    StudentRestDTO(Long id, String name){
        this.id=id;
        this.name=name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name=name; }

    @Override
    public String toString() {
        return "StudentRestDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
