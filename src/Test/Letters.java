package Test;

import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public enum Letters {
    A('a'), B('b'), C('c');

    public final char value;

    Letters(char value) {
        this.value = value;
    }

}
