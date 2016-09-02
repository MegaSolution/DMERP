package com.datex;

import com.datex.configuracion.DMAINServletListener;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(DmainApplication.class);
	}

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        servletContext.addListener(new DMAINServletListener());
        super.onStartup(servletContext);
    }
        
}
