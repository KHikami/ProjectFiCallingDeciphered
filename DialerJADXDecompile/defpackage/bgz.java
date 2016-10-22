package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* renamed from: bgz */
public final class bgz implements bgr {
    private static Set a;
    private static Set b;
    private static Set c;
    private static Set d;
    private static String e;
    private int f;
    private int g;
    private String h;

    public bgz() {
        this.f = 0;
        this.g = -1;
    }

    static {
        a = new HashSet(Arrays.asList(new String[]{"X-PHONETIC-FIRST-NAME", "X-PHONETIC-MIDDLE-NAME", "X-PHONETIC-LAST-NAME", "X-ABADR", "X-ABUID"}));
        b = new HashSet(Arrays.asList(new String[]{"X-GNO", "X-GN", "X-REDUCTION"}));
        c = new HashSet(Arrays.asList(new String[]{"X-MICROSOFT-ASST_TEL", "X-MICROSOFT-ASSISTANT", "X-MICROSOFT-OFFICELOC"}));
        d = new HashSet(Arrays.asList(new String[]{"X-SD-VERN", "X-SD-FORMAT_VER", "X-SD-CATEGORIES", "X-SD-CLASS", "X-SD-DCREATED", "X-SD-DESCRIPTION"}));
        e = "X-SD-CHAR_CODE";
    }

    public final void a() {
    }

    public final void b() {
    }

    public final void c() {
    }

    public final void d() {
    }

    public final void a(bgy bgy) {
        String str = bgy.a;
        List list = bgy.e;
        if (str.equalsIgnoreCase("VERSION") && list.size() > 0) {
            String str2 = (String) list.get(0);
            if (str2.equals("2.1")) {
                this.g = 0;
            } else if (str2.equals("3.0")) {
                this.g = 1;
            } else if (str2.equals("4.0")) {
                this.g = 2;
            } else {
                String str3 = "vCard";
                String str4 = "Invalid version string: ";
                str2 = String.valueOf(str2);
                Log.w(str3, str2.length() != 0 ? str4.concat(str2) : new String(str4));
            }
        } else if (str.equalsIgnoreCase(e)) {
            this.f = 3;
            if (list.size() > 0) {
                this.h = (String) list.get(0);
            }
        }
        if (this.f == 0) {
            if (c.contains(str)) {
                this.f = 4;
            } else if (d.contains(str)) {
                this.f = 3;
            } else if (b.contains(str)) {
                this.f = 2;
            } else if (a.contains(str)) {
                this.f = 1;
            }
        }
    }

    public final int e() {
        switch (this.f) {
            case rq.c /*2*/:
                return 402653192;
            case rl.e /*3*/:
                return 939524104;
            default:
                if (this.g == 0) {
                    return -1073741824;
                }
                if (this.g == 1) {
                    return -1073741823;
                }
                if (this.g == 2) {
                    return -1073741822;
                }
                return 0;
        }
    }

    public final String f() {
        if (TextUtils.isEmpty(this.h)) {
            return this.h;
        }
        switch (this.f) {
            case rq.b /*1*/:
                return "UTF-8";
            case rq.c /*2*/:
            case rl.e /*3*/:
            case rl.f /*4*/:
                return "SHIFT_JIS";
            default:
                return null;
        }
    }
}
