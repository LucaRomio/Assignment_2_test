////////////////////////////////////////////////////////////////////
// [Gabriel] [Rovesti] [2009088]
// [Luca] [Romio] [2014028]
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import java.util.List;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Simulazione app di gestione dei conti");
    }

    public void printUser(User _u){
        System.out.println(_u.getId()+"\t"+_u.getSurname()+"\n"+_u.getName()+"\t"+_u.getAge());
    };
    
    public void printEItem(EItem _i){
        System.out.println(_i.getName()+"\t"+_i.getPrice());
    };

    public void printOrderList(List<EItem> _l){
        System.out.println("Lista articoli:");
        for (EItem _i : _l) {
            printEItem(_i);
        }
    };

    public void printOrder(Order _e){
        printUser(_e.getUser());
        printOrderList(_e.getItemList());
    };
    
}