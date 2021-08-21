package org.codecraftlabs.training;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.annotation.Nonnull;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
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

    @Test
    public void givenAnEmptyOptional_thenIsEmptyBehavesAsExpected() {
        var optional = Optional.of("value");
        assertFalse(optional.isEmpty());

        optional = Optional.ofNullable(null);
        assertTrue(optional.isEmpty());
    }

    @Test
    public void verifyIfPresentWithOptional() {
        var optional = Optional.of("value");
        optional.ifPresent(name -> System.out.println(name.length()));
    }

    @Test
    public void verifyOrElse() {
        String nullName = null;
        String name = Optional.ofNullable(nullName).orElse("test");
        assertEquals("test", name);
    }

    @Test
    public void orElseGet() {
        String nullName = null;
        String name = Optional.ofNullable(nullName).orElseGet(() -> "test");
        assertEquals("test", name);
    }

    @Test
    public void orElseAndOrElseGetOverlap() {
        String text = null;

        String defaultText = Optional.ofNullable(text).orElseGet(this::getDefaultValue);
        assertEquals("Default Value", defaultText);

        defaultText = Optional.ofNullable(text).orElse(getDefaultValue());
        assertEquals("Default Value", defaultText);
    }

    @Test
    public void orElseAndOrElseGetDifference() {
        String text = "Text present";

        System.out.println("Using orElseGet:");
        String defaultText = Optional.ofNullable(text).orElseGet(this::getDefaultValue);
        assertEquals("Text present", defaultText);

        System.out.println("Using orElse:");
        defaultText = Optional.ofNullable(text).orElse(getDefaultValue());
        assertEquals("Text present", defaultText);
    }

    private String getDefaultValue() {
        System.out.println("Getting default value");
        return "Default Value";
    }

    @Test
    public void orElseThrowTest() {
        String nullName = null;
        assertThrows(IllegalArgumentException.class,
                () -> Optional.ofNullable(nullName).orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void orElseThrowNoSuchElement() {
        String nullName = null;
        assertThrows(NoSuchElementException.class,
                () -> Optional.ofNullable(nullName).orElseThrow());
    }

    @Test
    public void getValueWithOptional() {
        var optional = Optional.of("test");
        String name = optional.get();
        assertEquals("test", name);
    }

    @Test
    public void getValueWithNullOptional() {
        var optional = Optional.ofNullable(null);
        assertThrows(NoSuchElementException.class, () -> optional.get());
    }

    @Test
    public void filter() {
        Integer year = 2016;
        var yearOptional = Optional.of(year);
        boolean isYear2016 = yearOptional.filter(value -> value == 2016).isPresent();
        assertTrue(isYear2016);

        boolean isMissingYear2017 = yearOptional.filter(value -> value == 2017).isEmpty();
        assertTrue(isMissingYear2017);
    }

    @Test
    public void filterWithOptional() {
        assertTrue(isPriceInRange(new Modem(10.0)));
        assertFalse(isPriceInRange(new Modem(9.9)));
        assertFalse(isPriceInRange(new Modem(null)));
        assertFalse(isPriceInRange(new Modem(15.5)));
        assertFalse(isPriceInRange(null));
    }

    private boolean isPriceInRange(@Nonnull Modem modem) {
        return Optional.ofNullable(modem).map(Modem::getPrice).filter(price -> price >= 10).filter(price -> price <= 15).isPresent();
    }

    @Test
    public void optionalWithMapScenario1() {
        List<String> companyNames = Arrays.asList("paypal", "oracle", "", "microsoft", "", "apple");
        Optional<List<String>> listOptional = Optional.of(companyNames);

        int size = listOptional.map(List::size).orElse(0);
        assertEquals(6, size);
    }

    @Test
    public void optionalWithMapScenario2() {
        var name = "test";
        var optional = Optional.of(name);

        int size = optional.map(String::length).orElse(0);
        assertEquals(4, size);
    }

    @Test
    public void optionalWithFilterAndMap() {
        var password = " password ";
        var optional = Optional.of(password);
        boolean correctPassword = optional.filter(pass -> pass.equals("password")).isPresent();
        assertFalse(correctPassword);

        correctPassword = optional.map(String::trim).filter(pass -> pass.equals("password")).isPresent();
        assertTrue(correctPassword);
    }

    @Test
    public void optionalWithFlatMap() {
        Person person = new Person("test", 26);
        Optional<Person> personOptional = Optional.of(person);

        Optional<Optional<String>> nameOptionalWrapper = personOptional.map(Person::getName);
        Optional<String> nameOptional = nameOptionalWrapper.orElseThrow(IllegalArgumentException::new);
        String name1 = nameOptional.orElse("");
        assertEquals("test", name1);

        String name = personOptional.flatMap(Person::getName).orElse("");
        assertEquals("test", name);
    }
}
