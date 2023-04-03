package Tasks_Reference_Type;

import java.util.ArrayList;

public class MenuBuilder {
    public static void main(String[] args) {
        String menuTitle="My Dream menu";
        System.out.println("menuTitle:"+menuTitle);
        ArrayList<String>menu=new ArrayList<>();

        String stater="cold drinks";
        menu.add(stater);
        String mainCourse="pizza";
        menu.add(mainCourse);
        System.out.println("menu:"+menu);
    }
}
