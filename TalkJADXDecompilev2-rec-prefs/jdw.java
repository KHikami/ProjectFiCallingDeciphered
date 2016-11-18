package p000;

import android.accounts.Account;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

final class jdw implements jcq {
    private final ics f19918a;

    jdw(ics ics) {
        this.f19918a = ics;
    }

    public List<jco> mo1740a() {
        Throwable e;
        try {
            Account[] a = this.f19918a.mo3144a("com.google");
            List<jco> arrayList = new ArrayList(a.length);
            for (int i = 0; i < a.length; i++) {
                arrayList.add(new jcp(a[i].name, i).m23901a());
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
