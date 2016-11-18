package p000;

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
    private final Activity f21028a;
    private final Set<jtl> f21029b = new HashSet();
    private SparseArray<jsu> f21030c;
    private jfb<jtc> f21031d;

    jti(Activity activity, kbu kbu) {
        this.f21028a = activity;
        kbu.m25514a((kcq) this);
    }

    public void mo643a(Bundle bundle) {
        if (bundle != null) {
            this.f21030c = bundle.getSparseParcelableArray("com.google.android.libraries.social.permissionmanager.PermissionResultReceiver.Requests");
            String str = "onCreate restored requests: ";
            String valueOf = String.valueOf(this.f21030c == null ? "" : this.f21030c.toString());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
            this.f21031d = (jfb) bundle.getParcelable("com.google.android.libraries.social.permissionmanager.PermissionResultReceiver.Results");
        }
        if (this.f21030c == null) {
            this.f21030c = new SparseArray();
        }
        if (this.f21031d == null) {
            this.f21031d = new jfb(jtc.class);
        }
    }

    public void mo645b(Bundle bundle) {
        bundle.putSparseParcelableArray("com.google.android.libraries.social.permissionmanager.PermissionResultReceiver.Requests", this.f21030c);
        bundle.putParcelable("com.google.android.libraries.social.permissionmanager.PermissionResultReceiver.Results", this.f21031d);
    }

    void m25196a(jtl jtl) {
        this.f21029b.add(jtl);
    }

    void m25198b(jtl jtl) {
        this.f21029b.remove(jtl);
    }

    void m25195a(jte jte, int i, List<String> list) {
        String valueOf = String.valueOf(list.toString());
        new StringBuilder(String.valueOf(valueOf).length() + 32).append("requestPermissions: ").append(i).append(" ").append(valueOf);
        if (this.f21030c.size() > 0) {
            String valueOf2 = String.valueOf(this.f21030c.toString());
            throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf2).length() + 62).append("Cannot request permissions ").append(i).append(" when already requested ").append(valueOf2).toString());
        }
        this.f21030c.put(i, new jsu((List) list));
        List arrayList = new ArrayList();
        for (String valueOf3 : list) {
            if (jte.m25187a(this.f21028a, valueOf3) == -1) {
                arrayList.add(valueOf3);
            }
        }
        if (arrayList.isEmpty()) {
            new StringBuilder(44).append("requestPermissions: ").append(i).append(", all granted");
            gwb.m1863a(ljy.m29195a(new jtj(this, i)));
            return;
        }
        new StringBuilder(51).append("requestPermissions: ").append(i).append(", ").append(arrayList.size()).append(" needed");
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        jte.m25188a(this.f21028a, strArr, i);
    }

    public List<jtc> m25192a(int i) {
        List<jtc> a = this.f21031d.m24073a(Integer.valueOf(i));
        if (a == null) {
            return Collections.emptyList();
        }
        return a;
    }

    public void mo3607a(int i, String[] strArr, int[] iArr) {
        Object obj = null;
        new StringBuilder(39).append("onRequestPermissionsResult: ").append(i);
        jsu jsu = (jsu) this.f21030c.get(i);
        if (jsu == null) {
            String valueOf = String.valueOf(this.f21030c.toString());
            throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 37).append("No permission request ").append(i).append(" in ").append(valueOf).toString());
        }
        List a = jsu.m25172a();
        this.f21030c.remove(i);
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
        for (jtl a2 : this.f21029b) {
            if (a2.mo3606a(jtc)) {
                obj = 1;
            }
        }
        if (obj == null) {
            new StringBuilder(55).append("onRequestPermissionsResult: ").append(i).append(" not handled yet");
            this.f21031d.m24074a(Integer.valueOf(i), jtc);
        }
    }
}
