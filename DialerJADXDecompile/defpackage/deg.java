package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* renamed from: deg */
public final class deg extends IOException {
    private static final long serialVersionUID = -6947486886997889499L;

    public deg(int i, int i2) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space (pos " + i + " limit " + i2 + ").");
    }
}
