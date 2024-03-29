package structuralPattern.facade;

import structuralPattern.facade.alchemy_library.*;
import structuralPattern.facade.facad.PotionConversionFacade;


import static structuralPattern.facade.alchemy_library.Type.MANA;
import static structuralPattern.facade.alchemy_library.Type.STAMINA;

/* 
Алхимическая библиотека
*/

public class Solution {

    public static String potionName = "Minor Healing Potion";
    public static String type = "stamina";

    public static void main(String[] args) {
        PotionConversionFacade potionConversionFacade = new
                PotionConversionFacade();

        System.out.println(potionConversionFacade.convertPotion(potionName,type));
       /* System.out.println("Client Code: conversion started.");
        Potion potion = new Potion(potionName);
        Type type = Type.valueOf(Solution.type.toUpperCase());
        Essence sourceEssence = EssenceFactory.extract(potion);
        Essence destinationEssence;
        if (type == MANA) {
            destinationEssence = new ManaEssenceConverter();
        } else if (type == STAMINA) {
            destinationEssence = new StaminaEssenceConverter();
        } else {
            destinationEssence = new HealingEssenceConverter();
        }
        Potion portion = Extractor.extractPortion(potion, sourceEssence);
        Potion intermediateResult = Extractor.convert(portion, destinationEssence);
        Potion result = new Finalizator().fix(intermediateResult);
        System.out.println("Client Code: conversion completed.");

        System.out.println(result.getName());*/
    }
}
