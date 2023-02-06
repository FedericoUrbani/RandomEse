package it.develhope.exercise;

import java.util.ArrayList;
import java.util.List;

public class Tester {

    public static void main(String[] args) {
        List<Worker> workmanList = new ArrayList<Worker>();
        workmanList.add(new Worker(0, "Mario Gialli", (float) 0.5, 20));
        workmanList.add(new Worker(5, "Gianni Fannulloni", (float) 0.2, 30));
        workmanList.add(new Worker(17, "Giorgia Lavoroni", (float) 0.85, 40));

        List<Head> headList = new ArrayList<Head>();

        headList.add(new Head(3, "Alessio Antichi", (float) 0.55, 20));
        headList.add(new Head(1, "Marianna Figlidelcapo", (float) 0.3, 2));
        headList.add(new Head(9, "Gianluigi Figlidelcapo", (float) 0.3, 4));

        for (int i = 0; workmanList.size() > i; i++) {
            if (workmanList.get(i).canApplyForPromotion()) {
                System.out.println(workmanList.get(i).getName() + " can be promoted.");

            }

        }
        System.out.println("---------------------------------");
        for (int i = 0; headList.size() > i; i++) {
            if (headList.get(i).mayBeDemoted()) {
                System.out.println(headList.get(i).getName() + " can be demoted.");
            }

        }
        System.out.println("---------------------------------");
        List<Employee> employeesList = new ArrayList<Employee>();
        employeesList.addAll(workmanList);
        employeesList.addAll(headList);

        for (int i = 0; employeesList.size() > i; i++) {
                System.out.println(employeesList.get(i).getName() + " efficiencyIndex = " +employeesList.get(i).getEfficiencyIndex() );
                String s=employeesList.get(i).getName();
                String replaced=s.replaceAll("[A-Z]","");
                System.out.println(replaced);
        }
        System.out.println("-------------------------------------");
        for (int i = 0; employeesList.size() > i; i++) {

            String s=String.valueOf(employeesList.get(i).getEfficiencyIndex());
            String replaced=s.replaceAll("[0-9]","?").replace(".",",");
            System.out.println(replaced);
        }


    }
}

/**






 * e) Creare una lista di oggetti Employee unendo le due liste precedentemente
 * create
 * f) Stampare il nome e l’efficiencyIndex di ogni persona
 * g) Stampare il nome di ogni persona escludendo le lettere maiuscole
 * h) Stampare il nome di ogni persona e l’efficiencyIndex sostituendo il carattere
 * “.” con “,” e le cifre con ‘?’
 */