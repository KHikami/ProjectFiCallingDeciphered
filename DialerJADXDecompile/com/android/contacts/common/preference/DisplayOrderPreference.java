package com.android.contacts.common.preference;

import aic;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.preference.ListPreference;
import android.util.AttributeSet;
import buf;
import rq;

/* compiled from: PG */
public final class DisplayOrderPreference extends ListPreference {
    private aic a;
    private Context b;

    public DisplayOrderPreference(Context context) {
        super(context);
        a();
    }

    public DisplayOrderPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    private final void a() {
        this.b = getContext();
        this.a = new aic(this.b);
        setEntries(new String[]{this.b.getString(buf.eI), this.b.getString(buf.eH)});
        setEntryValues(new String[]{"1", "2"});
        setValue(String.valueOf(this.a.b()));
    }

    protected final boolean shouldPersist() {
        return false;
    }

    public final CharSequence getSummary() {
        switch (this.a.b()) {
            case rq.b /*1*/:
                return this.b.getString(buf.eI);
            case rq.c /*2*/:
                return this.b.getString(buf.eH);
            default:
                return null;
        }
    }

    protected final boolean persistString(String str) {
        int parseInt = Integer.parseInt(str);
        if (parseInt != this.a.b()) {
            this.a.b(parseInt);
            notifyChanged();
        }
        return true;
    }

    protected final void onPrepareDialogBuilder(Builder builder) {
        super.onPrepareDialogBuilder(builder);
        builder.setNegativeButton(null, null);
    }
}
