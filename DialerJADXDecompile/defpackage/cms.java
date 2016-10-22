package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.droidguard.DroidGuardResultsRequest;
import java.util.Map;

/* renamed from: cms */
final class cms implements brf {
    private /* synthetic */ cmn a;
    private /* synthetic */ String b;
    private /* synthetic */ Map c;
    private /* synthetic */ DroidGuardResultsRequest d;
    private /* synthetic */ cjy e;
    private /* synthetic */ cmo f;

    cms(cmo cmo, cmn cmn, String str, Map map, DroidGuardResultsRequest droidGuardResultsRequest, cjy cjy) {
        this.f = cmo;
        this.a = cmn;
        this.b = str;
        this.c = map;
        this.d = droidGuardResultsRequest;
        this.e = cjy;
    }

    public final void a(int i) {
        this.e.a(cmo.a("Disconnected."));
    }

    public final void a(Bundle bundle) {
        try {
            cmo.a(this.f);
            ((cnb) this.f.l()).a(this.a, this.b, this.c, this.d);
        } catch (RemoteException e) {
            this.e.a(cmo.a("RemoteException: " + e));
        }
    }
}
