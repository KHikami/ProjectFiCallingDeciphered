package defpackage;

import android.os.Bundle;
import java.util.List;

/* renamed from: eqm */
final class eqm implements eib {
    final /* synthetic */ Bundle a;
    final /* synthetic */ eql b;

    eqm(eql eql, Bundle bundle) {
        this.b = eql;
        this.a = bundle;
    }

    public void a(List<eic> list, Bundle bundle) {
        boolean z;
        iil.a(Integer.valueOf(list.size()), Integer.valueOf(1));
        eic eic = (eic) list.get(0);
        iil.a(eic.a, (Object) "android.permission.READ_PHONE_STATE");
        if (eic.b) {
            this.b.am = eqr.c;
        } else {
            this.b.am = eqr.b;
        }
        this.b.c = this.b.r();
        eql eql = this.b;
        if (this.a == null) {
            z = true;
        } else {
            z = false;
        }
        eql.a(z);
    }
}
