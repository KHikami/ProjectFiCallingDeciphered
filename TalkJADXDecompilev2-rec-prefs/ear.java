package p000;

import android.database.Cursor;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public final class ear {
    public final String f11061a;
    public final String f11062b;
    public final boolean f11063c;
    public final int f11064d;
    public final int f11065e;
    public final String f11066f;
    public final long f11067g;
    public final List<ecj> f11068h;
    public int f11069i;
    public final boolean f11070j;
    public final String f11071k;
    public final int f11072l;
    public final long f11073m;

    public ear(String str, String str2, int i, String str3, long j, boolean z, int i2, String str4, int i3, long j2) {
        this.f11061a = str;
        this.f11062b = str2;
        this.f11065e = i;
        this.f11063c = this.f11065e == 2;
        this.f11064d = i2;
        this.f11066f = str3;
        this.f11067g = j;
        this.f11068h = new ArrayList();
        this.f11069i = 0;
        this.f11070j = z;
        this.f11071k = str4;
        this.f11072l = i3;
        this.f11073m = j2;
        if (ebz.f11037d) {
            String str5 = this.f11061a;
            String str6 = this.f11066f;
            new StringBuilder((String.valueOf(str5).length() + 20) + String.valueOf(str6).length()).append("Conversation Line: ").append(str5).append(" ").append(str6);
        }
    }

    static String m13378a(Cursor cursor, int i, int i2) {
        String string = cursor.getString(i);
        if (TextUtils.isEmpty(string)) {
            return cursor.getString(i2);
        }
        return string;
    }

    public fvd m13379a() {
        if (this.f11068h.size() > 0) {
            return ((ecj) this.f11068h.get(0)).f11113q;
        }
        return fvd.MESSAGE;
    }

    boolean m13380b() {
        return this.f11072l == 1;
    }
}
