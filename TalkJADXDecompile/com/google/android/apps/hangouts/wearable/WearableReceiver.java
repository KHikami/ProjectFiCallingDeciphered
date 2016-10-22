package com.google.android.apps.hangouts.wearable;

import android.content.BroadcastReceiver;

public final class WearableReceiver extends BroadcastReceiver {
    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r8, android.content.Intent r9) {
        /*
        r7 = this;
        r6 = 1;
        r1 = 0;
        r2 = -1;
        r0 = grq.class;
        r0 = jyn.a(r8, r0);
        r0 = (grq) r0;
        r3 = r0.a(r8);
        r0 = "babel_wear_app_enable";
        r4 = gwb.a(r8, r0, r6);
        r0 = 3;
        r5 = new java.lang.Object[r0];
        r0 = r3.d();
        r0 = java.lang.Boolean.valueOf(r0);
        r5[r1] = r0;
        r0 = java.lang.Boolean.valueOf(r4);
        r5[r6] = r0;
        r6 = 2;
        if (r9 != 0) goto L_0x0047;
    L_0x002b:
        r0 = "null";
    L_0x002d:
        r5[r6] = r0;
        r0 = r3.d();
        if (r0 == 0) goto L_0x0046;
    L_0x0035:
        if (r4 == 0) goto L_0x0046;
    L_0x0037:
        r0 = r9.getAction();
        r4 = r0.hashCode();
        switch(r4) {
            case 1232336056: goto L_0x004c;
            default: goto L_0x0042;
        };
    L_0x0042:
        r0 = r2;
    L_0x0043:
        switch(r0) {
            case 0: goto L_0x0056;
            default: goto L_0x0046;
        };
    L_0x0046:
        return;
    L_0x0047:
        r0 = r9.getAction();
        goto L_0x002d;
    L_0x004c:
        r4 = "com.google.android.apps.hangouts.intent.action.ACTION_NOTIFY_DATASET_CHANGED";
        r0 = r0.equals(r4);
        if (r0 == 0) goto L_0x0042;
    L_0x0054:
        r0 = r1;
        goto L_0x0043;
    L_0x0056:
        r0 = "account_id";
        r0 = r9.getIntExtra(r0, r2);
        r0 = grm.b(r0);
        if (r0 == 0) goto L_0x0070;
    L_0x0062:
        r0 = r0.a();
        r1 = r3.f();
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0046;
    L_0x0070:
        r0 = bhl.class;
        r0 = jyn.a(r8, r0);
        r0 = (bhl) r0;
        r1 = new grh;
        r1.<init>();
        r0.a(r1);
        goto L_0x0046;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.hangouts.wearable.WearableReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}
