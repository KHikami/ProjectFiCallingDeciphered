package p000;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public final class eyt extends evz {
    private static final long serialVersionUID = 1;
    private final List<fbc> f12525g;

    private eyt(luc luc) {
        super(luc, luc.responseHeader, -1);
        lty[] ltyArr = luc.f26438a;
        List arrayList = new ArrayList();
        long a = glj.m17956a();
        for (lty lty : ltyArr) {
            if (lty.f26430a == null || TextUtils.isEmpty(lty.f26430a.f26403b)) {
                glk.m17982e("Babel", "Received empty gaiaid in parseClientUserPresenceList.", new Object[0]);
            } else if (lty.f26431b != null) {
                arrayList.add(new fbc(lty.f26431b, lty.f26430a.f26403b, a));
            } else if (lty.f26432c != null) {
                etw etw = new etw(lty.f26432c);
                String valueOf = String.valueOf(lty.f26430a.f26403b);
                String str = etw.f12258b;
                glk.m17981d("Babel", new StringBuilder((String.valueOf(valueOf).length() + 39) + String.valueOf(str).length()).append("Received presence error for ").append(valueOf).append(". Details: ").append(str).toString(), new Object[0]);
            }
        }
        this.f12525g = arrayList;
        if (evz.f5798a) {
            String valueOf2 = String.valueOf(luc);
            new StringBuilder(String.valueOf(valueOf2).length() + 27).append("QueryPresenceResponse from:").append(valueOf2);
        }
    }

    public void mo1960a(fok fok) {
        super.mo1960a(fok);
        int size = ((fgz) fok).m15301d().size();
        int size2 = this.f12525g != null ? this.f12525g.size() : 0;
        if (size != size2) {
            glk.m17981d("Babel", "Queried presence for " + size + ", but only get response for " + size2, new Object[0]);
        }
    }

    public static evz m14792a(luc luc) {
        if (evz.m8120a(luc.responseHeader)) {
            return new ewv((nzf) luc, luc.responseHeader);
        }
        return new eyt(luc);
    }

    public List<fbc> m14794k() {
        return this.f12525g;
    }
}
