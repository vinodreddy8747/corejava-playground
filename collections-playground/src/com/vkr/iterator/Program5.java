package com.vkr.iterator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

// Map  managers of employees
class Manager implements Comparable<Manager>{
	int id;
	String name;

	Manager(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Manager [id=" + id + ", name=" + name + "]";
	}
	
	@Override
	public int compareTo(Manager o) {
		return this.id - o.id;
	}

}

class Employee {
	int id;
	String name;
	String designation;

	public Employee(int id, String name, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + "]";
	}

}

public class Program5 {

	public static void main(String[] args) {
		Map<Manager, List<Employee>> managerMap = new HashMap<>();

		Employee e1 = new Employee(100, "harish", "Engineer");
		Employee e2 = new Employee(101, "suresh", "SeniorEngineer");
		Employee e3 = new Employee(102, "naresh", "JuniorEngineer");
		Employee e4 = new Employee(103, "rajesh", "Engineer");
		Employee e5 = new Employee(104, "ramesh", "Worker");
		List<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);

		Manager m1 = new Manager(1000, "Mahesh");

		managerMap.put(m1, list);

		Employee e6 = new Employee(105, "abc", "JuniorEngineer");
		Employee e7 = new Employee(106, "xyz", "SeniorEngineer");
		Employee e8 = new Employee(107, "pqr", "JuniorEngineer");
		Employee e9 = new Employee(108, "hero", "Worker");
		Employee e10 = new Employee(109, "villan", "Worker");

		List<Employee> list2 = new ArrayList<Employee>();
		list2.add(e6);
		list2.add(e7);

		List<Employee> list3 = new ArrayList<>();
		list3.add(e8);
		list3.add(e9);
		list3.add(e10);

		Manager m2 = new Manager(1001, "Vijay");
		Manager m3 = new Manager(1002, "Ajay");

		managerMap.put(m2, list2);
		managerMap.put(m3, list3);

		System.out.println(managerMap);

		Program5 p5 = new Program5();
		p5.readMap(managerMap);
		
		System.out.println("========================= Sorted Map ===================================");
		Map<Manager, List<Employee>> sortedMap = new TreeMap<Manager, List<Employee>>(managerMap);
		p5.readMap(sortedMap);


	}

	public void readMap(Map<Manager, List<Employee>> map) {
		Set<Map.Entry<Manager, List<Employee>>> entrySet = map.entrySet();

		Iterator<Entry<Manager, List<Employee>>> itr = entrySet.iterator();
		
		while(itr.hasNext()) {
			System.out.println("------ Map Entry reading started ------------------------------------");

			Entry<Manager, List<Employee>> entry = itr.next();
			
			System.out.println("Key of the element: " + entry.getKey());
			List<Employee> list = entry.getValue();
			
			for(Employee emp : list) {
				System.out.println("Value of key: " + emp);
			}
			
			System.out.println("------ Map Entry reading completed ----------------------------------");
			
		}
	}

}
