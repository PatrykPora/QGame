package pl.patrykpora.qgame.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.patrykpora.qgame.entity.Player;

public interface PlayerRepository extends JpaRepository<Player, Long> {


}
