package defpackage;

/* renamed from: ewm */
public final class ewm extends evz {
    private static final long serialVersionUID = 1;
    private final long g;
    private final String[] h;

    public ewm(lpj lpj) {
        String[] strArr;
        long a;
        super(lpj, lpj.responseHeader, 0);
        if (evz.a) {
            String valueOf = String.valueOf(lpj);
            new StringBuilder(String.valueOf(valueOf).length() + 32).append("DeleteConversationResponse from:").append(valueOf);
        }
        String[] strArr2 = null;
        if (lpj.a != null) {
            if (gwb.a(lpj.a.a) == 2) {
                strArr2 = lpj.a.d;
            }
            if (lpj.a.c != null) {
                strArr = strArr2;
                a = gwb.a(lpj.a.c);
            } else {
                strArr = strArr2;
                a = -1;
            }
        } else {
            strArr = null;
            a = -1;
        }
        this.g = a;
        this.h = strArr;
    }

    public void a(blo blo, fhc fhc) {
        super.a(blo, fhc);
        blo.a();
        try {
            new fes(((eur) this.b).e, this.g, this.h).a(blo);
            blo.b();
        } finally {
            blo.c();
        }
    }
}
