package com.example.demo;

@Entity
public class Pet {
    
    @Id
    private int id;  // ID will need to be set manually
    
    private String name;
    private int age;
    private String gender;
    private String description;
    private String imageUrl;

    // No-argument constructor
    public Pet() {
    }

    // All-arguments constructor
    public Pet(int id, String name, int age, String gender, String description, String imageUrl) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.description = description;
        this.imageUrl = imageUrl;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
