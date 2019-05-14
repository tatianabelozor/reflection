/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author user
 */
public class Table {

    public int size;
    public String color;

    public Table(int size, String color) {
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Table{"
                + "size=" + size + 
                ", color=" + color + "}";
    }
}
