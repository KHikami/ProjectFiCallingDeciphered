package defpackage;

import android.content.ContentUris;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.Telephony.Mms;
import android.util.SparseArray;
import java.util.HashSet;
import java.util.Iterator;

public final class aiz extends aiw<Uri, aja> {
    private static final UriMatcher a;
    private static final SparseArray<Integer> b;
    private static aiz c;
    private final SparseArray<HashSet<Uri>> d = new SparseArray();
    private final lo<Long, HashSet<Uri>> e = new lo();
    private final HashSet<Uri> f = new HashSet();

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

    public synchronized boolean a(Uri uri, aja aja) {
        boolean a;
        HashSet hashSet;
        HashSet hashSet2;
        Object withAppendedPath;
        int b = aja.b();
        HashSet hashSet3 = (HashSet) this.d.get(b);
        if (hashSet3 == null) {
            hashSet3 = new HashSet();
            this.d.put(b, hashSet3);
            hashSet = hashSet3;
        } else {
            hashSet = hashSet3;
        }
        long c = aja.c();
        hashSet3 = (HashSet) this.e.get(Long.valueOf(c));
        if (hashSet3 == null) {
            hashSet3 = new HashSet();
            this.e.put(Long.valueOf(c), hashSet3);
            hashSet2 = hashSet3;
        } else {
            hashSet2 = hashSet3;
        }
        switch (a.match(uri)) {
            case 1:
                Uri uri2 = uri;
                break;
            case 3:
            case 5:
            case 7:
            case 9:
                withAppendedPath = Uri.withAppendedPath(Mms.CONTENT_URI, uri.getLastPathSegment());
                break;
            default:
                withAppendedPath = null;
                break;
        }
        a = super.a(withAppendedPath, aja);
        if (a) {
            hashSet.add(withAppendedPath);
            hashSet2.add(withAppendedPath);
        }
        a(uri, false);
        return a;
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
            case 0:
            case 10:
                a();
                aja = null;
                break;
            case 1:
                aja = c(uri);
                break;
            case 2:
            case 4:
            case 6:
            case 8:
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
            case 3:
            case 5:
            case 7:
            case 9:
                aja = c(Uri.withAppendedPath(Mms.CONTENT_URI, uri.getLastPathSegment()));
                break;
            case 11:
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
