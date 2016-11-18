package defpackage;

import android.app.AlertDialog.Builder;
import android.content.SharedPreferences;

final class emt extends emv {
    final SharedPreferences a;
    final /* synthetic */ elk b;

    public emt(elk elk, SharedPreferences sharedPreferences) {
        this.b = elk;
        super("Change gRpc endpoint type");
        this.a = sharedPreferences;
    }

    public void a() {
        fbs[] values = fbs.values();
        CharSequence[] charSequenceArr = new CharSequence[values.length];
        for (int i = 0; i < values.length; i++) {
            charSequenceArr[i] = values[i].name();
        }
        Builder builder = new Builder(this.b.a);
        builder.setTitle("Choose server type");
        builder.setItems(charSequenceArr, new emu(this, charSequenceArr));
        builder.show();
    }
}
