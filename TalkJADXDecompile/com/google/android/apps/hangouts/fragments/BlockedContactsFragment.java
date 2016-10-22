package com.google.android.apps.hangouts.fragments;

import android.database.Cursor;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import ba;
import bko;
import com.google.android.apps.hangouts.content.EsProvider;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import cyv;
import cyw;
import cyx;
import cyy;
import dcj;
import enl;
import fde;
import fh;
import fip;
import fme;
import fmf;
import fzw;
import gni;
import gwb;
import ig;
import jca;
import lo;

public class BlockedContactsFragment extends dcj implements fh<Cursor> {
    public bko a;
    public cyw b;
    public int c;
    public jca d;
    public lo<Integer, cyy> e;
    public final gni f;
    private ListView g;
    private boolean h;
    private final fip i;

    public BlockedContactsFragment() {
        this.h = false;
        this.c = -1;
        this.f = new gni(this);
        this.i = new cyv(this);
    }

    public /* synthetic */ void onLoadFinished(ig igVar, Object obj) {
        a(igVar, (Cursor) obj);
    }

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.d = (jca) this.binder.a(jca.class);
    }

    public void a() {
        if (!this.h) {
            RealTimeChatService.a(this.i);
            this.h = true;
        }
    }

    public void b() {
        if (this.h) {
            RealTimeChatService.b(this.i);
            this.h = false;
        }
    }

    public void onCreate(Bundle bundle) {
        this.e = new lo();
        super.onCreate(bundle);
        this.a = fde.e(this.d.a());
    }

    public void onDestroy() {
        super.onDestroy();
        b();
        this.g.setAdapter(null);
        this.e = null;
    }

    public void onStart() {
        super.onStart();
        if (!((fzw) this.binder.a(fzw.class)).a(this.a.g())) {
            a();
            fme a = ((fmf) this.binder.a(fmf.class)).a();
            this.c = a.a();
            RealTimeChatService.a(a, this.a);
        }
        a(getView());
    }

    public void onStop() {
        super.onStop();
        b();
        this.e.clear();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(gwb.fN, viewGroup, false);
        this.g = (ListView) inflate.findViewById(ba.db);
        this.b = new cyw(this, getActivity(), null);
        this.g.setAdapter(this.b);
        getLoaderManager().a(1026, new Bundle(), this).t();
        return inflate;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    protected boolean isEmpty() {
        return this.b == null || this.b.a() == null || this.b.getCount() == 0;
    }

    public void a(View view) {
        if (c()) {
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

    protected boolean c() {
        return this.b == null || this.b.a() == null || this.c != -1;
    }

    public ig<Cursor> onCreateLoader(int i, Bundle bundle) {
        switch (i) {
            case 1026:
                bko bko = this.a;
                Builder buildUpon = EsProvider.m.buildUpon();
                buildUpon.appendQueryParameter("account_id", Integer.toString(bko.g()));
                return new enl(getActivity(), this.a, buildUpon.build(), cyx.a, null, null, "name ASC");
            default:
                return null;
        }
    }

    public void a(ig<Cursor> igVar, Cursor cursor) {
        switch (igVar.p()) {
            case 1026:
                this.b.a(cursor);
                a(getView());
            default:
        }
    }

    public void onLoaderReset(ig<Cursor> igVar) {
        switch (igVar.p()) {
            case 1026:
                this.b.a(null);
            default:
        }
    }
}
