package p000;

import android.content.Context;

final class jod extends jgc {
    private final jcr f20577a;

    public jod(String str, jcr jcr) {
        super(str);
        this.f20577a = jcr;
    }

    protected jgz mo648a(Context context) {
        try {
            jco[] a = this.f20577a.mo3478a();
            String[] strArr = new String[a.length];
            for (int i = 0; i < strArr.length; i++) {
                strArr[i] = a[i].m23898a();
            }
            jgz jgz = new jgz(true);
            jgz.m24192d().putStringArray("account_name_array", strArr);
            return jgz;
        } catch (jct e) {
            return new jgz(false);
        }
    }
}
