package com.trgt.rysetii.learningresourcesapi.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "learningresources")
public class LearningResource implements Serializable {

    @Id
    @Column(name = "learning_resource_id")
    private Integer learningResourceId;
    @Column(name = "learning_resource_name")
    private String productName;
    @Column(name = "cost_price")
    private Double costPrice;
    @Column(name = "selling_price")
    private Double sellingPrice;
    @Column(name = "learning_resource_status")
    @Enumerated(EnumType.STRING)
    private LearningResourceStatus learningResourceStatus;
    @Column(name = "created_date")
    private LocalDate createdDate;
    @Column(name = "published_date")
    private LocalDate publishedDate;
    @Column(name = "retired_date")
    private LocalDate retiredDate;

    public LearningResource() {
    }

    public LearningResource(Integer learningResourceId, String productName, Double costPrice, Double sellingPrice, LearningResourceStatus learningResourceStatus, LocalDate createdDate, LocalDate publishedDate, LocalDate retiredDate) {
        this.learningResourceId = learningResourceId;
        this.productName = productName;
        this.costPrice = costPrice;
        this.sellingPrice = sellingPrice;
        this.learningResourceStatus = learningResourceStatus;
        this.createdDate = createdDate;
        this.publishedDate = publishedDate;
        this.retiredDate = retiredDate;
    }

    public Integer getLearningResourceId() {
        return learningResourceId;
    }

    public void setLearningResourceId(Integer learningResourceId) {
        this.learningResourceId = learningResourceId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Double costPrice) {
        this.costPrice = costPrice;
    }

    public Double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(Double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public LearningResourceStatus getLearningResourceStatus() {
        return learningResourceStatus;
    }

    public void setLearningResourceStatus(LearningResourceStatus learningResourceStatus) {
        this.learningResourceStatus = learningResourceStatus;
    }

    public LocalDate getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDate getPublishedDate() {
        return this.publishedDate;
    }

    public void setPublishedDate(LocalDate publishedDate) {
        this.publishedDate = publishedDate;
    }

    public LocalDate getRetiredDate() {
        return this.retiredDate;
    }

    public void setRetiredDate(LocalDate retiredDate) {
        this.retiredDate = retiredDate;
    }
}
