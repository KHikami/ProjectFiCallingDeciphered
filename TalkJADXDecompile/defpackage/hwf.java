package defpackage;

import android.text.TextUtils;

/* renamed from: hwf */
public final class hwf {
    private final StringBuilder a;
    private boolean b;

    public hwf() {
        this.b = false;
        this.a = new StringBuilder();
    }

    public void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.a.append(str);
        }
    }

    public void b(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (this.b) {
                this.a.append(" AND ");
            }
            this.a.append(str);
            this.b = true;
        }
    }

    public String toString() {
        return this.a.toString();
    }
}
