package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.util.Log;

/* renamed from: bug */
public final class bug implements OnClickListener {
    private final Activity a;
    private final db b;
    private final Intent c;
    private final int d;

    public bug(Activity activity, Intent intent, int i) {
        this.a = activity;
        this.b = null;
        this.c = intent;
        this.d = i;
    }

    public bug(db dbVar, Intent intent, int i) {
        this.a = null;
        this.b = dbVar;
        this.c = intent;
        this.d = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            if (this.c != null && this.b != null) {
                db dbVar = this.b;
                Intent intent = this.c;
                int i2 = this.d;
                if (dbVar.u == null) {
                    throw new IllegalStateException("Fragment " + dbVar + " not attached to Activity");
                }
                dbVar.u.a(dbVar, intent, i2, null);
            } else if (this.c != null) {
                this.a.startActivityForResult(this.c, this.d);
            }
            dialogInterface.dismiss();
        } catch (ActivityNotFoundException e) {
            Log.e("SettingsRedirect", "Can't redirect to app settings for Google Play services");
        }
    }
}
