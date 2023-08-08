package com.lsx3.shiren2.analyzer.enums;

import java.util.Arrays;
import java.util.function.Function;

public class EnumReverseLookup<E extends Enum<E>, ATTR> {

    private final Class<E> enumClass;
    private final Function<E, ATTR> getter;

    public EnumReverseLookup(final Class<E> enumClass, final Function<E, ATTR> getter) {
        this.enumClass = enumClass;
        this.getter = getter;
    }

    public E lookup(ATTR attribute) {
        return Arrays
                .stream(enumClass.getEnumConstants())
                .filter(e -> getter.apply(e).equals(attribute))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException());
    }
}
