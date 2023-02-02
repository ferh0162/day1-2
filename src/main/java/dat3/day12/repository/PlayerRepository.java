package dat3.day12.repository;

import dat3.day12.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PlayerRepository extends JpaRepository<Player,Integer> {
  Player findPlayerByName(String name);

}

