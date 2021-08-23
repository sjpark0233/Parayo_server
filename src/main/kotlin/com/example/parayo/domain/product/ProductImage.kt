package com.example.parayo.domain.product

import java.util.*
import javax.persistence.*

@Entity(name = "product_image")
class ProductImage(
    var path: String,
    var productId: Long? = null
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    var createAt: Date? = null
    var updateAt: Date? = null

    @PrePersist
    fun prePersist() {
        createAt = Date()
        updateAt = Date()
    }

    @PreUpdate
    fun preUpdate() {
        updateAt = Date()
    }
}