package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: cmm */
public final class cmm extends jzn {
    static final gma a;
    static int b;
    GridView c;
    String d;
    jca e;
    dex f;
    dey g;

    static {
        a = gma.a("Babel_Stickers");
        b = 0;
    }

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.e = (jca) this.binder.a(jca.class);
        this.f = (dex) this.binder.a(dex.class);
        this.g = (dey) this.binder.a(dey.class);
    }

    public void onDestroy() {
        a();
        super.onDestroy();
    }

    private void a() {
        if (this.f.c() && this.c != null) {
            for (int i = 0; i < this.c.getChildCount(); i++) {
                this.f.a(this.c.getChildAt(i));
            }
        }
    }

    public void onCreate(Bundle bundle) {
        a.b("onCreate");
        super.onCreate(bundle);
        this.d = getArguments().getString("album_id");
        a.c("onCreate");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c = (GridView) layoutInflater.inflate(gwb.ns, viewGroup, false);
        a(this.c, null);
        this.c.setOnItemClickListener(new cmn(this));
        return this.c;
    }

    public void onStart() {
        if (((cmy) getTargetFragment()).i.isEmpty()) {
            glk.d("Babel_Stickers", "No sticker cache at start.", new Object[0]);
        } else {
            new cmp(this).execute(new Void[0]);
        }
        super.onStart();
    }

    void a(String str, boolean z) {
        int i;
        List<eyg> list = ((cmy) getTargetFragment()).i;
        if (list.isEmpty() || str == null) {
            i = -1;
        } else {
            i = -1;
            for (eyg eyg : list) {
                if (!"Recent".equals(eyg.a)) {
                    int size;
                    for (eyi eyi : eyg.e) {
                        if (str.equals(eyi.a)) {
                            size = (eyg.e.size() - eyg.e.indexOf(eyi)) + ((list.size() - list.indexOf(eyg)) * 1000);
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
            glk.e(str2, valueOf, new Object[0]);
            return;
        }
        gwb.a(fde.e(((jca) this.binder.a(jca.class)).a()), 1900, i);
        if (z) {
            gwb.a(fde.e(((jca) this.binder.a(jca.class)).a()), 2240, i);
        }
    }

    void a(GridView gridView, ArrayList<cmq> arrayList) {
        if (getActivity() != null && gridView != null) {
            if (!(this.f.c() || gridView.getAdapter() == null)) {
                ((cmr) gridView.getAdapter()).a();
            }
            if (arrayList != null) {
                gridView.setAdapter(new cmr(this, arrayList));
            } else {
                gridView.setAdapter(null);
            }
        }
    }

    public void onDestroyView() {
        if (!(this.c == null || this.c.getAdapter() == null)) {
            if (this.f.c()) {
                a();
            } else {
                glk.c("Babel_Stickers", "Clearing cache.", new Object[0]);
                ((cmr) this.c.getAdapter()).a();
            }
            ((cmr) this.c.getAdapter()).clear();
            a(this.c, null);
        }
        super.onDestroyView();
    }
}
