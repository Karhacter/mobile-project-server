package com.tranduckhanh.exercise02.entity;

import java.util.List;
import java.util.UUID;

import org.hibernate.annotations.GenericGenerator;

import java.util.Date;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(generator = "uuid2", strategy = GenerationType.IDENTITY)
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "id", columnDefinition = "BINARY(16)")
    private UUID productId;

    @Column(name = "product_name")
    private String name;

    @Column(name = "SKU")
    private String SKU;

    @Column(name = "reguler_price", columnDefinition = "numeric")
    private double regulerPrice;

    @Column(name = "discount_price", columnDefinition = "numeric")
    private double discountPrice;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "short_description")
    private String shortDescription;

    @Column(name = "product_description", columnDefinition = "TEXT")
    private String productDescription;

    @Column(name = "product_weight", columnDefinition = "NUMERIC")
    private double productWeight;

    @Column(name = "product_note", columnDefinition = "TEXT")
    private String productNote;

    @Column(name = "published")
    private boolean published;

    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    @ManyToMany(fetch = FetchType.LAZY, cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "product_tags", joinColumns = { @JoinColumn(name = "product_id") }, inverseJoinColumns = {
            @JoinColumn(name = "tag_id")
    })
    private List<Tag> tags;

    // Navigation properties
    @OneToMany(mappedBy = "product")
    private List<Gallery> galleries;

}
