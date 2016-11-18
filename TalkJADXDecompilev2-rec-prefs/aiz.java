package p000;

import android.content.ContentUris;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.Telephony.Mms;
import android.util.SparseArray;
import java.util.HashSet;
import java.util.Iterator;

public final class aiz extends aiw<Uri, aja> {
    private static final UriMatcher f976a;
    private static final SparseArray<Integer> f977b;
    private static aiz f978c;
    private final SparseArray<HashSet<Uri>> f979d = new SparseArray();
    private final lo<Long, HashSet<Uri>> f980e = new lo();
    private final HashSet<Uri> f981f = new HashSet();

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f976a = uriMatcher;
        uriMatcher.addURI("mms", null, 0);
        f976a.addURI("mms", "#", 1);
        f976a.addURI("mms", "inbox", 2);
        f976a.addURI("mms", "inbox/#", 3);
        f976a.addURI("mms", "sent", 4);
        f976a.addURI("mms", "sent/#", 5);
        f976a.addURI("mms", "drafts", 6);
        f976a.addURI("mms", "drafts/#", 7);
        f976a.addURI("mms", "outbox", 8);
        f976a.addURI("mms", "outbox/#", 9);
        f976a.addURI("mms-sms", "conversations", 10);
        f976a.addURI("mms-sms", "conversations/#", 11);
        SparseArray sparseArray = new SparseArray();
        f977b = sparseArray;
        sparseArray.put(2, Integer.valueOf(1));
        f977b.put(4, Integer.valueOf(2));
        f977b.put(6, Integer.valueOf(3));
        f977b.put(8, Integer.valueOf(4));
    }

    private aiz() {
    }

    public static final synchronized aiz m2585b() {
        aiz aiz;
        synchronized (aiz.class) {
            if (f978c == null) {
                f978c = new aiz();
            }
            aiz = f978c;
        }
        return aiz;
    }

    public synchronized boolean m2592a(Uri uri, aja aja) {
        boolean a;
        HashSet hashSet;
        HashSet hashSet2;
        Object withAppendedPath;
        int b = aja.m2597b();
        HashSet hashSet3 = (HashSet) this.f979d.get(b);
        if (hashSet3 == null) {
            hashSet3 = new HashSet();
            this.f979d.put(b, hashSet3);
            hashSet = hashSet3;
        } else {
            hashSet = hashSet3;
        }
        long c = aja.m2598c();
        hashSet3 = (HashSet) this.f980e.get(Long.valueOf(c));
        if (hashSet3 == null) {
            hashSet3 = new HashSet();
            this.f980e.put(Long.valueOf(c), hashSet3);
            hashSet2 = hashSet3;
        } else {
            hashSet2 = hashSet3;
        }
        switch (f976a.match(uri)) {
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
        a = super.mo227a(withAppendedPath, aja);
        if (a) {
            hashSet.add(withAppendedPath);
            hashSet2.add(withAppendedPath);
        }
        m2590a(uri, false);
        return a;
    }

    public synchronized void m2590a(Uri uri, boolean z) {
        if (z) {
            this.f981f.add(uri);
        } else {
            this.f981f.remove(uri);
        }
    }

    public synchronized boolean m2591a(Uri uri) {
        return this.f981f.contains(uri);
    }

    public synchronized aja m2594b(Uri uri) {
        aja aja;
        int match = f976a.match(uri);
        Iterator it;
        Uri uri2;
        aja aja2;
        switch (match) {
            case 0:
            case 10:
                mo226a();
                aja = null;
                break;
            case 1:
                aja = m2587c(uri);
                break;
            case 2:
            case 4:
            case 6:
            case 8:
                Integer num = (Integer) f977b.get(match);
                if (num != null) {
                    HashSet hashSet = (HashSet) this.f979d.get(num.intValue());
                    this.f979d.remove(num.intValue());
                    if (hashSet != null) {
                        it = hashSet.iterator();
                        while (it.hasNext()) {
                            uri2 = (Uri) it.next();
                            this.f981f.remove(uri2);
                            aja2 = (aja) super.mo228b(uri2);
                            if (aja2 != null) {
                                m2586b(uri2, aja2);
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
                aja = m2587c(Uri.withAppendedPath(Mms.CONTENT_URI, uri.getLastPathSegment()));
                break;
            case 11:
                HashSet hashSet2 = (HashSet) this.f980e.remove(Long.valueOf(ContentUris.parseId(uri)));
                if (hashSet2 != null) {
                    it = hashSet2.iterator();
                    while (it.hasNext()) {
                        uri2 = (Uri) it.next();
                        this.f981f.remove(uri2);
                        aja2 = (aja) super.mo228b(uri2);
                        if (aja2 != null) {
                            m2588c(uri2, aja2);
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

    private aja m2587c(Uri uri) {
        this.f981f.remove(uri);
        aja aja = (aja) super.mo228b(uri);
        if (aja == null) {
            return null;
        }
        m2586b(uri, aja);
        m2588c(uri, aja);
        return aja;
    }

    public synchronized void mo226a() {
        super.mo226a();
        this.f979d.clear();
        this.f980e.clear();
        this.f981f.clear();
    }

    private void m2586b(Uri uri, aja aja) {
        HashSet hashSet = (HashSet) this.f980e.get(Long.valueOf(aja.m2598c()));
        if (hashSet != null) {
            hashSet.remove(uri);
        }
    }

    private void m2588c(Uri uri, aja aja) {
        HashSet hashSet = (HashSet) this.f980e.get(Long.valueOf((long) aja.m2597b()));
        if (hashSet != null) {
            hashSet.remove(uri);
        }
    }
}
