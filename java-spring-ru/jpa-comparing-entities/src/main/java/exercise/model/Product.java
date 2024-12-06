package exercise.model;

import jakarta.persistence.*;

import static jakarta.persistence.GenerationType.IDENTITY;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

// BEGIN
@Getter
@Setter
@EqualsAndHashCode(of = {"title", "price"})
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    long id;
    String title;
    int price;
}
// END
