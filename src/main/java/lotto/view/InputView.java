package lotto.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public static String readPurchaseAmount() {
        System.out.println("구입 금액을 입력해 주세요.");
        return Console.readLine();
    }
}
