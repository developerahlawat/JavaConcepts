package com.javaconcept.java25;

import module java.base;
import module java.sql;

import java.sql.Date;

public class ModuleImport {
    public static void main(String[] args) {
        Date d = Date.valueOf("2025-06-15");
        System.out.println("Resolved Date: " + d);
    }
}