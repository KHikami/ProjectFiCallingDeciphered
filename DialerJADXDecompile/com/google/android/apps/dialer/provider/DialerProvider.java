package com.google.android.apps.dialer.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import biz;
import bjn;
import bjo;
import bjp;
import bjq;
import brc;
import brd;
import brf;
import buf;
import com.google.android.gms.common.ConnectionResult;
import coo;
import java.util.LinkedList;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import rl;

/* compiled from: PG */
public class DialerProvider extends ContentProvider implements brf {
    public static final Uri a;
    private static Uri c;
    private static int d;
    private static final UriMatcher e;
    public final LinkedList b;
    private String f;
    private brc g;
    private Handler h;
    private Runnable i;

    public DialerProvider() {
        this.b = new LinkedList();
        this.h = new Handler();
        this.i = new bjo(this);
    }

    static {
        Uri parse = Uri.parse("content://com.google.android.dialer.provider");
        c = parse;
        a = Uri.withAppendedPath(parse, "nearbyPlaces");
        d = 8;
        e = new UriMatcher(-1);
        new Handler().getLooper();
        bjn bjn = new bjn();
        e.addURI("com.google.android.dialer.provider", "nearbyPlaces/*", 0);
    }

    private static String a(String str) {
        for (String trim : str.split(";")) {
            String trim2 = trim2.trim();
            if (trim2.startsWith("charset=")) {
                return trim2.substring(d);
            }
        }
        return "UTF-8";
    }

    public boolean onCreate() {
        this.f = buf.U(getContext());
        if (this.f == null) {
            this.f = "";
        }
        this.g = new brd(getContext()).a((brf) this).a(coo.b).b();
        return true;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i = -1;
        if (Log.isLoggable("DialerProvider", 2)) {
            String valueOf = String.valueOf(uri);
            new StringBuilder(String.valueOf(valueOf).length() + 7).append("query: ").append(valueOf);
        }
        switch (e.match(uri)) {
            case rl.c /*0*/:
                if (buf.j(getContext())) {
                    Location c = c();
                    if (c == null) {
                        return null;
                    }
                    int i2;
                    String encode = Uri.encode(uri.getLastPathSegment());
                    String queryParameter = uri.getQueryParameter("limit");
                    if (queryParameter != null) {
                        try {
                            i = Integer.parseInt(queryParameter);
                        } catch (NumberFormatException e) {
                            Log.e("DialerProvider", new StringBuilder(String.valueOf(queryParameter).length() + 34).append("query: invalid limit parameter: '").append(queryParameter).append("'").toString());
                            i2 = i;
                        }
                    }
                    i2 = i;
                    return (Cursor) a(new bjp(this, strArr, encode, i2, c), "FilterThread", 10000, TimeUnit.MILLISECONDS);
                }
                Log.w("DialerProvider", "No location permission, ignoring query.");
                return null;
            default:
                return null;
        }
    }

    private final Object a(Callable callable, String str, long j, TimeUnit timeUnit) {
        String str2;
        String valueOf;
        String str3;
        String str4;
        Object bjq = new bjq(this, callable);
        FutureTask futureTask = new FutureTask(bjq);
        bjq.a = futureTask;
        synchronized (this.b) {
            this.b.addLast(futureTask);
            if (Log.isLoggable("DialerProvider", 2)) {
                new StringBuilder(36).append("Currently running tasks: ").append(this.b.size());
            }
            while (this.b.size() > 8) {
                Log.w("DialerProvider", "Too many tasks, canceling one");
                ((FutureTask) this.b.removeFirst()).cancel(true);
            }
        }
        if (Log.isLoggable("DialerProvider", 2)) {
            str2 = "Starting task ";
            valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
        }
        new Thread(futureTask, str).start();
        try {
            if (Log.isLoggable("DialerProvider", 2)) {
                str2 = "Getting future ";
                valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    str2.concat(valueOf);
                } else {
                    valueOf = new String(str2);
                }
            }
            return futureTask.get(10000, timeUnit);
        } catch (InterruptedException e) {
            str3 = "DialerProvider";
            valueOf = "Task was interrupted: ";
            str2 = String.valueOf(str);
            Log.w(str3, str2.length() != 0 ? valueOf.concat(str2) : new String(valueOf));
            Thread.currentThread().interrupt();
            return null;
        } catch (Throwable e2) {
            Throwable th = e2;
            valueOf = "DialerProvider";
            str4 = "Task threw an exception: ";
            str2 = String.valueOf(str);
            Log.w(valueOf, str2.length() != 0 ? str4.concat(str2) : new String(str4), th);
            return null;
        } catch (TimeoutException e3) {
            valueOf = "DialerProvider";
            str4 = "Task timed out: ";
            str2 = String.valueOf(str);
            Log.w(valueOf, str2.length() != 0 ? str4.concat(str2) : new String(str4));
            futureTask.cancel(true);
            return null;
        } catch (CancellationException e4) {
            str3 = "DialerProvider";
            valueOf = "Task was cancelled: ";
            str2 = String.valueOf(str);
            Log.w(str3, str2.length() != 0 ? valueOf.concat(str2) : new String(valueOf));
            return null;
        }
    }

    public String getType(Uri uri) {
        switch (e.match(uri)) {
            case rl.c /*0*/:
                return "vnd.android.cursor.item/contact";
            default:
                return null;
        }
    }

    public int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException();
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.database.Cursor a(java.lang.String[] r12, java.lang.String r13, int r14, android.location.Location r15) {
        /*
        r11 = this;
        r10 = 2;
        r9 = 0;
        r1 = 0;
        r0 = "DialerProvider";
        r0 = android.util.Log.isLoggable(r0, r10);
        if (r0 == 0) goto L_0x0029;
    L_0x000b:
        r0 = new java.lang.StringBuilder;
        r2 = java.lang.String.valueOf(r13);
        r2 = r2.length();
        r2 = r2 + 14;
        r0.<init>(r2);
        r2 = "handleFilter(";
        r0 = r0.append(r2);
        r0 = r0.append(r13);
        r2 = ")";
        r0.append(r2);
    L_0x0029:
        if (r13 != 0) goto L_0x002d;
    L_0x002b:
        r0 = r1;
    L_0x002c:
        return r0;
    L_0x002d:
        r0 = "UTF-8";
        r13 = java.net.URLDecoder.decode(r13, r0);	 Catch:{ UnsupportedEncodingException -> 0x03ac }
    L_0x0033:
        r0 = r11.getContext();
        r0.getContentResolver();
        r2 = bjd.v;
        r0 = crm.b;
        if (r0 != 0) goto L_0x0048;
    L_0x0040:
        r0 = new java.lang.IllegalStateException;
        r1 = "Must call PhenotypeFlag.init() first";
        r0.<init>(r1);
        throw r0;
    L_0x0048:
        r0 = crm.d;
        r0 = r0.b();
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 != 0) goto L_0x009a;
    L_0x0056:
        r0 = r2.i;
        if (r0 == 0) goto L_0x0082;
    L_0x005a:
        r0 = crm.b;
        r3 = r2.i;
        r0 = r0.getSharedPreferences(r3, r9);
        r3 = r2.g;
        r3 = r0.contains(r3);
        if (r3 == 0) goto L_0x009a;
    L_0x006a:
        r0 = r2.a(r0);
    L_0x006e:
        r0 = (java.lang.Integer) r0;
        r2 = r0.intValue();
        r3 = bjd.w;
        r0 = crm.b;
        if (r0 != 0) goto L_0x00ce;
    L_0x007a:
        r0 = new java.lang.IllegalStateException;
        r1 = "Must call PhenotypeFlag.init() first";
        r0.<init>(r1);
        throw r0;
    L_0x0082:
        if (r1 != 0) goto L_0x00b1;
    L_0x0084:
        r0 = r2.j;
        r3 = crm.b;
        r4 = r2.f;
        r5 = r2.g;
        r6 = r2.h;
        r0 = r0.a(r3, r4, r5, r6);
    L_0x0092:
        if (r0 == 0) goto L_0x009a;
    L_0x0094:
        r0 = r2.a(r0);
        if (r0 != 0) goto L_0x006e;
    L_0x009a:
        r0 = crm.b;
        r0 = r0.getContentResolver();
        r3 = r2.e;
        r0 = ckq.a(r0, r3);
        if (r0 == 0) goto L_0x00ae;
    L_0x00a8:
        r0 = r2.a(r0);
        if (r0 != 0) goto L_0x006e;
    L_0x00ae:
        r0 = r2.k;
        goto L_0x006e;
    L_0x00b1:
        r0 = r2.j;
        r3 = r2.f;
        r4 = r2.g;
        r5 = r2.h;
        r6 = new crk;
        r6.<init>(r3, r4, r5);
        r3 = r0.a(r6);
        if (r3 == 0) goto L_0x00c9;
    L_0x00c4:
        r0 = r3.a;
        r0 = (com.google.android.gms.phenotype.Flag) r0;
        goto L_0x0092;
    L_0x00c9:
        r0 = r0.a(r1, r6);
        goto L_0x0092;
    L_0x00ce:
        r0 = crm.d;
        r0 = r0.b();
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 != 0) goto L_0x0120;
    L_0x00dc:
        r0 = r3.i;
        if (r0 == 0) goto L_0x0108;
    L_0x00e0:
        r0 = crm.b;
        r4 = r3.i;
        r0 = r0.getSharedPreferences(r4, r9);
        r4 = r3.g;
        r4 = r0.contains(r4);
        if (r4 == 0) goto L_0x0120;
    L_0x00f0:
        r0 = r3.a(r0);
    L_0x00f4:
        r0 = (java.lang.Integer) r0;
        r3 = r0.intValue();
        r4 = bjd.u;
        r0 = crm.b;
        if (r0 != 0) goto L_0x0154;
    L_0x0100:
        r0 = new java.lang.IllegalStateException;
        r1 = "Must call PhenotypeFlag.init() first";
        r0.<init>(r1);
        throw r0;
    L_0x0108:
        if (r1 != 0) goto L_0x0137;
    L_0x010a:
        r0 = r3.j;
        r4 = crm.b;
        r5 = r3.f;
        r6 = r3.g;
        r7 = r3.h;
        r0 = r0.a(r4, r5, r6, r7);
    L_0x0118:
        if (r0 == 0) goto L_0x0120;
    L_0x011a:
        r0 = r3.a(r0);
        if (r0 != 0) goto L_0x00f4;
    L_0x0120:
        r0 = crm.b;
        r0 = r0.getContentResolver();
        r4 = r3.e;
        r0 = ckq.a(r0, r4);
        if (r0 == 0) goto L_0x0134;
    L_0x012e:
        r0 = r3.a(r0);
        if (r0 != 0) goto L_0x00f4;
    L_0x0134:
        r0 = r3.k;
        goto L_0x00f4;
    L_0x0137:
        r0 = r3.j;
        r4 = r3.f;
        r5 = r3.g;
        r6 = r3.h;
        r7 = new crk;
        r7.<init>(r4, r5, r6);
        r4 = r0.a(r7);
        if (r4 == 0) goto L_0x014f;
    L_0x014a:
        r0 = r4.a;
        r0 = (com.google.android.gms.phenotype.Flag) r0;
        goto L_0x0118;
    L_0x014f:
        r0 = r0.a(r1, r7);
        goto L_0x0118;
    L_0x0154:
        r0 = crm.d;
        r0 = r0.b();
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 != 0) goto L_0x01a1;
    L_0x0162:
        r0 = r4.i;
        if (r0 == 0) goto L_0x0189;
    L_0x0166:
        r0 = crm.b;
        r5 = r4.i;
        r0 = r0.getSharedPreferences(r5, r9);
        r5 = r4.g;
        r5 = r0.contains(r5);
        if (r5 == 0) goto L_0x01a1;
    L_0x0176:
        r0 = r4.a(r0);
    L_0x017a:
        r0 = (java.lang.Integer) r0;
        r0 = r0.intValue();
        r4 = r13.length();
        if (r4 >= r2) goto L_0x01d5;
    L_0x0186:
        r0 = r1;
        goto L_0x002c;
    L_0x0189:
        if (r1 != 0) goto L_0x01b8;
    L_0x018b:
        r0 = r4.j;
        r5 = crm.b;
        r6 = r4.f;
        r7 = r4.g;
        r8 = r4.h;
        r0 = r0.a(r5, r6, r7, r8);
    L_0x0199:
        if (r0 == 0) goto L_0x01a1;
    L_0x019b:
        r0 = r4.a(r0);
        if (r0 != 0) goto L_0x017a;
    L_0x01a1:
        r0 = crm.b;
        r0 = r0.getContentResolver();
        r5 = r4.e;
        r0 = ckq.a(r0, r5);
        if (r0 == 0) goto L_0x01b5;
    L_0x01af:
        r0 = r4.a(r0);
        if (r0 != 0) goto L_0x017a;
    L_0x01b5:
        r0 = r4.k;
        goto L_0x017a;
    L_0x01b8:
        r0 = r4.j;
        r5 = r4.f;
        r6 = r4.g;
        r7 = r4.h;
        r8 = new crk;
        r8.<init>(r5, r6, r7);
        r5 = r0.a(r8);
        if (r5 == 0) goto L_0x01d0;
    L_0x01cb:
        r0 = r5.a;
        r0 = (com.google.android.gms.phenotype.Flag) r0;
        goto L_0x0199;
    L_0x01d0:
        r0 = r0.a(r1, r8);
        goto L_0x0199;
    L_0x01d5:
        if (r4 <= r3) goto L_0x01db;
    L_0x01d7:
        r13 = r13.substring(r9, r3);
    L_0x01db:
        r2 = "https://www.google.com/complete/search?gs_ri=dialer";
        r3 = r11.getContext();	 Catch:{ IOException -> 0x0246 }
        r3 = r3.getContentResolver();	 Catch:{ IOException -> 0x0246 }
        r3 = blt.a(r3);	 Catch:{ IOException -> 0x0246 }
        r3 = r3.a(r2);	 Catch:{ IOException -> 0x0246 }
        r4 = r3.a(r2);	 Catch:{ IOException -> 0x0246 }
        if (r4 != 0) goto L_0x025f;
    L_0x01f3:
        r0 = "DialerProvider";
        r4 = r3.a;	 Catch:{ IOException -> 0x0246 }
        r4 = java.lang.String.valueOf(r4);	 Catch:{ IOException -> 0x0246 }
        r5 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0246 }
        r6 = java.lang.String.valueOf(r4);	 Catch:{ IOException -> 0x0246 }
        r6 = r6.length();	 Catch:{ IOException -> 0x0246 }
        r6 = r6 + 13;
        r7 = java.lang.String.valueOf(r2);	 Catch:{ IOException -> 0x0246 }
        r7 = r7.length();	 Catch:{ IOException -> 0x0246 }
        r6 = r6 + r7;
        r5.<init>(r6);	 Catch:{ IOException -> 0x0246 }
        r6 = "Blocked by ";
        r5 = r5.append(r6);	 Catch:{ IOException -> 0x0246 }
        r4 = r5.append(r4);	 Catch:{ IOException -> 0x0246 }
        r5 = ": ";
        r4 = r4.append(r5);	 Catch:{ IOException -> 0x0246 }
        r2 = r4.append(r2);	 Catch:{ IOException -> 0x0246 }
        r2 = r2.toString();	 Catch:{ IOException -> 0x0246 }
        android.util.Log.w(r0, r2);	 Catch:{ IOException -> 0x0246 }
        r2 = new java.io.IOException;	 Catch:{ IOException -> 0x0246 }
        r4 = "Blocked by rule: ";
        r0 = r3.a;	 Catch:{ IOException -> 0x0246 }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ IOException -> 0x0246 }
        r3 = r0.length();	 Catch:{ IOException -> 0x0246 }
        if (r3 == 0) goto L_0x0254;
    L_0x023e:
        r0 = r4.concat(r0);	 Catch:{ IOException -> 0x0246 }
    L_0x0242:
        r2.<init>(r0);	 Catch:{ IOException -> 0x0246 }
        throw r2;	 Catch:{ IOException -> 0x0246 }
    L_0x0246:
        r0 = move-exception;
        r2 = "DialerProvider";
        r3 = "Failed to execute query";
        android.util.Log.e(r2, r3, r0);	 Catch:{ all -> 0x025a }
        android.net.TrafficStats.clearThreadStatsTag();
        r0 = r1;
        goto L_0x002c;
    L_0x0254:
        r0 = new java.lang.String;	 Catch:{ IOException -> 0x0246 }
        r0.<init>(r4);	 Catch:{ IOException -> 0x0246 }
        goto L_0x0242;
    L_0x025a:
        r0 = move-exception;
        android.net.TrafficStats.clearThreadStatsTag();
        throw r0;
    L_0x025f:
        r2 = r4.equals(r4);	 Catch:{ IOException -> 0x0246 }
        if (r2 != 0) goto L_0x02b2;
    L_0x0265:
        r2 = "DialerProvider";
        r5 = 2;
        r2 = android.util.Log.isLoggable(r2, r5);	 Catch:{ IOException -> 0x0246 }
        if (r2 == 0) goto L_0x02b2;
    L_0x026e:
        r2 = r3.a;	 Catch:{ IOException -> 0x0246 }
        r2 = java.lang.String.valueOf(r2);	 Catch:{ IOException -> 0x0246 }
        r3 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0246 }
        r5 = java.lang.String.valueOf(r2);	 Catch:{ IOException -> 0x0246 }
        r5 = r5.length();	 Catch:{ IOException -> 0x0246 }
        r5 = r5 + 11;
        r6 = java.lang.String.valueOf(r4);	 Catch:{ IOException -> 0x0246 }
        r6 = r6.length();	 Catch:{ IOException -> 0x0246 }
        r5 = r5 + r6;
        r6 = java.lang.String.valueOf(r4);	 Catch:{ IOException -> 0x0246 }
        r6 = r6.length();	 Catch:{ IOException -> 0x0246 }
        r5 = r5 + r6;
        r3.<init>(r5);	 Catch:{ IOException -> 0x0246 }
        r5 = "Rule ";
        r3 = r3.append(r5);	 Catch:{ IOException -> 0x0246 }
        r2 = r3.append(r2);	 Catch:{ IOException -> 0x0246 }
        r3 = ": ";
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x0246 }
        r2 = r2.append(r4);	 Catch:{ IOException -> 0x0246 }
        r3 = " -> ";
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x0246 }
        r2.append(r4);	 Catch:{ IOException -> 0x0246 }
    L_0x02b2:
        r2 = android.net.Uri.parse(r4);	 Catch:{ IOException -> 0x0246 }
        r2 = r2.buildUpon();	 Catch:{ IOException -> 0x0246 }
        r3 = "q";
        r2 = r2.appendQueryParameter(r3, r13);	 Catch:{ IOException -> 0x0246 }
        r3 = "hl";
        r4 = r11.getContext();	 Catch:{ IOException -> 0x0246 }
        r4 = r4.getResources();	 Catch:{ IOException -> 0x0246 }
        r4 = r4.getConfiguration();	 Catch:{ IOException -> 0x0246 }
        r4 = r4.locale;	 Catch:{ IOException -> 0x0246 }
        r4 = r4.getLanguage();	 Catch:{ IOException -> 0x0246 }
        r2 = r2.appendQueryParameter(r3, r4);	 Catch:{ IOException -> 0x0246 }
        r3 = "sll";
        r4 = java.util.Locale.US;	 Catch:{ IOException -> 0x0246 }
        r5 = "%f,%f";
        r6 = 2;
        r6 = new java.lang.Object[r6];	 Catch:{ IOException -> 0x0246 }
        r7 = 0;
        r8 = r15.getLatitude();	 Catch:{ IOException -> 0x0246 }
        r8 = java.lang.Double.valueOf(r8);	 Catch:{ IOException -> 0x0246 }
        r6[r7] = r8;	 Catch:{ IOException -> 0x0246 }
        r7 = 1;
        r8 = r15.getLongitude();	 Catch:{ IOException -> 0x0246 }
        r8 = java.lang.Double.valueOf(r8);	 Catch:{ IOException -> 0x0246 }
        r6[r7] = r8;	 Catch:{ IOException -> 0x0246 }
        r4 = java.lang.String.format(r4, r5, r6);	 Catch:{ IOException -> 0x0246 }
        r2 = r2.appendQueryParameter(r3, r4);	 Catch:{ IOException -> 0x0246 }
        r3 = "radius";
        r0 = java.lang.String.valueOf(r0);	 Catch:{ IOException -> 0x0246 }
        r0 = r2.appendQueryParameter(r3, r0);	 Catch:{ IOException -> 0x0246 }
        r2 = "gs_gbg";
        r3 = r11.d();	 Catch:{ IOException -> 0x0246 }
        r0 = r0.appendQueryParameter(r2, r3);	 Catch:{ IOException -> 0x0246 }
        r2 = 43690; // 0xaaaa float:6.1223E-41 double:2.15857E-319;
        android.net.TrafficStats.setThreadStatsTag(r2);	 Catch:{ IOException -> 0x0246 }
        r2 = r0.build();	 Catch:{ IOException -> 0x0246 }
        r2 = r11.a(r2);	 Catch:{ IOException -> 0x0246 }
        android.net.TrafficStats.clearThreadStatsTag();
        r3 = "DialerProvider";
        r3 = android.util.Log.isLoggable(r3, r10);
        if (r3 == 0) goto L_0x0348;
    L_0x032c:
        r3 = java.lang.String.valueOf(r2);
        r4 = new java.lang.StringBuilder;
        r5 = java.lang.String.valueOf(r3);
        r5 = r5.length();
        r5 = r5 + 9;
        r4.<init>(r5);
        r5 = "Results: ";
        r4 = r4.append(r5);
        r4.append(r3);
    L_0x0348:
        r0 = r11.a(r12, r2, r14);	 Catch:{ JSONException -> 0x0382 }
        r1 = "DialerProvider";
        r1 = android.util.Log.isLoggable(r1, r10);
        if (r1 == 0) goto L_0x002c;
    L_0x0354:
        r1 = r0.getCount();
        r2 = new java.lang.StringBuilder;
        r3 = java.lang.String.valueOf(r13);
        r3 = r3.length();
        r3 = r3 + 35;
        r2.<init>(r3);
        r3 = "handleFilter(";
        r2 = r2.append(r3);
        r2 = r2.append(r13);
        r3 = "): ";
        r2 = r2.append(r3);
        r1 = r2.append(r1);
        r2 = " matches";
        r1.append(r2);
        goto L_0x002c;
    L_0x0382:
        r2 = move-exception;
        r2 = "DialerProvider";
        r0 = java.lang.String.valueOf(r0);
        r3 = new java.lang.StringBuilder;
        r4 = java.lang.String.valueOf(r0);
        r4 = r4.length();
        r4 = r4 + 27;
        r3.<init>(r4);
        r4 = "Invalid response to query: ";
        r3 = r3.append(r4);
        r0 = r3.append(r0);
        r0 = r0.toString();
        android.util.Log.e(r2, r0);
        r0 = r1;
        goto L_0x002c;
    L_0x03ac:
        r0 = move-exception;
        goto L_0x0033;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.dialer.provider.DialerProvider.a(java.lang.String[], java.lang.String, int, android.location.Location):android.database.Cursor");
    }

    private final JSONArray a(Uri uri) {
        try {
            return new JSONArray(b(uri));
        } catch (Throwable e) {
            String valueOf = String.valueOf(uri);
            Log.e("DialerProvider", new StringBuilder(String.valueOf(valueOf).length() + 43).append("Failed to retrieve/parse the response from ").append(valueOf).toString(), e);
            return null;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String b(android.net.Uri r10) {
        /*
        r9 = this;
        r8 = 0;
        r2 = 0;
        r0 = "DialerProvider";
        r1 = 2;
        r0 = android.util.Log.isLoggable(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x000b:
        r0 = r10.toString();
        r0 = java.lang.String.valueOf(r0);
        r1 = new java.lang.StringBuilder;
        r3 = java.lang.String.valueOf(r0);
        r3 = r3.length();
        r3 = r3 + 20;
        r1.<init>(r3);
        r3 = "executeHttpRequest(";
        r1 = r1.append(r3);
        r0 = r1.append(r0);
        r1 = ")";
        r0.append(r1);
    L_0x0031:
        r0 = new java.net.URL;
        r1 = r10.toString();
        r0.<init>(r1);
        r0 = r0.openConnection();
        r0 = (java.net.HttpURLConnection) r0;
        r1 = "User-Agent";
        r3 = r9.f;
        r0.setRequestProperty(r1, r3);
        r1 = r9.getContext();
        r1.getContentResolver();
        r3 = bjd.y;
        r1 = crm.b;
        if (r1 != 0) goto L_0x005c;
    L_0x0054:
        r0 = new java.lang.IllegalStateException;
        r1 = "Must call PhenotypeFlag.init() first";
        r0.<init>(r1);
        throw r0;
    L_0x005c:
        r1 = crm.d;
        r1 = r1.b();
        r1 = (java.lang.Boolean) r1;
        r1 = r1.booleanValue();
        if (r1 != 0) goto L_0x00e3;
    L_0x006a:
        r1 = r3.i;
        if (r1 == 0) goto L_0x00cb;
    L_0x006e:
        r1 = crm.b;
        r4 = r3.i;
        r1 = r1.getSharedPreferences(r4, r8);
        r4 = r3.g;
        r4 = r1.contains(r4);
        if (r4 == 0) goto L_0x00e3;
    L_0x007e:
        r1 = r3.a(r1);
    L_0x0082:
        r1 = (java.lang.Boolean) r1;
        r1 = r1.booleanValue();
        if (r1 != 0) goto L_0x0117;
    L_0x008a:
        r1 = r2;
    L_0x008b:
        r2 = android.text.TextUtils.isEmpty(r1);
        if (r2 != 0) goto L_0x00a6;
    L_0x0091:
        r2 = "Authorization";
        r3 = "Bearer ";
        r1 = java.lang.String.valueOf(r1);
        r4 = r1.length();
        if (r4 == 0) goto L_0x01eb;
    L_0x009f:
        r1 = r3.concat(r1);
    L_0x00a3:
        r0.setRequestProperty(r2, r1);
    L_0x00a6:
        r1 = r0.getInputStream();	 Catch:{ IOException -> 0x01f2 }
        r0 = r0.getContentType();
        r2 = a(r0);
        r0 = new java.io.ByteArrayOutputStream;
        r0.<init>();
        r3 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r3 = new byte[r3];	 Catch:{ all -> 0x00c6 }
    L_0x00bb:
        r4 = r1.read(r3);	 Catch:{ all -> 0x00c6 }
        if (r4 <= 0) goto L_0x01f7;
    L_0x00c1:
        r5 = 0;
        r0.write(r3, r5, r4);	 Catch:{ all -> 0x00c6 }
        goto L_0x00bb;
    L_0x00c6:
        r0 = move-exception;
        r1.close();
        throw r0;
    L_0x00cb:
        if (r2 != 0) goto L_0x00fa;
    L_0x00cd:
        r1 = r3.j;
        r4 = crm.b;
        r5 = r3.f;
        r6 = r3.g;
        r7 = r3.h;
        r1 = r1.a(r4, r5, r6, r7);
    L_0x00db:
        if (r1 == 0) goto L_0x00e3;
    L_0x00dd:
        r1 = r3.a(r1);
        if (r1 != 0) goto L_0x0082;
    L_0x00e3:
        r1 = crm.b;
        r1 = r1.getContentResolver();
        r4 = r3.e;
        r1 = ckq.a(r1, r4);
        if (r1 == 0) goto L_0x00f7;
    L_0x00f1:
        r1 = r3.a(r1);
        if (r1 != 0) goto L_0x0082;
    L_0x00f7:
        r1 = r3.k;
        goto L_0x0082;
    L_0x00fa:
        r1 = r3.j;
        r4 = r3.f;
        r5 = r3.g;
        r6 = r3.h;
        r7 = new crk;
        r7.<init>(r4, r5, r6);
        r4 = r1.a(r7);
        if (r4 == 0) goto L_0x0112;
    L_0x010d:
        r1 = r4.a;
        r1 = (com.google.android.gms.phenotype.Flag) r1;
        goto L_0x00db;
    L_0x0112:
        r1 = r1.a(r2, r7);
        goto L_0x00db;
    L_0x0117:
        r1 = r9.getContext();
        r1 = android.preference.PreferenceManager.getDefaultSharedPreferences(r1);
        if (r1 == 0) goto L_0x0135;
    L_0x0121:
        r3 = r9.getContext();
        r3 = r3.getResources();
        r4 = buf.lL;
        r3 = r3.getString(r4);
        r3 = r1.getBoolean(r3, r8);
        if (r3 != 0) goto L_0x0138;
    L_0x0135:
        r1 = r2;
        goto L_0x008b;
    L_0x0138:
        r3 = r9.getContext();
        r3 = r3.getResources();
        r4 = buf.lG;
        r3 = r3.getString(r4);
        r4 = "";
        r3 = r1.getString(r3, r4);
        r1 = android.text.TextUtils.isEmpty(r3);
        if (r1 == 0) goto L_0x0155;
    L_0x0152:
        r1 = r2;
        goto L_0x008b;
    L_0x0155:
        r4 = bjd.x;
        r1 = crm.b;
        if (r1 != 0) goto L_0x0163;
    L_0x015b:
        r0 = new java.lang.IllegalStateException;
        r1 = "Must call PhenotypeFlag.init() first";
        r0.<init>(r1);
        throw r0;
    L_0x0163:
        r1 = crm.d;
        r1 = r1.b();
        r1 = (java.lang.Boolean) r1;
        r1 = r1.booleanValue();
        if (r1 != 0) goto L_0x01b7;
    L_0x0171:
        r1 = r4.i;
        if (r1 == 0) goto L_0x019f;
    L_0x0175:
        r1 = crm.b;
        r5 = r4.i;
        r1 = r1.getSharedPreferences(r5, r8);
        r5 = r4.g;
        r5 = r1.contains(r5);
        if (r5 == 0) goto L_0x01b7;
    L_0x0185:
        r1 = r4.a(r1);
    L_0x0189:
        r1 = (java.lang.String) r1;
        r4 = r9.getContext();
        r1 = blm.a(r4, r3, r1);
        if (r1 != 0) goto L_0x008b;
    L_0x0195:
        r1 = "DialerProvider";
        r3 = "No token with the scope that we need...exiting";
        android.util.Log.e(r1, r3);
        r1 = r2;
        goto L_0x008b;
    L_0x019f:
        if (r2 != 0) goto L_0x01ce;
    L_0x01a1:
        r1 = r4.j;
        r5 = crm.b;
        r6 = r4.f;
        r7 = r4.g;
        r8 = r4.h;
        r1 = r1.a(r5, r6, r7, r8);
    L_0x01af:
        if (r1 == 0) goto L_0x01b7;
    L_0x01b1:
        r1 = r4.a(r1);
        if (r1 != 0) goto L_0x0189;
    L_0x01b7:
        r1 = crm.b;
        r1 = r1.getContentResolver();
        r5 = r4.e;
        r1 = ckq.a(r1, r5);
        if (r1 == 0) goto L_0x01cb;
    L_0x01c5:
        r1 = r4.a(r1);
        if (r1 != 0) goto L_0x0189;
    L_0x01cb:
        r1 = r4.k;
        goto L_0x0189;
    L_0x01ce:
        r1 = r4.j;
        r5 = r4.f;
        r6 = r4.g;
        r7 = r4.h;
        r8 = new crk;
        r8.<init>(r5, r6, r7);
        r5 = r1.a(r8);
        if (r5 == 0) goto L_0x01e6;
    L_0x01e1:
        r1 = r5.a;
        r1 = (com.google.android.gms.phenotype.Flag) r1;
        goto L_0x01af;
    L_0x01e6:
        r1 = r1.a(r2, r8);
        goto L_0x01af;
    L_0x01eb:
        r1 = new java.lang.String;
        r1.<init>(r3);
        goto L_0x00a3;
    L_0x01f2:
        r1 = move-exception;
        r0.disconnect();
        throw r1;
    L_0x01f7:
        r1.close();
        r0.flush();
        r3 = r0.toByteArray();
        r0 = new java.lang.String;	 Catch:{ UnsupportedEncodingException -> 0x0207 }
        r0.<init>(r3, r2);	 Catch:{ UnsupportedEncodingException -> 0x0207 }
    L_0x0206:
        return r0;
    L_0x0207:
        r0 = move-exception;
        r1 = r0;
        r4 = "DialerProvider";
        r5 = "Invalid charset: ";
        r0 = java.lang.String.valueOf(r2);
        r2 = r0.length();
        if (r2 == 0) goto L_0x0224;
    L_0x0217:
        r0 = r5.concat(r0);
    L_0x021b:
        android.util.Log.w(r4, r0, r1);
        r0 = new java.lang.String;
        r0.<init>(r3);
        goto L_0x0206;
    L_0x0224:
        r0 = new java.lang.String;
        r0.<init>(r5);
        goto L_0x021b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.dialer.provider.DialerProvider.b(android.net.Uri):java.lang.String");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.database.Cursor a(java.lang.String[] r36, org.json.JSONArray r37, int r38) {
        /*
        r35 = this;
        r15 = -1;
        r14 = -1;
        r13 = -1;
        r12 = -1;
        r11 = -1;
        r10 = -1;
        r9 = -1;
        r8 = -1;
        r7 = -1;
        r6 = -1;
        r5 = 0;
    L_0x000b:
        r0 = r36;
        r0 = r0.length;
        r16 = r0;
        r0 = r16;
        if (r5 >= r0) goto L_0x00b0;
    L_0x0014:
        r16 = r36[r5];
        r17 = "display_name";
        r0 = r17;
        r1 = r16;
        r17 = r0.equals(r1);
        if (r17 != 0) goto L_0x002e;
    L_0x0022:
        r17 = "display_name";
        r0 = r17;
        r1 = r16;
        r17 = r0.equals(r1);
        if (r17 == 0) goto L_0x0032;
    L_0x002e:
        r15 = r5;
    L_0x002f:
        r5 = r5 + 1;
        goto L_0x000b;
    L_0x0032:
        r17 = "data3";
        r0 = r17;
        r1 = r16;
        r17 = r0.equals(r1);
        if (r17 == 0) goto L_0x0040;
    L_0x003e:
        r14 = r5;
        goto L_0x002f;
    L_0x0040:
        r17 = "has_phone_number";
        r0 = r17;
        r1 = r16;
        r17 = r0.equals(r1);
        if (r17 == 0) goto L_0x004e;
    L_0x004c:
        r11 = r5;
        goto L_0x002f;
    L_0x004e:
        r17 = "_id";
        r0 = r17;
        r1 = r16;
        r17 = r0.equals(r1);
        if (r17 == 0) goto L_0x005c;
    L_0x005a:
        r10 = r5;
        goto L_0x002f;
    L_0x005c:
        r17 = "contact_id";
        r0 = r17;
        r1 = r16;
        r17 = r0.equals(r1);
        if (r17 == 0) goto L_0x006a;
    L_0x0068:
        r9 = r5;
        goto L_0x002f;
    L_0x006a:
        r17 = "data1";
        r0 = r17;
        r1 = r16;
        r17 = r0.equals(r1);
        if (r17 == 0) goto L_0x0078;
    L_0x0076:
        r13 = r5;
        goto L_0x002f;
    L_0x0078:
        r17 = "data2";
        r0 = r17;
        r1 = r16;
        r17 = r0.equals(r1);
        if (r17 == 0) goto L_0x0086;
    L_0x0084:
        r12 = r5;
        goto L_0x002f;
    L_0x0086:
        r17 = "photo_uri";
        r0 = r17;
        r1 = r16;
        r17 = r0.equals(r1);
        if (r17 == 0) goto L_0x0094;
    L_0x0092:
        r8 = r5;
        goto L_0x002f;
    L_0x0094:
        r17 = "photo_thumb_uri";
        r0 = r17;
        r1 = r16;
        r17 = r0.equals(r1);
        if (r17 == 0) goto L_0x00a2;
    L_0x00a0:
        r7 = r5;
        goto L_0x002f;
    L_0x00a2:
        r17 = "lookup";
        r0 = r17;
        r1 = r16;
        r16 = r0.equals(r1);
        if (r16 == 0) goto L_0x002f;
    L_0x00ae:
        r6 = r5;
        goto L_0x002f;
    L_0x00b0:
        r5 = r35.getContext();
        r5.getContentResolver();
        r16 = bjd.z;
        r17 = 0;
        r5 = crm.b;
        if (r5 != 0) goto L_0x00c7;
    L_0x00bf:
        r5 = new java.lang.IllegalStateException;
        r6 = "Must call PhenotypeFlag.init() first";
        r5.<init>(r6);
        throw r5;
    L_0x00c7:
        r5 = crm.d;
        r5 = r5.b();
        r5 = (java.lang.Boolean) r5;
        r5 = r5.booleanValue();
        if (r5 != 0) goto L_0x0147;
    L_0x00d5:
        r0 = r16;
        r5 = r0.i;
        if (r5 == 0) goto L_0x0117;
    L_0x00db:
        r5 = crm.b;
        r0 = r16;
        r0 = r0.i;
        r17 = r0;
        r18 = 0;
        r0 = r17;
        r1 = r18;
        r5 = r5.getSharedPreferences(r0, r1);
        r0 = r16;
        r0 = r0.g;
        r17 = r0;
        r0 = r17;
        r17 = r5.contains(r0);
        if (r17 == 0) goto L_0x0147;
    L_0x00fb:
        r0 = r16;
        r5 = r0.a(r5);
    L_0x0101:
        r5 = (java.lang.Boolean) r5;
        r20 = r5.booleanValue();
        r16 = bjd.A;
        r17 = 0;
        r5 = crm.b;
        if (r5 != 0) goto L_0x01a3;
    L_0x010f:
        r5 = new java.lang.IllegalStateException;
        r6 = "Must call PhenotypeFlag.init() first";
        r5.<init>(r6);
        throw r5;
    L_0x0117:
        if (r17 != 0) goto L_0x0168;
    L_0x0119:
        r0 = r16;
        r5 = r0.j;
        r17 = crm.b;
        r0 = r16;
        r0 = r0.f;
        r18 = r0;
        r0 = r16;
        r0 = r0.g;
        r19 = r0;
        r0 = r16;
        r0 = r0.h;
        r20 = r0;
        r0 = r17;
        r1 = r18;
        r2 = r19;
        r3 = r20;
        r5 = r5.a(r0, r1, r2, r3);
    L_0x013d:
        if (r5 == 0) goto L_0x0147;
    L_0x013f:
        r0 = r16;
        r5 = r0.a(r5);
        if (r5 != 0) goto L_0x0101;
    L_0x0147:
        r5 = crm.b;
        r5 = r5.getContentResolver();
        r0 = r16;
        r0 = r0.e;
        r17 = r0;
        r0 = r17;
        r5 = ckq.a(r5, r0);
        if (r5 == 0) goto L_0x0163;
    L_0x015b:
        r0 = r16;
        r5 = r0.a(r5);
        if (r5 != 0) goto L_0x0101;
    L_0x0163:
        r0 = r16;
        r5 = r0.k;
        goto L_0x0101;
    L_0x0168:
        r0 = r16;
        r5 = r0.j;
        r0 = r16;
        r0 = r0.f;
        r18 = r0;
        r0 = r16;
        r0 = r0.g;
        r19 = r0;
        r0 = r16;
        r0 = r0.h;
        r20 = r0;
        r21 = new crk;
        r0 = r21;
        r1 = r18;
        r2 = r19;
        r3 = r20;
        r0.<init>(r1, r2, r3);
        r0 = r21;
        r18 = r5.a(r0);
        if (r18 == 0) goto L_0x019a;
    L_0x0193:
        r0 = r18;
        r5 = r0.a;
        r5 = (com.google.android.gms.phenotype.Flag) r5;
        goto L_0x013d;
    L_0x019a:
        r0 = r17;
        r1 = r21;
        r5 = r5.a(r0, r1);
        goto L_0x013d;
    L_0x01a3:
        r5 = crm.d;
        r5 = r5.b();
        r5 = (java.lang.Boolean) r5;
        r5 = r5.booleanValue();
        if (r5 != 0) goto L_0x02fe;
    L_0x01b1:
        r0 = r16;
        r5 = r0.i;
        if (r5 == 0) goto L_0x02ce;
    L_0x01b7:
        r5 = crm.b;
        r0 = r16;
        r0 = r0.i;
        r17 = r0;
        r18 = 0;
        r0 = r17;
        r1 = r18;
        r5 = r5.getSharedPreferences(r0, r1);
        r0 = r16;
        r0 = r0.g;
        r17 = r0;
        r0 = r17;
        r17 = r5.contains(r0);
        if (r17 == 0) goto L_0x02fe;
    L_0x01d7:
        r0 = r16;
        r5 = r0.a(r5);
    L_0x01dd:
        r5 = (java.lang.Boolean) r5;
        r5 = r5.booleanValue();
        if (r5 == 0) goto L_0x035b;
    L_0x01e5:
        r5 = 2;
    L_0x01e6:
        r21 = new android.database.MatrixCursor;
        r0 = r21;
        r1 = r36;
        r0.<init>(r1);
        r16 = 1;
        r0 = r37;
        r1 = r16;
        r22 = r0.getJSONArray(r1);
        r17 = 1;
        r16 = 0;
        r34 = r16;
        r16 = r17;
        r17 = r34;
    L_0x0203:
        r18 = r22.length();
        r0 = r17;
        r1 = r18;
        if (r0 >= r1) goto L_0x061d;
    L_0x020d:
        r0 = r22;
        r1 = r17;
        r19 = r0.getJSONArray(r1);	 Catch:{ JSONException -> 0x0628 }
        r18 = 0;
        r0 = r19;
        r1 = r18;
        r18 = r0.getString(r1);	 Catch:{ JSONException -> 0x0628 }
        r18 = android.text.Html.fromHtml(r18);	 Catch:{ JSONException -> 0x0628 }
        r18 = r18.toString();	 Catch:{ JSONException -> 0x0628 }
        r23 = 3;
        r0 = r19;
        r1 = r23;
        r19 = r0.getJSONObject(r1);	 Catch:{ JSONException -> 0x0628 }
        r23 = "b";
        r0 = r19;
        r1 = r23;
        r23 = r0.getString(r1);	 Catch:{ JSONException -> 0x0628 }
        r23 = android.text.Html.fromHtml(r23);	 Catch:{ JSONException -> 0x0628 }
        r23 = r23.toString();	 Catch:{ JSONException -> 0x0628 }
        r24 = "g";
        r0 = r19;
        r1 = r24;
        r24 = r0.getString(r1);	 Catch:{ JSONException -> 0x0628 }
        r24 = android.text.Html.fromHtml(r24);	 Catch:{ JSONException -> 0x0628 }
        r24 = r24.toString();	 Catch:{ JSONException -> 0x0628 }
        r25 = "f";
        r26 = 0;
        r0 = r19;
        r1 = r25;
        r2 = r26;
        r25 = r0.optString(r1, r2);	 Catch:{ JSONException -> 0x0628 }
        r26 = "d";
        r27 = 0;
        r0 = r19;
        r1 = r26;
        r2 = r27;
        r26 = r0.optString(r1, r2);	 Catch:{ JSONException -> 0x0628 }
        r27 = "c";
        r28 = 0;
        r0 = r19;
        r1 = r27;
        r2 = r28;
        r27 = r0.optString(r1, r2);	 Catch:{ JSONException -> 0x0628 }
        if (r20 == 0) goto L_0x02c4;
    L_0x0281:
        if (r27 == 0) goto L_0x02c4;
    L_0x0283:
        r18 = java.lang.String.valueOf(r18);	 Catch:{ JSONException -> 0x0628 }
        r19 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x0628 }
        r28 = java.lang.String.valueOf(r18);	 Catch:{ JSONException -> 0x0628 }
        r28 = r28.length();	 Catch:{ JSONException -> 0x0628 }
        r28 = r28 + 9;
        r29 = java.lang.String.valueOf(r27);	 Catch:{ JSONException -> 0x0628 }
        r29 = r29.length();	 Catch:{ JSONException -> 0x0628 }
        r28 = r28 + r29;
        r0 = r19;
        r1 = r28;
        r0.<init>(r1);	 Catch:{ JSONException -> 0x0628 }
        r0 = r19;
        r1 = r18;
        r18 = r0.append(r1);	 Catch:{ JSONException -> 0x0628 }
        r19 = " [";
        r18 = r18.append(r19);	 Catch:{ JSONException -> 0x0628 }
        r0 = r18;
        r1 = r27;
        r18 = r0.append(r1);	 Catch:{ JSONException -> 0x0628 }
        r19 = " miles]";
        r18 = r18.append(r19);	 Catch:{ JSONException -> 0x0628 }
        r18 = r18.toString();	 Catch:{ JSONException -> 0x0628 }
    L_0x02c4:
        r19 = r23.isEmpty();	 Catch:{ JSONException -> 0x0628 }
        if (r19 == 0) goto L_0x035e;
    L_0x02ca:
        r17 = r17 + 1;
        goto L_0x0203;
    L_0x02ce:
        if (r17 != 0) goto L_0x0320;
    L_0x02d0:
        r0 = r16;
        r5 = r0.j;
        r17 = crm.b;
        r0 = r16;
        r0 = r0.f;
        r18 = r0;
        r0 = r16;
        r0 = r0.g;
        r19 = r0;
        r0 = r16;
        r0 = r0.h;
        r21 = r0;
        r0 = r17;
        r1 = r18;
        r2 = r19;
        r3 = r21;
        r5 = r5.a(r0, r1, r2, r3);
    L_0x02f4:
        if (r5 == 0) goto L_0x02fe;
    L_0x02f6:
        r0 = r16;
        r5 = r0.a(r5);
        if (r5 != 0) goto L_0x01dd;
    L_0x02fe:
        r5 = crm.b;
        r5 = r5.getContentResolver();
        r0 = r16;
        r0 = r0.e;
        r17 = r0;
        r0 = r17;
        r5 = ckq.a(r5, r0);
        if (r5 == 0) goto L_0x031a;
    L_0x0312:
        r0 = r16;
        r5 = r0.a(r5);
        if (r5 != 0) goto L_0x01dd;
    L_0x031a:
        r0 = r16;
        r5 = r0.k;
        goto L_0x01dd;
    L_0x0320:
        r0 = r16;
        r5 = r0.j;
        r0 = r16;
        r0 = r0.f;
        r18 = r0;
        r0 = r16;
        r0 = r0.g;
        r19 = r0;
        r0 = r16;
        r0 = r0.h;
        r21 = r0;
        r22 = new crk;
        r0 = r22;
        r1 = r18;
        r2 = r19;
        r3 = r21;
        r0.<init>(r1, r2, r3);
        r0 = r22;
        r18 = r5.a(r0);
        if (r18 == 0) goto L_0x0352;
    L_0x034b:
        r0 = r18;
        r5 = r0.a;
        r5 = (com.google.android.gms.phenotype.Flag) r5;
        goto L_0x02f4;
    L_0x0352:
        r0 = r17;
        r1 = r22;
        r5 = r5.a(r0, r1);
        goto L_0x02f4;
    L_0x035b:
        r5 = 0;
        goto L_0x01e6;
    L_0x035e:
        r0 = r36;
        r0 = r0.length;	 Catch:{ JSONException -> 0x0628 }
        r19 = r0;
        r0 = r19;
        r0 = new java.lang.Object[r0];	 Catch:{ JSONException -> 0x0628 }
        r28 = r0;
        if (r15 < 0) goto L_0x036d;
    L_0x036b:
        r28[r15] = r18;	 Catch:{ JSONException -> 0x0628 }
    L_0x036d:
        if (r14 < 0) goto L_0x0371;
    L_0x036f:
        r28[r14] = r24;	 Catch:{ JSONException -> 0x0628 }
    L_0x0371:
        if (r11 < 0) goto L_0x037b;
    L_0x0373:
        r19 = 1;
        r19 = java.lang.Boolean.valueOf(r19);	 Catch:{ JSONException -> 0x0628 }
        r28[r11] = r19;	 Catch:{ JSONException -> 0x0628 }
    L_0x037b:
        r19 = -1;
        r0 = r19;
        if (r9 == r0) goto L_0x0387;
    L_0x0381:
        r19 = java.lang.Integer.valueOf(r16);	 Catch:{ JSONException -> 0x0628 }
        r28[r9] = r19;	 Catch:{ JSONException -> 0x0628 }
    L_0x0387:
        if (r13 < 0) goto L_0x038b;
    L_0x0389:
        r28[r13] = r23;	 Catch:{ JSONException -> 0x0628 }
    L_0x038b:
        if (r12 < 0) goto L_0x0395;
    L_0x038d:
        r19 = 12;
        r19 = java.lang.Integer.valueOf(r19);	 Catch:{ JSONException -> 0x0628 }
        r28[r12] = r19;	 Catch:{ JSONException -> 0x0628 }
    L_0x0395:
        if (r26 != 0) goto L_0x061e;
    L_0x0397:
        r19 = new abc;	 Catch:{ JSONException -> 0x0628 }
        r26 = 0;
        r29 = 2;
        r30 = 1;
        r0 = r19;
        r1 = r18;
        r2 = r26;
        r3 = r29;
        r4 = r30;
        r0.<init>(r1, r2, r3, r4);	 Catch:{ JSONException -> 0x0628 }
        r26 = aaz.a;	 Catch:{ JSONException -> 0x0628 }
        r26 = r26.buildUpon();	 Catch:{ JSONException -> 0x0628 }
        r0 = r19;
        r0 = r0.e;	 Catch:{ JSONException -> 0x0628 }
        r29 = r0;
        r29 = android.text.TextUtils.isEmpty(r29);	 Catch:{ JSONException -> 0x0628 }
        if (r29 != 0) goto L_0x03cf;
    L_0x03be:
        r29 = "display_name";
        r0 = r19;
        r0 = r0.e;	 Catch:{ JSONException -> 0x0628 }
        r30 = r0;
        r0 = r26;
        r1 = r29;
        r2 = r30;
        r0.appendQueryParameter(r1, r2);	 Catch:{ JSONException -> 0x0628 }
    L_0x03cf:
        r0 = r19;
        r0 = r0.f;	 Catch:{ JSONException -> 0x0628 }
        r29 = r0;
        r29 = android.text.TextUtils.isEmpty(r29);	 Catch:{ JSONException -> 0x0628 }
        if (r29 != 0) goto L_0x03ec;
    L_0x03db:
        r29 = "identifier";
        r0 = r19;
        r0 = r0.f;	 Catch:{ JSONException -> 0x0628 }
        r30 = r0;
        r0 = r26;
        r1 = r29;
        r2 = r30;
        r0.appendQueryParameter(r1, r2);	 Catch:{ JSONException -> 0x0628 }
    L_0x03ec:
        r0 = r19;
        r0 = r0.g;	 Catch:{ JSONException -> 0x0628 }
        r29 = r0;
        r30 = 1;
        r0 = r29;
        r1 = r30;
        if (r0 == r1) goto L_0x040f;
    L_0x03fa:
        r29 = "contact_type";
        r0 = r19;
        r0 = r0.g;	 Catch:{ JSONException -> 0x0628 }
        r30 = r0;
        r30 = java.lang.String.valueOf(r30);	 Catch:{ JSONException -> 0x0628 }
        r0 = r26;
        r1 = r29;
        r2 = r30;
        r0.appendQueryParameter(r1, r2);	 Catch:{ JSONException -> 0x0628 }
    L_0x040f:
        r0 = r19;
        r0 = r0.h;	 Catch:{ JSONException -> 0x0628 }
        r29 = r0;
        r30 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r29 = (r29 > r30 ? 1 : (r29 == r30 ? 0 : -1));
        if (r29 == 0) goto L_0x0430;
    L_0x041b:
        r29 = "scale";
        r0 = r19;
        r0 = r0.h;	 Catch:{ JSONException -> 0x0628 }
        r30 = r0;
        r30 = java.lang.String.valueOf(r30);	 Catch:{ JSONException -> 0x0628 }
        r0 = r26;
        r1 = r29;
        r2 = r30;
        r0.appendQueryParameter(r1, r2);	 Catch:{ JSONException -> 0x0628 }
    L_0x0430:
        r0 = r19;
        r0 = r0.i;	 Catch:{ JSONException -> 0x0628 }
        r29 = r0;
        r30 = 0;
        r29 = (r29 > r30 ? 1 : (r29 == r30 ? 0 : -1));
        if (r29 == 0) goto L_0x0451;
    L_0x043c:
        r29 = "offset";
        r0 = r19;
        r0 = r0.i;	 Catch:{ JSONException -> 0x0628 }
        r30 = r0;
        r30 = java.lang.String.valueOf(r30);	 Catch:{ JSONException -> 0x0628 }
        r0 = r26;
        r1 = r29;
        r2 = r30;
        r0.appendQueryParameter(r1, r2);	 Catch:{ JSONException -> 0x0628 }
    L_0x0451:
        r0 = r19;
        r0 = r0.j;	 Catch:{ JSONException -> 0x0628 }
        r29 = r0;
        if (r29 == 0) goto L_0x046e;
    L_0x0459:
        r29 = "is_circular";
        r0 = r19;
        r0 = r0.j;	 Catch:{ JSONException -> 0x0628 }
        r19 = r0;
        r19 = java.lang.String.valueOf(r19);	 Catch:{ JSONException -> 0x0628 }
        r0 = r26;
        r1 = r29;
        r2 = r19;
        r0.appendQueryParameter(r1, r2);	 Catch:{ JSONException -> 0x0628 }
    L_0x046e:
        r19 = r26.build();	 Catch:{ JSONException -> 0x0628 }
        r19 = r19.toString();	 Catch:{ JSONException -> 0x0628 }
    L_0x0476:
        if (r8 < 0) goto L_0x047a;
    L_0x0478:
        r28[r8] = r19;	 Catch:{ JSONException -> 0x0628 }
    L_0x047a:
        if (r7 < 0) goto L_0x047e;
    L_0x047c:
        r28[r7] = r19;	 Catch:{ JSONException -> 0x0628 }
    L_0x047e:
        if (r6 < 0) goto L_0x05f8;
    L_0x0480:
        r26 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x0628 }
        r29 = java.lang.String.valueOf(r18);	 Catch:{ JSONException -> 0x0628 }
        r29 = r29.length();	 Catch:{ JSONException -> 0x0628 }
        r29 = r29 + 2;
        r30 = java.lang.String.valueOf(r24);	 Catch:{ JSONException -> 0x0628 }
        r30 = r30.length();	 Catch:{ JSONException -> 0x0628 }
        r29 = r29 + r30;
        r0 = r26;
        r1 = r29;
        r0.<init>(r1);	 Catch:{ JSONException -> 0x0628 }
        r0 = r26;
        r1 = r18;
        r26 = r0.append(r1);	 Catch:{ JSONException -> 0x0628 }
        r29 = ", ";
        r0 = r26;
        r1 = r29;
        r26 = r0.append(r1);	 Catch:{ JSONException -> 0x0628 }
        r0 = r26;
        r1 = r24;
        r24 = r0.append(r1);	 Catch:{ JSONException -> 0x0628 }
        r24 = r24.toString();	 Catch:{ JSONException -> 0x0628 }
        r26 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0628 }
        r26.<init>();	 Catch:{ JSONException -> 0x0628 }
        r29 = "vnd.android.cursor.item/name";
        r30 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0628 }
        r30.<init>();	 Catch:{ JSONException -> 0x0628 }
        r31 = "data1";
        r0 = r30;
        r1 = r31;
        r2 = r18;
        r30 = r0.put(r1, r2);	 Catch:{ JSONException -> 0x0628 }
        r0 = r26;
        r1 = r29;
        r2 = r30;
        r26 = r0.put(r1, r2);	 Catch:{ JSONException -> 0x0628 }
        r29 = "vnd.android.cursor.item/phone_v2";
        r30 = 1;
        r0 = r30;
        r0 = new org.json.JSONObject[r0];	 Catch:{ JSONException -> 0x0628 }
        r30 = r0;
        r31 = 0;
        r32 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0628 }
        r32.<init>();	 Catch:{ JSONException -> 0x0628 }
        r33 = "data1";
        r0 = r32;
        r1 = r33;
        r2 = r23;
        r23 = r0.put(r1, r2);	 Catch:{ JSONException -> 0x0628 }
        r32 = "data2";
        r33 = 12;
        r0 = r23;
        r1 = r32;
        r2 = r33;
        r23 = r0.put(r1, r2);	 Catch:{ JSONException -> 0x0628 }
        r30[r31] = r23;	 Catch:{ JSONException -> 0x0628 }
        r23 = buf.a(r30);	 Catch:{ JSONException -> 0x0628 }
        r0 = r26;
        r1 = r29;
        r2 = r23;
        r23 = r0.put(r1, r2);	 Catch:{ JSONException -> 0x0628 }
        r26 = "vnd.android.cursor.item/postal-address_v2";
        r29 = 1;
        r0 = r29;
        r0 = new org.json.JSONObject[r0];	 Catch:{ JSONException -> 0x0628 }
        r29 = r0;
        r30 = 0;
        r31 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0628 }
        r31.<init>();	 Catch:{ JSONException -> 0x0628 }
        r32 = "data1";
        r0 = r31;
        r1 = r32;
        r2 = r24;
        r24 = r0.put(r1, r2);	 Catch:{ JSONException -> 0x0628 }
        r31 = "data2";
        r32 = 2;
        r0 = r24;
        r1 = r31;
        r2 = r32;
        r24 = r0.put(r1, r2);	 Catch:{ JSONException -> 0x0628 }
        r29[r30] = r24;	 Catch:{ JSONException -> 0x0628 }
        r24 = buf.a(r29);	 Catch:{ JSONException -> 0x0628 }
        r0 = r23;
        r1 = r26;
        r2 = r24;
        r23 = r0.put(r1, r2);	 Catch:{ JSONException -> 0x0628 }
        if (r25 == 0) goto L_0x0589;
    L_0x0555:
        r24 = "vnd.android.cursor.item/website";
        r26 = 1;
        r0 = r26;
        r0 = new org.json.JSONObject[r0];	 Catch:{ JSONException -> 0x0628 }
        r26 = r0;
        r29 = 0;
        r30 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0628 }
        r30.<init>();	 Catch:{ JSONException -> 0x0628 }
        r31 = "data1";
        r0 = r30;
        r1 = r31;
        r2 = r25;
        r25 = r0.put(r1, r2);	 Catch:{ JSONException -> 0x0628 }
        r30 = "data2";
        r31 = 3;
        r0 = r25;
        r1 = r30;
        r2 = r31;
        r25 = r0.put(r1, r2);	 Catch:{ JSONException -> 0x0628 }
        r26[r29] = r25;	 Catch:{ JSONException -> 0x0628 }
        r25 = buf.a(r26);	 Catch:{ JSONException -> 0x0628 }
        r23.put(r24, r25);	 Catch:{ JSONException -> 0x0628 }
    L_0x0589:
        r24 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0628 }
        r24.<init>();	 Catch:{ JSONException -> 0x0628 }
        r25 = "display_name";
        r0 = r24;
        r1 = r25;
        r2 = r18;
        r18 = r0.put(r1, r2);	 Catch:{ JSONException -> 0x0628 }
        r24 = "display_name_source";
        r25 = 30;
        r0 = r18;
        r1 = r24;
        r2 = r25;
        r18 = r0.put(r1, r2);	 Catch:{ JSONException -> 0x0628 }
        r24 = "exportSupport";
        r0 = r18;
        r1 = r24;
        r18 = r0.put(r1, r5);	 Catch:{ JSONException -> 0x0628 }
        r24 = "photo_uri";
        r0 = r18;
        r1 = r24;
        r2 = r19;
        r18 = r0.put(r1, r2);	 Catch:{ JSONException -> 0x0628 }
        r19 = "vnd.android.cursor.item/contact";
        r0 = r18;
        r1 = r19;
        r2 = r23;
        r18 = r0.put(r1, r2);	 Catch:{ JSONException -> 0x0628 }
        r19 = "analytics_category";
        r23 = "nearbyplaces";
        r0 = r18;
        r1 = r19;
        r2 = r23;
        r18 = r0.put(r1, r2);	 Catch:{ JSONException -> 0x0628 }
        r19 = "analytics_action";
        r23 = "call";
        r0 = r18;
        r1 = r19;
        r2 = r23;
        r18 = r0.put(r1, r2);	 Catch:{ JSONException -> 0x0628 }
        r19 = "analytics_value";
        r0 = r18;
        r1 = r19;
        r2 = r27;
        r18 = r0.put(r1, r2);	 Catch:{ JSONException -> 0x0628 }
        r18 = r18.toString();	 Catch:{ JSONException -> 0x0628 }
        r28[r6] = r18;	 Catch:{ JSONException -> 0x0628 }
    L_0x05f8:
        r18 = -1;
        r0 = r18;
        if (r10 == r0) goto L_0x0604;
    L_0x05fe:
        r18 = java.lang.Integer.valueOf(r16);	 Catch:{ JSONException -> 0x0628 }
        r28[r10] = r18;	 Catch:{ JSONException -> 0x0628 }
    L_0x0604:
        r0 = r21;
        r1 = r28;
        r0.addRow(r1);	 Catch:{ JSONException -> 0x0628 }
        r18 = -1;
        r0 = r38;
        r1 = r18;
        if (r0 == r1) goto L_0x0624;
    L_0x0613:
        r18 = r21.getCount();	 Catch:{ JSONException -> 0x0628 }
        r0 = r18;
        r1 = r38;
        if (r0 < r1) goto L_0x0624;
    L_0x061d:
        return r21;
    L_0x061e:
        r19 = aaz.a(r26);	 Catch:{ JSONException -> 0x0628 }
        goto L_0x0476;
    L_0x0624:
        r16 = r16 + 1;
        goto L_0x02ca;
    L_0x0628:
        r18 = move-exception;
        r19 = "DialerProvider";
        r23 = new java.lang.StringBuilder;
        r24 = 47;
        r23.<init>(r24);
        r24 = "Skipped the suggestions at position ";
        r23 = r23.append(r24);
        r0 = r23;
        r1 = r17;
        r23 = r0.append(r1);
        r23 = r23.toString();
        r0 = r19;
        r1 = r23;
        r2 = r18;
        android.util.Log.e(r0, r1, r2);
        goto L_0x02ca;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.dialer.provider.DialerProvider.a(java.lang.String[], org.json.JSONArray, int):android.database.Cursor");
    }

    public final synchronized void a() {
        if (this.g != null && (this.g.d() || this.g.e())) {
            this.g.c();
        }
    }

    private final synchronized boolean b() {
        boolean z = false;
        synchronized (this) {
            if (this.g == null) {
                Log.w("DialerProvider", "GoogleApiClient is null.");
            } else {
                if (!this.g.d()) {
                    ConnectionResult a = this.g.a(3000, TimeUnit.MILLISECONDS);
                    if (a == null || !a.b()) {
                        Log.w("DialerProvider", "Couldn't connect to GoogleApiClient");
                    }
                }
                z = true;
            }
        }
        return z;
    }

    private final synchronized Location c() {
        Location a;
        if (b()) {
            a = biz.a(this.g);
            this.h.removeCallbacks(this.i);
            this.h.postDelayed(this.i, 30000);
        } else {
            a = null;
        }
        return a;
    }

    public final void a(Bundle bundle) {
    }

    public final void a(int i) {
    }

    private final String d() {
        StringBuilder stringBuilder = new StringBuilder();
        int b = b(32) + 4;
        for (int i = 0; i < b; i++) {
            int b2;
            if (Math.random() < 0.3d) {
                b2 = b(10) + 48;
            } else {
                b2 = (Math.random() > 0.5d ? 65 : 97) + b(26);
            }
            stringBuilder.append(Character.toString((char) b2));
        }
        return stringBuilder.toString();
    }

    private static int b(int i) {
        return (int) Math.floor(Math.random() * ((double) i));
    }
}
