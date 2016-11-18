package defpackage;

import java.util.List;

public final class nxx extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;
    private final List<String> a = null;

    public nxx() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public nxc a() {
        return new nxc(getMessage());
    }
}
