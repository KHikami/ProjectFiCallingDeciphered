package com.google.android.libraries.social.settings;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.apps.common.proguard.UsedByReflection;
import gwb;
import jwi;
import jwu;
import jwv;
import jxe;

@UsedByReflection
public final class PreferenceScreen extends jwu implements OnDismissListener, OnItemClickListener {
    private ListAdapter a;
    private Dialog c;

    @UsedByReflection
    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, gwb.zK);
    }

    private ListAdapter h() {
        if (this.a == null) {
            this.a = i();
        }
        return this.a;
    }

    private ListAdapter i() {
        return new jwv(this);
    }

    public void a(ListView listView) {
        listView.setOnItemClickListener(this);
        listView.setAdapter(h());
        C();
    }

    protected void M_() {
        if (j() == null && a() != 0) {
            a(null);
        }
    }

    private void a(Bundle bundle) {
        int i;
        Context x = x();
        ListView listView = new ListView(x);
        a(listView);
        CharSequence o = o();
        if (TextUtils.isEmpty(o)) {
            i = 16973830;
        } else {
            i = 16973829;
        }
        DialogInterface dialog = new Dialog(x, i);
        this.c = dialog;
        dialog.setContentView(listView);
        if (!TextUtils.isEmpty(o)) {
            dialog.setTitle(o);
        }
        dialog.setOnDismissListener(this);
        if (bundle != null) {
            dialog.onRestoreInstanceState(bundle);
        }
        B().a(dialog);
        dialog.show();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.c = null;
        B().b(dialogInterface);
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object item = h().getItem(i);
        if (item instanceof jwi) {
            ((jwi) item).a(this);
        }
    }

    protected boolean d() {
        return false;
    }

    protected Parcelable e() {
        Parcelable e = super.e();
        Dialog dialog = this.c;
        if (dialog == null || !dialog.isShowing()) {
            return e;
        }
        Parcelable jxe = new jxe(e);
        jxe.a = true;
        jxe.b = dialog.onSaveInstanceState();
        return jxe;
    }

    protected void a(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(jxe.class)) {
            super.a(parcelable);
            return;
        }
        jxe jxe = (jxe) parcelable;
        super.a(jxe.getSuperState());
        if (jxe.a) {
            a(jxe.b);
        }
    }
}
