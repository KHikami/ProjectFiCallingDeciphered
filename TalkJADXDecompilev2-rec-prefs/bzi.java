package p000;

import android.app.AlertDialog;
import android.text.Editable;
import android.text.TextWatcher;

final class bzi implements TextWatcher {
    final /* synthetic */ AlertDialog f4829a;
    final /* synthetic */ bzf f4830b;

    bzi(bzf bzf, AlertDialog alertDialog) {
        this.f4830b = bzf;
        this.f4829a = alertDialog;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f4829a.getButton(-1).setEnabled(true);
    }
}
