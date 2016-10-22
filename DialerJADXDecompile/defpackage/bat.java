package defpackage;

import android.app.ActionBar;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;

/* compiled from: PG */
/* renamed from: bat */
public final class bat extends ayn implements bav {
    private ListView a;
    private int b;
    private aaz c;
    private LayoutInflater d;
    private baw f;
    private boolean g;
    private boolean h;

    public final /* synthetic */ bdq g() {
        return this;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.h = true;
            this.g = bundle.getBoolean("key_conference_is_visible");
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(buf.kV, viewGroup, false);
        this.a = (ListView) inflate.findViewById(az.am);
        this.c = aaz.a(getActivity().getApplicationContext());
        this.b = (int) getResources().getDimension(buf.kd);
        this.d = LayoutInflater.from(getActivity().getApplicationContext());
        return inflate;
    }

    public final void onResume() {
        super.onResume();
        if (this.h) {
            a(this.g);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("key_conference_is_visible", this.g);
        super.onSaveInstanceState(bundle);
    }

    public final void a(boolean z) {
        this.g = z;
        ActionBar actionBar = getActivity().getActionBar();
        if (z) {
            actionBar.setTitle(aq.cz);
            actionBar.setElevation((float) this.b);
            actionBar.setHideOffset(0);
            actionBar.show();
            azs azs = azs.a;
            bau bau = (bau) this.e;
            Context activity = getActivity();
            bau.a = (Context) Objects.requireNonNull(activity);
            bau.a = activity;
            bau.a(azs);
            this.a.requestFocus();
            return;
        }
        actionBar.setElevation(0.0f);
        actionBar.setHideOffset(actionBar.getHeight());
    }

    public final boolean a() {
        return isVisible();
    }

    public final void a(Context context, List list, boolean z) {
        if (this.f == null) {
            this.f = new baw(this.a, context, this.d, this.c);
            this.a.setAdapter(this.f);
        }
        baw baw = this.f;
        if (baw.c != null) {
            baw.c.a("android.contacts.DISPLAY_ORDER");
            baw.c.a("android.contacts.SORT_ORDER");
        }
        baw.e = z;
        bbc a = bbc.a(baw.b);
        HashSet hashSet = new HashSet(list.size());
        Object obj = null;
        for (ayo ayo : list) {
            bbe a2;
            String str = ayo.d;
            hashSet.add(str);
            bbe bbe = (bbe) a.c.get(str);
            if (bbe == null) {
                a2 = bbc.a(baw.b, ayo, ayo.c() == 4);
            } else {
                a2 = bbe;
            }
            bbb bbb;
            if (baw.a.containsKey(str)) {
                bbb = (bbb) baw.a.get(str);
                bbb.a = ayo;
                bbb.b = a2;
            } else {
                bbb = new bbb(baw, ayo, a2);
                baw.d.add(bbb);
                baw.a.put(ayo.d, bbb);
                obj = 1;
            }
        }
        Iterator it = baw.a.entrySet().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            if (!hashSet.contains((String) entry.getKey())) {
                baw.d.remove((bbb) entry.getValue());
                it.remove();
            }
        }
        if (obj != null) {
            Collections.sort(baw.d, new baz(baw));
        }
        baw.notifyDataSetChanged();
    }

    public final void a(ayo ayo) {
        baw baw = this.f;
        String str = ayo.d;
        if (baw.a.containsKey(str)) {
            ((bbb) baw.a.get(str)).a = ayo;
            baw.a(str);
        }
    }

    public final /* synthetic */ bdj h() {
        return new bau();
    }
}
