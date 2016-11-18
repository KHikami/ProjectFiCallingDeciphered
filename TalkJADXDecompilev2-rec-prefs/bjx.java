package p000;

import android.text.TextUtils;
import java.util.List;

public final class bjx extends gkc {
    final List<String> f3596a;
    private final String f3597e;

    bjx(List<String> list, String str, String str2, int i, boolean z) {
        super(null, str);
        m5547a(i);
        m5550a(false);
        m5557c(false);
        m5553b(0);
        m5558d(true);
        this.f3596a = list;
        this.f3597e = str2;
    }

    public void mo608a() {
        CharSequence a = gkc.m5546a(m5552b(), m5556c(), m5559d(), true, false);
        this.b = null;
        StringBuilder stringBuilder = new StringBuilder();
        if (!TextUtils.isEmpty(this.f3597e)) {
            stringBuilder.append(this.f3597e).append("|");
        }
        for (String append : this.f3596a) {
            stringBuilder.append(append);
            stringBuilder.append("|");
        }
        this.c = stringBuilder.append(a).toString();
    }
}
