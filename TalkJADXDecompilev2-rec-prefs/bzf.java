package p000;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public final class bzf extends dq {
    bzj aj;

    public Dialog mo792a(Bundle bundle) {
        CharSequence string = getArguments().getString("name");
        Builder builder = new Builder(getActivity());
        View inflate = getActivity().getLayoutInflater().inflate(gwb.kv, null);
        EditText editText = (EditText) inflate.findViewById(gwb.ku);
        editText.setText(string);
        editText.setSelection(0, editText.getText().toString().length());
        builder.setTitle(gwb.ky).setView(inflate).setPositiveButton(getString(gwb.kz), new bzh(this, editText)).setNegativeButton(getString(gwb.kx), new bzg(this));
        Dialog create = builder.create();
        editText.addTextChangedListener(new bzi(this, create));
        create.getWindow().setSoftInputMode(5);
        return create;
    }

    public void m7014a(bzj bzj) {
        this.aj = bzj;
    }
}
