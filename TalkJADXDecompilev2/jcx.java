package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;

public final class jcx implements jcf {
    public static final jdn c = new jdn();
    public final SharedPreferences b;
    private List<jcl> d;
    private final List<jcm> e;
    private final List<jcn> f;
    private List<jcd> g;
    private final Context h;
    private boolean i;
    private boolean j;
    private final SparseArray<jch> k;
    private final Runnable l;

    jcx(Context context) {
        this(context, context.getSharedPreferences("accounts", 0), null);
    }

    private jcx(Context context, SharedPreferences sharedPreferences, List<jcl> list) {
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.i = true;
        this.k = new SparseArray();
        this.l = new jcy(this);
        this.h = context;
        this.b = sharedPreferences;
        this.d = null;
    }

    private void g() {
        int i = 0;
        if (!this.j) {
            int i2;
            int i3;
            this.j = true;
            if (this.d == null) {
                this.d = jyn.c(this.h, jcl.class);
            }
            List list = this.f;
            list.add(new jda(this));
            list.add(new jdb(this));
            list.add(new jdc(this));
            list.add(new jdd(this));
            list.add(new jde(this));
            list.add(new jdf(this));
            for (jcl a : this.d) {
                a.a(this.f);
            }
            String str = "AccountStore#upgradeAccountCreated";
            if (!this.b.contains(str)) {
                Editor edit = this.b.edit();
                edit.putBoolean(str, true);
                i2 = this.b.getInt("count", 0);
                for (i3 = 0; i3 < i2; i3++) {
                    SharedPreferences sharedPreferences = this.b;
                    String valueOf = String.valueOf("gaia_id");
                    if (sharedPreferences.contains(new StringBuilder(String.valueOf(valueOf).length() + 12).append(i3).append(".").append(valueOf).toString())) {
                        String valueOf2 = String.valueOf("created");
                        edit.putBoolean(new StringBuilder(String.valueOf(valueOf2).length() + 12).append(i3).append(".").append(valueOf2).toString(), true);
                    }
                }
                edit.apply();
            }
            e();
            Editor edit2 = this.b.edit();
            SparseArray sparseArray = new SparseArray();
            for (Integer intValue : a()) {
                i3 = intValue.intValue();
                sparseArray.put(i3, new jci(this, i3));
            }
            for (jcn a2 : this.f) {
                String a3 = a2.a();
                if (this.b.contains(a3)) {
                    for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                        ((jci) sparseArray.valueAt(i4)).b(a3, true);
                    }
                    edit2.remove(a3);
                }
            }
            for (i2 = 0; i2 < sparseArray.size(); i2++) {
                jci jci = (jci) sparseArray.valueAt(i2);
                for (jcn jcn : this.f) {
                    String a4 = jcn.a();
                    if (!jci.a(a4)) {
                        jcn.a(this.h, jci);
                        jci.b(a4, true);
                    }
                }
            }
            while (i < sparseArray.size()) {
                ((jci) sparseArray.valueAt(i)).a(sparseArray.keyAt(i), edit2);
                i++;
            }
            edit2.apply();
            e();
        }
    }

    public synchronized int b(String str) {
        return b(str, null);
    }

    public synchronized int b(String str, String str2) {
        int keyAt;
        h();
        SparseArray sparseArray = this.k;
        for (int i = 0; i < sparseArray.size(); i++) {
            jch jch = (jch) sparseArray.valueAt(i);
            if (TextUtils.equals(jch.b("account_name"), str) && TextUtils.equals(jch.b("effective_gaia_id"), str2)) {
                keyAt = sparseArray.keyAt(i);
                break;
            }
        }
        keyAt = -1;
        return keyAt;
    }

    public synchronized int c(String str) {
        int keyAt;
        h();
        SparseArray sparseArray = this.k;
        for (int i = 0; i < sparseArray.size(); i++) {
            jch jch = (jch) sparseArray.valueAt(i);
            if (TextUtils.equals(jch.b("gaia_id"), str) && !jch.c("is_managed_account")) {
                keyAt = sparseArray.keyAt(i);
                break;
            }
        }
        keyAt = -1;
        return keyAt;
    }

    public void a(String str, int i) {
        if (i == -1 || c(i)) {
            Editor edit = this.b.edit();
            String valueOf = String.valueOf("key.");
            String valueOf2 = String.valueOf(str);
            edit.putInt(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), i).apply();
            f();
            return;
        }
        throw new jcj("Account does not exist: " + i);
    }

    public int d(String str) {
        SharedPreferences sharedPreferences = this.b;
        String valueOf = String.valueOf("key.");
        String valueOf2 = String.valueOf(str);
        return sharedPreferences.getInt(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), -1);
    }

    private void i(int i) {
        Editor edit = this.b.edit();
        for (String str : this.b.getAll().keySet()) {
            if (str.startsWith("key.") && this.b.getInt(str, -1) == i) {
                edit.remove(str);
            }
        }
        edit.apply();
    }

    public synchronized jch a(int i) {
        jch jch;
        h();
        jch = (jch) this.k.get(i);
        if (jch == null) {
            throw new jcj("No such account: " + i);
        }
        return jch;
    }

    public synchronized boolean c(int i) {
        h();
        return this.k.get(i) != null;
    }

    public synchronized boolean d(int i) {
        boolean z;
        z = c(i) && a(i).a();
        return z;
    }

    public synchronized boolean e(int i) {
        boolean z;
        z = c(i) && a(i).b();
        return z;
    }

    public jci a(String str) {
        return a(str, null);
    }

    public synchronized jci a(String str, String str2) {
        jci jci;
        boolean z = true;
        synchronized (this) {
            g();
            jci = new jci(this, -1);
            jci.b("created", true);
            jci.b("account_name", str);
            jci.b("effective_gaia_id", str2);
            String str3 = "is_managed_account";
            if (str2 == null) {
                z = false;
            }
            jci.b(str3, z);
            for (jcl a : this.d) {
                a.a(this.h, jci);
            }
            for (jcn a2 : this.f) {
                jci.b(a2.a(), true);
            }
        }
        return jci;
    }

    public void f(int i) {
        for (jcd c : c()) {
            c.c(i);
        }
        g(i);
        f();
    }

    public synchronized void g(int i) {
        if (Log.isLoggable("AccountStore", 3)) {
            new StringBuilder(28).append("Removing account ").append(i);
        }
        j(i);
        i(i);
        h(i);
        e();
    }

    public void h(int i) {
        String str = i + ".";
        Editor edit = this.b.edit();
        for (Entry key : this.b.getAll().entrySet()) {
            String str2 = (String) key.getKey();
            if (str2.startsWith(str)) {
                edit.remove(str2);
            }
        }
        edit.apply();
    }

    public synchronized jci b(int i) {
        if (c(i)) {
        } else {
            throw new jcj("No such account: " + i);
        }
        return new jci(this, i);
    }

    public synchronized void a(jcm jcm) {
        gwb.aJ();
        this.e.add(jcm);
    }

    public synchronized void b(jcm jcm) {
        gwb.aJ();
        this.e.remove(jcm);
    }

    public synchronized List<jcd> c() {
        if (this.g == null) {
            this.g = jyn.c(this.h, jcd.class);
        }
        return this.g;
    }

    public synchronized int d() {
        int i;
        i = this.b.getInt("count", 0);
        this.b.edit().putInt("count", i + 1).apply();
        return i;
    }

    private void h() {
        if (this.i) {
            g();
            int i = this.b.getInt("count", 0);
            this.k.clear();
            for (int i2 = 0; i2 < i; i2++) {
                SharedPreferences sharedPreferences = this.b;
                String valueOf = String.valueOf("created");
                if (sharedPreferences.contains(new StringBuilder(String.valueOf(valueOf).length() + 12).append(i2).append(".").append(valueOf).toString())) {
                    this.k.put(i2, new jdg(this, i2));
                }
            }
            this.i = false;
        }
    }

    public synchronized void e() {
        this.i = true;
    }

    public synchronized List<Integer> a() {
        List<Integer> arrayList;
        h();
        int size = this.k.size();
        arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(Integer.valueOf(this.k.keyAt(i)));
        }
        return arrayList;
    }

    public synchronized List<Integer> a(Comparator<jch> comparator) {
        List<Integer> a;
        a = a();
        Collections.sort(a, new jcz(this, comparator));
        return a;
    }

    public synchronized List<Integer> a(String... strArr) {
        List<Integer> arrayList;
        h();
        int size = this.k.size();
        arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            jch jch = (jch) this.k.valueAt(i);
            for (String c : strArr) {
                if (!jch.c(c)) {
                    Object obj = null;
                    break;
                }
            }
            int i2 = 1;
            if (obj != null) {
                arrayList.add(Integer.valueOf(this.k.keyAt(i)));
            }
        }
        return arrayList;
    }

    public void f() {
        if (gwb.aI()) {
            int size = this.e.size();
            jcm[] jcmArr = (jcm[]) this.e.toArray(new jcm[size]);
            for (int i = 0; i < size; i++) {
                jcmArr[i].S_();
            }
            return;
        }
        gwb.a(ljy.a(this.l), true);
    }

    public String b() {
        return new jdm(this).a();
    }

    private void j(int i) {
        int i2 = 1;
        int i3 = 0;
        try {
            File file = new File(new File(this.h.getFilesDir(), "account-blobs"), String.format("account-%d", new Object[]{Integer.valueOf(i)}));
            if (!(file.isDirectory() || file.mkdirs())) {
                i2 = 0;
            }
            if (i2 == 0) {
                String valueOf = String.valueOf(file);
                throw new IOException(new StringBuilder(String.valueOf(valueOf).length() + 35).append("Could not create account blob dir: ").append(valueOf).toString());
            }
            String[] list = file.list();
            while (i3 < list.length) {
                new File(file, list[i3]).delete();
                i3++;
            }
            file.delete();
        } catch (IOException e) {
        }
    }
}
