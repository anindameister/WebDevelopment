package fr.telecom_st_etienne.fx.series.configuration;

import java.util.Properties;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
public class SeriesConfiguration implements WebMvcConfigurer {

	public void addResourceHandlers(final ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/style/**").addResourceLocations("/style/");
		registry.addResourceHandler("/images/**").addResourceLocations("/images/");
	}
	
	@Bean
	public EmbeddedServletContainerFactory servletContainer() {
		TomcatEmbeddedServletContainerFactory factory = new TomcatEmbeddedServletContainerFactory();
		factory.setPort(8180);
		return factory;
	}

	// Source de données (DATA TIER)
	// A noter: il faut un driver JDBC dans le projet Maven
	// Le Database Admin va nous fournir les accès à la source de données
	@Bean(name = "dataSource")
	@Scope("singleton")
	public DataSource getDataSource() {
		DataSource dataSource = new DataSource();
		dataSource.setUsername("root");
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/series");
		dataSource.setValidationQuery("SELECT 1");
		dataSource.setValidationInterval(34000);
		dataSource.setTestOnBorrow(true);
		return dataSource;
	}

	@Bean("entityManagerFactory")
	public LocalContainerEntityManagerFactoryBean getEntityManagerFactoryBean() {
		LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean();
		entityManagerFactoryBean.setDataSource(getDataSource());
		entityManagerFactoryBean.setPersistenceUnitName("entityManagerFactory");
		entityManagerFactoryBean.setPackagesToScan("fr.telecom_st_etienne.fx.series.business");
		Properties jpaProperties = new Properties();
		jpaProperties.put("hibernate.hbm2ddl.auto", "update");
		jpaProperties.put("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		entityManagerFactoryBean.setJpaProperties(jpaProperties);
		
		JpaVendorAdapter jpaVendorAdapter = new HibernateJpaVendorAdapter();
		entityManagerFactoryBean.setJpaVendorAdapter(jpaVendorAdapter );
		return entityManagerFactoryBean;
	}
	
	@Bean("viewResolver")
	public ViewResolver getViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
	    resolver.setPrefix("");
	    resolver.setSuffix(".jsp");
	    resolver.setViewClass(org.springframework.web.servlet.view.JstlView.class);
		return resolver;
	}
	
	@Bean("transactionManager")
	public JpaTransactionManager getTransactionManager() {
		JpaTransactionManager jpaTransactionManager = new JpaTransactionManager();
		jpaTransactionManager.setEntityManagerFactory(getEntityManagerFactoryBean().getObject());
		return jpaTransactionManager;
	}
	
}