import android.content.Context;
import android.text.Editable;
import android.text.Spannable;
import android.text.TextWatcher;

final class cdj implements TextWatcher {
    final /* synthetic */ Context a;
    final /* synthetic */ cdh b;

    cdj(cdh cdh, Context context) {
        this.b = cdh;
        this.a = context;
    }

    public void afterTextChanged(Editable editable) {
        gob.a(this.a).a((Spannable) editable, null, this.b.b);
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        gwb.b(this.b.k);
        this.b.k.a(charSequence, i2, i3);
        gwb.a(this.b.k);
    }
}
