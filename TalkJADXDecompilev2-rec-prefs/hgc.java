package p000;

import android.app.Activity;
import android.app.Fragment;
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

public final class hgc extends Fragment implements hgb {
    private static WeakHashMap<Activity, WeakReference<hgc>> f16893a = new WeakHashMap();
    private Map<String, hga> f16894b = new ky();
    private int f16895c = 0;
    private Bundle f16896d;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static hgc m19723a(Activity activity) {
        WeakReference weakReference = (WeakReference) f16893a.get(activity);
        if (weakReference != null) {
            hgc hgc = (hgc) weakReference.get();
        }
        try {
            hgc = (hgc) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (hgc == null || hgc.isRemoving()) {
                hgc = new hgc();
                activity.getFragmentManager().beginTransaction().add(hgc, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            f16893a.put(activity, new WeakReference(hgc));
            return hgc;
        } catch (Throwable e) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
        }
    }

    public Activity mo2533a() {
        return getActivity();
    }

    public <T extends hga> T mo2534a(String str, Class<T> cls) {
        return (hga) cls.cast(this.f16894b.get(str));
    }

    public void mo2535a(String str, hga hga) {
        if (this.f16894b.containsKey(str)) {
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 59).append("LifecycleCallback with tag ").append(str).append(" already added to this fragment.").toString());
        }
        this.f16894b.put(str, hga);
        if (this.f16895c > 0) {
            new Handler(Looper.getMainLooper()).post(new hgd(this, hga, str));
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (hga a : this.f16894b.values()) {
            a.mo2476a(str, fileDescriptor, printWriter, strArr);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (hga a : this.f16894b.values()) {
            a.mo2471a(i, i2, intent);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f16895c = 1;
        this.f16896d = bundle;
        for (Entry entry : this.f16894b.entrySet()) {
            ((hga) entry.getValue()).mo2472a(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Entry entry : this.f16894b.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((hga) entry.getValue()).mo2474b(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public void onStart() {
        super.onStop();
        this.f16895c = 2;
        for (hga a : this.f16894b.values()) {
            a.mo2470a();
        }
    }

    public void onStop() {
        super.onStop();
        this.f16895c = 3;
        for (hga b : this.f16894b.values()) {
            b.mo2473b();
        }
    }
}
