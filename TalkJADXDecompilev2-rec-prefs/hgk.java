package p000;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;

public final class hgk extends dr implements hgb {
    private static WeakHashMap<dw, WeakReference<hgk>> f16906a = new WeakHashMap();
    private Map<String, hga> f16907b = new ky();
    private int f16908c = 0;
    private Bundle f16909d;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static hgk m19740a(dw dwVar) {
        WeakReference weakReference = (WeakReference) f16906a.get(dwVar);
        if (weakReference != null) {
            hgk hgk = (hgk) weakReference.get();
        }
        try {
            hgk = (hgk) dwVar.J_().mo1844a("SupportLifecycleFragmentImpl");
            if (hgk == null || hgk.isRemoving()) {
                hgk = new hgk();
                dwVar.J_().mo1845a().mo1528a((dr) hgk, "SupportLifecycleFragmentImpl").mo1529b();
            }
            f16906a.put(dwVar, new WeakReference(hgk));
            return hgk;
        } catch (Throwable e) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
        }
    }

    private dw m19742b() {
        return getActivity();
    }

    public /* synthetic */ Activity mo2533a() {
        return m19742b();
    }

    public <T extends hga> T mo2534a(String str, Class<T> cls) {
        return (hga) cls.cast(this.f16907b.get(str));
    }

    public void mo2535a(String str, hga hga) {
        if (this.f16907b.containsKey(str)) {
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 59).append("LifecycleCallback with tag ").append(str).append(" already added to this fragment.").toString());
        }
        this.f16907b.put(str, hga);
        if (this.f16908c > 0) {
            new Handler(Looper.getMainLooper()).post(new hgl(this, hga, str));
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (hga a : this.f16907b.values()) {
            a.mo2476a(str, fileDescriptor, printWriter, strArr);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (hga a : this.f16907b.values()) {
            a.mo2471a(i, i2, intent);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f16908c = 1;
        this.f16909d = bundle;
        for (Entry entry : this.f16907b.entrySet()) {
            ((hga) entry.getValue()).mo2472a(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Entry entry : this.f16907b.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((hga) entry.getValue()).mo2474b(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public void onStart() {
        super.onStop();
        this.f16908c = 2;
        for (hga a : this.f16907b.values()) {
            a.mo2470a();
        }
    }

    public void onStop() {
        super.onStop();
        this.f16908c = 3;
        for (hga b : this.f16907b.values()) {
            b.mo2473b();
        }
    }
}
