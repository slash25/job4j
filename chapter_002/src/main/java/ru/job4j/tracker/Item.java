package ru.job4j.tracker;

import java.util.Objects;
public class Item {

    private String id;
    private String name;
    private  String description;
    private  long create;

    public Item(String id, String name, String description, long create) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.create = create;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getCreate() {
        return create;
    }

    public void setCreate(long create) {
        this.create = create;
    }
}
