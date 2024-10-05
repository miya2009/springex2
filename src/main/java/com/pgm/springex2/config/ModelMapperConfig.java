package com.pgm.springex2.config;

import org.modelmapper.ModelMapper;
import org.modelmapper.config.Configuration;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.spi.MatchingStrategy;

public class ModelMapperConfig {
    public ModelMapper getMapper(){
        ModelMapper modelMapper=new ModelMapper();
        modelMapper.getConfiguration()
                .setFieldMatchingEnabled(true)
                .setFieldAccessLevel(Configuration.AccessLevel.PRIVATE)
                .setMatchingStrategy(MatchingStrategies.LOOSE);
        return modelMapper;
    }
}
