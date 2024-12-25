package org.example.oracle.seal;

public sealed interface AnimalInter permits Cat, Animal {
    void summa();
}
