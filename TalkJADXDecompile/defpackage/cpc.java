package defpackage;

import android.content.Context;

/* renamed from: cpc */
public class cpc extends cov {
    cpc(Context context, bko bko, String str, CharSequence charSequence, bxn bxn, int i, String str2, boolean z, String str3) {
        super(context, bko, str, charSequence, bxn, i, str2, z, str3);
    }

    protected void a(blo blo, long j, int i, String str, bls bls, String str2, boolean z, CharSequence charSequence) {
        a(blo, j, z, i, str, str2, charSequence);
        if (blo.n(str2, h()) != fwx.FAILED_TO_SEND) {
            blo.a(str2, h(), fwx.UPLOADING, 0);
            a(blo, z, i, str, bls, str2, charSequence);
        }
    }

    protected fok a(cpb cpb) {
        return new col(cpb);
    }
}
