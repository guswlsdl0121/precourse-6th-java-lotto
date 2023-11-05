package lotto.util.validator;

import lotto.constant.InputMessage;

public class AmountValidator implements InputValidator<Integer> {
    private static final int A_LOTTO_PRICE = 1000;
    private static final int NO_REMAINDER = 0;

    @Override
    public void validate(Integer amount) {
        validateIsPositive(amount);
        validateIsMultipleOfThousand(amount);
    }

    private void validateIsPositive(Integer amount) {
        if (amount < A_LOTTO_PRICE) {
            throw new IllegalArgumentException(InputMessage.ERROR_AMOUNT_SMALL_THAN_THOUSAND);
        }
    }

    private void validateIsMultipleOfThousand(Integer amount) {
        if (amount % A_LOTTO_PRICE != NO_REMAINDER) {
            throw new IllegalArgumentException(InputMessage.ERROR_AMOUNT_NOT_MULTIPLE_OF_THOUSAND);
        }
    }
}