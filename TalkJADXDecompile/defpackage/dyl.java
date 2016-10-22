package defpackage;

import android.text.TextUtils;
import com.google.android.apps.hangouts.navigation.NavigationDrawerFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: dyl */
public final class dyl implements guq<hrz> {
    final /* synthetic */ NavigationDrawerFragment a;

    public dyl(NavigationDrawerFragment navigationDrawerFragment) {
        this.a = navigationDrawerFragment;
    }

    public /* synthetic */ void a(gup gup) {
        hrz hrz = (hrz) gup;
        if (this.a.getActivity() != null) {
            NavigationDrawerFragment navigationDrawerFragment = this.a;
            gux a = hrz.a();
            if (navigationDrawerFragment.ar.b()) {
                hwn hwn;
                List arrayList = new ArrayList();
                List arrayList2 = new ArrayList(arrayList);
                bko e = fde.e(navigationDrawerFragment.ar.a());
                Iterator it = a.iterator();
                Object obj = null;
                while (it.hasNext()) {
                    hwn = (hwn) it.next();
                    if (navigationDrawerFragment.d(hwn)) {
                        arrayList.add(hwn);
                        if (hwn.a().equals(e.a())) {
                            obj = 1;
                            navigationDrawerFragment.c(hwn);
                        } else {
                            arrayList2.add(hwn);
                        }
                    }
                }
                if (TextUtils.isEmpty(fde.e(navigationDrawerFragment.ar.a()).p())) {
                    navigationDrawerFragment.at.a(navigationDrawerFragment.ar.a()).b().a(1, TimeUnit.DAYS).c(2716);
                }
                int size = arrayList.size();
                if (size > 0) {
                    if (size == 1) {
                        navigationDrawerFragment.at.a(-1).b().a(1, TimeUnit.DAYS).c(2031);
                    } else if (size == 2) {
                        navigationDrawerFragment.at.a(-1).b().a(1, TimeUnit.DAYS).c(2032);
                    } else if (size == 3) {
                        navigationDrawerFragment.at.a(-1).b().a(1, TimeUnit.DAYS).c(2033);
                    } else {
                        navigationDrawerFragment.at.a(-1).b().a(1, TimeUnit.DAYS).c(2034);
                    }
                }
                int b = navigationDrawerFragment.as.b(navigationDrawerFragment.aq.a());
                fzw fzw = (fzw) navigationDrawerFragment.binder.a(fzw.class);
                if (glq.c(gwb.H()) && navigationDrawerFragment.as.c(b) && fzw.c(b)) {
                    arrayList.add(navigationDrawerFragment.aq);
                    navigationDrawerFragment.at.a(navigationDrawerFragment.ar.a()).b().a(1, TimeUnit.DAYS).c(2035);
                    if (fzw.a(navigationDrawerFragment.ar.a())) {
                        navigationDrawerFragment.c(navigationDrawerFragment.aq);
                        obj = 1;
                    } else {
                        arrayList2.add(navigationDrawerFragment.aq);
                    }
                }
                if (obj != null) {
                    List list;
                    if (arrayList.isEmpty()) {
                        list = null;
                    } else {
                        list = arrayList;
                    }
                    if (!(navigationDrawerFragment.am == null || navigationDrawerFragment.d(navigationDrawerFragment.am))) {
                        navigationDrawerFragment.am = null;
                    }
                    if (!(navigationDrawerFragment.an == null || navigationDrawerFragment.d(navigationDrawerFragment.an))) {
                        navigationDrawerFragment.an = null;
                    }
                    if (navigationDrawerFragment.am == null) {
                        navigationDrawerFragment.am = navigationDrawerFragment.an;
                        navigationDrawerFragment.an = null;
                    }
                    if (navigationDrawerFragment.am == null) {
                        navigationDrawerFragment.am = arrayList2.size() > 0 ? (hwn) arrayList2.get(0) : null;
                        navigationDrawerFragment.an = arrayList2.size() > 1 ? (hwn) arrayList2.get(1) : null;
                    }
                    hwn = navigationDrawerFragment.al;
                    hwn hwn2 = navigationDrawerFragment.am;
                    hwn hwn3 = navigationDrawerFragment.an;
                    if (navigationDrawerFragment.i == null) {
                        navigationDrawerFragment.i = new htc(navigationDrawerFragment.getActivity(), gwb.gL, navigationDrawerFragment.aw, navigationDrawerFragment.ax);
                        navigationDrawerFragment.i.b(true);
                        navigationDrawerFragment.i.a(navigationDrawerFragment.g);
                        navigationDrawerFragment.i.a(true);
                    }
                    navigationDrawerFragment.ak = list;
                    navigationDrawerFragment.b(hwn);
                    navigationDrawerFragment.i.b(list);
                    if (navigationDrawerFragment.e != null) {
                        navigationDrawerFragment.e.a(hwn2, hwn3);
                    }
                    navigationDrawerFragment.h.a();
                }
            }
        }
    }
}
