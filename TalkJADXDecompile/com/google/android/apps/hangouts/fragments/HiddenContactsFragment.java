package com.google.android.apps.hangouts.fragments;

import android.app.Activity;
import android.database.Cursor;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import ba;
import bhl;
import bko;
import bkq;
import com.google.android.apps.hangouts.content.EsProvider;
import dcj;
import dcs;
import dct;
import dcu;
import dcv;
import dcw;
import dcx;
import enl;
import fde;
import fh;
import fkr;
import gia;
import gie;
import gpb;
import gwb;
import ig;
import iih;
import java.util.HashMap;
import java.util.Map;
import jca;

public class HiddenContactsFragment extends dcj implements fh<Cursor> {
    public jca a;
    public dcu b;
    public Map<String, String> c;
    public final gpb d;
    private ListView e;
    private boolean f;
    private final gia<dcx> g;
    private final gia<dcw> h;

    public HiddenContactsFragment() {
        this.f = false;
        this.g = new dcs(this);
        this.h = new dct(this);
        this.d = new gpb(this);
    }

    public /* synthetic */ void onLoadFinished(ig igVar, Object obj) {
        a(igVar, (Cursor) obj);
    }

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.a = (jca) this.binder.a(jca.class);
        ((iih) this.binder.a(iih.class)).a(this.a.a()).b().c(3315);
    }

    public void a() {
        if (!this.f) {
            int a = this.a.a();
            gie gie = (gie) this.binder.a(gie.class);
            gie.a(dcw.class, this.h, dcw.a(a));
            gie.a(dcx.class, this.g, dcx.a(a));
            this.f = true;
        }
    }

    public void onCreate(Bundle bundle) {
        this.c = new HashMap();
        super.onCreate(bundle);
    }

    public void onDestroy() {
        super.onDestroy();
        this.e.setAdapter(null);
        this.c = null;
    }

    public void onStart() {
        super.onStart();
        a();
        ((bhl) this.binder.a(bhl.class)).a(new fkr(this.a.a()));
        a(getView());
    }

    public void onStop() {
        super.onStop();
        this.c.clear();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(gwb.gO, viewGroup, false);
        this.e = (ListView) inflate.findViewById(ba.db);
        this.b = new dcu(this, getActivity(), null);
        this.e.setAdapter(this.b);
        getLoaderManager().a(1027, new Bundle(), this).t();
        return inflate;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    protected boolean isEmpty() {
        return this.b == null || this.b.a() == null || this.b.getCount() == 0;
    }

    public void a(View view) {
        if (b()) {
            showEmptyViewProgress(view);
        } else if (isEmpty()) {
            showEmptyView(view);
        } else {
            showContent(view);
        }
    }

    protected void doShowEmptyViewProgress(View view) {
        if (isEmpty()) {
            view.findViewById(16908292).setVisibility(8);
            view.findViewById(ba.cW).setVisibility(0);
            view.findViewById(ba.db).setVisibility(8);
        }
    }

    protected void showContent(View view) {
        super.showContent(view);
        view.findViewById(ba.cW).setVisibility(8);
        view.findViewById(ba.db).setVisibility(0);
    }

    protected boolean b() {
        if (!(this.b == null || this.b.a() == null)) {
            boolean z;
            if (bkq.a(getContext(), this.a.a(), "last_suggested_contacts_time", 0) == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public ig<Cursor> onCreateLoader(int i, Bundle bundle) {
        switch (i) {
            case 1027:
                bko e = fde.e(this.a.a());
                Builder buildUpon = EsProvider.n.buildUpon();
                buildUpon.appendQueryParameter("account_id", Integer.toString(e.g()));
                return new enl(getActivity(), e, buildUpon.build(), dcv.a, null, null, "name ASC");
            default:
                return null;
        }
    }

    public void a(ig<Cursor> igVar, Cursor cursor) {
        switch (igVar.p()) {
            case 1027:
                this.b.a(cursor);
                a(getView());
            default:
        }
    }

    public void onLoaderReset(ig<Cursor> igVar) {
        switch (igVar.p()) {
            case 1027:
                this.b.a(null);
            default:
        }
    }
}
