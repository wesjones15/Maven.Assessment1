package com.zipcodewilmington.assessment1.part3;

import com.zipcodewilmington.assessment1.part1.IntegerArrayUtils;
import com.zipcodewilmington.assessment1.part2.ArrayUtils;

import java.util.ArrayList;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    public Pet[] pets;
    private String name;
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {
        this.pets = pets;
        this.name = name;
        if (pets != null) {
            for (Pet pet : pets) {
                pet.setOwner(this);
            }
        }
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        Integer newArraySize;
        if (pets != null){
            newArraySize = pets.length + 1;
        } else {
            newArraySize = 1;
        }
        Pet[] newArray = new Pet[newArraySize];

        for (int i = 0; i < newArraySize-1; i++) {
            newArray[i] = pets[i];
        }
        newArray[newArray.length-1] = pet;
        pets = newArray;
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        Integer newArraySize;
        if (pets != null && pets.length > 1) {
            newArraySize = pets.length - 1;
        } else {
            newArraySize = 1;
        }

        Pet[] newArray = new Pet[newArraySize];
        int idx = 0;
        for (int i = 0; i < newArraySize; i++) {
            if (!pets[i].equals(pet)) {
                newArray[idx] = pets[i];
                idx += 1;
            }
        }

        pets = newArray;
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        boolean isOwner = false;
        for (Pet existingPet : this.pets) {
            if (existingPet.equals(pet)) {
                isOwner = true;
            }
        }
        return isOwner;
    }

    public Integer[] getPetAgesArray() {
        Integer[] petAges = new Integer[pets.length];
        for (int i = 0; i < pets.length; i++) {
            petAges[i] = pets[i].getAge();
        }
        return petAges;
    }
    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        Integer[] petAges = getPetAgesArray();
        Integer youngestPetAge = Integer.MAX_VALUE;
        for (Integer age: petAges) {
            if (age < youngestPetAge) {
                youngestPetAge = age;
            }
        }
        return youngestPetAge;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        Integer[] petAges = getPetAgesArray();
        Integer oldestPetAge = 0;
        for (Integer age: petAges) {
            if (age > oldestPetAge) {
                oldestPetAge = age;
            }
        }
        return oldestPetAge;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        Integer[] petAges = getPetAgesArray();
        return Float.valueOf(Double.toString(IntegerArrayUtils.getAverage(petAges)));
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return this.pets.length;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        return this.pets;
    }
}
