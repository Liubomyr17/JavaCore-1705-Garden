package com.company;

/*

1705 Garden

1. Create a method public void addFruit (int index, String fruit) - which adds the fruit parameter to the fruits leaf at the index position
2. Create a method public void removeFruit (int index) - which removes the element with index from fruits
3. Create a method public void addVegetable (int index, String vegetable) - which adds the parameter vegetable to the vegetables sheet at position index
4. Create a method public void removeVegetable (int index) - which removes an element with index from vegetables
5. The Garden class will be used by threads. So make sure all methods block the this mutex
6. Implement this with a minimum amount of code.

Requirements:
1. The Garden class must contain the public void addFruit (int index, String fruit) method.
2. The Garden class must contain the public void removeFruit (int index) method.
3. The Garden class must contain the public void addVegetable (int index, String vegetable) method.
4. The Garden class must contain the public void removeVegetable (int index) method.
5. The addFruit (int index, String fruit) method should add the fruit parameter to the fruits leaf at the index position.
6. The removeFruit (int index) method should remove from fruits an element with index index.
7. The addVegetable (int index, String vegetable) method should add the vegetable parameter to the vegetables sheet at the index position.
8. The removeVegetable (int index) method should remove an element with index from vegetables.
9. All methods of the Garden class must block this mutex (be synchronized).



 */


import java.util.ArrayList;
import java.util.List;

/*
Сад-огород
*/

public class Solution {


    public static void main(String[] args) {

    }

    public static class Garden {

        public final List<String> fruits = new ArrayList<String>();
        public final List<String> vegetables = new ArrayList<String>();

        public synchronized void addFruit(int index, String fruit) {
            fruits.add(index, fruit);
        }

        public synchronized void removeFruit(int index) {
            fruits.remove(index);
        }

        public synchronized void addVegetable(int index, String vegetable) {
            vegetables.add(index, vegetable);
        }

        public synchronized void removeVegetable(int index) {
            vegetables.remove(index);
        }
    }
}








