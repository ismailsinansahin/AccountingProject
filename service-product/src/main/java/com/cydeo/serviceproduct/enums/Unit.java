package com.cydeo.serviceproduct.enums;

import lombok.Getter;

@Getter
public enum Unit {

        LIBRE("Libre"), GALON("Galon"), PIECES("Pieces"), KILOGRAM("Kilogram"),
        METER("Meter"), INCH("Inch"), FEET("Feet");

        private final String value;

        Unit(String value){
            this.value = value;
        }

        public String getValue(){
            return value;
        }

}
