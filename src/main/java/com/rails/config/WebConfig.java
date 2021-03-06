package com.rails.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.
	DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.
	WebMvcConfigurerAdapter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesView;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages={"com.rails.web","com.rails.data"})
public class WebConfig extends WebMvcConfigurerAdapter{
	
//	@Bean	
//	public ViewResolver viewResolver(){
//		InternalResourceViewResolver resolver =
//			new InternalResourceViewResolver();
//		
//		resolver.setPrefix("/WEB-INF/views/");
//		resolver.setSuffix(".jsp");
//                //This attaches the java standard templating language
//                resolver.setViewClass(org.springframework.web.servlet.view.JstlView.class);
//		resolver.setExposeContextBeansAsAttributes(true);
//		return resolver;
//	}
        
        
        @Bean
        public ViewResolver viewResolver(){
            return new TilesViewResolver();
        }
        
        @Bean
        public TilesConfigurer tilesConfigurer(){
            TilesConfigurer tiles = new TilesConfigurer();
            tiles.setDefinitions(new String[]{"/WEB-INF/layout/tiles.xml"});
            tiles.setCheckRefresh(true);
            return tiles;
        }
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer
			configurer){
		configurer.enable();	
	}
	
}
