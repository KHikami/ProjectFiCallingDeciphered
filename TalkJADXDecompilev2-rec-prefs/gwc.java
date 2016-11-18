package p000;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.util.Log;

public abstract class gwc implements OnClickListener {
    public static gwc m18764a(Activity activity, Intent intent, int i) {
        return new gwd(activity, intent, i);
    }

    public abstract void mo2355a();

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            mo2355a();
            dialogInterface.dismiss();
        } catch (ActivityNotFoundException e) {
            Log.e("DialogRedirect", "Can't redirect to app settings for Google Play services");
        }
    }
}
