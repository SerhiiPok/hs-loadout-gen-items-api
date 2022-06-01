package com.hsloadoutgen.api;

import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;

public class Testicle {

    @Test
    public void test() {
        try {
            FileInputStream inputStream = new FileInputStream("E:/Programs/hs-loadout-gen-api/items/items.xml");
            String result = IOUtils.toString(inputStream);
            String chck = "chck";
            String chsk = "chsk";
        } catch (Exception e) {

        }
    }
}
