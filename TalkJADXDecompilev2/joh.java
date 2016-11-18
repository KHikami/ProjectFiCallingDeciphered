package defpackage;

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
    final SparseArray<Intent> b;
    final jhx c;
    final jcf d;
    final jum e;
    final jno f;
    jnc g;
    private final Context h;
    private final List<jmr> i;
    private final Object j;
    private final ExecutorService k;
    private final jcr l;
    private final jdy m;

    public joh(Context context) {
        this(context, Executors.newCachedThreadPool(new joi()));
    }

    private joh(Context context, ExecutorService executorService) {
        this.i = new ArrayList();
        this.b = new SparseArray();
        this.j = new Object();
        this.h = context;
        this.k = executorService;
        this.c = (jhx) jyn.a(context, jhx.class);
        this.d = (jcf) jyn.a(context, jcf.class);
        this.e = (jum) jyn.a(context, jum.class);
        this.g = (jnc) jyn.b(context, jnc.class);
        this.f = (jno) jyn.a(context, jno.class);
        this.l = (jcr) jyn.a(context, jcr.class);
        this.m = (jdy) jyn.a(context, jdy.class);
    }

    public void a(ed edVar, jmu jmu, String str) {
        joa.a(edVar).a(jmu, str);
    }

    boolean a() {
        jms c = joh.c();
        Set hashSet = new HashSet();
        try {
            int intValue;
            for (jco a : this.l.a()) {
                String a2 = a.a();
                hashSet.add(a2);
                int b = this.d.b(a2);
                if (a(b, c)) {
                    new StringBuilder(68).append("Account ").append(b).append(" is not ready for login because it needs refresh.");
                    return false;
                }
            }
            for (Integer intValue2 : this.d.a()) {
                intValue = intValue2.intValue();
                if (!hashSet.contains(this.d.a(intValue).b("account_name"))) {
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

    boolean d(int i) {
        if (i == -1) {
            return true;
        }
        if (TextUtils.equals(this.f.a(), this.d.a(i).b("LoginManager.build_version"))) {
            return false;
        }
        return true;
    }

    private static jms c() {
        return new jmt().a(true).a(0).b(false).a();
    }

    jnl b() {
        return b(joh.c());
    }

    public void a(jms jms) {
        b(jms);
    }

    private jnl b(jms jms) {
        jnl jnl;
        this.m.a();
        synchronized (this.j) {
            gwb.aK();
            jco[] a = this.l.a();
            List arrayList = new ArrayList(a.length);
            for (jco jco : a) {
                int b = this.d.b(jco.a());
                boolean a2 = a(b, jms);
                if (Log.isLoggable("LoginManager", 3)) {
                    new StringBuilder(40).append("Account ").append(b).append(" needs refresh: ").append(a2);
                }
                if (a2) {
                    arrayList.add(new jok(this, jco, null, null, jms.c()));
                }
            }
            jnl = new jnl();
            b(arrayList);
            jnl.a = true;
            ArrayList arrayList2 = (ArrayList) arrayList;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                ((jok) obj).a(jnl);
                new StringBuilder(45).append("Account update for ").append(jnl.d).append(" success: ").append(jnl.a);
            }
        }
        return jnl;
    }

    public void a(String str, jms jms) {
        int b = this.d.b(str);
        if (b != -1 && this.d.a(b).c("logged_out")) {
            throw new jmc("refreshAccount called for a logged out account");
        } else if (a(b, jms)) {
            a(str, null, null, jms.c());
        }
    }

    private boolean a(int i, jms jms) {
        if (i == -1) {
            return true;
        }
        jch a = this.d.a(i);
        long a2 = a.a("LoginManager.last_updated", 0);
        if (!a.c("logged_out")) {
            if (d(i)) {
                return true;
            }
            if (!jms.a() && this.c.a() - a2 >= jms.b()) {
                return true;
            }
        }
        return false;
    }

    jnl a(String str, String str2, jmu jmu, boolean z) {
        jnl jnl = new jnl();
        try {
            jco a = this.l.a(str);
            if (a != null) {
                jok jok = new jok(this, a, str2, jmu, z);
                b(Collections.singletonList(jok));
                jnl.a = true;
                jok.a(jnl);
            }
            return jnl;
        } catch (jct e) {
            jnl.e = Collections.singletonList(e);
            return jnl;
        }
    }

    private void b(List<jok> list) {
        gwb.aK();
        Object obj = null;
        this.b.clear();
        List<jnd> c = jyn.c(this.h, jnd.class);
        synchronized (this.j) {
            int[] iArr = new int[]{jng.a, jng.b};
            for (int i = 0; i < 2; i++) {
                int i2 = iArr[i];
                List arrayList = new ArrayList();
                for (jnd jnd : c) {
                    if (jnd.a() == i2) {
                        arrayList.add(jnd);
                    }
                }
                for (jok a : list) {
                    jok a2;
                    a2.a(arrayList);
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
                        ((jok) obj3).b(arrayList3);
                    }
                    try {
                        this.k.invokeAll(arrayList3);
                        arrayList = new ArrayList();
                        ArrayList arrayList5 = (ArrayList) arrayList2;
                        int size2 = arrayList5.size();
                        i4 = 0;
                        while (i4 < size2) {
                            obj2 = arrayList5.get(i4);
                            i4++;
                            a2 = (jok) obj2;
                            if (!a2.a()) {
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
        c((List) list);
    }

    private void c(List<jok> list) {
        int i = 0;
        Object obj = null;
        Object obj2 = null;
        while (i < 3) {
            Collection arrayList = new ArrayList(list.size());
            for (jok joj : list) {
                arrayList.add(new joj(this, joj));
            }
            try {
                this.k.invokeAll(arrayList);
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

    public void b(int i) {
    }

    public void c(int i) {
        a(i);
    }

    void e(int i) {
        List c = jyn.c(this.h, jnh.class);
        int size = c.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((jnh) c.get(i2)).a(i);
        }
    }

    public void a(jmr jmr) {
        this.i.add(jmr);
    }

    public void b(jmr jmr) {
        this.i.remove(jmr);
    }

    static boolean a(jci jci, List<jmw> list) {
        boolean z;
        boolean c = jci.c("logged_in");
        if (list != null) {
            z = true;
            for (jmw jmw : list) {
                boolean z2;
                if (z && jmw.e(jci)) {
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
            if (jci.c("logged_out") && !jci.c("has_irrecoverable_error")) {
                jci.c();
            }
            jci.b("logged_in", true).b("logged_out", false);
        }
        return true;
    }

    public void a(int i) {
        if (this.d.d(i)) {
            synchronized (this.j) {
                f(i);
            }
        }
    }

    void f(int i) {
        if (this.d.d(i) || !this.d.e(i)) {
            jch a = this.d.a(i);
            if (!a.c("is_managed_account")) {
                String b = a.b("account_name");
                List a2 = this.d.a();
                int size = a2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Integer num = (Integer) a2.get(i2);
                    jch a3 = this.d.a(num.intValue());
                    if (a3.a() && a3.c("is_managed_account") && a3.b("account_name").equals(b)) {
                        f(num.intValue());
                    }
                }
            }
            this.d.b(i).b("logged_out", true).b("logged_in", false).d();
            e(i);
        }
    }

    public boolean a(jmu jmu, int i) {
        return a(jmu, i, jmu.d);
    }

    private boolean a(jmu jmu, int i, boolean z) {
        if (!this.d.c(i) || b(jmu, i) != null) {
            return false;
        }
        if (!z || this.d.a(i).c("logged_in")) {
            return true;
        }
        return false;
    }

    jmw b(jmu jmu, int i) {
        List arrayList = new ArrayList();
        jch a = this.d.a(i);
        if (this.g != null) {
            jnc jnc = this.g;
            a.b("account_name");
            jnc.a(arrayList);
        }
        arrayList.addAll(jmu.u);
        for (jmw jmw : a(arrayList)) {
            if (!jmw.e(a)) {
                return jmw;
            }
        }
        return null;
    }

    List<jmw> a(List<Class<? extends jmw>> list) {
        List<jmw> arrayList = new ArrayList();
        for (Class a : list) {
            arrayList.add((jmw) jyn.a(this.h, a));
        }
        return arrayList;
    }

    void a(jmu jmu, String str, int i) {
        b(jmu, str, i);
    }

    void a(jmu jmu, String str) {
        b(jmu, str, -1);
    }

    private void b(jmu jmu, String str, int i) {
        for (jmr a : this.i) {
            a.a(jmu, str, i);
        }
    }

    public Intent g(int i) {
        return (Intent) this.b.get(i);
    }

    static IOException a(juo juo) {
        Throwable th = juo.m;
        if (th != null) {
            return new IOException("Rpc failed", th);
        }
        if (!juo.n()) {
            return null;
        }
        return new IOException("RPC failed with code " + juo.k);
    }
}
