package behavioralPattern.visitor;

/* 
Шерсть и звезды
*/

import behavioralPattern.visitor.animals.Cat;
import behavioralPattern.visitor.animals.Cow;
import behavioralPattern.visitor.animals.Dog;
import behavioralPattern.visitor.visitors.JsonExportVisitor;
import behavioralPattern.visitor.visitors.YamlExportVisitor;

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Cat().accept(new JsonExportVisitor()));
        System.out.println(new Cow().accept(new JsonExportVisitor()));
        System.out.println(new Dog().accept(new JsonExportVisitor()));

        System.out.println(new Cat().accept(new YamlExportVisitor()));
        System.out.println(new Cow().accept(new YamlExportVisitor()));
        System.out.println(new Dog().accept(new YamlExportVisitor()));
    }
}
