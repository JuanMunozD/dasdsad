package edu.eci.ieti.gameover.repository;

import edu.eci.ieti.gameover.model.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BetRepository extends MongoRepository<Usuario,String> {
}
