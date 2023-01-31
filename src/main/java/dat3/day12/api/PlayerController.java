package dat3.day12.api;

import dat3.day12.entity.Player;
import dat3.day12.repository.PlayerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/players")
public class PlayerController {


  PlayerRepository playerRepository;


  public PlayerController(PlayerRepository playerRepository) {
    this.playerRepository = playerRepository;
  }


  @GetMapping
  Iterable<Player> getPlayers() {
    var players =  playerRepository.findAll();
    return players;
  }
}

