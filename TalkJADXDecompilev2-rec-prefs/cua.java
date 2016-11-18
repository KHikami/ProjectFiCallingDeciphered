package p000;

import java.util.Arrays;
import java.util.Collections;

final class cua implements ijl<lyw> {
    final /* synthetic */ cty f9092a;

    cua(cty cty) {
        this.f9092a = cty;
    }

    public /* synthetic */ void mo1431a(nzf nzf) {
        m11013b((lyw) nzf);
    }

    public /* synthetic */ void mo1432b(nzf nzf) {
        m11012a((lyw) nzf);
    }

    private void m11012a(lyw lyw) {
        String valueOf = String.valueOf(lyw);
        glk.m17982e("Babel_explane", new StringBuilder(String.valueOf(valueOf).length() + 28).append("participants_search: error: ").append(valueOf).toString(), new Object[0]);
        this.f9092a.m11000a(Collections.emptyList());
    }

    private void m11013b(lyw lyw) {
        String valueOf = String.valueOf(lyw);
        glk.m17970a("Babel_explane", new StringBuilder(String.valueOf(valueOf).length() + 30).append("participants_search: success: ").append(valueOf).toString(), new Object[0]);
        this.f9092a.m11000a(Arrays.asList(lyw.f26960a));
    }
}
