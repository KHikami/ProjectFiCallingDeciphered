package defpackage;

import android.accounts.Account;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: jdw */
final class jdw implements jcq {
    private final ics a;

    jdw(ics ics) {
        this.a = ics;
    }

    public List<jco> a() {
        Throwable e;
        try {
            Account[] a = this.a.a("com.google");
            List<jco> arrayList = new ArrayList(a.length);
            for (int i = 0; i < a.length; i++) {
                arrayList.add(new jcp(a[i].name, i).a());
            }
            return arrayList;
        } catch (RemoteException e2) {
            e = e2;
            throw new jct(e);
        } catch (idt e3) {
            e = e3;
            throw new jct(e);
        } catch (ids e4) {
            e = e4;
            throw new jct(e);
        }
    }
}
