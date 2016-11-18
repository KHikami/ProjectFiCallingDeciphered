package p000;

import android.app.AlertDialog.Builder;
import android.content.SharedPreferences;

final class emt extends emv {
    final SharedPreferences f11863a;
    final /* synthetic */ elk f11864b;

    public emt(elk elk, SharedPreferences sharedPreferences) {
        this.f11864b = elk;
        super("Change gRpc endpoint type");
        this.f11863a = sharedPreferences;
    }

    public void mo811a() {
        fbs[] values = fbs.values();
        CharSequence[] charSequenceArr = new CharSequence[values.length];
        for (int i = 0; i < values.length; i++) {
            charSequenceArr[i] = values[i].name();
        }
        Builder builder = new Builder(this.f11864b.f11810a);
        builder.setTitle("Choose server type");
        builder.setItems(charSequenceArr, new emu(this, charSequenceArr));
        builder.show();
    }
}
