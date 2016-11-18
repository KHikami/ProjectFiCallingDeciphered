package defpackage;

import android.app.AlertDialog;
import android.text.Editable;
import android.text.TextWatcher;

final class bzi implements TextWatcher {
    final /* synthetic */ AlertDialog a;
    final /* synthetic */ bzf b;

    bzi(bzf bzf, AlertDialog alertDialog) {
        this.b = bzf;
        this.a = alertDialog;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.a.getButton(-1).setEnabled(true);
    }
}
