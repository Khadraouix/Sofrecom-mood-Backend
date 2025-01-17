package mood.sof.humeur.service;

import mood.sof.humeur.Exeption.UserNotFoundException;
import mood.sof.humeur.model.User;
import mood.sof.humeur.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public User findBymatricule(String matricule) {
        // Implement the logic to fetch the user by matricule and password
        return this.userRepository.findBymatricule(matricule)
                .orElseThrow(()->new UserNotFoundException("User with ID "+matricule+" was not found" ));
    }

    @Override
    public void add(User user) {

        userRepository.save(user);

    }
    // You can implement other service methods here

}