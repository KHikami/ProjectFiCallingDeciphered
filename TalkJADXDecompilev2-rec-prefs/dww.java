package p000;

import android.content.Context;
import android.text.TextUtils;

public class dww implements bhm {
    private final int f10685a;
    private final String f10686b;
    private final String f10687c;

    public static dww m12949a(int i, String str) {
        return new dww(i, str, false);
    }

    public dww(int i, String str, boolean z) {
        this.f10685a = i;
        if (z) {
            this.f10686b = str;
            this.f10687c = "";
            return;
        }
        this.f10686b = "";
        this.f10687c = str;
    }

    public int mo539a(Context context, bhb bhb) {
        if (TextUtils.isEmpty(this.f10686b)) {
            ((dwv) jyn.m25426a(context, dwv.class)).mo1747a(this.f10687c);
        } else {
            ((dwv) jyn.m25426a(context, dwv.class)).mo1746a(this.f10685a, this.f10686b);
        }
        return bhn.f3348a;
    }
}
