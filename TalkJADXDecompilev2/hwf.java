package defpackage;

import android.text.TextUtils;

public final class hwf {
    private final StringBuilder a = new StringBuilder();
    private boolean b = false;

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
