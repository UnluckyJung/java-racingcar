package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class TryCountTest {

    @Test
    @DisplayName("시도 횟수가 영어 일때")
    public void tryCount_영어() {
        assertThatThrownBy(() -> {
            TryCount tryCount = new TryCount("abc");
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("시도 횟수가 음수 일때")
    public void tryCount_음수() {
        assertThatThrownBy(() -> {
            TryCount tryCount = new TryCount("-1");
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
