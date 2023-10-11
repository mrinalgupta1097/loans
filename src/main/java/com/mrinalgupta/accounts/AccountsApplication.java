package com.mrinalgupta.accounts;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/** The type Accounts application. */
@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
    info =
        @Info(
            title = "Accounts Microservice REST API Documentation",
            description = "Bank Accounts microservice REST API Documentaion",
            version = "v1",
            contact = @Contact(name = "mrinal gupta", email = "mrinalgupta1097@gmail.com"),
            license = @License(name = "APACHE 2.0")))
public class AccountsApplication {

  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {
    SpringApplication.run(AccountsApplication.class, args);
  }
}
