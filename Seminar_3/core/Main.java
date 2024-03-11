package core;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import core.pharmacy.Medicine;
import core.pharmacy.Medicine2;
import core.pharmacy.MedicineComponent;
import core.pharmacy.impl.Asitromin;
import core.pharmacy.impl.Penicilium;
import core.pharmacy.impl.Vetbicid;

public class Main {
    public static void main(String[] args) {
        List<MedicineComponent> medList = new ArrayList<>();
        List<Medicine> medicineList = new ArrayList<>();
        Asitromin asit = new Asitromin("Asitromin", 50, 70);
        Penicilium penicilium = new Penicilium("Penicil", 30, 50);
        Vetbicid vetbicid = new Vetbicid("Vetbicid", 40, 30);

        Medicine medicine1 = new Medicine();
        medicine1.addComponent(asit).addComponent(penicilium).addComponent(vetbicid);
        Medicine medicine2 = new Medicine();
        medicine2.addComponent(vetbicid).addComponent(vetbicid);
        Medicine medicine3 = new Medicine();
        medicine3.addComponent(penicilium).addComponent(asit);

        medicineList.add(medicine1);
        medicineList.add(medicine2);
        medicineList.add(medicine3);

        // Medicine2 medicine1 = new Medicine2();
        // medicine1.addComponent(asit).addComponent(penicilium).addComponent(vetbicid);

        // for (MedicineComponent component : medicine1) {
            
        // }
        // Iterator<MedicineComponent> med = medicine1;
        // while (med.hasNext()){
        //     System.out.println(med.next());
        // }
        // for (MedicineComponent component : medicine1){
        //     System.out.println(component);
        // }
        // medList.add(asit);
        // medList.add(penicilium);
        // medList.add(vetbicid);
        // System.out.println(medList);
        // Collections.sort(medList, (comp1,comp2) -> (int) (comp1.getWeight() - comp2.getWeight()));
        // System.out.println(medList);

        // medicineList.add(asit);
        // medicineList.add(penicilium);
        System.out.println(medicineList);
        Collections.sort(medicineList);
        System.out.println(medicineList);
    }
    
}
