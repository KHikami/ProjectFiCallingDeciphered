package defpackage;

import java.util.Arrays;

/* renamed from: clb */
final class clb {
    public final boolean equals(Object obj) {
        return obj == this ? true : !(obj instanceof clb) ? false : Arrays.equals(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(null) + 16337;
    }
}
