package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.util.Log;

public abstract class gwc implements OnClickListener {
    public static gwc a(Activity activity, Intent intent, int i) {
        return new gwd(activity, intent, i);
    }

    public abstract void a();

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            a();
            dialogInterface.dismiss();
        } catch (ActivityNotFoundException e) {
            Log.e("DialogRedirect", "Can't redirect to app settings for Google Play services");
        }
    }
}
