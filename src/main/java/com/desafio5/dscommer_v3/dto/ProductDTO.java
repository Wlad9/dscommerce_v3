package com.desafio5.dscommer_v3.dto;
import com.desafio5.dscommer_v3.entities.Product;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class ProductDTO {
    private Long id;
    @Size(min = 3, max = 80, message = "Nome min 3 e max 80 caracteres")
    @NotBlank(message = "Campo obrigatório")
    private String name;
    @Size(min=3,max = 10, message = "Mínimo 3 e máximo 10 caracteres obrigatórios")
    @NotBlank(message = "campo requerido")
    private String description;
    @Positive(message = "Valor deve ser positivo")
    private Double price;
    private String imgUrl;

    public ProductDTO(Long id, String name, String description, Double price, String imgUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imgUrl = imgUrl;
    }

    public ProductDTO(Product entity) {
        id = entity.getId();
        name = entity.getName();
        description = entity.getDescription();
        price = entity.getPrice();
        imgUrl = entity.getImgUrl();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public String getImgUrl() {
        return imgUrl;
    }
}
