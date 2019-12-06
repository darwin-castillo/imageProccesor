/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olinimageprocessor.common;

/**
 *
 * @author Jeniffer
 */
public class ImageProperties {
    
    private int width;
    private int height;
    private String name;
    private String typeName;

    public ImageProperties() {
    }

    public ImageProperties(int width, int height, String typeName) {
        this.width = width;
        this.height = height;
        this.typeName = typeName;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
    
    
       
    
}
