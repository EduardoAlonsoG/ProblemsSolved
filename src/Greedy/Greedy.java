package Greedy;

import java.util.ArrayList;
import java.util.List;

class Task{
    protected String name;
    protected Integer hrs;
    public Task(String name , Integer hrs){
        this.name = name;
        this.hrs = hrs;
    }
}

class Utility{
    public List<Task> tareasOrdenadas(List<Task> taskOrd , Integer hrsI){
        List <Task> tareasHechas = new ArrayList<>();

        for(Task n : taskOrd){
            if(hrsI >= n.hrs) {
                tareasHechas.add(n);
                hrsI = hrsI-n.hrs;
            }
        }

        return tareasHechas;
    }
}

public class Greedy {
    public static void main(String[] args) {
        Utility greedy = new Utility();
        List<Task> tareasOrd = getListTask();
        Integer hrs = 10;
        Utility ut = new Utility();
        System.out.println("The task you've done: ");
        for(Task x : ut.tareasOrdenadas(tareasOrd , hrs)){
            System.out.println(x.name + " ");
        }

    }

    public static List<Task> getListTask(){

        List <Task> totalTask = new ArrayList<>();
        Task tr1,tr2,tr3,tr4,tr5,tr6,tr7,tr8,tr9;
        tr1 = new Task("A" , 2);
        tr2 = new Task("B" , 5);
        tr3 = new Task("C" , 3);
        tr4 = new Task("D" , 2);
        tr5 = new Task("E" , 9);
        tr6 = new Task("F" , 5);
        tr7 = new Task("G" , 4);
        tr8 = new Task("H" , 7);
        tr9 = new Task("I" , 1);

        totalTask.add(tr1);
        totalTask.add(tr2);
        totalTask.add(tr3);
        totalTask.add(tr4);
        totalTask.add(tr5);
        totalTask.add(tr6);
        totalTask.add(tr7);
        totalTask.add(tr8);
        totalTask.add(tr9);

        totalTask.sort((o1, o2) -> o1.hrs.compareTo(o2.hrs));

        return totalTask;

    }
}