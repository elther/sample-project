package elther.ugemang.lotto.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Game {
    List<Integer> pickedNumbers = new ArrayList<>();
}
