/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rob
 */
public class ShipDemo {

public static void main(String[] args) {

//create an array of type ship of size

Ship[] ships=new Ship[3];

//initialize constructors

ships[0]=new Ship("Mil.Falcon",2002);

ships[1]=new CruiseShip("X-Wing",2002,1336);

ships[2]=new CargoShip("Battle Star",2002,100);

//print toString methods

for(int i=0;i<ships.length;i++)

System.out.println(ships[i].toString());

}

}