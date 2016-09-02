/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datex.configuracion;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Web application lifecycle listener.
 *
 * @author roger
 */
@WebListener()
public class DMAINServletListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Iniciando servletcontext");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Parando servletcontext");
    }
}
