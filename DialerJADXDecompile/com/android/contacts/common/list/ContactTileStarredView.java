package com.android.contacts.common.list;

import abc;
import adx;
import android.content.Context;
import android.util.AttributeSet;

/* compiled from: PG */
public class ContactTileStarredView extends adx {
    public ContactTileStarredView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected final boolean a() {
        return false;
    }

    protected final int b() {
        return this.b.a();
    }

    protected final abc a(String str, String str2) {
        return new abc(str, str2, 1, 0.8f, 0.0f, true);
    }
}
