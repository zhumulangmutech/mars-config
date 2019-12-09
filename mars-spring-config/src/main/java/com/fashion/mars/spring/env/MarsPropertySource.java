package com.fashion.mars.spring.env;

import com.fashion.mars.spring.config.MarsDataConfig;
import lombok.Data;
import org.springframework.core.env.PropertiesPropertySource;

import java.util.Properties;

/**
 * @author fashionbrot
 * @version 0.1.0
 * @date 2019/12/8 22:45
 */
@Data
public class MarsPropertySource extends PropertiesPropertySource {

    private MarsDataConfig marsDataConfig;

    public MarsPropertySource( String name, Properties source ,MarsDataConfig marsDataConfig) {
        super(name, source);
        this.marsDataConfig =  marsDataConfig;
    }

}
