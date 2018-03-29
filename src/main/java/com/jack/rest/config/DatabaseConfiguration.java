package com.jack.rest.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;


@Configuration
@EnableTransactionManagement
@SuppressWarnings("all")
public class DatabaseConfiguration {

    @Bean(destroyMethod = "shutdown")
    @Qualifier("datasource")
    @Primary
    public DataSource datasource() {
        HikariConfig config = new HikariConfig();
        config.setDriverClassName("com.mysql.jdbc.Driver");
        config.setJdbcUrl("jdbc:mysql://localhost:3306/community");
        config.setUsername( "root");
        config.setPassword("password");
//        config.setMaximumPoolSize(Integer.valueOf(Global.getConfigCfg("cfg:jdbc.maximumPoolSize", "10")));
//        config.addDataSourceProperty("cachePrepStmts", Global.getConfigCfg("cfg:jdbc.cachePrepStmts", "true"));
//        config.addDataSourceProperty("prepStmtCacheSize", Global.getConfigCfg("cfg:jdbc.prepStmtCacheSize", "250"));
//        config.addDataSourceProperty("prepStmtCacheSqlLimit", Global.getConfigCfg("cfg:jdbc.prepStmtCacheSqlLimit", "2048"));
//        config.addDataSourceProperty("useServerPrepStmts", Global.getConfigCfg("cfg:jdbc.useServerPrepStmts", "true"));
        return new HikariDataSource(config);
    }

}
