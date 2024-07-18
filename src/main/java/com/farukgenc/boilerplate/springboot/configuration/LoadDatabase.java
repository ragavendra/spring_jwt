package payroll;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.farukgenc.boilerplate.springboot.model.User;
import com.farukgenc.boilerplate.springboot.model.UserRole;
import com.farukgenc.boilerplate.springboot.repository.UserRepository;

@Configuration
class LoadDatabase {

  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

  @Bean
  CommandLineRunner initDatabase(UserRepository repository) {

    return args -> {
      log.info("Preloading " + repository.save(new User("Bilbo Baggins", "burglar", "passwd", "bilbo@email.com", UserRole.USER )));
      log.info("Preloading " + repository.save(new User("Frodo Baggins", "thief", "passwd", "frodoo@email.com", UserRole.USER )));
    };
  }
}
