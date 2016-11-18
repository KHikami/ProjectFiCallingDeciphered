package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import java.util.ArrayList;
import java.util.List;

public final class cmm extends jzn {
    static final gma f5644a = gma.m18073a("Babel_Stickers");
    static int f5645b = 0;
    GridView f5646c;
    String f5647d;
    jca f5648e;
    dex f5649f;
    dey f5650g;

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.f5648e = (jca) this.binder.m25443a(jca.class);
        this.f5649f = (dex) this.binder.m25443a(dex.class);
        this.f5650g = (dey) this.binder.m25443a(dey.class);
    }

    public void onDestroy() {
        m7926a();
        super.onDestroy();
    }

    private void m7926a() {
        if (this.f5649f.mo1511c() && this.f5646c != null) {
            for (int i = 0; i < this.f5646c.getChildCount(); i++) {
                this.f5649f.mo1503a(this.f5646c.getChildAt(i));
            }
        }
    }

    public void onCreate(Bundle bundle) {
        f5644a.m18078b("onCreate");
        super.onCreate(bundle);
        this.f5647d = getArguments().getString("album_id");
        f5644a.m18079c("onCreate");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f5646c = (GridView) layoutInflater.inflate(gwb.ns, viewGroup, false);
        m7927a(this.f5646c, null);
        this.f5646c.setOnItemClickListener(new cmn(this));
        return this.f5646c;
    }

    public void onStart() {
        if (((cmy) getTargetFragment()).f5639i.isEmpty()) {
            glk.m17981d("Babel_Stickers", "No sticker cache at start.", new Object[0]);
        } else {
            new cmp(this).execute(new Void[0]);
        }
        super.onStart();
    }

    void m7928a(String str, boolean z) {
        int i;
        List<eyg> list = ((cmy) getTargetFragment()).f5639i;
        if (list.isEmpty() || str == null) {
            i = -1;
        } else {
            i = -1;
            for (eyg eyg : list) {
                if (!"Recent".equals(eyg.f12515a)) {
                    int size;
                    for (eyi eyi : eyg.f12519e) {
                        if (str.equals(eyi.f12520a)) {
                            size = (eyg.f12519e.size() - eyg.f12519e.indexOf(eyi)) + ((list.size() - list.indexOf(eyg)) * 1000);
                            break;
                        }
                    }
                    size = i;
                    if (size != -1) {
                        i = size;
                        break;
                    }
                    i = size;
                }
            }
        }
        if (i == -1) {
            String str2 = "Babel_Stickers";
            String str3 = "Photo not found for log: ";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                valueOf = str3.concat(valueOf);
            } else {
                valueOf = new String(str3);
            }
            glk.m17982e(str2, valueOf, new Object[0]);
            return;
        }
        gwb.m1824a(fde.m15018e(((jca) this.binder.m25443a(jca.class)).mo2317a()), 1900, i);
        if (z) {
            gwb.m1824a(fde.m15018e(((jca) this.binder.m25443a(jca.class)).mo2317a()), 2240, i);
        }
    }

    void m7927a(GridView gridView, ArrayList<cmq> arrayList) {
        if (getActivity() != null && gridView != null) {
            if (!(this.f5649f.mo1511c() || gridView.getAdapter() == null)) {
                ((cmr) gridView.getAdapter()).m7933a();
            }
            if (arrayList != null) {
                gridView.setAdapter(new cmr(this, arrayList));
            } else {
                gridView.setAdapter(null);
            }
        }
    }

    public void onDestroyView() {
        if (!(this.f5646c == null || this.f5646c.getAdapter() == null)) {
            if (this.f5649f.mo1511c()) {
                m7926a();
            } else {
                glk.m17979c("Babel_Stickers", "Clearing cache.", new Object[0]);
                ((cmr) this.f5646c.getAdapter()).m7933a();
            }
            ((cmr) this.f5646c.getAdapter()).clear();
            m7927a(this.f5646c, null);
        }
        super.onDestroyView();
    }
}
