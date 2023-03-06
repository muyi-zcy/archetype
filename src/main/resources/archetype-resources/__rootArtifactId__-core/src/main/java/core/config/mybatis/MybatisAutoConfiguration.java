#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.core.config.mybatis;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: muyi
 * @date: 2023/3/6
 **/
@Configuration
public class MybatisAutoConfiguration {
    @Bean
    public MetaObjectHandler defaultMetaObjectHandler() {
        return new DefaultFieldHandler();
    }
}
