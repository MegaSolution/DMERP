package com.datex;

import com.datex.configuracion.ServletDespachador;
import javax.servlet.Servlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class DmainApplication implements CommandLineRunner{
    
    @Autowired
    JdbcTemplate data;

    @SuppressWarnings("serial")
    @Bean
    public Servlet dispatcherServlet() {
        return new ServletDespachador();
    }

    public static void main(String[] args) {
        SpringApplication.run(DmainApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        StringBuffer sql = new StringBuffer();
        sql.append("CREATE TABLE IF NOT EXISTS tablas(");
        sql.append("id serial primary key,");
        sql.append("nombre varchar(50));");
        data.execute(sql.toString());
    }
}
