package com.bttf.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

import org.springframework.stereotype.Service;

/**
author : Wassim MNASSER
*/
@Service
public class DVDServiceImpl implements DVDService {

	 /**
     * Calcul de prix total selon les DVDs.
     * @param dvdContent Contenu de DVD.
     * @return Prix total des DVDs.
     */
    public int calculateTotalPrice(String dvdContent) {
        int totalPrice = 0;
        int priceWithoutDiscount = 0;
        boolean containsNonDiscounted = false;

        // copier le contenu dans une liste
        List<String> itemsList = new ArrayList<>(Arrays.asList(dvdContent.split("\n")));

        // analyser le contenu
        for (String item : itemsList) {
            String itemName = item.trim();
            int itemPrice = getItemPrice(itemName);
            totalPrice += itemPrice;
            if (itemName.startsWith("Back to the Future")) {
                priceWithoutDiscount += itemPrice;
            } else {
                containsNonDiscounted = true;
            }
        }

        // appliquer la réduction sur "Back to the Future" films
        int uniqueCount = getUniqueItemCount(itemsList);
        if (uniqueCount == 2) {
            totalPrice = (int) (priceWithoutDiscount * 0.9);
        } else if (uniqueCount == 3) {
            totalPrice = (int) (priceWithoutDiscount * 0.8);
        }

        //S'il y a des articles sans réduction, ajouter leur prix sans aucune remise
        if (containsNonDiscounted) {
            totalPrice += 20; // Prix de l'article non réduit
        }

        return totalPrice;
    }

    /**
     * Gets the price of a specific DVD.
     * @param itemName The name of the DVD.
     * @return The price of the DVD.
     */
    private int getItemPrice(String itemName) {
        if (itemName.startsWith("Back to the Future")) {
            return 15;
        } else {
            return 20; // Prix par défaut pour les autres films
        }
    }

    /**
     * Obtient le nombre de DVD uniques "Back to the future" dans le panier.
     * @param  La liste des articles dans le panier.
     * @return Le nombre de DVD uniques "Back to the Future".
     */
    private int getUniqueItemCount(List<String> items) {
        Set<String> uniqueItems = new HashSet<>();
        for (String item : items) {
            if (item.startsWith("Back to the Future")) {
                uniqueItems.add(item);
            }
        }
        return uniqueItems.size();
    }
}
