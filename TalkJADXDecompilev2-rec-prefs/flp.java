package p000;

import android.content.Context;

final class flp implements flo, ghz<fln> {
    private final Context f13416a;
    private final gid f13417b;
    private final ky<String, fln> f13418c = new ky();

    flp(Context context) {
        this.f13416a = context;
        this.f13417b = (gid) jyn.m25426a(context, gid.class);
    }

    public Class<fln> mo2026a() {
        return fln.class;
    }

    public synchronized void mo2028a(gia<fln> gia_fln, gib gib) {
        for (int i = 0; i < this.f13418c.size(); i++) {
            ayo ayo = (fln) this.f13418c.m28018c(i);
            if (ayo.f13415c.m17707a(gib)) {
                String valueOf = String.valueOf(gia_fln.toString());
                String valueOf2 = String.valueOf(gib.toString());
                new StringBuilder((String.valueOf(valueOf).length() + 25) + String.valueOf(valueOf2).length()).append("Triggering callback ").append(valueOf).append(" for ").append(valueOf2);
                this.f13417b.mo2275a(ayo, (gia) gia_fln);
            }
        }
    }

    public synchronized void mo2029a(String str, String str2) {
        fln fln = (fln) this.f13418c.get(str);
        if (fln != null) {
            String valueOf = String.valueOf(fln.f13413a);
            String valueOf2 = String.valueOf(fln.f13414b);
            glk.m17982e("Babel_ConvIdChanged", new StringBuilder((((String.valueOf(str).length() + 31) + String.valueOf(str2).length()) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length()).append("Replacing existing ID: ").append(str).append("/").append(str2).append(" with ").append(valueOf).append("/").append(valueOf2).toString(), new Object[0]);
            iil.m21870a("Replaced existing changed conversation ID");
        }
        if (gwb.m1906a(this.f13416a, "babel_strict_conversation_id_change_checks", false)) {
            if (str.equals(str2)) {
                String str3 = "Babel_ConvIdChanged";
                valueOf = "Replacing ID with the same ID: ";
                valueOf2 = String.valueOf(str);
                if (valueOf2.length() != 0) {
                    valueOf2 = valueOf.concat(valueOf2);
                } else {
                    valueOf2 = new String(valueOf);
                }
                glk.m17982e(str3, valueOf2, new Object[0]);
                iil.m21870a("Replaced ID with the same ID");
            }
            if (!(blo.m5871a(str) || blo.m5871a(str2))) {
                glk.m17982e("Babel_ConvIdChanged", new StringBuilder((String.valueOf(str).length() + 64) + String.valueOf(str2).length()).append("Neither the old nor new conversation IDs are client generated: ").append(str).append("/").append(str2).toString(), new Object[0]);
                iil.m21870a("Neither the old nor new conversation IDs are client generated");
            }
            if (blo.m5871a(str) && blo.m5871a(str2)) {
                glk.m17982e("Babel_ConvIdChanged", new StringBuilder((String.valueOf(str).length() + 61) + String.valueOf(str2).length()).append("Both the old and new conversation IDs are client generated: ").append(str).append("/").append(str2).toString(), new Object[0]);
                iil.m21870a("Both the old and new conversation IDs are client generated");
            }
        }
        glk.m17970a("Babel_ConvIdChanged", new StringBuilder((String.valueOf(str).length() + 18) + String.valueOf(str2).length()).append("ConvIdChanged ").append(str).append(" -> ").append(str2).toString(), new Object[0]);
        ayo fln2 = new fln(str, str2);
        this.f13418c.put(str, fln2);
        this.f13417b.mo2276a(fln2, fln2.f13415c);
    }

    public synchronized String mo2027a(String str) {
        String str2;
        fln fln = (fln) this.f13418c.get(str);
        if (fln != null) {
            str2 = fln.f13414b;
        } else {
            str2 = null;
        }
        return str2;
    }
}
