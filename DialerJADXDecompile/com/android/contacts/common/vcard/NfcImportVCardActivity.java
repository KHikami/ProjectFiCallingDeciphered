package com.android.contacts.common.vcard;

import afb;
import agd;
import ajf;
import ajh;
import ajo;
import ajt;
import ajv;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.os.Bundle;
import android.os.IBinder;
import android.provider.ContactsContract.RawContacts;
import android.util.Log;
import bfs;
import buf;
import com.android.contacts.common.activity.RequestPermissionsActivity;
import java.util.List;

/* compiled from: PG */
public class NfcImportVCardActivity extends Activity implements ajt, ServiceConnection {
    private NdefRecord a;
    private agd b;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final ajh a() {
        /*
        r10 = this;
        r3 = 0;
        r7 = 1;
        r4 = new java.io.ByteArrayInputStream;	 Catch:{ IOException -> 0x0089, bhf -> 0x0092, bhd -> 0x009f }
        r0 = r10.a;	 Catch:{ IOException -> 0x0089, bhf -> 0x0092, bhd -> 0x009f }
        r0 = r0.getPayload();	 Catch:{ IOException -> 0x0089, bhf -> 0x0092, bhd -> 0x009f }
        r4.<init>(r0);	 Catch:{ IOException -> 0x0089, bhf -> 0x0092, bhd -> 0x009f }
        r0 = 0;
        r4.mark(r0);	 Catch:{ IOException -> 0x0089, bhf -> 0x0092, bhd -> 0x009f }
        r2 = new bgw;	 Catch:{ IOException -> 0x0089, bhf -> 0x0092, bhd -> 0x009f }
        r2.<init>();	 Catch:{ IOException -> 0x0089, bhf -> 0x0092, bhd -> 0x009f }
        r1 = new bgp;	 Catch:{ bhh -> 0x0051, all -> 0x0082 }
        r1.<init>();	 Catch:{ bhh -> 0x0051, all -> 0x0082 }
        r0 = new bgz;	 Catch:{ bhh -> 0x00c8, all -> 0x00af }
        r0.<init>();	 Catch:{ bhh -> 0x00c8, all -> 0x00af }
        r2.a(r1);	 Catch:{ bhh -> 0x00cc, all -> 0x00b2 }
        r2.a(r0);	 Catch:{ bhh -> 0x00cc, all -> 0x00b2 }
        r2.a(r4);	 Catch:{ bhh -> 0x00cc, all -> 0x00b2 }
        r4.close();	 Catch:{ IOException -> 0x004d, bhf -> 0x00aa, bhd -> 0x009f }
        r6 = r0;
        r8 = r1;
    L_0x002e:
        r0 = new ajh;
        r1 = r10.b;
        r2 = r10.a;
        r2 = r2.getPayload();
        r4 = buf.fU;
        r4 = r10.getString(r4);
        r5 = r6.e();
        r6 = r6.f();
        r8 = r8.a;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8);
        r3 = r0;
    L_0x004c:
        return r3;
    L_0x004d:
        r2 = move-exception;
        r6 = r0;
        r8 = r1;
        goto L_0x002e;
    L_0x0051:
        r0 = move-exception;
        r2 = r3;
        r0 = r3;
    L_0x0054:
        r4.reset();	 Catch:{ all -> 0x00b7 }
        r7 = 2;
        r5 = new bgx;	 Catch:{ all -> 0x00b7 }
        r5.<init>();	 Catch:{ all -> 0x00b7 }
        r1 = new bgp;	 Catch:{ bhh -> 0x0076 }
        r1.<init>();	 Catch:{ bhh -> 0x0076 }
        r0 = new bgz;	 Catch:{ bhh -> 0x00c3, all -> 0x00bc }
        r0.<init>();	 Catch:{ bhh -> 0x00c3, all -> 0x00bc }
        r5.a(r1);	 Catch:{ bhh -> 0x00c5, all -> 0x00be }
        r5.a(r0);	 Catch:{ bhh -> 0x00c5, all -> 0x00be }
        r5.a(r4);	 Catch:{ bhh -> 0x00c5, all -> 0x00be }
        r4.close();	 Catch:{ IOException -> 0x007e, bhf -> 0x00aa, bhd -> 0x009f }
        r6 = r0;
        r8 = r1;
        goto L_0x002e;
    L_0x0076:
        r1 = move-exception;
        r1 = r0;
    L_0x0078:
        r4.close();	 Catch:{ IOException -> 0x007c, bhf -> 0x00ac, bhd -> 0x009f }
        goto L_0x004c;
    L_0x007c:
        r0 = move-exception;
        goto L_0x004c;
    L_0x007e:
        r2 = move-exception;
        r6 = r0;
        r8 = r1;
        goto L_0x002e;
    L_0x0082:
        r0 = move-exception;
        r2 = r3;
        r1 = r3;
    L_0x0085:
        r4.close();	 Catch:{ IOException -> 0x00a8, bhf -> 0x00ac, bhd -> 0x009f }
    L_0x0088:
        throw r0;	 Catch:{ IOException -> 0x0089, bhf -> 0x00ac, bhd -> 0x009f }
    L_0x0089:
        r0 = move-exception;
        r1 = "NfcImportVCardActivity";
        r2 = "Failed reading vcard data";
        android.util.Log.e(r1, r2, r0);
        goto L_0x004c;
    L_0x0092:
        r0 = move-exception;
        r0 = r3;
        r1 = r3;
    L_0x0095:
        r2 = "NfcImportVCardActivity";
        r4 = "Nested Exception is found (it may be false-positive).";
        android.util.Log.w(r2, r4);
        r6 = r0;
        r8 = r1;
        goto L_0x002e;
    L_0x009f:
        r0 = move-exception;
        r1 = "NfcImportVCardActivity";
        r2 = "Error parsing vcard";
        android.util.Log.e(r1, r2, r0);
        goto L_0x004c;
    L_0x00a8:
        r4 = move-exception;
        goto L_0x0088;
    L_0x00aa:
        r2 = move-exception;
        goto L_0x0095;
    L_0x00ac:
        r0 = move-exception;
        r0 = r2;
        goto L_0x0095;
    L_0x00af:
        r0 = move-exception;
        r2 = r3;
        goto L_0x0085;
    L_0x00b2:
        r2 = move-exception;
        r9 = r2;
        r2 = r0;
        r0 = r9;
        goto L_0x0085;
    L_0x00b7:
        r1 = move-exception;
        r9 = r1;
        r1 = r0;
        r0 = r9;
        goto L_0x0085;
    L_0x00bc:
        r0 = move-exception;
        goto L_0x0085;
    L_0x00be:
        r2 = move-exception;
        r9 = r2;
        r2 = r0;
        r0 = r9;
        goto L_0x0085;
    L_0x00c3:
        r0 = move-exception;
        goto L_0x0078;
    L_0x00c5:
        r2 = move-exception;
        r2 = r0;
        goto L_0x0078;
    L_0x00c8:
        r0 = move-exception;
        r2 = r3;
        r0 = r1;
        goto L_0x0054;
    L_0x00cc:
        r2 = move-exception;
        r2 = r0;
        r0 = r1;
        goto L_0x0054;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.contacts.common.vcard.NfcImportVCardActivity.a():ajh");
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        VCardService vCardService = ((ajv) iBinder).a;
        new ajo(this).execute(new VCardService[]{vCardService});
    }

    public void onServiceDisconnected(ComponentName componentName) {
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!RequestPermissionsActivity.b(this)) {
            Intent intent = getIntent();
            if ("android.nfc.action.NDEF_DISCOVERED".equals(intent.getAction())) {
                String type = intent.getType();
                if (type == null || !("text/x-vcard".equals(type) || "text/vcard".equals(type))) {
                    Log.w("NfcImportVCardActivity", "Not a vcard");
                    finish();
                    return;
                }
                this.a = ((NdefMessage) intent.getParcelableArrayExtra("android.nfc.extra.NDEF_MESSAGES")[0]).getRecords()[0];
                List a = afb.a((Context) this).a(true);
                if (a.size() == 0) {
                    this.b = null;
                } else if (a.size() == 1) {
                    this.b = (agd) a.get(0);
                } else {
                    startActivityForResult(new Intent(this, SelectAccountActivity.class), 1);
                    return;
                }
                d();
                return;
            }
            String valueOf = String.valueOf(intent);
            Log.w("NfcImportVCardActivity", new StringBuilder(String.valueOf(valueOf).length() + 16).append("Unknowon intent ").append(valueOf).toString());
            finish();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            return;
        }
        if (i2 == -1) {
            this.b = new agd(intent.getStringExtra("account_name"), intent.getStringExtra("account_type"), intent.getStringExtra("data_set"));
            d();
            return;
        }
        finish();
    }

    private final void d() {
        Intent intent = new Intent(this, VCardService.class);
        startService(intent);
        bindService(intent, this, 1);
    }

    public final void a(ajh ajh, int i, int i2) {
    }

    public final void a(ajh ajh, int i, bfs bfs, int i2, int i3) {
    }

    public final void a(ajh ajh, int i, Uri uri) {
        if (!isFinishing() && uri != null) {
            buf.a((Context) this, new Intent("android.intent.action.VIEW", RawContacts.getContactLookupUri(getContentResolver(), uri)));
            finish();
        }
    }

    public final void b() {
        if (!isFinishing()) {
        }
    }

    public final void a(ajh ajh, int i) {
    }

    public final void a(ajf ajf, int i) {
    }

    public final void c() {
    }
}
