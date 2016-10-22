package com.google.android.libraries.componentview.services.application;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnShowListener;
import android.util.Log;
import ofd;
import ofe;

public class DialogLauncher {
    Dialog b;
    ofe c;

    class 1 implements OnShowListener {
        final /* synthetic */ Dialog a;
        final /* synthetic */ ofd b;
        final /* synthetic */ DialogLauncher c;

        public void onShow(DialogInterface dialogInterface) {
            this.c.b = this.a;
            this.c.c = this.b.b;
        }
    }

    class 2 implements OnDismissListener {
        final /* synthetic */ DialogLauncher a;

        public void onDismiss(DialogInterface dialogInterface) {
            this.a.b = null;
            this.a.c = null;
        }
    }

    class 3 implements OnCancelListener {
        public void onCancel(DialogInterface dialogInterface) {
        }
    }

    public interface DialogListener {
    }

    public void a() {
        if (b()) {
            this.b.dismiss();
        } else {
            Log.e("DialogLauncher", "There is no open dialog to dismiss");
        }
    }

    public boolean b() {
        return this.b != null;
    }
}
