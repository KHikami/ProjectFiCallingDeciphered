package com.android.dialer.app.list;

import abw;
import adh;
import adi;
import adn;
import aeg;
import aix;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Loader;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract.QuickContact;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import apu;
import apv;
import aq;
import ath;
import buf;
import bv;
import cc;
import cob;
import com.android.dialer.app.widget.EmptyContentView;

/* compiled from: PG */
public class AllContactsFragment extends adi implements ath, cc {
    private EmptyContentView k;
    private BroadcastReceiver l;

    public /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        a(loader, (Cursor) obj);
    }

    public AllContactsFragment() {
        this.l = new apu(this);
        this.b = false;
        this.c = true;
        c(true);
        a(true);
        e(false);
        b(true);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.k = (EmptyContentView) view.findViewById(aq.aq);
        this.k.b(cob.al);
        this.k.a(cob.aZ);
        this.k.d = this;
        this.i.setEmptyView(this.k);
        this.k.setVisibility(8);
        aix.a(this.i, getResources());
    }

    public void onStart() {
        super.onStart();
        buf.a(getActivity(), this.l, "android.permission.READ_CONTACTS");
    }

    public void onStop() {
        buf.a(getActivity(), this.l);
        super.onStop();
    }

    protected final void f_() {
        if (buf.c(getActivity(), "android.permission.READ_CONTACTS")) {
            super.f_();
            this.k.a(cob.aZ);
            this.k.c(cob.ba);
            return;
        }
        this.k.a(cob.cA);
        this.k.c(cob.cE);
        this.k.setVisibility(0);
    }

    public final void a(Loader loader, Cursor cursor) {
        super.a(loader, cursor);
        if (cursor == null || cursor.getCount() == 0) {
            this.k.setVisibility(0);
        }
    }

    protected final adh a() {
        aeg apv = new apv(this, getActivity());
        apv.f = true;
        apv.t = adn.a(-1);
        apv.x = this.a;
        return apv;
    }

    protected final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(buf.hr, null);
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Uri uri = (Uri) view.getTag();
        if (uri == null) {
            return;
        }
        if (abw.a()) {
            QuickContact.showQuickContact(getContext(), view, uri, null, "vnd.android.cursor.item/phone_v2");
        } else {
            QuickContact.showQuickContact(getActivity(), view, uri, 3, null);
        }
    }

    protected final void a(int i, long j) {
    }

    public final void e_() {
        Context activity = getActivity();
        if (activity != null) {
            if (buf.c(activity, "android.permission.READ_CONTACTS")) {
                buf.a(activity, buf.l(), cob.aY);
                return;
            }
            bv.a(this, new String[]{"android.permission.READ_CONTACTS"}, 1);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 1 && iArr.length > 0 && iArr[0] == 0) {
            c_();
        }
    }
}
