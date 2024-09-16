package be.swsb.kata.bootstrap;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HelloTest {

    @Test
    void greet_ReturnsHelloWorld() {
        assertThat(new Hello().greet()).isEqualTo("Hello, world!");
    }
}
