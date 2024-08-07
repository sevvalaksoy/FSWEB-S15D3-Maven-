package org.example;


import org.example.entity.Employee;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        List<Employee> employees = new LinkedList<>();
        employees.add(new Employee(1, "Dogancan", "Kinik"));
        employees.add(new Employee(1, "Dogancan", "Kinik"));
        employees.add(new Employee(2, "Seyyit Battal", "Arvas"));
        employees.add(new Employee(2, "Seyyit Battal", "Arvas"));
        employees.add(new Employee(3, "Anil", "Ensari"));
        employees.add(new Employee(3, "Anil", "Ensari"));
        employees.add(new Employee(4, "Burak", "Cevizli"));
        employees.add(null);

    }
    public static List<Employee> findDuplicates(List<Employee> list){
        List<Employee> duplicates = new LinkedList<>();
        for(Employee w: list){
            if(Collections.frequency(list,w)>1){
                if(!(duplicates.contains(w))){
                    duplicates.add(w);
                }
            }
        }
        return duplicates;
    }
    public static Map findUniques(List<Employee> list){
        Map map = new LinkedHashMap();
        List all = new LinkedList();
        all.addAll(findDuplicates(list));
        all.addAll(removeDuplicates(list));
        for(int i = 0; i < all.size(); i++){
            map.put(i+1, all.get(i));
        }
        return map;
    }
    public static List<Employee> removeDuplicates(List<Employee> list){
        List<Employee> deletedData = new LinkedList<>(list);
        deletedData.removeAll(findDuplicates(list));
        Iterator iter = deletedData.iterator();
        while(iter.hasNext()){
            if(iter.next() == null){
                iter.remove();
            }
        }
        return deletedData;
    }
}