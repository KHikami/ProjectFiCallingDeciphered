package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public final class eyt extends evz {
    private static final long serialVersionUID = 1;
    private final List<fbc> g;

    private eyt(luc luc) {
        super(luc, luc.responseHeader, -1);
        lty[] ltyArr = luc.a;
        List arrayList = new ArrayList();
        long a = glj.a();
        for (lty lty : ltyArr) {
            if (lty.a == null || TextUtils.isEmpty(lty.a.b)) {
                glk.e("Babel", "Received empty gaiaid in parseClientUserPresenceList.", new Object[0]);
            } else if (lty.b != null) {
                arrayList.add(new fbc(lty.b, lty.a.b, a));
            } else if (lty.c != null) {
                etw etw = new etw(lty.c);
                String valueOf = String.valueOf(lty.a.b);
                String str = etw.b;
                glk.d("Babel", new StringBuilder((String.valueOf(valueOf).length() + 39) + String.valueOf(str).length()).append("Received presence error for ").append(valueOf).append(". Details: ").append(str).toString(), new Object[0]);
            }
        }
        this.g = arrayList;
        if (evz.a) {
            String valueOf2 = String.valueOf(luc);
            new StringBuilder(String.valueOf(valueOf2).length() + 27).append("QueryPresenceResponse from:").append(valueOf2);
        }
    }

    public void a(fok fok) {
        super.a(fok);
        int size = ((fgz) fok).d().size();
        int size2 = this.g != null ? this.g.size() : 0;
        if (size != size2) {
            glk.d("Babel", "Queried presence for " + size + ", but only get response for " + size2, new Object[0]);
        }
    }

    public static evz a(luc luc) {
        if (evz.a(luc.responseHeader)) {
            return new ewv((nzf) luc, luc.responseHeader);
        }
        return new eyt(luc);
    }

    public List<fbc> k() {
        return this.g;
    }
}
