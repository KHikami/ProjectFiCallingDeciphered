package com.android.contacts.common.preference;

import afb;
import agd;
import aic;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.preference.ListPreference;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
public class DefaultAccountPreference extends ListPreference {
    private aic a;
    private Map b;

    public DefaultAccountPreference(Context context) {
        super(context);
        a();
    }

    public DefaultAccountPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    private final void a() {
        this.a = new aic(getContext());
        this.b = new HashMap();
        List<agd> a = afb.a(getContext()).a(true);
        for (agd agd : a) {
            this.b.put(agd.a, agd);
        }
        Set keySet = this.b.keySet();
        String[] strArr = (String[]) keySet.toArray(new String[keySet.size()]);
        setEntries(strArr);
        setEntryValues(strArr);
        String valueOf = String.valueOf(this.a.c());
        if (a.size() == 1) {
            setValue(((agd) a.get(0)).a);
        } else if (keySet.contains(valueOf)) {
            setValue(valueOf);
        } else {
            setValue(null);
        }
    }

    protected boolean shouldPersist() {
        return false;
    }

    public CharSequence getSummary() {
        return this.a.c();
    }

    protected boolean persistString(String str) {
        if (!(str == null && this.a.c() == null) && (str == null || this.a.c() == null || !str.equals(this.a.c()))) {
            this.a.a((agd) this.b.get(str));
            notifyChanged();
        }
        return true;
    }

    protected void onPrepareDialogBuilder(Builder builder) {
        super.onPrepareDialogBuilder(builder);
        builder.setNegativeButton(null, null);
    }
}
