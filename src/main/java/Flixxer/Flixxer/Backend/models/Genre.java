package Flixxer.Flixxer.Backend.models;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Genre {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Setter
    @Column
    private String title;

    @ManyToMany(mappedBy = "genres")
    private Set<Video> videos = new HashSet<>();




    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
   }
}
