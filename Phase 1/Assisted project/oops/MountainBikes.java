package com.simplilearn.oops;

public class MountainBikes extends Bycycle{
	public int seatHeight; 
	public MountainBikes(int gear,int speed,int startHeight) 
    {  
		super(gear,speed); 
        int seatHeight = startHeight; 
    }  
    public void setHeight(int newValue) 
    { 
        int seatHeight;
		seatHeight = newValue; 
    } 
    @Override
    public String toString() 
    { 
        return (super.toString()+"\nseat height is "+ seatHeight); 
    } 

}
