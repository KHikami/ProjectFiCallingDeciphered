package com.android.contacts.common.list;

import adg;
import adw;
import adx;
import aix;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View.OnClickListener;

/* compiled from: PG */
public class ContactTilePhoneFrequentView extends adx {
    public String a;

    public ContactTilePhoneFrequentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected final boolean a() {
        return true;
    }

    public final void a(adg adg) {
        super.a(adg);
        this.a = null;
        if (adg != null) {
            this.a = adg.g;
        }
    }

    protected final OnClickListener c() {
        return new adw(this);
    }

    protected final int b() {
        return aix.a(this.e);
    }
}
