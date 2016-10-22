package defpackage;

import android.content.ContentUris;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.Telephony.Mms;
import android.util.SparseArray;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: aiz */
public final class aiz extends aiw<Uri, aja> {
    private static final UriMatcher a;
    private static final SparseArray<Integer> b;
    private static aiz c;
    private final SparseArray<HashSet<Uri>> d;
    private final lo<Long, HashSet<Uri>> e;
    private final HashSet<Uri> f;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        a = uriMatcher;
        uriMatcher.addURI("mms", null, 0);
        a.addURI("mms", "#", 1);
        a.addURI("mms", "inbox", 2);
        a.addURI("mms", "inbox/#", 3);
        a.addURI("mms", "sent", 4);
        a.addURI("mms", "sent/#", 5);
        a.addURI("mms", "drafts", 6);
        a.addURI("mms", "drafts/#", 7);
        a.addURI("mms", "outbox", 8);
        a.addURI("mms", "outbox/#", 9);
        a.addURI("mms-sms", "conversations", 10);
        a.addURI("mms-sms", "conversations/#", 11);
        SparseArray sparseArray = new SparseArray();
        b = sparseArray;
        sparseArray.put(2, Integer.valueOf(1));
        b.put(4, Integer.valueOf(2));
        b.put(6, Integer.valueOf(3));
        b.put(8, Integer.valueOf(4));
    }

    private aiz() {
        this.d = new SparseArray();
        this.e = new lo();
        this.f = new HashSet();
    }

    public static final synchronized aiz b() {
        aiz aiz;
        synchronized (aiz.class) {
            if (c == null) {
                c = new aiz();
            }
            aiz = c;
        }
        return aiz;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean a(android.net.Uri r7, defpackage.aja r8) {
        /*
        r6 = this;
        monitor-enter(r6);
        r1 = r8.b();	 Catch:{ all -> 0x0064 }
        r0 = r6.d;	 Catch:{ all -> 0x0064 }
        r0 = r0.get(r1);	 Catch:{ all -> 0x0064 }
        r0 = (java.util.HashSet) r0;	 Catch:{ all -> 0x0064 }
        if (r0 != 0) goto L_0x0069;
    L_0x000f:
        r0 = new java.util.HashSet;	 Catch:{ all -> 0x0064 }
        r0.<init>();	 Catch:{ all -> 0x0064 }
        r2 = r6.d;	 Catch:{ all -> 0x0064 }
        r2.put(r1, r0);	 Catch:{ all -> 0x0064 }
        r2 = r0;
    L_0x001a:
        r4 = r8.c();	 Catch:{ all -> 0x0064 }
        r0 = r6.e;	 Catch:{ all -> 0x0064 }
        r1 = java.lang.Long.valueOf(r4);	 Catch:{ all -> 0x0064 }
        r0 = r0.get(r1);	 Catch:{ all -> 0x0064 }
        r0 = (java.util.HashSet) r0;	 Catch:{ all -> 0x0064 }
        if (r0 != 0) goto L_0x0067;
    L_0x002c:
        r0 = new java.util.HashSet;	 Catch:{ all -> 0x0064 }
        r0.<init>();	 Catch:{ all -> 0x0064 }
        r1 = r6.e;	 Catch:{ all -> 0x0064 }
        r3 = java.lang.Long.valueOf(r4);	 Catch:{ all -> 0x0064 }
        r1.put(r3, r0);	 Catch:{ all -> 0x0064 }
        r1 = r0;
    L_0x003b:
        r0 = a;	 Catch:{ all -> 0x0064 }
        r0 = r0.match(r7);	 Catch:{ all -> 0x0064 }
        switch(r0) {
            case 1: goto L_0x0057;
            case 2: goto L_0x0044;
            case 3: goto L_0x0059;
            case 4: goto L_0x0044;
            case 5: goto L_0x0059;
            case 6: goto L_0x0044;
            case 7: goto L_0x0059;
            case 8: goto L_0x0044;
            case 9: goto L_0x0059;
            default: goto L_0x0044;
        };	 Catch:{ all -> 0x0064 }
    L_0x0044:
        r0 = 0;
    L_0x0045:
        r3 = super.a(r0, r8);	 Catch:{ all -> 0x0064 }
        if (r3 == 0) goto L_0x0051;
    L_0x004b:
        r2.add(r0);	 Catch:{ all -> 0x0064 }
        r1.add(r0);	 Catch:{ all -> 0x0064 }
    L_0x0051:
        r0 = 0;
        r6.a(r7, r0);	 Catch:{ all -> 0x0064 }
        monitor-exit(r6);
        return r3;
    L_0x0057:
        r0 = r7;
        goto L_0x0045;
    L_0x0059:
        r0 = r7.getLastPathSegment();	 Catch:{ all -> 0x0064 }
        r3 = android.provider.Telephony.Mms.CONTENT_URI;	 Catch:{ all -> 0x0064 }
        r0 = android.net.Uri.withAppendedPath(r3, r0);	 Catch:{ all -> 0x0064 }
        goto L_0x0045;
    L_0x0064:
        r0 = move-exception;
        monitor-exit(r6);
        throw r0;
    L_0x0067:
        r1 = r0;
        goto L_0x003b;
    L_0x0069:
        r2 = r0;
        goto L_0x001a;
        */
        throw new UnsupportedOperationException("Method not decompiled: aiz.a(android.net.Uri, aja):boolean");
    }

    public synchronized void a(Uri uri, boolean z) {
        if (z) {
            this.f.add(uri);
        } else {
            this.f.remove(uri);
        }
    }

    public synchronized boolean a(Uri uri) {
        return this.f.contains(uri);
    }

    public synchronized aja b(Uri uri) {
        aja aja;
        int match = a.match(uri);
        Iterator it;
        Uri uri2;
        aja aja2;
        switch (match) {
            case wi.w /*0*/:
            case wi.dr /*10*/:
                a();
                aja = null;
                break;
            case wi.j /*1*/:
                aja = c(uri);
                break;
            case wi.l /*2*/:
            case wi.h /*4*/:
            case wi.s /*6*/:
            case wi.m /*8*/:
                Integer num = (Integer) b.get(match);
                if (num != null) {
                    HashSet hashSet = (HashSet) this.d.get(num.intValue());
                    this.d.remove(num.intValue());
                    if (hashSet != null) {
                        it = hashSet.iterator();
                        while (it.hasNext()) {
                            uri2 = (Uri) it.next();
                            this.f.remove(uri2);
                            aja2 = (aja) super.b(uri2);
                            if (aja2 != null) {
                                b(uri2, aja2);
                            }
                        }
                    }
                }
                aja = null;
                break;
            case wi.z /*3*/:
            case wi.p /*5*/:
            case wi.q /*7*/:
            case wi.n /*9*/:
                aja = c(Uri.withAppendedPath(Mms.CONTENT_URI, uri.getLastPathSegment()));
                break;
            case wi.dB /*11*/:
                HashSet hashSet2 = (HashSet) this.e.remove(Long.valueOf(ContentUris.parseId(uri)));
                if (hashSet2 != null) {
                    it = hashSet2.iterator();
                    while (it.hasNext()) {
                        uri2 = (Uri) it.next();
                        this.f.remove(uri2);
                        aja2 = (aja) super.b(uri2);
                        if (aja2 != null) {
                            c(uri2, aja2);
                        }
                    }
                }
                aja = null;
                break;
            default:
                aja = null;
                break;
        }
        return aja;
    }

    private aja c(Uri uri) {
        this.f.remove(uri);
        aja aja = (aja) super.b(uri);
        if (aja == null) {
            return null;
        }
        b(uri, aja);
        c(uri, aja);
        return aja;
    }

    public synchronized void a() {
        super.a();
        this.d.clear();
        this.e.clear();
        this.f.clear();
    }

    private void b(Uri uri, aja aja) {
        HashSet hashSet = (HashSet) this.e.get(Long.valueOf(aja.c()));
        if (hashSet != null) {
            hashSet.remove(uri);
        }
    }

    private void c(Uri uri, aja aja) {
        HashSet hashSet = (HashSet) this.e.get(Long.valueOf((long) aja.b()));
        if (hashSet != null) {
            hashSet.remove(uri);
        }
    }
}
