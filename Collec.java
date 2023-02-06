package project;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Collec {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter start number: ");
    int start = sc.nextInt();
    System.out.print("Enter end number: ");
    int end = sc.nextInt();
    List<Integer> mainList = new ArrayList<>();
    List<Integer> evenList = new ArrayList<>();
    List<Integer> oddList = new ArrayList<>();

    for (int i = start; i <= end; i++) {
      mainList.add(i);
      System.out.println(i);
      if (i % 2 == 0) {
        evenList.add(i);
      } else {
        oddList.add(i);
      }
    }
    System.out.println("Main list: " + mainList);
    Set<Integer> mainSet = new HashSet<>(mainList);
    mainSet.addAll(evenList);
    mainSet.addAll(oddList);

    HashMap<Integer, Integer> mainMap = new HashMap<>();
    for (int num : mainList) {
      mainMap.put(start, end);
    }
    System.out.println("Main list: " + mainList);
    System.out.println("Even list: " + evenList);
    System.out.println("Odd list: " + oddList);
    System.out.println("Main set: " + mainSet);
    System.out.println("Main map: " + mainMap);
  }
}
