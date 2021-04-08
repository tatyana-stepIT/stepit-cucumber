package com.step_it.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Color {
    RED("red"),
    BLUE("blues"),
    YELLOW("yellow");

    private final String color;

}
