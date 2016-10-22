package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* renamed from: afm */
final class afm {
    private final String a;
    private final String b;
    private final String c;

    public afm(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b, this.c});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof afm)) {
            return false;
        }
        afm afm = (afm) obj;
        if (Objects.equals(this.a, afm.a) && Objects.equals(this.b, afm.b) && Objects.equals(this.c, afm.c)) {
            return true;
        }
        return false;
    }
}
