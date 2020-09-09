//package com.worserole.shope_springboot.config;
//
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.SqlSessionTemplate;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
//import org.springframework.core.io.support.ResourcePatternResolver;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//import org.springframework.transaction.TransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//import org.springframework.transaction.annotation.TransactionManagementConfigurer;
//
//import javax.sql.DataSource;
//
//@Configuration
//@EnableTransactionManagement
//public class MybatisSpringConfig implements TransactionManagementConfigurer {
//
//    @Autowired
//    private DataSource dataSource;
//
//    /*
//     * 在spring中注册SqlSessionFactory, 在这里可以设置参数：
//     *      1. 设置分页参数
//     *      2. 配置Mybatis运行时参数
//     *      3. 注册 XML 映射器
//     */
//    public SqlSessionFactory sqlSessionFactory() {
//        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
//        //设置数据源
//        sqlSessionFactoryBean.setDataSource(dataSource);
//
//        //配置mybatis运行时参数
//        org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
//        //自动将数据库中的下划线转换为驼峰格式
//        configuration.setMapUnderscoreToCamelCase(true);
//        configuration.setDefaultFetchSize(100);
//        configuration.setDefaultStatementTimeout(30);
//
//        sqlSessionFactoryBean.setConfiguration(configuration);
//
//        //在构建 SqlSessionFactory时注册 XML 注册器
//        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
//
//        try {
//            sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:mapper/*.xml"));
//            return sqlSessionFactoryBean.getObject();
//        } catch (Exception e) {
//            e.printStackTrace();
//            throw new RuntimeException();
//        }
//    }
//
//    @Bean(value = "sqlSession")
//    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
//        return new SqlSessionTemplate(sqlSessionFactory);
//    }
//
//
//    //Spring事务管理器
//    @Bean(value = "transactionManager")
//    @Override
//    public TransactionManager annotationDrivenTransactionManager() {
//        return new DataSourceTransactionManager(dataSource);
//    }
//}
