package p000;

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
    public static final jdn f19874c = new jdn();
    public final SharedPreferences f19875b;
    private List<jcl> f19876d;
    private final List<jcm> f19877e;
    private final List<jcn> f19878f;
    private List<jcd> f19879g;
    private final Context f19880h;
    private boolean f19881i;
    private boolean f19882j;
    private final SparseArray<jch> f19883k;
    private final Runnable f19884l;

    jcx(Context context) {
        this(context, context.getSharedPreferences("accounts", 0), null);
    }

    private jcx(Context context, SharedPreferences sharedPreferences, List<jcl> list) {
        this.f19877e = new ArrayList();
        this.f19878f = new ArrayList();
        this.f19881i = true;
        this.f19883k = new SparseArray();
        this.f19884l = new jcy(this);
        this.f19880h = context;
        this.f19875b = sharedPreferences;
        this.f19876d = null;
    }

    private void m23920g() {
        int i = 0;
        if (!this.f19882j) {
            int i2;
            int i3;
            this.f19882j = true;
            if (this.f19876d == null) {
                this.f19876d = jyn.m25438c(this.f19880h, jcl.class);
            }
            List list = this.f19878f;
            list.add(new jda(this));
            list.add(new jdb(this));
            list.add(new jdc(this));
            list.add(new jdd(this));
            list.add(new jde(this));
            list.add(new jdf(this));
            for (jcl a : this.f19876d) {
                a.mo546a(this.f19878f);
            }
            String str = "AccountStore#upgradeAccountCreated";
            if (!this.f19875b.contains(str)) {
                Editor edit = this.f19875b.edit();
                edit.putBoolean(str, true);
                i2 = this.f19875b.getInt("count", 0);
                for (i3 = 0; i3 < i2; i3++) {
                    SharedPreferences sharedPreferences = this.f19875b;
                    String valueOf = String.valueOf("gaia_id");
                    if (sharedPreferences.contains(new StringBuilder(String.valueOf(valueOf).length() + 12).append(i3).append(".").append(valueOf).toString())) {
                        String valueOf2 = String.valueOf("created");
                        edit.putBoolean(new StringBuilder(String.valueOf(valueOf2).length() + 12).append(i3).append(".").append(valueOf2).toString(), true);
                    }
                }
                edit.apply();
            }
            m23943e();
            Editor edit2 = this.f19875b.edit();
            SparseArray sparseArray = new SparseArray();
            for (Integer intValue : mo3453a()) {
                i3 = intValue.intValue();
                sparseArray.put(i3, new jci(this, i3));
            }
            for (jcn a2 : this.f19878f) {
                String a3 = a2.mo547a();
                if (this.f19875b.contains(a3)) {
                    for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                        ((jci) sparseArray.valueAt(i4)).m23881b(a3, true);
                    }
                    edit2.remove(a3);
                }
            }
            for (i2 = 0; i2 < sparseArray.size(); i2++) {
                jci jci = (jci) sparseArray.valueAt(i2);
                for (jcn jcn : this.f19878f) {
                    String a4 = jcn.mo547a();
                    if (!jci.mo3438a(a4)) {
                        jcn.mo548a(this.f19880h, jci);
                        jci.m23881b(a4, true);
                    }
                }
            }
            while (i < sparseArray.size()) {
                ((jci) sparseArray.valueAt(i)).m23871a(sparseArray.keyAt(i), edit2);
                i++;
            }
            edit2.apply();
            m23943e();
        }
    }

    public synchronized int mo3461b(String str) {
        return mo3462b(str, null);
    }

    public synchronized int mo3462b(String str, String str2) {
        int keyAt;
        m23921h();
        SparseArray sparseArray = this.f19883k;
        for (int i = 0; i < sparseArray.size(); i++) {
            jch jch = (jch) sparseArray.valueAt(i);
            if (TextUtils.equals(jch.mo3440b("account_name"), str) && TextUtils.equals(jch.mo3440b("effective_gaia_id"), str2)) {
                keyAt = sparseArray.keyAt(i);
                break;
            }
        }
        keyAt = -1;
        return keyAt;
    }

    public synchronized int mo3466c(String str) {
        int keyAt;
        m23921h();
        SparseArray sparseArray = this.f19883k;
        for (int i = 0; i < sparseArray.size(); i++) {
            jch jch = (jch) sparseArray.valueAt(i);
            if (TextUtils.equals(jch.mo3440b("gaia_id"), str) && !jch.mo3448c("is_managed_account")) {
                keyAt = sparseArray.keyAt(i);
                break;
            }
        }
        keyAt = -1;
        return keyAt;
    }

    public void mo3459a(String str, int i) {
        if (i == -1 || mo3467c(i)) {
            Editor edit = this.f19875b.edit();
            String valueOf = String.valueOf("key.");
            String valueOf2 = String.valueOf(str);
            edit.putInt(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), i).apply();
            m23945f();
            return;
        }
        throw new jcj("Account does not exist: " + i);
    }

    public int mo3468d(String str) {
        SharedPreferences sharedPreferences = this.f19875b;
        String valueOf = String.valueOf("key.");
        String valueOf2 = String.valueOf(str);
        return sharedPreferences.getInt(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), -1);
    }

    private void m23922i(int i) {
        Editor edit = this.f19875b.edit();
        for (String str : this.f19875b.getAll().keySet()) {
            if (str.startsWith("key.") && this.f19875b.getInt(str, -1) == i) {
                edit.remove(str);
            }
        }
        edit.apply();
    }

    public synchronized jch mo3456a(int i) {
        jch jch;
        m23921h();
        jch = (jch) this.f19883k.get(i);
        if (jch == null) {
            throw new jcj("No such account: " + i);
        }
        return jch;
    }

    public synchronized boolean mo3467c(int i) {
        m23921h();
        return this.f19883k.get(i) != null;
    }

    public synchronized boolean mo3469d(int i) {
        boolean z;
        z = mo3467c(i) && mo3456a(i).mo3437a();
        return z;
    }

    public synchronized boolean mo3470e(int i) {
        boolean z;
        z = mo3467c(i) && mo3456a(i).mo3442b();
        return z;
    }

    public jci mo3457a(String str) {
        return mo3458a(str, null);
    }

    public synchronized jci mo3458a(String str, String str2) {
        jci jci;
        boolean z = true;
        synchronized (this) {
            m23920g();
            jci = new jci(this, -1);
            jci.m23881b("created", true);
            jci.m23879b("account_name", str);
            jci.m23879b("effective_gaia_id", str2);
            String str3 = "is_managed_account";
            if (str2 == null) {
                z = false;
            }
            jci.m23881b(str3, z);
            for (jcl a : this.f19876d) {
                a.mo545a(this.f19880h, jci);
            }
            for (jcn a2 : this.f19878f) {
                jci.m23881b(a2.mo547a(), true);
            }
        }
        return jci;
    }

    public void mo3471f(int i) {
        for (jcd c : m23938c()) {
            c.mo1775c(i);
        }
        m23947g(i);
        m23945f();
    }

    public synchronized void m23947g(int i) {
        if (Log.isLoggable("AccountStore", 3)) {
            new StringBuilder(28).append("Removing account ").append(i);
        }
        m23923j(i);
        m23922i(i);
        m23948h(i);
        m23943e();
    }

    public void m23948h(int i) {
        String str = i + ".";
        Editor edit = this.f19875b.edit();
        for (Entry key : this.f19875b.getAll().entrySet()) {
            String str2 = (String) key.getKey();
            if (str2.startsWith(str)) {
                edit.remove(str2);
            }
        }
        edit.apply();
    }

    public synchronized jci mo3464b(int i) {
        if (mo3467c(i)) {
        } else {
            throw new jcj("No such account: " + i);
        }
        return new jci(this, i);
    }

    public synchronized void mo3460a(jcm jcm) {
        gwb.aJ();
        this.f19877e.add(jcm);
    }

    public synchronized void mo3465b(jcm jcm) {
        gwb.aJ();
        this.f19877e.remove(jcm);
    }

    public synchronized List<jcd> m23938c() {
        if (this.f19879g == null) {
            this.f19879g = jyn.m25438c(this.f19880h, jcd.class);
        }
        return this.f19879g;
    }

    public synchronized int m23940d() {
        int i;
        i = this.f19875b.getInt("count", 0);
        this.f19875b.edit().putInt("count", i + 1).apply();
        return i;
    }

    private void m23921h() {
        if (this.f19881i) {
            m23920g();
            int i = this.f19875b.getInt("count", 0);
            this.f19883k.clear();
            for (int i2 = 0; i2 < i; i2++) {
                SharedPreferences sharedPreferences = this.f19875b;
                String valueOf = String.valueOf("created");
                if (sharedPreferences.contains(new StringBuilder(String.valueOf(valueOf).length() + 12).append(i2).append(".").append(valueOf).toString())) {
                    this.f19883k.put(i2, new jdg(this, i2));
                }
            }
            this.f19881i = false;
        }
    }

    public synchronized void m23943e() {
        this.f19881i = true;
    }

    public synchronized List<Integer> mo3453a() {
        List<Integer> arrayList;
        m23921h();
        int size = this.f19883k.size();
        arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(Integer.valueOf(this.f19883k.keyAt(i)));
        }
        return arrayList;
    }

    public synchronized List<Integer> mo3454a(Comparator<jch> comparator) {
        List<Integer> a;
        a = mo3453a();
        Collections.sort(a, new jcz(this, comparator));
        return a;
    }

    public synchronized List<Integer> mo3455a(String... strArr) {
        List<Integer> arrayList;
        m23921h();
        int size = this.f19883k.size();
        arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            jch jch = (jch) this.f19883k.valueAt(i);
            for (String c : strArr) {
                if (!jch.mo3448c(c)) {
                    Object obj = null;
                    break;
                }
            }
            int i2 = 1;
            if (obj != null) {
                arrayList.add(Integer.valueOf(this.f19883k.keyAt(i)));
            }
        }
        return arrayList;
    }

    public void m23945f() {
        if (gwb.aI()) {
            int size = this.f19877e.size();
            jcm[] jcmArr = (jcm[]) this.f19877e.toArray(new jcm[size]);
            for (int i = 0; i < size; i++) {
                jcmArr[i].S_();
            }
            return;
        }
        gwb.m1865a(ljy.m29195a(this.f19884l), true);
    }

    public String mo3463b() {
        return new jdm(this).m23989a();
    }

    private void m23923j(int i) {
        int i2 = 1;
        int i3 = 0;
        try {
            File file = new File(new File(this.f19880h.getFilesDir(), "account-blobs"), String.format("account-%d", new Object[]{Integer.valueOf(i)}));
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
