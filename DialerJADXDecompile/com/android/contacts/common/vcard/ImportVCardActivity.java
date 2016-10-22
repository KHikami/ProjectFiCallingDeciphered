package com.android.contacts.common.vcard;

import afb;
import agd;
import aji;
import ajj;
import ajk;
import ajm;
import ajn;
import ajt;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.ProgressDialog;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import buf;
import cob;
import com.android.contacts.common.activity.RequestImportVCardPermissionsActivity;
import es;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public class ImportVCardActivity extends Activity {
    public ajt a;
    public agd b;
    public ProgressDialog c;
    public ajn d;
    public ajm e;
    public String f;
    private Handler g;
    private ajk h;

    public ImportVCardActivity() {
        this.g = new Handler();
        this.h = new ajk(this);
    }

    private final void a(Uri uri, String str) {
        a(new Uri[]{uri}, new String[]{str});
    }

    private final void a(Uri[] uriArr, String[] strArr) {
        runOnUiThread(new aji(this, uriArr, strArr));
    }

    private final String a(Uri uri) {
        Throwable th;
        Cursor cursor = null;
        if (uri == null) {
            return null;
        }
        try {
            String string;
            Cursor query = getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
            if (query != null) {
                try {
                    if (query.getCount() > 0 && query.moveToFirst()) {
                        if (query.getCount() > 1) {
                            Log.w("VCardImport", "Unexpected multiple rows: " + query.getCount());
                        }
                        int columnIndex = query.getColumnIndex("_display_name");
                        if (columnIndex >= 0) {
                            string = query.getString(columnIndex);
                            if (query != null) {
                                query.close();
                            }
                            if (TextUtils.isEmpty(string)) {
                                return string;
                            }
                            return uri.getLastPathSegment();
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = query;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            string = null;
            if (query != null) {
                query.close();
            }
            if (TextUtils.isEmpty(string)) {
                return string;
            }
            return uri.getLastPathSegment();
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    private final Uri b(Uri uri, String str) {
        Throwable th;
        WritableByteChannel writableByteChannel = null;
        String.format("Copy a Uri to app local storage (%s -> %s)", new Object[]{uri, str});
        ReadableByteChannel newChannel;
        try {
            newChannel = Channels.newChannel(getContentResolver().openInputStream(uri));
            try {
                Uri parse = Uri.parse(getFileStreamPath(str).toURI().toString());
                writableByteChannel = openFileOutput(str, 0).getChannel();
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(8192);
                while (newChannel.read(allocateDirect) != -1) {
                    allocateDirect.flip();
                    writableByteChannel.write(allocateDirect);
                    allocateDirect.compact();
                }
                allocateDirect.flip();
                while (allocateDirect.hasRemaining()) {
                    writableByteChannel.write(allocateDirect);
                }
                if (newChannel != null) {
                    try {
                        newChannel.close();
                    } catch (IOException e) {
                        Log.w("VCardImport", "Failed to close inputChannel.");
                    }
                }
                if (writableByteChannel != null) {
                    try {
                        writableByteChannel.close();
                    } catch (IOException e2) {
                        Log.w("VCardImport", "Failed to close outputChannel");
                    }
                }
                return parse;
            } catch (Throwable th2) {
                th = th2;
                if (newChannel != null) {
                    try {
                        newChannel.close();
                    } catch (IOException e3) {
                        Log.w("VCardImport", "Failed to close inputChannel.");
                    }
                }
                if (writableByteChannel != null) {
                    try {
                        writableByteChannel.close();
                    } catch (IOException e4) {
                        Log.w("VCardImport", "Failed to close outputChannel");
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            newChannel = null;
            if (newChannel != null) {
                newChannel.close();
            }
            if (writableByteChannel != null) {
                writableByteChannel.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String b(android.net.Uri r6) {
        /*
        r5 = this;
        r1 = 0;
        r0 = 0;
    L_0x0002:
        r2 = "import_tmp_";
        r2 = java.lang.String.valueOf(r2);
        r3 = new java.lang.StringBuilder;
        r4 = java.lang.String.valueOf(r2);
        r4 = r4.length();
        r4 = r4 + 15;
        r3.<init>(r4);
        r2 = r3.append(r2);
        r2 = r2.append(r0);
        r3 = ".vcf";
        r2 = r2.append(r3);
        r2 = r2.toString();
        r3 = r5.getFileStreamPath(r2);
        r3 = r3.exists();
        if (r3 == 0) goto L_0x0043;
    L_0x0033:
        r2 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        if (r0 != r2) goto L_0x0040;
    L_0x0038:
        r0 = new java.lang.RuntimeException;
        r1 = "Exceeded cache limit";
        r0.<init>(r1);
        throw r0;
    L_0x0040:
        r0 = r0 + 1;
        goto L_0x0002;
    L_0x0043:
        r5.b(r6, r2);	 Catch:{ SecurityException -> 0x0056, IOException -> 0x0065 }
        if (r2 != 0) goto L_0x0074;
    L_0x0048:
        r0 = "VCardImport";
        r2 = "Cannot load uri to local storage.";
        android.util.Log.e(r0, r2);
        r0 = buf.fe;
        r5.a(r0);
        r0 = r1;
    L_0x0055:
        return r0;
    L_0x0056:
        r0 = move-exception;
        r2 = "VCardImport";
        r3 = "SecurityException";
        android.util.Log.e(r2, r3, r0);
        r0 = buf.fe;
        r5.a(r0);
        r0 = r1;
        goto L_0x0055;
    L_0x0065:
        r0 = move-exception;
        r2 = "VCardImport";
        r3 = "IOException during caching vCard";
        android.util.Log.e(r2, r3, r0);
        r0 = buf.fe;
        r5.a(r0);
        r0 = r1;
        goto L_0x0055;
    L_0x0074:
        r0 = r2;
        goto L_0x0055;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.contacts.common.vcard.ImportVCardActivity.b(android.net.Uri):java.lang.String");
    }

    private final Uri c(Uri uri) {
        String b = b(uri);
        if (b == null) {
            return null;
        }
        return Uri.parse(getFileStreamPath(b).toURI().toString());
    }

    protected void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        Uri data = getIntent().getData();
        if (data == null || !data.toString().startsWith("file:///storage")) {
            z = false;
        } else {
            z = true;
        }
        if (!z || !RequestImportVCardPermissionsActivity.a(this)) {
            String stringExtra;
            String stringExtra2;
            if (data != null) {
                stringExtra = getIntent().getStringExtra("com.android.contacts.common.vcard.LOCAL_TMP_FILE_NAME");
                stringExtra2 = getIntent().getStringExtra("com.android.contacts.common.vcard.SOURCE_URI_DISPLAY_NAME");
                if (TextUtils.isEmpty(stringExtra)) {
                    stringExtra = b(data);
                    stringExtra2 = a(data);
                    if (stringExtra == null) {
                        Log.e("VCardImport", "Cannot load uri to local storage.");
                        a(buf.fe);
                        return;
                    }
                    getIntent().putExtra("com.android.contacts.common.vcard.LOCAL_TMP_FILE_NAME", stringExtra);
                    getIntent().putExtra("com.android.contacts.common.vcard.SOURCE_URI_DISPLAY_NAME", stringExtra2);
                }
                data = Uri.parse(getFileStreamPath(stringExtra).toURI().toString());
            } else {
                stringExtra2 = null;
            }
            if (!RequestImportVCardPermissionsActivity.a(this)) {
                Object stringExtra3;
                Object stringExtra4;
                Intent intent = getIntent();
                if (intent != null) {
                    stringExtra3 = intent.getStringExtra("account_name");
                    stringExtra4 = intent.getStringExtra("account_type");
                    stringExtra = intent.getStringExtra("data_set");
                } else {
                    Log.e("VCardImport", "intent does not exist");
                    stringExtra = null;
                    stringExtra4 = null;
                    stringExtra3 = null;
                }
                if (TextUtils.isEmpty(stringExtra3) || TextUtils.isEmpty(stringExtra4)) {
                    List a = afb.a((Context) this).a(true);
                    if (a.size() == 0) {
                        this.b = null;
                    } else if (a.size() == 1) {
                        this.b = (agd) a.get(0);
                    } else {
                        startActivityForResult(new Intent(this, SelectAccountActivity.class), 0);
                        return;
                    }
                }
                this.b = new agd(stringExtra3, stringExtra4, stringExtra);
                c(data, stringExtra2);
            }
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Uri data;
        if (i == 0) {
            if (i2 == -1) {
                this.b = new agd(intent.getStringExtra("account_name"), intent.getStringExtra("account_type"), intent.getStringExtra("data_set"));
                data = getIntent().getData();
                if (data == null) {
                    c(data, null);
                    return;
                }
                c(Uri.parse(getFileStreamPath(getIntent().getStringExtra("com.android.contacts.common.vcard.LOCAL_TMP_FILE_NAME")).toURI().toString()), getIntent().getStringExtra("com.android.contacts.common.vcard.SOURCE_URI_DISPLAY_NAME"));
                return;
            }
            if (i2 != 0) {
                Log.w("VCardImport", "Result code was not OK nor CANCELED: " + i2);
            }
            finish();
        } else if (i != 100) {
        } else {
            if (i2 == -1) {
                ClipData clipData = intent.getClipData();
                if (clipData != null) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i3 = 0; i3 < clipData.getItemCount(); i3++) {
                        Uri uri = clipData.getItemAt(i3).getUri();
                        if (uri != null) {
                            Uri c = c(uri);
                            if (c != null) {
                                String a = a(uri);
                                arrayList.add(c);
                                arrayList2.add(a);
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        Log.w("VCardImport", "No vCard was selected for import");
                        finish();
                        return;
                    }
                    String valueOf = String.valueOf(arrayList);
                    new StringBuilder(String.valueOf(valueOf).length() + 37).append("Multiple vCards selected for import: ").append(valueOf);
                    a((Uri[]) arrayList.toArray(new Uri[0]), (String[]) arrayList2.toArray(new String[0]));
                    return;
                }
                data = intent.getData();
                if (data != null) {
                    String valueOf2 = String.valueOf(data);
                    new StringBuilder(String.valueOf(valueOf2).length() + 27).append("vCard selected for import: ").append(valueOf2);
                    Uri c2 = c(data);
                    if (c2 != null) {
                        a(c2, a(data));
                        return;
                    }
                    Log.w("VCardImport", "No local URI for vCard import");
                    finish();
                    return;
                }
                Log.w("VCardImport", "No vCard was selected for import");
                finish();
                return;
            }
            if (i2 != 0) {
                Log.w("VCardImport", "Result code was not OK nor CANCELED" + i2);
            }
            finish();
        }
    }

    private final void c(Uri uri, String str) {
        if (uri != null) {
            String valueOf = String.valueOf(uri);
            new StringBuilder(String.valueOf(valueOf).length() + 32).append("Starting vCard import using Uri ").append(valueOf);
            a(uri, str);
            return;
        }
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("text/x-vcard");
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        startActivityForResult(intent, 100);
    }

    protected Dialog onCreateDialog(int i, Bundle bundle) {
        CharSequence string;
        if (i == cob.E) {
            if (this.c == null) {
                string = getString(buf.dC);
                CharSequence string2 = getString(buf.dB);
                this.c = new ProgressDialog(this);
                this.c.setTitle(string);
                this.c.setMessage(string2);
                this.c.setProgressStyle(0);
                this.c.setOnCancelListener(this.d);
                this.e = new ajm(this);
                startService(new Intent(this, VCardService.class));
                bindService(new Intent(this, VCardService.class), this.e, 1);
            }
            return this.c;
        } else if (i != cob.H) {
            return super.onCreateDialog(i, bundle);
        } else {
            string = this.f;
            if (TextUtils.isEmpty(string)) {
                Log.e("VCardImport", "Error message is null while it must not.");
                string = getString(buf.fi);
            }
            return new Builder(this).setTitle(getString(buf.gh)).setIconAttribute(16843605).setMessage(string).setOnCancelListener(this.h).setPositiveButton(17039370, this.h).create();
        }
    }

    protected void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (this.c != null) {
            showDialog(cob.E);
        }
    }

    public final void a(int i) {
        NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
        CharSequence string = getString(i);
        es a = new es(this).a(true);
        a.l = getResources().getColor(buf.cD);
        es b = a.a(17301624).a(getString(buf.gR)).b(string);
        b.d = PendingIntent.getActivity(this, 0, new Intent(getPackageName(), null), 0);
        notificationManager.notify("VCardServiceFailure", 1, b.a());
        this.g.post(new ajj(this));
    }
}
