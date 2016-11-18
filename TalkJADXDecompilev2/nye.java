package defpackage;

final class nye extends IllegalArgumentException {
    nye(int i, int i2) {
        super("Unpaired surrogate at index " + i + " of " + i2);
    }
}
