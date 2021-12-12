package blog.entity;

import javax.persistence.*;

@Entity
@Table(name = "blogers")
public class Bloger {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String content;
    private String image;

    public Bloger() {
    }

    public Bloger(Long id, String name, String content, String image) {
        this.id = id;
        this.name = name;
        this.content = content;
        this.image = image;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
