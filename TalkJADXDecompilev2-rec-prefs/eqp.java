package p000;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.EditText;
import java.util.List;

final class eqp implements OnItemSelectedListener {
    final /* synthetic */ List f12064a;
    final /* synthetic */ bbk f12065b;
    final /* synthetic */ eql f12066c;

    eqp(eql eql, List list, bbk bbk) {
        this.f12066c = eql;
        this.f12064a = list;
        this.f12065b = bbk;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        CharSequence charSequence = this.f12066c.f12051b.f13802b;
        this.f12066c.f12051b = (fra) this.f12064a.get(i);
        Object obj = this.f12066c.f12051b.f13802b;
        if (!TextUtils.equals(charSequence, obj)) {
            this.f12065b.m4749a(obj);
        }
        EditText editText = this.f12066c.f12055f;
        String str = "+";
        String valueOf = String.valueOf(this.f12066c.f12051b.f13803c);
        editText.setText(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
        this.f12066c.f12051b = (fra) this.f12064a.get(0);
        EditText editText = this.f12066c.f12055f;
        String str = "+";
        String valueOf = String.valueOf(this.f12066c.f12051b.f13803c);
        editText.setText(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }
}
