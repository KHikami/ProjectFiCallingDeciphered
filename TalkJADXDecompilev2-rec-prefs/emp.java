package p000;

import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.View;
import android.widget.EditText;

final class emp implements OnClickListener {
    final /* synthetic */ fom[] f11855a;
    final /* synthetic */ emo f11856b;

    emp(emo emo, fom[] fomArr) {
        this.f11856b = emo;
        this.f11855a = fomArr;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        emo emo = this.f11856b;
        fom fom = this.f11855a[i];
        CharSequence string = emo.f11853a.getString(fom.f13582f, null);
        View editText = new EditText(emo.f11854b.f11810a);
        editText.setInputType(16);
        editText.setHint(fom.f13583g.m25576a());
        editText.setId(fom.ordinal());
        if (string != null) {
            editText.setText(string);
        }
        Builder builder = new Builder(emo.f11854b.f11810a);
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
