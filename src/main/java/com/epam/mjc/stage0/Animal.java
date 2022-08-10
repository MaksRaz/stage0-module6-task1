package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;
    public Animal(String color, int numberOfPaws, boolean hafFur){
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hafFur;
    }

    public String getDescription(){
        if (hasFur){
            if (this.numberOfPaws > 1){
                return String.format("This animal is mostly %s. It has %s paws and a fur.", this.color, this.numberOfPaws);
            }
            else{
                return String.format("This animal is mostly %s. It has %s paw and a fur.", this.color, this.numberOfPaws);
            }
        }
        else {
            if (this.numberOfPaws > 1){
                return String.format("This animal is mostly %s. It has %s paws and no fur.", this.color, this.numberOfPaws);
            }
            else {
                return String.format("This animal is mostly %s. It has %s paw and no fur.", this.color, this.numberOfPaws);
            }
        }

    }

}
