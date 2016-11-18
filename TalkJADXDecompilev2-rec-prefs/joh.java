package p000;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class joh implements jcd, jmq {
    final SparseArray<Intent> f20585b;
    final jhx f20586c;
    final jcf f20587d;
    final jum f20588e;
    final jno f20589f;
    jnc f20590g;
    private final Context f20591h;
    private final List<jmr> f20592i;
    private final Object f20593j;
    private final ExecutorService f20594k;
    private final jcr f20595l;
    private final jdy f20596m;

    public joh(Context context) {
        this(context, Executors.newCachedThreadPool(new joi()));
    }

    private joh(Context context, ExecutorService executorService) {
        this.f20592i = new ArrayList();
        this.f20585b = new SparseArray();
        this.f20593j = new Object();
        this.f20591h = context;
        this.f20594k = executorService;
        this.f20586c = (jhx) jyn.m25426a(context, jhx.class);
        this.f20587d = (jcf) jyn.m25426a(context, jcf.class);
        this.f20588e = (jum) jyn.m25426a(context, jum.class);
        this.f20590g = (jnc) jyn.m25433b(context, jnc.class);
        this.f20589f = (jno) jyn.m25426a(context, jno.class);
        this.f20595l = (jcr) jyn.m25426a(context, jcr.class);
        this.f20596m = (jdy) jyn.m25426a(context, jdy.class);
    }

    public void mo3572a(ed edVar, jmu jmu, String str) {
        joa.m24783a(edVar).m24805a(jmu, str);
    }

    boolean m24834a() {
        jms c = joh.m24823c();
        Set hashSet = new HashSet();
        try {
            int intValue;
            for (jco a : this.f20595l.mo3478a()) {
                String a2 = a.m23898a();
                hashSet.add(a2);
                int b = this.f20587d.mo3461b(a2);
                if (m24817a(b, c)) {
                    new StringBuilder(68).append("Account ").append(b).append(" is not ready for login because it needs refresh.");
                    return false;
                }
            }
            for (Integer intValue2 : this.f20587d.mo3453a()) {
                intValue = intValue2.intValue();
                if (!hashSet.contains(this.f20587d.mo3456a(intValue).mo3440b("account_name"))) {
                    new StringBuilder(87).append("Account ").append(intValue).append(" is not ready for login because account store has a removed account.");
                    return false;
                }
            }
            return true;
        } catch (Throwable e) {
            if (Log.isLoggable("LoginManager", 6)) {
                Log.e("LoginManager", "Failed to obtain device accounts when checking if accounts are ready for login", e);
            }
            return false;
        }
    }

    boolean m24841d(int i) {
        if (i == -1) {
            return true;
        }
        if (TextUtils.equals(this.f20589f.m24757a(), this.f20587d.mo3456a(i).mo3440b("LoginManager.build_version"))) {
            return false;
        }
        return true;
    }

    private static jms m24823c() {
        return new jmt().m24728a(true).m24727a(0).m24729b(false).m24726a();
    }

    jnl m24837b() {
        return m24820b(joh.m24823c());
    }

    public void mo3575a(jms jms) {
        m24820b(jms);
    }

    private jnl m24820b(jms jms) {
        jnl jnl;
        this.f20596m.mo3479a();
        synchronized (this.f20593j) {
            gwb.aK();
            jco[] a = this.f20595l.mo3478a();
            List arrayList = new ArrayList(a.length);
            for (jco jco : a) {
                int b = this.f20587d.mo3461b(jco.m23898a());
                boolean a2 = m24817a(b, jms);
                if (Log.isLoggable("LoginManager", 3)) {
                    new StringBuilder(40).append("Account ").append(b).append(" needs refresh: ").append(a2);
                }
                if (a2) {
                    arrayList.add(new jok(this, jco, null, null, jms.m24725c()));
                }
            }
            jnl = new jnl();
            m24821b(arrayList);
            jnl.f20538a = true;
            ArrayList arrayList2 = (ArrayList) arrayList;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                ((jok) obj).m24848a(jnl);
                new StringBuilder(45).append("Account update for ").append(jnl.f20541d).append(" success: ").append(jnl.f20538a);
            }
        }
        return jnl;
    }

    public void mo3573a(String str, jms jms) {
        int b = this.f20587d.mo3461b(str);
        if (b != -1 && this.f20587d.mo3456a(b).mo3448c("logged_out")) {
            throw new jmc("refreshAccount called for a logged out account");
        } else if (m24817a(b, jms)) {
            m24826a(str, null, null, jms.m24725c());
        }
    }

    private boolean m24817a(int i, jms jms) {
        if (i == -1) {
            return true;
        }
        jch a = this.f20587d.mo3456a(i);
        long a2 = a.mo3434a("LoginManager.last_updated", 0);
        if (!a.mo3448c("logged_out")) {
            if (m24841d(i)) {
                return true;
            }
            if (!jms.m24723a() && this.f20586c.mo3524a() - a2 >= jms.m24724b()) {
                return true;
            }
        }
        return false;
    }

    jnl m24826a(String str, String str2, jmu jmu, boolean z) {
        jnl jnl = new jnl();
        try {
            jco a = this.f20595l.mo3476a(str);
            if (a != null) {
                jok jok = new jok(this, a, str2, jmu, z);
                m24821b(Collections.singletonList(jok));
                jnl.f20538a = true;
                jok.m24848a(jnl);
            }
            return jnl;
        } catch (jct e) {
            jnl.f20542e = Collections.singletonList(e);
            return jnl;
        }
    }

    private void m24821b(List<jok> list) {
        gwb.aK();
        Object obj = null;
        this.f20585b.clear();
        List<jnd> c = jyn.m25438c(this.f20591h, jnd.class);
        synchronized (this.f20593j) {
            int[] iArr = new int[]{jng.f20532a, jng.f20533b};
            for (int i = 0; i < 2; i++) {
                int i2 = iArr[i];
                List arrayList = new ArrayList();
                for (jnd jnd : c) {
                    if (jnd.mo1730a() == i2) {
                        arrayList.add(jnd);
                    }
                }
                for (jok a : list) {
                    jok a2;
                    a2.m24847a(arrayList);
                }
                List arrayList2 = new ArrayList(list);
                int i3 = 0;
                while (i3 < 3 && !arrayList2.isEmpty()) {
                    Object obj2;
                    Collection arrayList3 = new ArrayList();
                    ArrayList arrayList4 = (ArrayList) arrayList2;
                    int size = arrayList4.size();
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj3 = arrayList4.get(i4);
                        i4++;
                        ((jok) obj3).m24851b(arrayList3);
                    }
                    try {
                        this.f20594k.invokeAll(arrayList3);
                        arrayList = new ArrayList();
                        ArrayList arrayList5 = (ArrayList) arrayList2;
                        int size2 = arrayList5.size();
                        i4 = 0;
                        while (i4 < size2) {
                            obj2 = arrayList5.get(i4);
                            i4++;
                            a2 = (jok) obj2;
                            if (!a2.m24849a()) {
                                arrayList.add(a2);
                            }
                        }
                        arrayList2 = arrayList;
                        obj2 = obj;
                    } catch (InterruptedException e) {
                        obj2 = 1;
                    }
                    i3++;
                    obj = obj2;
                }
            }
        }
        if (obj != null) {
            Thread.currentThread().interrupt();
        }
        m24824c((List) list);
    }

    private void m24824c(List<jok> list) {
        int i = 0;
        Object obj = null;
        Object obj2 = null;
        while (i < 3) {
            Collection arrayList = new ArrayList(list.size());
            for (jok joj : list) {
                arrayList.add(new joj(this, joj));
            }
            try {
                this.f20594k.invokeAll(arrayList);
                Object obj3 = obj;
                obj = 1;
            } catch (InterruptedException e) {
                int i2 = 1;
                obj = obj2;
            }
            if (obj == null) {
                i++;
                obj2 = obj;
                obj = obj3;
            } else {
                return;
            }
        }
        if (obj != null) {
            Thread.currentThread().interrupt();
        }
    }

    public void mo1774b(int i) {
    }

    public void mo1775c(int i) {
        mo3571a(i);
    }

    void m24842e(int i) {
        List c = jyn.m25438c(this.f20591h, jnh.class);
        int size = c.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((jnh) c.get(i2)).mo609a(i);
        }
    }

    public void mo3574a(jmr jmr) {
        this.f20592i.add(jmr);
    }

    public void mo3577b(jmr jmr) {
        this.f20592i.remove(jmr);
    }

    static boolean m24818a(jci jci, List<jmw> list) {
        boolean z;
        boolean c = jci.mo3448c("logged_in");
        if (list != null) {
            z = true;
            for (jmw jmw : list) {
                boolean z2;
                if (z && jmw.mo1735e(jci)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z = z2;
            }
        } else {
            z = true;
        }
        if (!z) {
            return false;
        }
        if (!c) {
            if (jci.mo3448c("logged_out") && !jci.mo3448c("has_irrecoverable_error")) {
                jci.m23884c();
            }
            jci.m23881b("logged_in", true).m23881b("logged_out", false);
        }
        return true;
    }

    public void mo3571a(int i) {
        if (this.f20587d.mo3469d(i)) {
            synchronized (this.f20593j) {
                m24843f(i);
            }
        }
    }

    void m24843f(int i) {
        if (this.f20587d.mo3469d(i) || !this.f20587d.mo3470e(i)) {
            jch a = this.f20587d.mo3456a(i);
            if (!a.mo3448c("is_managed_account")) {
                String b = a.mo3440b("account_name");
                List a2 = this.f20587d.mo3453a();
                int size = a2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Integer num = (Integer) a2.get(i2);
                    jch a3 = this.f20587d.mo3456a(num.intValue());
                    if (a3.mo3437a() && a3.mo3448c("is_managed_account") && a3.mo3440b("account_name").equals(b)) {
                        m24843f(num.intValue());
                    }
                }
            }
            this.f20587d.mo3464b(i).m23881b("logged_out", true).m23881b("logged_in", false).m23891d();
            m24842e(i);
        }
    }

    public boolean mo3576a(jmu jmu, int i) {
        return m24819a(jmu, i, jmu.f20501d);
    }

    private boolean m24819a(jmu jmu, int i, boolean z) {
        if (!this.f20587d.mo3467c(i) || m24836b(jmu, i) != null) {
            return false;
        }
        if (!z || this.f20587d.mo3456a(i).mo3448c("logged_in")) {
            return true;
        }
        return false;
    }

    jmw m24836b(jmu jmu, int i) {
        List arrayList = new ArrayList();
        jch a = this.f20587d.mo3456a(i);
        if (this.f20590g != null) {
            jnc jnc = this.f20590g;
            a.mo3440b("account_name");
            jnc.mo1732a(arrayList);
        }
        arrayList.addAll(jmu.f20518u);
        for (jmw jmw : m24825a(arrayList)) {
            if (!jmw.mo1735e(a)) {
                return jmw;
            }
        }
        return null;
    }

    List<jmw> m24825a(List<Class<? extends jmw>> list) {
        List<jmw> arrayList = new ArrayList();
        for (Class a : list) {
            arrayList.add((jmw) jyn.m25426a(this.f20591h, a));
        }
        return arrayList;
    }

    void m24833a(jmu jmu, String str, int i) {
        m24822b(jmu, str, i);
    }

    void m24832a(jmu jmu, String str) {
        m24822b(jmu, str, -1);
    }

    private void m24822b(jmu jmu, String str, int i) {
        for (jmr a : this.f20592i) {
            a.mo3565a(jmu, str, i);
        }
    }

    public Intent m24844g(int i) {
        return (Intent) this.f20585b.get(i);
    }

    static IOException m24816a(juo juo) {
        Throwable th = juo.f5766m;
        if (th != null) {
            return new IOException("Rpc failed", th);
        }
        if (!juo.m8076n()) {
            return null;
        }
        return new IOException("RPC failed with code " + juo.f5764k);
    }
}
