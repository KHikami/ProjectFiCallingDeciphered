package defpackage;

import java.util.Map.Entry;

enum mlw extends mlv {
    mlw(String str, int i) {
        super(str, 0);
    }

    public /* synthetic */ Object a(Object obj) {
        return ((Entry) obj).getKey();
    }
}
