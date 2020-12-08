package com.Animaux.app;

import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Animal {
	
	private String name;
	private String Kind;
	private int    size;
	private static double id = 0;
	
	
	public Animal(String name,String kind,int size){
		// TODO Auto-generated constructor stub
		this.name = name;
		this.Kind = kind;
		id = Math.random() * ( 100 - 10 );
		this.size = size;
		
	}
	
	public void ReadSound(String effectSource) throws UnsupportedAudioFileException, IOException, 
	LineUnavailableException {
		
		
		
		
	}
	
@Override
public String toString() {
	// TODO Auto-generated method stub
	return "name : " + this.name + " Kind : " + this.Kind + " size : " + this.size;
	
}
     
	
	
	
	

}
