package defpackage;

import java.util.Map.Entry;

enum mlx extends mlv {
    mlx(String str, int i) {
        super(str, 1);
    }

    public /* synthetic */ Object a(Object obj) {
        return ((Entry) obj).getValue();
    }
}
