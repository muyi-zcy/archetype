#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.web.config;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * description: AppConfig
 * date: 2021/10/12 23:33
 * author: muyi
 * version: 1.0
 */

@SpringBootApplication(scanBasePackages = "${package}.*")
@MapperScan("${package}.core.dao")
@NacosPropertySource(dataId = "${parentArtifactId}",groupId = "${parentArtifactId}-dev", autoRefreshed = true,type = ConfigType.YAML)
public class AppConfig {
    public static void main(String[] args) {
        SpringApplication.run(AppConfig.class);
    }
}
