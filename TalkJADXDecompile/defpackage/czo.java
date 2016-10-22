package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Debug;
import android.os.Debug.MemoryInfo;

/* renamed from: czo */
public final class czo extends AsyncTask<Void, Void, Void> {
    private hwl a;
    private ky<String, Integer> b;
    private ky<String, Integer> c;
    private final Context d;
    private final czp e;
    private final fsb f;

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return b();
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        c();
    }

    private void c() {
        if (!isCancelled()) {
            this.e.a(this.f, this);
        }
    }

    public czo(Context context, hwl hwl, fsb fsb, czp czp) {
        this.b = new ky();
        this.c = new ky();
        this.d = context;
        this.f = fsb;
        this.e = czp;
        this.a = hwl;
    }

    public hwk a(String str) {
        if (this.a == null || this.a.c() || !this.c.containsKey(str)) {
            return null;
        }
        return (hwk) this.a.a(gwb.a((Integer) this.c.get(str)));
    }

    public hwk b(String str) {
        String e = glq.e(this.d, str);
        if (this.a == null || this.a.c() || !this.b.containsKey(e)) {
            return null;
        }
        return (hwk) this.a.a(gwb.a((Integer) this.b.get(e)));
    }

    public void a() {
        this.a = null;
        this.b.clear();
        this.c.clear();
    }

    private Void b() {
        try {
            this.b.clear();
            this.c.clear();
            MemoryInfo memoryInfo = new MemoryInfo();
            if (this.a != null) {
                glk.c("Babel", "Loading contacts: " + this.a.a(), new Object[0]);
                for (int i = 0; i < this.a.a(); i++) {
                    if (i % 100 == 0) {
                        Debug.getMemoryInfo(memoryInfo);
                        if (memoryInfo.getTotalPss() < 2048) {
                            glk.e("Babel", "Low memory! Halting contact load.", new Object[0]);
                            break;
                        }
                    }
                    hwk hwk = (hwk) this.a.a(i);
                    if (dak.a(hwk)) {
                        for (hwr hwr : hwk.d()) {
                            if (isCancelled()) {
                                throw new InterruptedException();
                            }
                            String e = glq.e(this.d, hwr.b());
                            if (!this.b.containsKey(e)) {
                                this.b.put(e, Integer.valueOf(i));
                            }
                        }
                        for (Long l : hwk.b()) {
                            if (isCancelled()) {
                                throw new InterruptedException();
                            }
                            String valueOf = String.valueOf(l);
                            if (!this.c.containsKey(valueOf)) {
                                this.c.put(valueOf, Integer.valueOf(i));
                            }
                        }
                        continue;
                    }
                }
            }
        } catch (InterruptedException e2) {
            glk.d("Babel", "ContactLookupProviderAsyncTask interrupted.", new Object[0]);
            a();
        } catch (IllegalStateException e3) {
            glk.d("Babel", "ContactLookupProviderAsyncTask failed with IllegalStateException.", new Object[0]);
            a();
        }
        return null;
    }
}
