import android.text.TextUtils;

public final class dks implements iqp {
    private final String a;
    private final String b;
    private final String c;
    private final int d;

    dks(String str, String str2, String str3, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
    }

    public String a() {
        if (TextUtils.isEmpty(this.a)) {
            return this.b;
        }
        return this.a;
    }

    public String b() {
        return this.b;
    }

    String c() {
        return this.c;
    }

    int d() {
        return this.d;
    }
}
