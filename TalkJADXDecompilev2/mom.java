package defpackage;

import java.math.BigDecimal;

enum mom extends moh {
    mom(String str, int i, boolean z, boolean z2) {
        super(str, 4, true, true);
    }

    public boolean a(Object obj) {
        return (obj instanceof Double) || (obj instanceof Float) || (obj instanceof BigDecimal);
    }
}
