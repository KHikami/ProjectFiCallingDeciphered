package p000;

import android.text.TextUtils;
import com.google.android.apps.hangouts.navigation.NavigationDrawerFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class dyl implements guq<hrz> {
    final /* synthetic */ NavigationDrawerFragment f10830a;

    public dyl(NavigationDrawerFragment navigationDrawerFragment) {
        this.f10830a = navigationDrawerFragment;
    }

    public /* synthetic */ void mo1538a(gup gup) {
        hrz hrz = (hrz) gup;
        if (this.f10830a.getActivity() != null) {
            NavigationDrawerFragment navigationDrawerFragment = this.f10830a;
            gux a = hrz.mo2553a();
            if (navigationDrawerFragment.ar.mo2319b()) {
                hwn hwn;
                List arrayList = new ArrayList();
                List arrayList2 = new ArrayList(arrayList);
                bko e = fde.m15018e(navigationDrawerFragment.ar.mo2317a());
                Iterator it = a.iterator();
                Object obj = null;
                while (it.hasNext()) {
                    hwn = (hwn) it.next();
                    if (navigationDrawerFragment.m8756d(hwn)) {
                        arrayList.add(hwn);
                        if (hwn.mo1778a().equals(e.m5629a())) {
                            obj = 1;
                            navigationDrawerFragment.m8755c(hwn);
                        } else {
                            arrayList2.add(hwn);
                        }
                    }
                }
                if (TextUtils.isEmpty(fde.m15018e(navigationDrawerFragment.ar.mo2317a()).m5647p())) {
                    navigationDrawerFragment.at.mo1979a(navigationDrawerFragment.ar.mo2317a()).mo1693b().mo1697a(1, TimeUnit.DAYS).mo1714c(2716);
                }
                int size = arrayList.size();
                if (size > 0) {
                    if (size == 1) {
                        navigationDrawerFragment.at.mo1979a(-1).mo1693b().mo1697a(1, TimeUnit.DAYS).mo1714c(2031);
                    } else if (size == 2) {
                        navigationDrawerFragment.at.mo1979a(-1).mo1693b().mo1697a(1, TimeUnit.DAYS).mo1714c(2032);
                    } else if (size == 3) {
                        navigationDrawerFragment.at.mo1979a(-1).mo1693b().mo1697a(1, TimeUnit.DAYS).mo1714c(2033);
                    } else {
                        navigationDrawerFragment.at.mo1979a(-1).mo1693b().mo1697a(1, TimeUnit.DAYS).mo1714c(2034);
                    }
                }
                int b = navigationDrawerFragment.as.mo3461b(navigationDrawerFragment.aq.mo1778a());
                fzw fzw = (fzw) navigationDrawerFragment.binder.m25443a(fzw.class);
                if (glq.m18015c(gwb.m1400H()) && navigationDrawerFragment.as.mo3467c(b) && fzw.mo2152c(b)) {
                    arrayList.add(navigationDrawerFragment.aq);
                    navigationDrawerFragment.at.mo1979a(navigationDrawerFragment.ar.mo2317a()).mo1693b().mo1697a(1, TimeUnit.DAYS).mo1714c(2035);
                    if (fzw.mo2146a(navigationDrawerFragment.ar.mo2317a())) {
                        navigationDrawerFragment.m8755c(navigationDrawerFragment.aq);
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
                    if (!(navigationDrawerFragment.am == null || navigationDrawerFragment.m8756d(navigationDrawerFragment.am))) {
                        navigationDrawerFragment.am = null;
                    }
                    if (!(navigationDrawerFragment.an == null || navigationDrawerFragment.m8756d(navigationDrawerFragment.an))) {
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
                    if (navigationDrawerFragment.f6510i == null) {
                        navigationDrawerFragment.f6510i = new htc(navigationDrawerFragment.getActivity(), gwb.gL, navigationDrawerFragment.aw, navigationDrawerFragment.ax);
                        navigationDrawerFragment.f6510i.m20826b(true);
                        navigationDrawerFragment.f6510i.m20822a(navigationDrawerFragment.f6508g);
                        navigationDrawerFragment.f6510i.m20824a(true);
                    }
                    navigationDrawerFragment.ak = list;
                    navigationDrawerFragment.m8754b(hwn);
                    navigationDrawerFragment.f6510i.m20825b(list);
                    if (navigationDrawerFragment.f6506e != null) {
                        navigationDrawerFragment.f6506e.m9970a(hwn2, hwn3);
                    }
                    navigationDrawerFragment.f6509h.m13093a();
                }
            }
        }
    }
}
