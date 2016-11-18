package defpackage;

import android.content.Context;

final class flp implements flo, ghz<fln> {
    private final Context a;
    private final gid b;
    private final ky<String, fln> c = new ky();

    flp(Context context) {
        this.a = context;
        this.b = (gid) jyn.a(context, gid.class);
    }

    public Class<fln> a() {
        return fln.class;
    }

    public synchronized void a(gia<fln> gia_fln, gib gib) {
        for (int i = 0; i < this.c.size(); i++) {
            ayo ayo = (fln) this.c.c(i);
            if (ayo.c.a(gib)) {
                String valueOf = String.valueOf(gia_fln.toString());
                String valueOf2 = String.valueOf(gib.toString());
                new StringBuilder((String.valueOf(valueOf).length() + 25) + String.valueOf(valueOf2).length()).append("Triggering callback ").append(valueOf).append(" for ").append(valueOf2);
                this.b.a(ayo, (gia) gia_fln);
            }
        }
    }

    public synchronized void a(String str, String str2) {
        fln fln = (fln) this.c.get(str);
        if (fln != null) {
            String valueOf = String.valueOf(fln.a);
            String valueOf2 = String.valueOf(fln.b);
            glk.e("Babel_ConvIdChanged", new StringBuilder((((String.valueOf(str).length() + 31) + String.valueOf(str2).length()) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length()).append("Replacing existing ID: ").append(str).append("/").append(str2).append(" with ").append(valueOf).append("/").append(valueOf2).toString(), new Object[0]);
            iil.a("Replaced existing changed conversation ID");
        }
        if (gwb.a(this.a, "babel_strict_conversation_id_change_checks", false)) {
            if (str.equals(str2)) {
                String str3 = "Babel_ConvIdChanged";
                valueOf = "Replacing ID with the same ID: ";
                valueOf2 = String.valueOf(str);
                if (valueOf2.length() != 0) {
                    valueOf2 = valueOf.concat(valueOf2);
                } else {
                    valueOf2 = new String(valueOf);
                }
                glk.e(str3, valueOf2, new Object[0]);
                iil.a("Replaced ID with the same ID");
            }
            if (!(blo.a(str) || blo.a(str2))) {
                glk.e("Babel_ConvIdChanged", new StringBuilder((String.valueOf(str).length() + 64) + String.valueOf(str2).length()).append("Neither the old nor new conversation IDs are client generated: ").append(str).append("/").append(str2).toString(), new Object[0]);
                iil.a("Neither the old nor new conversation IDs are client generated");
            }
            if (blo.a(str) && blo.a(str2)) {
                glk.e("Babel_ConvIdChanged", new StringBuilder((String.valueOf(str).length() + 61) + String.valueOf(str2).length()).append("Both the old and new conversation IDs are client generated: ").append(str).append("/").append(str2).toString(), new Object[0]);
                iil.a("Both the old and new conversation IDs are client generated");
            }
        }
        glk.a("Babel_ConvIdChanged", new StringBuilder((String.valueOf(str).length() + 18) + String.valueOf(str2).length()).append("ConvIdChanged ").append(str).append(" -> ").append(str2).toString(), new Object[0]);
        ayo fln2 = new fln(str, str2);
        this.c.put(str, fln2);
        this.b.a(fln2, fln2.c);
    }

    public synchronized String a(String str) {
        String str2;
        fln fln = (fln) this.c.get(str);
        if (fln != null) {
            str2 = fln.b;
        } else {
            str2 = null;
        }
        return str2;
    }
}
