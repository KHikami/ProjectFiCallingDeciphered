package p000;

import android.content.Context;

public final class iti {
    private String f18965a;
    private itj f18966b = new itj();

    public iti(Context context) {
        m23216a(icb.m21564a(context.getContentResolver(), "babel_hangout_apiary_path", "https://www.googleapis.com/hangouts/v1android/"));
    }

    private iti m23216a(String str) {
        ba.m4536a((Object) str);
        boolean z = str.startsWith("https://") && str.endsWith("/");
        ba.m4577a(z);
        this.f18965a = str;
        return this;
    }

    public String m23217a() {
        return this.f18965a;
    }

    public itj m23218b() {
        return this.f18966b;
    }

    public String toString() {
        String str = this.f18965a;
        String valueOf = String.valueOf(this.f18966b);
        return new StringBuilder((String.valueOf(str).length() + 36) + String.valueOf(valueOf).length()).append("ClientInfo(mesiUrl=").append(str).append(", clientOptions=").append(valueOf).append(")").toString();
    }
}
