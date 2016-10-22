package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;

/* compiled from: PG */
/* renamed from: aho */
public final class aho extends ahl {
    public aho(ContentValues contentValues) {
        super(contentValues);
    }

    public final boolean a(ahl ahl, Context context) {
        if (!(ahl instanceof aho) || this.b == null || ahl.b == null) {
            return false;
        }
        aho aho = (aho) ahl;
        if (!TextUtils.equals(b(), aho.b())) {
            return false;
        }
        if (a(this.b) && aho.a(aho.b)) {
            if (b(this.b) != aho.b(aho.b)) {
                return false;
            }
            if (b(this.b) != 0 || TextUtils.equals(c(), aho.c())) {
                return true;
            }
            return false;
        } else if (a(this.b) == aho.a(aho.b)) {
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
