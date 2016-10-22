package com.google.android.apps.dialer.spam.impl;

import android.app.job.JobParameters;
import android.app.job.JobService;
import buf;

/* compiled from: PG */
public class SpamJobService extends JobService {
    public static boolean a;
    private static final Object b;

    static {
        b = new Object();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onStartJob(android.app.job.JobParameters r13) {
        /*
        r12 = this;
        r2 = 1;
        r1 = 0;
        r3 = r13.getJobId();
        r4 = r12.getApplicationContext();
        r0 = buf.n(r3);
        if (r0 == 0) goto L_0x004d;
    L_0x0010:
        r5 = bjd.E;
        r6 = 0;
        r0 = crm.b;
        if (r0 != 0) goto L_0x001f;
    L_0x0017:
        r0 = new java.lang.IllegalStateException;
        r1 = "Must call PhenotypeFlag.init() first";
        r0.<init>(r1);
        throw r0;
    L_0x001f:
        r0 = crm.d;
        r0 = r0.b();
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 != 0) goto L_0x006a;
    L_0x002d:
        r0 = r5.i;
        if (r0 == 0) goto L_0x0052;
    L_0x0031:
        r0 = crm.b;
        r6 = r5.i;
        r0 = r0.getSharedPreferences(r6, r1);
        r6 = r5.g;
        r6 = r0.contains(r6);
        if (r6 == 0) goto L_0x006a;
    L_0x0041:
        r0 = r5.a(r0);
    L_0x0045:
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 != 0) goto L_0x009e;
    L_0x004d:
        buf.h(r4, r3);
        r0 = r1;
    L_0x0051:
        return r0;
    L_0x0052:
        if (r6 != 0) goto L_0x0081;
    L_0x0054:
        r0 = r5.j;
        r6 = crm.b;
        r7 = r5.f;
        r8 = r5.g;
        r9 = r5.h;
        r0 = r0.a(r6, r7, r8, r9);
    L_0x0062:
        if (r0 == 0) goto L_0x006a;
    L_0x0064:
        r0 = r5.a(r0);
        if (r0 != 0) goto L_0x0045;
    L_0x006a:
        r0 = crm.b;
        r0 = r0.getContentResolver();
        r6 = r5.e;
        r0 = ckq.a(r0, r6);
        if (r0 == 0) goto L_0x007e;
    L_0x0078:
        r0 = r5.a(r0);
        if (r0 != 0) goto L_0x0045;
    L_0x007e:
        r0 = r5.k;
        goto L_0x0045;
    L_0x0081:
        r0 = r5.j;
        r7 = r5.f;
        r8 = r5.g;
        r9 = r5.h;
        r10 = new crk;
        r10.<init>(r7, r8, r9);
        r7 = r0.a(r10);
        if (r7 == 0) goto L_0x0099;
    L_0x0094:
        r0 = r7.a;
        r0 = (com.google.android.gms.phenotype.Flag) r0;
        goto L_0x0062;
    L_0x0099:
        r0 = r0.a(r6, r10);
        goto L_0x0062;
    L_0x009e:
        r0 = r13.getExtras();
        r5 = "spam_jobs_interval";
        r6 = r0.getLong(r5);
        r8 = buf.m(r3);
        r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r0 == 0) goto L_0x00e6;
    L_0x00b0:
        r0 = buf.l(r3);
        r0 = java.lang.String.valueOf(r0);
        r2 = new java.lang.StringBuilder;
        r5 = java.lang.String.valueOf(r0);
        r5 = r5.length();
        r5 = r5 + 58;
        r2.<init>(r5);
        r5 = "SpamJobService, rescheduling ";
        r2 = r2.append(r5);
        r0 = r2.append(r0);
        r2 = " because interval was updated";
        r0 = r0.append(r2);
        r0 = r0.toString();
        r2 = new java.lang.Object[r1];
        buf.c(r0, r2);
        buf.g(r4, r3);
        r0 = r1;
        goto L_0x0051;
    L_0x00e6:
        r5 = b;
        monitor-enter(r5);
        r0 = a;	 Catch:{ all -> 0x0111 }
        if (r0 == 0) goto L_0x0114;
    L_0x00ed:
        r2 = "SpamJobService, other job already running, returning false for: ";
        r0 = buf.l(r3);	 Catch:{ all -> 0x0111 }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x0111 }
        r3 = r0.length();	 Catch:{ all -> 0x0111 }
        if (r3 == 0) goto L_0x010b;
    L_0x00fd:
        r0 = r2.concat(r0);	 Catch:{ all -> 0x0111 }
    L_0x0101:
        r2 = 0;
        r2 = new java.lang.Object[r2];	 Catch:{ all -> 0x0111 }
        buf.c(r0, r2);	 Catch:{ all -> 0x0111 }
        monitor-exit(r5);	 Catch:{ all -> 0x0111 }
        r0 = r1;
        goto L_0x0051;
    L_0x010b:
        r0 = new java.lang.String;	 Catch:{ all -> 0x0111 }
        r0.<init>(r2);	 Catch:{ all -> 0x0111 }
        goto L_0x0101;
    L_0x0111:
        r0 = move-exception;
        monitor-exit(r5);	 Catch:{ all -> 0x0111 }
        throw r0;
    L_0x0114:
        r0 = 1;
        a = r0;	 Catch:{ all -> 0x0111 }
        monitor-exit(r5);	 Catch:{ all -> 0x0111 }
        r8 = java.lang.System.currentTimeMillis();
        r10 = r12.a();
        r8 = r8 - r10;
        r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1));
        if (r0 >= 0) goto L_0x015a;
    L_0x0125:
        r0 = buf.l(r3);
        r0 = java.lang.String.valueOf(r0);
        r2 = new java.lang.StringBuilder;
        r3 = java.lang.String.valueOf(r0);
        r3 = r3.length();
        r3 = r3 + 90;
        r2.<init>(r3);
        r3 = "SpamJobService, returning false for ";
        r2 = r2.append(r3);
        r0 = r2.append(r0);
        r2 = " because the last update occurred within the interval.";
        r0 = r0.append(r2);
        r0 = r0.toString();
        r2 = new java.lang.Object[r1];
        buf.c(r0, r2);
        a = r1;
        r0 = r1;
        goto L_0x0051;
    L_0x015a:
        r5 = "SpamJobService, syncing for job: ";
        r0 = buf.l(r3);
        r0 = java.lang.String.valueOf(r0);
        r3 = r0.length();
        if (r3 == 0) goto L_0x0188;
    L_0x016a:
        r0 = r5.concat(r0);
    L_0x016e:
        r3 = new java.lang.Object[r1];
        buf.c(r0, r3);
        r0 = new bku;
        r0.<init>(r12, r13);
        r3 = buf.a(r4);
        if (r3 != 0) goto L_0x018e;
    L_0x017e:
        r0 = "SpamAsyncTaskUtil, user is in locked state, cannot fetch spam list.";
        r1 = new java.lang.Object[r1];
        buf.c(r0, r1);
    L_0x0185:
        r0 = r2;
        goto L_0x0051;
    L_0x0188:
        r0 = new java.lang.String;
        r0.<init>(r5);
        goto L_0x016e;
    L_0x018e:
        r3 = new bkl;
        r3.<init>(r4, r0);
        r0 = android.os.AsyncTask.THREAD_POOL_EXECUTOR;
        r1 = new java.lang.Void[r1];
        r3.executeOnExecutor(r0, r1);
        goto L_0x0185;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.dialer.spam.impl.SpamJobService.onStartJob(android.app.job.JobParameters):boolean");
    }

    public boolean onStopJob(JobParameters jobParameters) {
        String str = "SpamJobService, onStopJob for job: ";
        String valueOf = String.valueOf(buf.l(jobParameters.getJobId()));
        buf.c(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), new Object[0]);
        return true;
    }

    public final long a() {
        return getSharedPreferences(getApplicationContext().getPackageName(), 0).getLong("spam_jobs_last_updated_blacklist", 1);
    }
}
