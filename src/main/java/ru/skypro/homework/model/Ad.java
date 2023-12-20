package ru.skypro.homework.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Ad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer price;
    private String title;
    private String description;
    private String imageUrl;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private User author;

    @OneToMany(mappedBy = "ad")
    private List<Comment> comments;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ad ad = (Ad) o;
        return Objects.equals(id, ad.id)
                && Objects.equals(price, ad.price)
                && Objects.equals(title, ad.title)
                && Objects.equals(description, ad.description)
                && Objects.equals(imageUrl, ad.imageUrl)
                && Objects.equals(author, ad.author)
                && Objects.equals(comments, ad.comments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, price, title, description, imageUrl, author, comments);
    }

    @Override
    public String toString() {
        return "Ad{" +
                "id=" + id +
                ", price=" + price +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", author=" + author +
                ", comments=" + comments +
                '}';
    }
}