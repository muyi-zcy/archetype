#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.web.config;

import com.alibaba.nacos.api.config.ConfigType;
import com.alibaba.nacos.api.config.annotation.NacosConfigurationProperties;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * description: AppConfig
 * date: 2021/10/12 23:33
 * author: muyi
 * version: 1.0
 */

@SpringBootApplication(scanBasePackages = "${package}.*")
@EnableDubbo(scanBasePackages = "${package}.*")
@MapperScan("${package}.core.dao")
@NacosConfigurationProperties(dataId = "${parentArtifactId}",groupId = "${parentArtifactId}", autoRefreshed = true,type = ConfigType.YAML)
@EnableTransactionManagement
public class AppConfig {
    public static void main(String[] args) {
        SpringApplication.run(AppConfig.class, args);
    }
}
