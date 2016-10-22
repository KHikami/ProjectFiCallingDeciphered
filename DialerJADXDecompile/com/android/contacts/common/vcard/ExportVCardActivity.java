package com.android.contacts.common.vcard;

import ajf;
import ajp;
import ajv;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.ServiceConnection;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.text.BidiFormatter;
import android.text.TextDirectionHeuristics;
import android.util.Log;
import buf;
import cob;
import com.android.contacts.common.activity.RequestImportVCardPermissionsActivity;
import java.util.List;

/* compiled from: PG */
public class ExportVCardActivity extends Activity implements OnCancelListener, OnClickListener, ServiceConnection {
    private static final BidiFormatter c;
    public boolean a;
    public VCardService b;
    private volatile boolean d;
    private String e;

    public ExportVCardActivity() {
        this.d = true;
    }

    static {
        c = BidiFormatter.getInstance();
    }

    public static String a(Context context, Uri uri) {
        String str = null;
        if (uri != null) {
            Cursor query = context.getContentResolver().query(uri, null, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndex("_display_name"));
                        if (query != null) {
                            query.close();
                        }
                    }
                } catch (Throwable th) {
                    if (query != null) {
                        query.close();
                    }
                }
            }
            if (query != null) {
                query.close();
            }
        }
        return str;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!RequestImportVCardPermissionsActivity.a(this)) {
            int i;
            List queryIntentActivities = getPackageManager().queryIntentActivities(b(), 65536);
            if (queryIntentActivities == null || queryIntentActivities.size() <= 0) {
                i = 0;
            } else {
                i = 1;
            }
            if (i == 0) {
                Log.e("VCardExport", "Couldn't find export intent handler");
                c();
                return;
            }
            String string = getIntent().getExtras().getString("CALLING_ACTIVITY");
            Intent intent = new Intent(this, VCardService.class);
            intent.putExtra("CALLING_ACTIVITY", string);
            if (startService(intent) == null) {
                Log.e("VCardExport", "Failed to start vCard service");
                c();
            } else if (!bindService(intent, this, 1)) {
                Log.e("VCardExport", "Failed to connect to vCard service.");
                c();
            }
        }
    }

    private final Intent b() {
        Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("text/x-vcard");
        intent.putExtra("android.intent.extra.TITLE", c.unicodeWrap(getString(buf.eX), TextDirectionHeuristics.LTR));
        return intent;
    }

    private final void c() {
        this.e = getString(buf.fi);
        showDialog(cob.I);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 100) {
            if (!(i2 != -1 || this.b == null || intent == null || intent.getData() == null)) {
                this.b.a(new ajf("com.google.android.dialer.files", intent.getData()), new ajp(this));
            }
            a();
        }
    }

    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.a = true;
        this.b = ((ajv) iBinder).a;
        startActivityForResult(b(), 100);
    }

    public synchronized void onServiceDisconnected(ComponentName componentName) {
        this.b = null;
        this.a = false;
        if (this.d) {
            Log.w("VCardExport", "Disconnected from service during the process ongoing.");
            c();
        }
    }

    protected Dialog onCreateDialog(int i, Bundle bundle) {
        if (i != cob.I) {
            return super.onCreateDialog(i, bundle);
        }
        String str;
        this.d = false;
        Builder title = new Builder(this).setTitle(buf.eT);
        int i2 = buf.eS;
        Object[] objArr = new Object[1];
        if (this.e != null) {
            str = this.e;
        } else {
            str = getString(buf.fi);
        }
        objArr[0] = str;
        return title.setMessage(getString(i2, objArr)).setPositiveButton(17039370, this).setOnCancelListener(this).create();
    }

    protected void onPrepareDialog(int i, Dialog dialog, Bundle bundle) {
        if (i == cob.I) {
            ((AlertDialog) dialog).setMessage(this.e);
        } else {
            super.onPrepareDialog(i, dialog, bundle);
        }
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        a();
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.d = false;
        a();
    }

    public void unbindService(ServiceConnection serviceConnection) {
        this.d = false;
        super.unbindService(serviceConnection);
    }

    protected final synchronized void a() {
        if (this.a) {
            unbindService(this);
            this.a = false;
        }
        finish();
    }
}
