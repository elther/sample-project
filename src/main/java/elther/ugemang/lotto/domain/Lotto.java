package elther.ugemang.lotto.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Lotto {
    int totalCount;
    List<Game> game = new ArrayList<>();

    public Integer getTotalCount(){
        return game.size();
    }
}
