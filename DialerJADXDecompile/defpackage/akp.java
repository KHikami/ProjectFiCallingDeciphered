package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Trace;
import android.preference.PreferenceManager;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/* compiled from: PG */
/* renamed from: akp */
public class akp extends Application {
    public void onCreate() {
        int i;
        Trace.beginSection("DialerApplication onCreate");
        super.onCreate();
        Trace.beginSection("DialerApplication ExtensionsFactory initialization");
        Context applicationContext = getApplicationContext();
        if (acw.a == null) {
            try {
                InputStream open = applicationContext.getAssets().open("contacts_extensions.properties");
                acw.a = new Properties();
                acw.a.load(open);
                open.close();
                String property = acw.a.getProperty("extendedPhoneDirectories");
                if (property != null) {
                    acw.b = (acv) acw.a(property);
                }
            } catch (FileNotFoundException e) {
            } catch (IOException e2) {
                e2.toString();
            }
        }
        Trace.endSection();
        auk auk = new auk(this, PreferenceManager.getDefaultSharedPreferences(this), new aup(this));
        if (auk.b.contains("checkedAutoMigrate")) {
            buf.c("BlockedNumbersAutoMigrator, not attempting auto-migrate: already checked once.", new Object[0]);
            i = 0;
        } else {
            buf.a("BlockedNumbersAutoMigrator, updating state as already checked for auto-migrate.", new Object[0]);
            auk.b.edit().putBoolean("checkedAutoMigrate", true).apply();
            if (!buf.n()) {
                buf.a("BlockedNumbersAutoMigrator, not attempting auto-migrate: not available.", new Object[0]);
                i = 0;
            } else if (buf.x(auk.a)) {
                buf.a("BlockedNumbersAutoMigrator, not attempting auto-migrate: already migrated.", new Object[0]);
                i = 0;
            } else {
                boolean z = true;
            }
        }
        if (i != 0) {
            buf.a("BlockedNumbersAutoMigrator, attempting to auto-migrate.", new Object[0]);
            auk.c.a(new aul(auk));
        }
        Trace.endSection();
    }
}
