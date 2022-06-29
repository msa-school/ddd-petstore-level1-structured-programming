package com.demo.petstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PetstoreApplication {

	public static void main(String[] args) {

		Pet dog = new Pet();
		dog.appearance = 0;
		dog.energy = 0;
		dog.type = "Dog";

		speak(dog);

		eat(dog);

		System.out.println("appearance=" + dog.appearance);
		System.out.println("energy=" + dog.energy);

		sleep(dog);

		System.out.println("appearance=" + dog.appearance);
		System.out.println("energy=" + dog.energy);

		//SpringApplication.run(PetstoreApplication.class, args);
	}

	public static void speak(Pet pet){
		System.out.println("pet is speaking");

		if("Dog".equals(pet.type))
			System.out.println("멍멍");
		else if("Cat".equals(pet.type))
			System.out.println("야옹");
		else
			System.out.println("소리낼줄 모릅니다");
	}


	public static void eat(Pet pet){
		System.out.println("pet is eating");

		if("Dog".equals(pet.type)){
			pet.energy = pet.energy + 2;
			speak(pet);	
		}
		else if("Cat".equals(pet.type))
			pet.energy = pet.energy + 1;
	}

	public static void sleep(Pet pet){
		System.out.println("pet is sleeping");
		if("Dog".equals(pet.type)){
			pet.energy = pet.energy + 1;
		}else if("Cat".equals(pet.type)){
			pet.appearance = pet.appearance + 1;
			pet.energy = pet.energy + 1;
		}

	}

}
