package defpackage;

import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.View;
import android.widget.EditText;

final class emp implements OnClickListener {
    final /* synthetic */ fom[] a;
    final /* synthetic */ emo b;

    emp(emo emo, fom[] fomArr) {
        this.b = emo;
        this.a = fomArr;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        emo emo = this.b;
        fom fom = this.a[i];
        CharSequence string = emo.a.getString(fom.f, null);
        View editText = new EditText(emo.b.a);
        editText.setInputType(16);
        editText.setHint(fom.g.a());
        editText.setId(fom.ordinal());
        if (string != null) {
            editText.setText(string);
        }
        Builder builder = new Builder(emo.b.a);
        String str = "Change endpoint for ";
        String valueOf = String.valueOf(fom.toString());
        builder.setTitle(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        builder.setView(editText);
        builder.setNegativeButton("Cancel", new emq(emo));
        builder.setNeutralButton("Set to default", new emr(emo, fom));
        builder.setPositiveButton("Set it!", new ems(emo, fom, editText));
        builder.show();
    }
}
