package p000;

public final class ewm extends evz {
    private static final long serialVersionUID = 1;
    private final long f12414g;
    private final String[] f12415h;

    public ewm(lpj lpj) {
        String[] strArr;
        long a;
        super(lpj, lpj.responseHeader, 0);
        if (evz.f5798a) {
            String valueOf = String.valueOf(lpj);
            new StringBuilder(String.valueOf(valueOf).length() + 32).append("DeleteConversationResponse from:").append(valueOf);
        }
        String[] strArr2 = null;
        if (lpj.f26003a != null) {
            if (gwb.m1507a(lpj.f26003a.f25993a) == 2) {
                strArr2 = lpj.f26003a.f25996d;
            }
            if (lpj.f26003a.f25995c != null) {
                strArr = strArr2;
                a = gwb.m1523a(lpj.f26003a.f25995c);
            } else {
                strArr = strArr2;
                a = -1;
            }
        } else {
            strArr = null;
            a = -1;
        }
        this.f12414g = a;
        this.f12415h = strArr;
    }

    public void mo1047a(blo blo, fhc fhc) {
        super.mo1047a(blo, fhc);
        blo.m5958a();
        try {
            new fes(((eur) this.b).e, this.f12414g, this.f12415h).m15169a(blo);
            blo.m6015b();
        } finally {
            blo.m6028c();
        }
    }
}
