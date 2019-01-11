package com.javarush.task.task17.task1714;

/* 
Comparable
*/

public class Beach implements Comparable<Beach>{
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество
    
    public synchronized int compareTo (Beach beachToCompare){
//        Integer comparatorB2 = (int) beachToCompare.getDistance()*beachToCompare.getQuality();
//        Integer comparatorB1 = (int) distance*quality;
        return (quality - beachToCompare.quality) - (int) (distance - beachToCompare.distance);//comparatorB1.compareTo(comparatorB2);
    }
    
    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    public static void main(String[] args) {
//        Beach b1 = new Beach("B1", 200, 10);
//        Beach b2 = new Beach("B2", 50, 100);
//        System.out.println(b1.compareTo(b2));
    }
}
