package com.luizcsdev.beerstock.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BeerType {

    LAGER("Lager"),
    MALZBIER("Malzbier"),
    WITBIER("Witbier"),
    WEISS("Weiss"),
    ALE("Ale"),
    TRIGO("Trigo"),
    IPA("Ipa"),
    STOUT("Stout");

    private final String description;
}
