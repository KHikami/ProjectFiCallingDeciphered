package p000;

import android.app.AlertDialog.Builder;
import android.content.SharedPreferences;
import android.text.Html;

final class emz extends emv {
    final SharedPreferences f11870a;
    final /* synthetic */ elk f11871b;
    private final boolean f11872c;

    public emz(elk elk, SharedPreferences sharedPreferences) {
        this.f11871b = elk;
        super("Use desktop to debug all my backend requests");
        this.f11870a = sharedPreferences;
        this.f11872c = sharedPreferences.getBoolean("use_staging_servers", false);
    }

    public void mo811a() {
        Builder builder = new Builder(this.f11871b.f11810a);
        builder.setTitle("Current setting: " + this.f11872c);
        builder.setMessage(Html.fromHtml("Enabling this mode makes the app talk to staging servers where all requests can be logged using xsds.<br/><b>A restart of the app might be required.</b><br/>\n\nAfter enabling this: Visit xsds.corp.google.com and click 'Unlock'"));
        builder.setPositiveButton("Enable it!", new ena(this));
        builder.setNegativeButton("Disable it!", new enb(this));
        builder.show();
    }
}
