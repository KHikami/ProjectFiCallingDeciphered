package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;

/* compiled from: PG */
/* renamed from: ahx */
public final class ahx extends ahl {
    public ahx(ContentValues contentValues) {
        super(contentValues);
    }

    public final boolean a(ahl ahl, Context context) {
        if (!(ahl instanceof ahx) || this.b == null || ahl.b == null) {
            return false;
        }
        ahx ahx = (ahx) ahl;
        if (!TextUtils.equals(b(), ahx.b())) {
            return false;
        }
        if (a(this.b) && ahx.a(ahx.b)) {
            if (b(this.b) != ahx.b(ahx.b)) {
                return false;
            }
            if (b(this.b) != 0 || TextUtils.equals(c(), ahx.c())) {
                return true;
            }
            return false;
        } else if (a(this.b) == ahx.a(ahx.b)) {
            return true;
        } else {
            return false;
        }
    }

    private String b() {
        return this.a.getAsString("data1");
    }

    private String c() {
        return this.a.getAsString("data3");
    }
}
