package com.esafzay.font;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Font {

    public static final Map<String, List<String>> map = new HashMap<>();

    static {
        map.put("A", Arrays.asList("0110", "1001", "1111", "1001", "1001"));
        map.put("B", Arrays.asList("1110", "1001", "1110", "1001", "1110"));
        map.put("C", Arrays.asList("0110", "1001", "1000", "1001", "0110"));
        map.put("D", Arrays.asList("1110", "1001", "1001", "1001", "1110"));
        map.put("E", Arrays.asList("1111", "1000", "1110", "1000", "1111"));
        map.put("F", Arrays.asList("1111", "1000", "1110", "1000", "1000"));
        map.put("G", Arrays.asList("0111", "1000", "1011", "1001", "0110"));
        map.put("H", Arrays.asList("1001", "1001", "1111", "1001", "1001"));
        map.put("I", Arrays.asList("1", "1", "1", "1", "1"));
        map.put("J", Arrays.asList("1111", "0010", "0010", "1010", "0100"));
        map.put("K", Arrays.asList("1001", "1010", "1100", "1010", "1001"));
        map.put("L", Arrays.asList("100", "100", "100", "100", "111"));
        map.put("M", Arrays.asList("10001", "11011", "10101", "10001", "10001"));
        map.put("N", Arrays.asList("1001", "1101", "1011", "1001", "1001"));
        map.put("O", Arrays.asList("0110", "1001", "1001", "1001", "0110"));
        map.put("P", Arrays.asList("1110", "1001", "1110", "1000", "1000"));
        map.put("Q", Arrays.asList("0110", "1001", "1001", "1101", "0111"));
        map.put("R", Arrays.asList("1110", "1001", "1110", "1010", "1001"));
        map.put("S", Arrays.asList("0111", "1000", "0110", "0001", "1110"));
        map.put("T", Arrays.asList("111", "010", "010", "010", "010"));
        map.put("U", Arrays.asList("1001", "1001", "1001", "1001", "0110"));
        map.put("V", Arrays.asList("1001", "1001", "1001", "0110", "0100"));
        map.put("W", Arrays.asList("10001", "10101", "10101", "11011", "10001"));
        map.put("X", Arrays.asList("10001", "01010", "00100", "01010", "10001"));
        map.put("Y", Arrays.asList("10001", "01010", "00100", "00100", "00100"));
        map.put("Z", Arrays.asList("1111", "0001", "0110", "1000", "1111"));
        map.put("1", Arrays.asList("010", "110", "010", "010", "111"));
        map.put("2", Arrays.asList("0110", "1001", "0010", "0100", "1111"));
        map.put("3", Arrays.asList("1110", "0001", "0110", "0001", "1110"));
        map.put("4", Arrays.asList("1001", "1001", "1111", "0001", "0001"));
        map.put("5", Arrays.asList("1111", "1000", "0110", "0001", "1110"));
        map.put("6", Arrays.asList("0110", "1000", "1110", "1001", "0110"));
        map.put("7", Arrays.asList("1111", "0001", "0010", "0100", "0100"));
        map.put("8", Arrays.asList("0110", "1001", "0110", "1001", "0110"));
        map.put("9", Arrays.asList("0110", "1001", "0111", "0001", "0110"));
        map.put("0", Arrays.asList("0110", "1001", "1001", "1001", "0110"));
        map.put("space", Arrays.asList("0", "0", "0", "0", "0"));
    }
}
