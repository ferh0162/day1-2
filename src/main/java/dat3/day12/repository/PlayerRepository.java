package dat3.day12.repository;

import dat3.day12.entity.Player;
import org.springframework.data.repository.CrudRepository;

public interface PlayerRepository extends CrudRepository<Player,Integer> {

}

