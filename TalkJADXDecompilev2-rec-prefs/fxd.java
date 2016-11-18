package p000;

import android.content.Context;

public final class fxd implements fxa {
    public void mo2109a(Context context, dr drVar, String str, String str2, String str3) {
        String valueOf = String.valueOf("g:");
        String valueOf2 = String.valueOf(str);
        fxd.m16454c(context, drVar, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), str2, str3);
    }

    public void mo2110b(Context context, dr drVar, String str, String str2, String str3) {
        String valueOf = String.valueOf("p:");
        String valueOf2 = String.valueOf(str);
        fxd.m16454c(context, drVar, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), str2, str3);
    }

    private static void m16454c(Context context, dr drVar, String str, String str2, String str3) {
        ba.m4537a((Object) str, (Object) "Couldn't start SmartProfile because personId was null");
        glk.m17970a("Babel", "Starting SmartProfile with personId = %s, name = %s", glk.m17974b(str), glk.m17974b(str2));
        bko e = fde.m15018e(((jca) jyn.m25426a(context, jca.class)).mo2317a());
        drVar.startActivityForResult(((ihm) jyn.m25426a(context, ihm.class)).mo3210a().mo3205b(str).mo3203a(e.m5629a()).mo3202a(407).mo3204b(context.getResources().getColor(gwb.dU)).mo3207c(str2).mo3209d(str3).mo3208d(100).mo3206c(context.getResources().getColor(gwb.dV)).mo3201a(), 0);
    }

    public void mo2108a(Context context, dr drVar, bjg bjg) {
        String valueOf;
        String valueOf2;
        if (bjg.mo581o()) {
            valueOf2 = String.valueOf("c:");
            valueOf = String.valueOf(bjg.mo582p());
            valueOf = valueOf.length() != 0 ? valueOf2.concat(valueOf) : new String(valueOf2);
        } else {
            if (bjg.mo574h()) {
                for (bjf bjf : bjg.mo576j()) {
                    if (!bjf.m5377g()) {
                        valueOf2 = String.valueOf("g:");
                        valueOf = String.valueOf(bjf.m5371b());
                        valueOf = valueOf.length() != 0 ? valueOf2.concat(valueOf) : new String(valueOf2);
                    }
                }
            }
            bjo a = bjg.mo567a();
            if (a != null) {
                valueOf2 = String.valueOf("p:");
                valueOf = String.valueOf(a.m5473c());
                valueOf = valueOf.length() != 0 ? valueOf2.concat(valueOf) : new String(valueOf2);
            } else {
                valueOf = bjg.mo569c();
                if (valueOf != null) {
                    valueOf2 = String.valueOf("e:");
                    valueOf = String.valueOf(valueOf);
                    valueOf = valueOf.length() != 0 ? valueOf2.concat(valueOf) : new String(valueOf2);
                } else {
                    valueOf = null;
                }
            }
        }
        fxd.m16454c(context, drVar, valueOf, bjg.mo571e(), bjg.mo572f());
    }
}
