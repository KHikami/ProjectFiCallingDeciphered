package p000;

import android.text.TextUtils;

public final class aka implements ajw {
    String f1080a;
    String f1081b;
    String f1082c;
    String f1083d;
    String f1084e;
    String f1085f;
    String f1086g;
    String f1087h;
    String f1088i;
    String f1089j;
    public String f1090k;

    public boolean m2685b() {
        return TextUtils.isEmpty(this.f1080a) && TextUtils.isEmpty(this.f1081b) && TextUtils.isEmpty(this.f1082c) && TextUtils.isEmpty(this.f1083d) && TextUtils.isEmpty(this.f1084e);
    }

    public boolean m2686c() {
        return TextUtils.isEmpty(this.f1086g) && TextUtils.isEmpty(this.f1087h) && TextUtils.isEmpty(this.f1088i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aka)) {
            return false;
        }
        aka aka = (aka) obj;
        if (TextUtils.equals(this.f1080a, aka.f1080a) && TextUtils.equals(this.f1082c, aka.f1082c) && TextUtils.equals(this.f1081b, aka.f1081b) && TextUtils.equals(this.f1083d, aka.f1083d) && TextUtils.equals(this.f1084e, aka.f1084e) && TextUtils.equals(this.f1085f, aka.f1085f) && TextUtils.equals(this.f1086g, aka.f1086g) && TextUtils.equals(this.f1088i, aka.f1088i) && TextUtils.equals(this.f1087h, aka.f1087h) && TextUtils.equals(this.f1089j, aka.f1089j)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String[] strArr = new String[]{this.f1080a, this.f1082c, this.f1081b, this.f1083d, this.f1084e, this.f1085f, this.f1086g, this.f1088i, this.f1087h, this.f1089j};
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
        return String.format("family: %s, given: %s, middle: %s, prefix: %s, suffix: %s", new Object[]{this.f1080a, this.f1081b, this.f1082c, this.f1083d, this.f1084e});
    }

    public final ajy mo229a() {
        return ajy.NAME;
    }
}
