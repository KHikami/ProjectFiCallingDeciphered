package defpackage;

import java.math.BigInteger;

enum mol extends moh {
    mol(String str, int i, boolean z, boolean z2) {
        super(str, 3, true, false);
    }

    public boolean a(Object obj) {
        return (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof BigInteger);
    }
}
