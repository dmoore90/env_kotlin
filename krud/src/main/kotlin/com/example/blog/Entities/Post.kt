package com.example.blog.Entities

import javax.persistence.*;

@Entity
@Table(name="Posts")
class Post {
    private var id: Long? = null
    private var content: String? = null

    public fun Post() {
    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public fun getId(): Long? {
        return id;
    }

    public fun setId(id: Long) {
        this.id = id;
    }

    public fun getContent(): String? {
        return content;
    }

    public fun setContent(content: String) {
        this.content = content;
    }
}
