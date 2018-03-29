package com.jack.rest.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//@EnableWebMvc
@Configuration
public class WebConfig {

	private final Logger log = LoggerFactory.getLogger(WebConfig.class);
//
//
//	 @Override
//	  public void addResourceHandlers(ResourceHandlerRegistry registry) {
//	    registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
//	  }
//
//   @Override
//   public void addViewControllers(ViewControllerRegistry registry) {
//	   log.debug("add view controllers");
//       registry.addViewController("/test").setViewName("redirect:/ver/top");
//   }
//
//    public void addInterceptors(InterceptorRegistry registry) {
////        registry.addInterceptor(new CommonIntercepter()).addPathPatterns("/**");
//    }
//

//    @Bean
//    public ErrorPageFilter errorPageFilter() {
//        return new ErrorPageFilter();
//    }
//
//    @Bean
//    public FilterRegistrationBean disableSpringBootErrorFilter(ErrorPageFilter filter) {
//        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
//        filterRegistrationBean.setFilter(filter);
//        filterRegistrationBean.setEnabled(false);
//        return filterRegistrationBean;
//    }

}

