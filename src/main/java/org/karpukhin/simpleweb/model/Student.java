package org.karpukhin.simpleweb.model;

/**
 * @author Pavel Karpukhin
 */
public class Student extends Entity {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
