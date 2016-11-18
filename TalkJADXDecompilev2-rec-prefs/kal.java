package p000;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import java.io.File;

public final class kal extends dq implements OnClickListener {
    public Dialog mo792a(Bundle bundle) {
        CharSequence charSequence = null;
        Context activity = getActivity();
        try {
            PackageManager packageManager = activity.getPackageManager();
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(activity.getPackageName(), 0);
            if (applicationInfo != null) {
                charSequence = packageManager.getApplicationLabel(applicationInfo);
            }
        } catch (NameNotFoundException e) {
        }
        if (charSequence == null) {
            charSequence = activity.getString(gwb.zZ);
        }
        Builder builder = new Builder(activity);
        builder.setTitle(activity.getString(gwb.Ab, new Object[]{charSequence}));
        builder.setMessage(activity.getString(gwb.Aa, new Object[]{charSequence}));
        builder.setPositiveButton(17039370, this);
        builder.setCancelable(true);
        return builder.create();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        switch (i) {
            case -1:
                Context activity = getActivity();
                new File(activity.getFilesDir(), "corrupted_install").delete();
                String str = "android.intent.action.VIEW";
                String str2 = "market://details?id=";
                String valueOf = String.valueOf(activity.getPackageName());
                if (valueOf.length() != 0) {
                    valueOf = str2.concat(valueOf);
                } else {
                    valueOf = new String(str2);
                }
                activity.startActivity(new Intent(str, Uri.parse(valueOf)));
                activity.finish();
                return;
            default:
                return;
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
        dw activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }
}
