package defpackage;

import android.text.TextUtils;
import java.util.List;

/* renamed from: bjx */
public final class bjx extends gkc {
    final List<String> a;
    private final String e;

    bjx(List<String> list, String str, String str2, int i, boolean z) {
        super(null, str);
        a(i);
        a(false);
        c(false);
        b(0);
        d(true);
        this.a = list;
        this.e = str2;
    }

    public void a() {
        CharSequence a = gkc.a(b(), c(), d(), true, false);
        this.b = null;
        StringBuilder stringBuilder = new StringBuilder();
        if (!TextUtils.isEmpty(this.e)) {
            stringBuilder.append(this.e).append("|");
        }
        for (String append : this.a) {
            stringBuilder.append(append);
            stringBuilder.append("|");
        }
        this.c = stringBuilder.append(a).toString();
    }
}
