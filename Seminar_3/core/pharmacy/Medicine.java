package core.pharmacy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Medicine implements Iterator<MedicineComponent>, Comparable<Medicine> {
    private List<MedicineComponent> components; 
    private int index;

    public Medicine(){
        this.components = new ArrayList<>();
        this.index = 0;
    }

    public Medicine addComponent(MedicineComponent component) {
        components.add(component);
        return this;
    }

    public int getMedicineWeight(){
        int weight = 0;
        for(MedicineComponent component : components){
            weight += component.getWeight();
        }
        return weight;
    }

    public int getMedicinePower(){
        int power = 0;
        for (MedicineComponent component : components){
            power += component.getPower();
        }
        return power;
    }

    @Override
    public boolean hasNext() {
        // return components.iterator().hasNext();
        return index < components.size();
    }

    @Override
    public MedicineComponent next() {
        // return components.iterator().next();
        return components.get(index++);
    }

    @Override
    public String toString() {
        return "Medicine: " + components.toString();
    }

    @Override
    public int compareTo(Medicine o) {
        if(this.getMedicineWeight() - o.getMedicineWeight() == 0){
            return this.getMedicinePower() - o.getMedicinePower();
        }
        return this.getMedicineWeight() - o.getMedicineWeight();
    }
}
