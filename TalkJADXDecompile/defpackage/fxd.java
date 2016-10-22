package defpackage;

import android.content.Context;

/* renamed from: fxd */
public final class fxd implements fxa {
    public void a(Context context, dr drVar, String str, String str2, String str3) {
        String valueOf = String.valueOf("g:");
        String valueOf2 = String.valueOf(str);
        fxd.c(context, drVar, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), str2, str3);
    }

    public void b(Context context, dr drVar, String str, String str2, String str3) {
        String valueOf = String.valueOf("p:");
        String valueOf2 = String.valueOf(str);
        fxd.c(context, drVar, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), str2, str3);
    }

    private static void c(Context context, dr drVar, String str, String str2, String str3) {
        ba.a((Object) str, (Object) "Couldn't start SmartProfile because personId was null");
        glk.a("Babel", "Starting SmartProfile with personId = %s, name = %s", glk.b(str), glk.b(str2));
        bko e = fde.e(((jca) jyn.a(context, jca.class)).a());
        drVar.startActivityForResult(((ihm) jyn.a(context, ihm.class)).a().b(str).a(e.a()).a(407).b(context.getResources().getColor(gwb.dU)).c(str2).d(str3).d(100).c(context.getResources().getColor(gwb.dV)).a(), 0);
    }

    public void a(Context context, dr drVar, bjg bjg) {
        String valueOf;
        String valueOf2;
        if (bjg.o()) {
            valueOf2 = String.valueOf("c:");
            valueOf = String.valueOf(bjg.p());
            valueOf = valueOf.length() != 0 ? valueOf2.concat(valueOf) : new String(valueOf2);
        } else {
            if (bjg.h()) {
                for (bjf bjf : bjg.j()) {
                    if (!bjf.g()) {
                        valueOf2 = String.valueOf("g:");
                        valueOf = String.valueOf(bjf.b());
                        valueOf = valueOf.length() != 0 ? valueOf2.concat(valueOf) : new String(valueOf2);
                    }
                }
            }
            bjo a = bjg.a();
            if (a != null) {
                valueOf2 = String.valueOf("p:");
                valueOf = String.valueOf(a.c());
                valueOf = valueOf.length() != 0 ? valueOf2.concat(valueOf) : new String(valueOf2);
            } else {
                valueOf = bjg.c();
                if (valueOf != null) {
                    valueOf2 = String.valueOf("e:");
                    valueOf = String.valueOf(valueOf);
                    valueOf = valueOf.length() != 0 ? valueOf2.concat(valueOf) : new String(valueOf2);
                } else {
                    valueOf = null;
                }
            }
        }
        fxd.c(context, drVar, valueOf, bjg.e(), bjg.f());
    }
}
