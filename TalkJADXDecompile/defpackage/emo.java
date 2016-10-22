package defpackage;

import android.app.AlertDialog.Builder;
import android.content.SharedPreferences;

/* renamed from: emo */
final class emo extends emv {
    final SharedPreferences a;
    final /* synthetic */ elk b;

    public emo(elk elk, SharedPreferences sharedPreferences) {
        this.b = elk;
        super("Change API endpoint URLs");
        this.a = sharedPreferences;
    }

    public void a() {
        fom[] values = fom.values();
        CharSequence[] charSequenceArr = new CharSequence[values.length];
        for (int i = 0; i < values.length; i++) {
            charSequenceArr[i] = values[i].toString();
        }
        Builder builder = new Builder(this.b.a);
        builder.setTitle("Choose API to change");
        builder.setItems(charSequenceArr, new emp(this, values));
        builder.show();
    }
}
