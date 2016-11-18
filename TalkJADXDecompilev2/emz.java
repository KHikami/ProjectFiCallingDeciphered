package defpackage;

import android.app.AlertDialog.Builder;
import android.content.SharedPreferences;
import android.text.Html;

final class emz extends emv {
    final SharedPreferences a;
    final /* synthetic */ elk b;
    private final boolean c;

    public emz(elk elk, SharedPreferences sharedPreferences) {
        this.b = elk;
        super("Use desktop to debug all my backend requests");
        this.a = sharedPreferences;
        this.c = sharedPreferences.getBoolean("use_staging_servers", false);
    }

    public void a() {
        Builder builder = new Builder(this.b.a);
        builder.setTitle("Current setting: " + this.c);
        builder.setMessage(Html.fromHtml("Enabling this mode makes the app talk to staging servers where all requests can be logged using xsds.<br/><b>A restart of the app might be required.</b><br/>\n\nAfter enabling this: Visit xsds.corp.google.com and click 'Unlock'"));
        builder.setPositiveButton("Enable it!", new ena(this));
        builder.setNegativeButton("Disable it!", new enb(this));
        builder.show();
    }
}
