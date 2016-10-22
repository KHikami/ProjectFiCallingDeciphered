package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.EditText;
import java.util.List;

/* renamed from: eqp */
final class eqp implements OnItemSelectedListener {
    final /* synthetic */ List a;
    final /* synthetic */ bbk b;
    final /* synthetic */ eql c;

    eqp(eql eql, List list, bbk bbk) {
        this.c = eql;
        this.a = list;
        this.b = bbk;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        CharSequence charSequence = this.c.b.b;
        this.c.b = (fra) this.a.get(i);
        Object obj = this.c.b.b;
        if (!TextUtils.equals(charSequence, obj)) {
            this.b.a(obj);
        }
        EditText editText = this.c.f;
        String str = "+";
        String valueOf = String.valueOf(this.c.b.c);
        editText.setText(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
        this.c.b = (fra) this.a.get(0);
        EditText editText = this.c.f;
        String str = "+";
        String valueOf = String.valueOf(this.c.b.c);
        editText.setText(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }
}
