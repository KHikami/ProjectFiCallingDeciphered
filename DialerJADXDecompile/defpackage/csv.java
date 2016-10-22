package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: csv */
public class csv implements cst {
    public static final ctu a;
    private final bqg b;

    static {
        a = new csw();
    }

    csv(Context context, String str, String str2) {
        this.b = new bqg(context, str, str2, null);
    }

    public final css a(byte[] bArr) {
        return new csx(this.b, bArr);
    }

    public csv(Context context, String str, String str2, byte b) {
        this(context, str, str2);
    }
}
