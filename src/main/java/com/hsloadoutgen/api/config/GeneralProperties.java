package com.hsloadoutgen.api.config;

import org.apache.commons.io.IOUtils;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

@Configuration
@ConfigurationProperties("hs-loadout-gen")
public class GeneralProperties {

    private String itemsPath;

    public String getItemsPath() {
        return itemsPath;
    }

    public void setItemsPath(String path) {
        itemsPath = path;
    }

    @Bean
    public ItemsConfig getItemsConfig() {
        ItemsConfig itemsConfig = new ItemsConfig();
        try {
            FileInputStream inputStream = new FileInputStream(itemsPath);
            itemsConfig.setItemsXMLString(IOUtils.toString(inputStream));
        } catch (FileNotFoundException e) {

        } catch (IOException e1) {

        } catch (Exception e2) {

        }
        return itemsConfig;
    }

}
