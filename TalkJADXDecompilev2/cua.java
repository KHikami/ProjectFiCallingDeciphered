package defpackage;

import java.util.Arrays;
import java.util.Collections;

final class cua implements ijl<lyw> {
    final /* synthetic */ cty a;

    cua(cty cty) {
        this.a = cty;
    }

    public /* synthetic */ void a(nzf nzf) {
        b((lyw) nzf);
    }

    public /* synthetic */ void b(nzf nzf) {
        a((lyw) nzf);
    }

    private void a(lyw lyw) {
        String valueOf = String.valueOf(lyw);
        glk.e("Babel_explane", new StringBuilder(String.valueOf(valueOf).length() + 28).append("participants_search: error: ").append(valueOf).toString(), new Object[0]);
        this.a.a(Collections.emptyList());
    }

    private void b(lyw lyw) {
        String valueOf = String.valueOf(lyw);
        glk.a("Babel_explane", new StringBuilder(String.valueOf(valueOf).length() + 30).append("participants_search: success: ").append(valueOf).toString(), new Object[0]);
        this.a.a(Arrays.asList(lyw.a));
    }
}
