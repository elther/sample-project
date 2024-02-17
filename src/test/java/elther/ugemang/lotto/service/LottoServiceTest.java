package elther.ugemang.lotto.service;

import elther.ugemang.lotto.domain.Game;
import elther.ugemang.lotto.domain.NumberBox;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Comparator;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
public class LottoServiceTest {

    @Autowired
    private LottoService lottoService;

    @Test
    void lottoBoxInitTest(){
        NumberBox box = lottoService.initNumberBox(45);
        List<Integer> box1 = box.getBox();

        assertThat(box1.size()).isEqualTo(45);
        assertThat(box1.get(box1.size()-1)).isEqualTo(45);
    }

    @Test
    void playOneGameTest(){
        NumberBox numberBox = lottoService.initNumberBox(45);
        Game game = new Game();
        for(int i=0;i<6;i++) {
            int index = (int) (Math.random() * numberBox.getBox().size());
            game.getPickedNumber().add((numberBox.getBox().remove(index)));
        }
        game.getPickedNumber().sort(Comparator.naturalOrder());
        System.out.println(game.getPickedNumber().toString());
    }

    @Test
    void playFiveGameTest(){
        for(int i=0;i<5;i++) {
            NumberBox numberBox = lottoService.initNumberBox(45);
            Game game = new Game();
            for (int j = 0; j < 6; j++) {
                int index = (int) (Math.random() * numberBox.getBox().size());
                game.getPickedNumber().add((numberBox.getBox().remove(index)));
            }
            game.getPickedNumber().sort(Comparator.naturalOrder());
            System.out.println(game.getPickedNumber().toString());
        }
    }
}
