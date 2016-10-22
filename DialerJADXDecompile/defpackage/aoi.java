package defpackage;

import android.text.TextUtils;
import java.util.Objects;

/* compiled from: PG */
/* renamed from: aoi */
public final class aoi {
    public final String a;
    public final String b;
    public final aws c;

    public aoi(String str, String str2, aws aws) {
        this.a = str;
        this.b = str2;
        this.c = aws;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof aoi)) {
            return false;
        }
        aoi aoi = (aoi) obj;
        if (!TextUtils.equals(this.a, aoi.a)) {
            return false;
        }
        if (!TextUtils.equals(this.b, aoi.b)) {
            return false;
        }
        if (Objects.equals(this.c, aoi.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((this.b == null ? 0 : this.b.hashCode()) + (((this.c == null ? 0 : this.c.hashCode()) + 31) * 31)) * 31;
        if (this.a != null) {
            i = this.a.hashCode();
        }
        return hashCode + i;
    }
}
