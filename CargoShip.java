/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rob
 */
    public class CargoShip extends Ship{

int noOfTonns;

// construtor for name and year ,number of tonns

public CargoShip(String name,int year,int noOfTonns)

{

super(name,year);

this.noOfTonns=noOfTonns;

}

//return number of tonns

public int getNoOfTonns()

{

return noOfTonns;

}

public String toString()

{

return "\n Ship name :"+getShipName()+

"\nShip Capacity :"+getNoOfTonns();

}

}