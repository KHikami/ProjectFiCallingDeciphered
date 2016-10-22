import android.content.Context;

final class ebj {
    ebj() {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void a(android.content.Context r24, int r25, boolean r26) {
        /*
        r4 = bbm.class;
        r0 = r24;
        r4 = jyn.a(r0, r4);
        r15 = r4;
        r15 = (bbm) r15;
        r4 = fzw.class;
        r0 = r24;
        r4 = jyn.a(r0, r4);
        r4 = (fzw) r4;
        r17 = fde.e(r25);
        r0 = r25;
        r4 = r4.a(r0);
        if (r4 == 0) goto L_0x0022;
    L_0x0021:
        return;
    L_0x0022:
        r20 = new java.util.LinkedList;
        r20.<init>();
        r4 = 1;
        r8 = new java.lang.String[r4];
        r4 = 0;
        r5 = bkq.c(r24, r25);
        r5 = r5.b;
        r8[r4] = r5;
        r4 = com.google.android.apps.hangouts.content.EsProvider.l;
        r0 = r25;
        r5 = com.google.android.apps.hangouts.content.EsProvider.a(r4, r0);
        r21 = new java.util.LinkedList;
        r21.<init>();
        r22 = new gjj;
        r22.<init>();
        r18 = 0;
        r10 = 1;
        r4 = 0;
        r6 = com.google.android.apps.hangouts.hangout.IncomingRing.b;
        if (r6 == 0) goto L_0x0077;
    L_0x004d:
        r4 = com.google.android.apps.hangouts.hangout.IncomingRing.b;
        r4 = r4.d();
        r4 = r4.e();
    L_0x0057:
        r16 = r4;
    L_0x0059:
        r4 = r24.getContentResolver();
        r6 = ebi.a;
        r7 = ebi.b;
        r9 = "merge_key, timestamp DESC";
        r23 = r4.query(r5, r6, r7, r8, r9);
        if (r23 == 0) goto L_0x006f;
    L_0x0069:
        r4 = r23.moveToFirst();	 Catch:{ all -> 0x01c9 }
        if (r4 != 0) goto L_0x0096;
    L_0x006f:
        r4 = ebf.a;	 Catch:{ all -> 0x01c9 }
        if (r23 == 0) goto L_0x0021;
    L_0x0073:
        r23.close();
        goto L_0x0021;
    L_0x0077:
        r6 = dgg.a();
        r6 = r6.c();
        if (r6 == 0) goto L_0x01dd;
    L_0x0081:
        r4 = dgg.a();
        r4 = r4.s();
        if (r4 != 0) goto L_0x008d;
    L_0x008b:
        r4 = 0;
        goto L_0x0057;
    L_0x008d:
        r4 = r4.e();
        r4 = r4.e();
        goto L_0x0057;
    L_0x0096:
        r4 = ebf.a;	 Catch:{ all -> 0x01c9 }
        r4 = 0;
        r8 = r10;
    L_0x009a:
        r5 = 2;
        r0 = r23;
        r9 = r0.getString(r5);	 Catch:{ all -> 0x01c9 }
        r5 = 8;
        r0 = r23;
        r14 = r0.getInt(r5);	 Catch:{ all -> 0x01c9 }
        r5 = ebf.a;	 Catch:{ all -> 0x01c9 }
        if (r5 == 0) goto L_0x00d8;
    L_0x00ad:
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x01c9 }
        r6 = java.lang.String.valueOf(r4);	 Catch:{ all -> 0x01c9 }
        r6 = r6.length();	 Catch:{ all -> 0x01c9 }
        r6 = r6 + 51;
        r7 = java.lang.String.valueOf(r9);	 Catch:{ all -> 0x01c9 }
        r7 = r7.length();	 Catch:{ all -> 0x01c9 }
        r6 = r6 + r7;
        r5.<init>(r6);	 Catch:{ all -> 0x01c9 }
        r6 = "[HangoutNotifications] conversationId: ";
        r5 = r5.append(r6);	 Catch:{ all -> 0x01c9 }
        r5 = r5.append(r4);	 Catch:{ all -> 0x01c9 }
        r6 = " newConvId: ";
        r5 = r5.append(r6);	 Catch:{ all -> 0x01c9 }
        r5.append(r9);	 Catch:{ all -> 0x01c9 }
    L_0x00d8:
        r5 = android.text.TextUtils.equals(r9, r4);	 Catch:{ all -> 0x01c9 }
        if (r5 != 0) goto L_0x01d5;
    L_0x00de:
        r4 = 5;
        r0 = r23;
        r10 = r0.getInt(r4);	 Catch:{ all -> 0x01c9 }
        r4 = 6;
        r0 = r23;
        r4 = r0.getLong(r4);	 Catch:{ all -> 0x01c9 }
        r6 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r12 = r4 / r6;
        r0 = r16;
        r4 = android.text.TextUtils.equals(r9, r0);	 Catch:{ all -> 0x01c9 }
        if (r4 == 0) goto L_0x0150;
    L_0x00f8:
        r4 = ebf.a;	 Catch:{ all -> 0x01c9 }
        if (r4 == 0) goto L_0x01c5;
    L_0x00fc:
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x01c9 }
        r5 = java.lang.String.valueOf(r9);	 Catch:{ all -> 0x01c9 }
        r5 = r5.length();	 Catch:{ all -> 0x01c9 }
        r5 = r5 + 85;
        r4.<init>(r5);	 Catch:{ all -> 0x01c9 }
        r5 = "[HangoutNotifications]  newConvId: ";
        r4 = r4.append(r5);	 Catch:{ all -> 0x01c9 }
        r4 = r4.append(r9);	 Catch:{ all -> 0x01c9 }
        r5 = " ignored because of active ring or joined hangout.";
        r4.append(r5);	 Catch:{ all -> 0x01c9 }
        r12 = r18;
    L_0x011c:
        r4 = r9;
        r8 = r10;
        r10 = r12;
    L_0x011f:
        r5 = r23.moveToNext();	 Catch:{ all -> 0x01c9 }
        if (r5 != 0) goto L_0x01d9;
    L_0x0125:
        if (r23 == 0) goto L_0x012a;
    L_0x0127:
        r23.close();
    L_0x012a:
        r4 = r22.size();
        if (r4 <= 0) goto L_0x01d0;
    L_0x0130:
        r4 = new ece;
        r5 = r24;
        r6 = r25;
        r7 = r22;
        r9 = r21;
        r4.<init>(r5, r6, r7, r8, r9, r10);
        ecm.a(r4);
        r0 = r26;
        r4.a(r0);
    L_0x0145:
        r0 = r24;
        r1 = r25;
        r2 = r20;
        ecs.a(r0, r1, r2);
        goto L_0x0021;
    L_0x0150:
        r4 = 1;
        r0 = r23;
        r4 = r0.getInt(r4);	 Catch:{ all -> 0x01c9 }
        r5 = fwy.HANGOUT_START_EVENT;	 Catch:{ all -> 0x01c9 }
        r5 = r5.ordinal();	 Catch:{ all -> 0x01c9 }
        if (r4 != r5) goto L_0x0194;
    L_0x015f:
        r0 = r25;
        r4 = r15.g(r0);	 Catch:{ all -> 0x01c9 }
        if (r4 != 0) goto L_0x0194;
    L_0x0167:
        r4 = 3;
        r5 = 4;
        r0 = r23;
        r8 = ear.a(r0, r4, r5);	 Catch:{ all -> 0x01c9 }
        r4 = 0;
        r0 = r23;
        r11 = r0.getString(r4);	 Catch:{ all -> 0x01c9 }
        r4 = "Should at least have a fallback name for the inviter";
        iil.b(r4, r11);	 Catch:{ all -> 0x01c9 }
        r5 = new ecs;	 Catch:{ all -> 0x01c9 }
        r6 = r24;
        r7 = r25;
        r5.<init>(r6, r7, r8, r9, r10, r11, r12, r14);	 Catch:{ all -> 0x01c9 }
        ecm.a(r5);	 Catch:{ all -> 0x01c9 }
        r0 = r20;
        r0.add(r5);	 Catch:{ all -> 0x01c9 }
        r0 = r26;
        r5.a(r0);	 Catch:{ all -> 0x01c9 }
        r12 = r18;
        goto L_0x011c;
    L_0x0194:
        r4 = 7;
        r0 = r23;
        r4 = r0.getString(r4);	 Catch:{ all -> 0x01c9 }
        r5 = 1;
        r0 = r17;
        r5 = gwb.a(r0, r4, r5);	 Catch:{ all -> 0x01c9 }
        r4 = 0;
        if (r5 == 0) goto L_0x01ad;
    L_0x01a5:
        r4 = bkq.c(r24, r25);	 Catch:{ all -> 0x01c9 }
        r4 = r5.contains(r4);	 Catch:{ all -> 0x01c9 }
    L_0x01ad:
        if (r4 != 0) goto L_0x01c5;
    L_0x01af:
        r4 = 3;
        r5 = 4;
        r0 = r23;
        r4 = ear.a(r0, r4, r5);	 Catch:{ all -> 0x01c9 }
        r0 = r21;
        r0.add(r4);	 Catch:{ all -> 0x01c9 }
        r0 = r22;
        r0.add(r9);	 Catch:{ all -> 0x01c9 }
        r4 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1));
        if (r4 > 0) goto L_0x011c;
    L_0x01c5:
        r12 = r18;
        goto L_0x011c;
    L_0x01c9:
        r4 = move-exception;
        if (r23 == 0) goto L_0x01cf;
    L_0x01cc:
        r23.close();
    L_0x01cf:
        throw r4;
    L_0x01d0:
        ece.b(r24, r25);
        goto L_0x0145;
    L_0x01d5:
        r10 = r18;
        goto L_0x011f;
    L_0x01d9:
        r18 = r10;
        goto L_0x009a;
    L_0x01dd:
        r16 = r4;
        goto L_0x0059;
        */
        throw new UnsupportedOperationException("Method not decompiled: ebj.a(android.content.Context, int, boolean):void");
    }

    void a(Context context, int i, String str) {
        gjj a = gjj.a(str);
        boolean a2 = ((fuz) jyn.a(context, fuz.class)).a(i);
        if (blf.b(new blo(context, i), a) > 0 && !a2) {
            a(context, i, true);
        }
    }
}
