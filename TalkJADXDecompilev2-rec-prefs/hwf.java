package p000;

import android.text.TextUtils;

public final class hwf {
    private final StringBuilder f17417a = new StringBuilder();
    private boolean f17418b = false;

    public void m21136a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f17417a.append(str);
        }
    }

    public void m21137b(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (this.f17418b) {
                this.f17417a.append(" AND ");
            }
            this.f17417a.append(str);
            this.f17418b = true;
        }
    }

    public String toString() {
        return this.f17417a.toString();
    }
}
