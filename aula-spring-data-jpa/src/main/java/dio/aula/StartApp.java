package dio.aula;

import dio.aula.model.User;
import dio.aula.model.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("Renato");
        user.setUsername("nato");
        user.setPassword("dio123");

        repository.save(user);

        for (User u : repository.findAll()){
            System.out.println(u);
        }
    }
}
