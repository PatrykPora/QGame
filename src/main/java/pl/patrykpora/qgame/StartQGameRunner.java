package pl.patrykpora.qgame;

import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.patrykpora.qgame.entity.Player;

@Component
@Log
public class StartQGameRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        log.info("started executing....");

        Player player = new Player("patryk");
        log.info("Created player data = " + player);
    }
}
