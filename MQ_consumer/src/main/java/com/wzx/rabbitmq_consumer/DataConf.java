package com.wzx.rabbitmq_consumer;
import org.apache.commons.dbcp2.BasicDataSource;


public class DataConf {
  private static BasicDataSource dataSource = new BasicDataSource();

  private static void init() {
    dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
    dataSource.setUrl("");

    dataSource.setUsername("someusername");
    dataSource.setPassword("somepassword");

    dataSource.setInitialSize(15);
    dataSource.setMaxTotal(45);
    dataSource.setMaxIdle(30);
    dataSource.setMinIdle(15);
    dataSource.setMaxWaitMillis(30000);
  }

  static{
    init();
  }

  public static BasicDataSource getDataSource(){
    return dataSource;
  }
}





