package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class jti implements kcd, kcl, kcn, kcq {
    private final Activity a;
    private final Set<jtl> b = new HashSet();
    private SparseArray<jsu> c;
    private jfb<jtc> d;

    jti(Activity activity, kbu kbu) {
        this.a = activity;
        kbu.a((kcq) this);
    }

    public void a(Bundle bundle) {
        if (bundle != null) {
            this.c = bundle.getSparseParcelableArray("com.google.android.libraries.social.permissionmanager.PermissionResultReceiver.Requests");
            String str = "onCreate restored requests: ";
            String valueOf = String.valueOf(this.c == null ? "" : this.c.toString());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
            this.d = (jfb) bundle.getParcelable("com.google.android.libraries.social.permissionmanager.PermissionResultReceiver.Results");
        }
        if (this.c == null) {
            this.c = new SparseArray();
        }
        if (this.d == null) {
            this.d = new jfb(jtc.class);
        }
    }

    public void b(Bundle bundle) {
        bundle.putSparseParcelableArray("com.google.android.libraries.social.permissionmanager.PermissionResultReceiver.Requests", this.c);
        bundle.putParcelable("com.google.android.libraries.social.permissionmanager.PermissionResultReceiver.Results", this.d);
    }

    void a(jtl jtl) {
        this.b.add(jtl);
    }

    void b(jtl jtl) {
        this.b.remove(jtl);
    }

    void a(jte jte, int i, List<String> list) {
        String valueOf = String.valueOf(list.toString());
        new StringBuilder(String.valueOf(valueOf).length() + 32).append("requestPermissions: ").append(i).append(" ").append(valueOf);
        if (this.c.size() > 0) {
            String valueOf2 = String.valueOf(this.c.toString());
            throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf2).length() + 62).append("Cannot request permissions ").append(i).append(" when already requested ").append(valueOf2).toString());
        }
        this.c.put(i, new jsu((List) list));
        List arrayList = new ArrayList();
        for (String valueOf3 : list) {
            if (jte.a(this.a, valueOf3) == -1) {
                arrayList.add(valueOf3);
            }
        }
        if (arrayList.isEmpty()) {
            new StringBuilder(44).append("requestPermissions: ").append(i).append(", all granted");
            gwb.a(ljy.a(new jtj(this, i)));
            return;
        }
        new StringBuilder(51).append("requestPermissions: ").append(i).append(", ").append(arrayList.size()).append(" needed");
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        jte.a(this.a, strArr, i);
    }

    public List<jtc> a(int i) {
        List<jtc> a = this.d.a(Integer.valueOf(i));
        if (a == null) {
            return Collections.emptyList();
        }
        return a;
    }

    public void a(int i, String[] strArr, int[] iArr) {
        Object obj = null;
        new StringBuilder(39).append("onRequestPermissionsResult: ").append(i);
        jsu jsu = (jsu) this.c.get(i);
        if (jsu == null) {
            String valueOf = String.valueOf(this.c.toString());
            throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 37).append("No permission request ").append(i).append(" in ").append(valueOf).toString());
        }
        List a = jsu.a();
        this.c.remove(i);
        int[] iArr2 = new int[a.size()];
        for (int i2 = 0; i2 < a.size(); i2++) {
            int i3;
            for (int i4 = 0; i4 < strArr.length; i4++) {
                if (((String) a.get(i2)).equals(strArr[i4])) {
                    i3 = iArr[i4];
                    break;
                }
            }
            i3 = 0;
            iArr2[i2] = i3;
        }
        Parcelable jtc = new jtc(i, (String[]) a.toArray(new String[a.size()]), iArr2);
        for (jtl a2 : this.b) {
            if (a2.a(jtc)) {
                obj = 1;
            }
        }
        if (obj == null) {
            new StringBuilder(55).append("onRequestPermissionsResult: ").append(i).append(" not handled yet");
            this.d.a(Integer.valueOf(i), jtc);
        }
    }
}
