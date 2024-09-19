/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mystudent;

/**
 *
 * @author kutlwano
 */

public class Mystudent {
 String name;
 String surname;
 int Age;
  private int ModuleMark; 
 
  
  private int moduleMark;
public MyStudent(String name,String surname,int age,int moduleMark)
{
  this.name=name;
    this.surname=surname;
    this.Age=age;
    this.ModuleMark=ModuleMark;
    
}
    // method 1
    public String getName()
    {
        return name;
    }
 
    // method 2
    public String getSurname()
    {
        return surname;
    }
 
    // method 3
    public int getAge()
    {
        return Age;
    }
 
    // method 4
    public int getModuleMark()
    {
        return moduleMark;
    }
 
    @Override
    public String toString()
    {
        return("Student name"+ this.getName()+
               "Surname,age and moduleMark are " +
               this.getSurname()+"," + this.getAge()+
               ","+ this.getModuleMark());

}
    
    public static void main(String[] args) {
       
  MyStudent kutlwano= new MyStudent("kutlwano","Matlaopane",19,79);
System.out.println(kutlwano.toString());
  MyStudent Mamello= new MyStudent("Mamello","Masolane",17,65);
System.out.println(Mamello.toString());
MyStudent Thabang= new MyStudent("Thabang","Moshibi",18,43);
System.out.println(Thabang.toString());


    }
    
}
