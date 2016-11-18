package p000;

import android.content.Context;

public class cpc extends cov {
    cpc(Context context, bko bko, String str, CharSequence charSequence, bxn bxn, int i, String str2, boolean z, String str3) {
        super(context, bko, str, charSequence, bxn, i, str2, z, str3);
    }

    protected void mo1366a(blo blo, long j, int i, String str, bls bls, String str2, boolean z, CharSequence charSequence) {
        m10551a(blo, j, z, i, str, str2, charSequence);
        if (blo.m6090n(str2, m10565h()) != fwx.FAILED_TO_SEND) {
            blo.m5992a(str2, m10565h(), fwx.UPLOADING, 0);
            m10557a(blo, z, i, str, bls, str2, charSequence);
        }
    }

    protected fok mo1370a(cpb cpb) {
        return new col(cpb);
    }
}
