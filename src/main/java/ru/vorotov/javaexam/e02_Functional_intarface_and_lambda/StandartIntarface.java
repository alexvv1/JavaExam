package ru.vorotov.javaexam.e02_Functional_intarface_and_lambda;

import java.util.function.BiFunction;
import java.util.function.DoubleConsumer;
import java.util.function.IntFunction;
import java.util.function.Supplier;

public class StandartIntarface {

    Supplier


    IntFunction<String> i = (int value) -> "2";
    BiFunction<String, Integer, String> biF = (String s, Integer integer) -> "sss";
    DoubleConsumer dc = (double value) -> {};


}
