package org.codecraftlabs.training;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OptionalTest {
    @Test
    public void whenCreatesEmptyOptional_thenCorrect() {
        Optional<String> empty = Optional.empty();
        assertFalse(empty.isPresent());
    }

    @Test
    public void givenNonNull_whenCreatesNonNullable_thenCorrect() {
        String name = "test";
        Optional<String> opt = Optional.of(name);
        assertTrue(opt.isPresent());
    }

    @Test
    public void givenNull_whenThrowsErrorOnCreate_thenCorrect() {
        String name = null;
        Assertions.assertThrows(NullPointerException.class, () -> Optional.of(name));
    }

    @Test
    public void givenNonNull_whenCreatesNullable_thenCorrect() {
        var name = "some value";
        var opt = Optional.ofNullable(name);
        assertTrue(opt.isPresent());
    }

    @Test
    public void givenNull_whenCreatesNullable_thenCorrect() {
        String name = null;
        var optional = Optional.ofNullable(name);
        assertFalse(optional.isPresent());
    }

    @Test
    public void givenOptional_whenIsPresentWorks_thenCorrect() {
        var optional = Optional.of("value");
        assertTrue(optional.isPresent());

        optional = Optional.ofNullable(null);
        assertFalse(optional.isPresent());
    }
}
