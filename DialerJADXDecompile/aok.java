import android.text.TextUtils;

/* compiled from: PG */
public final class aok {
    private String a;
    private String b;

    public aok(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof aok)) {
            return false;
        }
        aok aok = (aok) obj;
        if (TextUtils.equals(this.a, aok.a) && TextUtils.equals(this.b, aok.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = this.a == null ? 0 : this.a.hashCode();
        if (this.b != null) {
            i = this.b.hashCode();
        }
        return hashCode ^ i;
    }
}
