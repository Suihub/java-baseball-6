package baseball.controller;

import baseball.domain.Ball;
import baseball.view.GameOutput;
import baseball.view.UserInput;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.LinkedHashSet;
import java.util.Set;

public class GameController {
    private final Set<BallDto> computer = new LinkedHashSet<>();
    private final GameOutput output = new GameOutput();
    private final UserInput input = new UserInput();

    public void start(){
        while (computer.size() < 3){
            Ball ball = new Ball(Randoms.pickNumberInRange(1, 9));
            computer.add(new BallDto(ball.getNumber()));
        }
        output.printGameStart();
        input.inputUserNumber();
    }

    public Set<BallDto> getComputer() {
        return computer;
    }
}
