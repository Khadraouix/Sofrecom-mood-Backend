package mood.sof.humeur.service;

import mood.sof.humeur.model.User;

public interface UserService {
    User findBymatricule(String matricule);
    void add(User user);
}
