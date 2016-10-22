package com.android.contacts.common.preference;

import aic;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.preference.ListPreference;
import android.util.AttributeSet;
import buf;
import rq;

/* compiled from: PG */
public final class SortOrderPreference extends ListPreference {
    private aic a;
    private Context b;

    public SortOrderPreference(Context context) {
        super(context);
        a();
    }

    public SortOrderPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    private final void a() {
        this.b = getContext();
        this.a = new aic(this.b);
        setEntries(new String[]{this.b.getString(buf.eG), this.b.getString(buf.eF)});
        setEntryValues(new String[]{"1", "2"});
        setValue(String.valueOf(this.a.a()));
    }

    protected final boolean shouldPersist() {
        return false;
    }

    public final CharSequence getSummary() {
        switch (this.a.a()) {
            case rq.b /*1*/:
                return this.b.getString(buf.eG);
            case rq.c /*2*/:
                return this.b.getString(buf.eF);
            default:
                return null;
        }
    }

    protected final boolean persistString(String str) {
        int parseInt = Integer.parseInt(str);
        if (parseInt != this.a.a()) {
            this.a.a(parseInt);
            notifyChanged();
        }
        return true;
    }

    protected final void onPrepareDialogBuilder(Builder builder) {
        super.onPrepareDialogBuilder(builder);
        builder.setNegativeButton(null, null);
    }
}
