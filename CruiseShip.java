/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rob
 */
public class CruiseShip extends Ship{

int maxPassengers;

//construtor for name and number of passengers

public CruiseShip(String ship,

int year,int maxPassengers)

{

super(ship,year);

this.maxPassengers=maxPassengers;

}

//return maximum passengers

public int getMaxPassengers()

{

return maxPassengers;

}

//Overiride the toString

public String toString()

{

return "\nShip Name :"+getShipName()+

"\nMaximum Number of passengers :"+

getMaxPassengers();

}

}