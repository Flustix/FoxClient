package net.foxes4life.foxclient.config;

import com.google.gson.annotations.Expose;

import java.util.LinkedHashMap;

public class Category {
    @Expose
    public final String name;

    @Expose
    public LinkedHashMap<String, Object> settings = new LinkedHashMap<>();

    public Category(String name) {
        this.name = name;
    }

    public void addSetting(String key, Object value) {
        this.settings.put(key, value);
    }

    public void set(String key, Object value) {
        if(!this.settings.containsKey(key)) return;
        this.settings.put(key, value);
    }

    public Object get(String key) {
        if(!this.settings.containsKey(key)) return null;
        return this.settings.get(key);
    }
}
