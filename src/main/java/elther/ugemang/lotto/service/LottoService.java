package elther.ugemang.lotto.service;

import elther.ugemang.lotto.domain.Game;
import elther.ugemang.lotto.domain.Lotto;
import elther.ugemang.lotto.domain.NumberBox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class LottoService {

    public NumberBox initNumberBox(int count) {
        NumberBox box = new NumberBox();
        List<Integer> numbers = new ArrayList<>();
        for(int i=0; i < count; i++) {
            numbers.add(i+1);
        }
        box.setBox(numbers);
        return box;
    }

    public Lotto play(int gameCount){
        Lotto lotto = new Lotto();
        for(int i=0;i<gameCount;i++) {
            NumberBox numberBox = this.initNumberBox(45);
            Game game = new Game();
            for (int j = 0; j < 6; j++) {
                int index = (int) (Math.random() * numberBox.getBox().size());
                game.getPickedNumbers().add((numberBox.getBox().remove(index)));
            }
            game.getPickedNumbers().sort(Comparator.naturalOrder());
            lotto.getGame().add(game);
        }
        return lotto;
    }
}
