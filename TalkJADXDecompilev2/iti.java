package defpackage;

import android.content.Context;

public final class iti {
    private String a;
    private itj b = new itj();

    public iti(Context context) {
        a(icb.a(context.getContentResolver(), "babel_hangout_apiary_path", "https://www.googleapis.com/hangouts/v1android/"));
    }

    private iti a(String str) {
        ba.a((Object) str);
        boolean z = str.startsWith("https://") && str.endsWith("/");
        ba.a(z);
        this.a = str;
        return this;
    }

    public String a() {
        return this.a;
    }

    public itj b() {
        return this.b;
    }

    public String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        return new StringBuilder((String.valueOf(str).length() + 36) + String.valueOf(valueOf).length()).append("ClientInfo(mesiUrl=").append(str).append(", clientOptions=").append(valueOf).append(")").toString();
    }
}
