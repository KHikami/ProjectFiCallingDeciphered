package defpackage;

import android.text.TextUtils;

public final class aka implements ajw {
    String a;
    String b;
    String c;
    String d;
    String e;
    String f;
    String g;
    String h;
    String i;
    String j;
    public String k;

    public boolean b() {
        return TextUtils.isEmpty(this.a) && TextUtils.isEmpty(this.b) && TextUtils.isEmpty(this.c) && TextUtils.isEmpty(this.d) && TextUtils.isEmpty(this.e);
    }

    public boolean c() {
        return TextUtils.isEmpty(this.g) && TextUtils.isEmpty(this.h) && TextUtils.isEmpty(this.i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aka)) {
            return false;
        }
        aka aka = (aka) obj;
        if (TextUtils.equals(this.a, aka.a) && TextUtils.equals(this.c, aka.c) && TextUtils.equals(this.b, aka.b) && TextUtils.equals(this.d, aka.d) && TextUtils.equals(this.e, aka.e) && TextUtils.equals(this.f, aka.f) && TextUtils.equals(this.g, aka.g) && TextUtils.equals(this.i, aka.i) && TextUtils.equals(this.h, aka.h) && TextUtils.equals(this.j, aka.j)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String[] strArr = new String[]{this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.i, this.h, this.j};
        int i = 0;
        int i2 = 0;
        while (i < 10) {
            String str = strArr[i];
            int i3 = i2 * 31;
            if (str != null) {
                i2 = str.hashCode();
            } else {
                i2 = 0;
            }
            i++;
            i2 = i3 + i2;
        }
        return i2;
    }

    public String toString() {
        return String.format("family: %s, given: %s, middle: %s, prefix: %s, suffix: %s", new Object[]{this.a, this.b, this.c, this.d, this.e});
    }

    public final ajy a() {
        return ajy.NAME;
    }
}
