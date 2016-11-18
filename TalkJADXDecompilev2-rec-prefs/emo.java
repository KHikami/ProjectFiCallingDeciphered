package p000;

import android.app.AlertDialog.Builder;
import android.content.SharedPreferences;

final class emo extends emv {
    final SharedPreferences f11853a;
    final /* synthetic */ elk f11854b;

    public emo(elk elk, SharedPreferences sharedPreferences) {
        this.f11854b = elk;
        super("Change API endpoint URLs");
        this.f11853a = sharedPreferences;
    }

    public void mo811a() {
        fom[] values = fom.values();
        CharSequence[] charSequenceArr = new CharSequence[values.length];
        for (int i = 0; i < values.length; i++) {
            charSequenceArr[i] = values[i].toString();
        }
        Builder builder = new Builder(this.f11854b.f11810a);
        builder.setTitle("Choose API to change");
        builder.setItems(charSequenceArr, new emp(this, values));
        builder.show();
    }
}
