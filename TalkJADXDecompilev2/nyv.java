package defpackage;

import java.io.IOException;

public final class nyv extends IOException {
    private static final long serialVersionUID = -6947486886997889499L;

    nyv(int i, int i2) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space (pos " + i + " limit " + i2 + ").");
    }
}
