package pl.patrykpora.qgame;

import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import pl.patrykpora.qgame.entity.Player;
import pl.patrykpora.qgame.repository.PlayerRepository;


@Component
@Log
public class StartQGameRunner implements CommandLineRunner {

    @Autowired
    private PlayerRepository playerRepository;

    @Override
    public void run(String... args) throws Exception {

        playerRepository.save(new Player("patryk"));
        playerRepository.save(new Player("ania"));
        playerRepository.save(new Player("arti"));
        playerRepository.save(new Player("jula"));



    }
}
