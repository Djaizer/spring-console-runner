package spring.console.runner.domain;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Image {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String title;

    public Image(String name) {
        this.name = name;
    }
    public Image(String name, String title) {
        this.name = name;
        this.title = title;
    }
}
