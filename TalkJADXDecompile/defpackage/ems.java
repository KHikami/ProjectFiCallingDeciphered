package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences.Editor;
import android.widget.EditText;
import android.widget.Toast;

/* renamed from: ems */
final class ems implements OnClickListener {
    final /* synthetic */ fom a;
    final /* synthetic */ EditText b;
    final /* synthetic */ emo c;

    ems(emo emo, fom fom, EditText editText) {
        this.c = emo;
        this.a = fom;
        this.b = editText;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Editor edit = this.c.a.edit();
        edit.putString(this.a.f, this.b.getText().toString());
        edit.apply();
        Toast.makeText(this.c.b.a, "You may need to restart the app for changes to take effect", 0).show();
    }
}
