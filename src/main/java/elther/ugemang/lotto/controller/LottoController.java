package elther.ugemang.lotto.controller;

import elther.ugemang.lotto.domain.Lotto;
import elther.ugemang.lotto.service.LottoService;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/lotto")
public class LottoController {
    private final LottoService lottoService;
    public LottoController(LottoService lottoService) {
        this.lottoService = lottoService;
    }
    @GetMapping({"play", "/play/{gameCount}"})
    public Lotto play(@PathVariable Optional<Integer> gameCount){
        if(gameCount.isPresent())
            return lottoService.play(gameCount.get());

        return lottoService.play(1);
    }
}
