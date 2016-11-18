package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public abstract class frf {
    private static final boolean f10558a = false;
    private final ConcurrentHashMap<String, List<frj>> f10559b = new ConcurrentHashMap();
    private final LinkedBlockingQueue<String> f10560c = new LinkedBlockingQueue();
    private volatile Thread f10561d;
    private final Object f10562e = new Object();
    public final Handler f10563f = new Handler(Looper.getMainLooper());

    public abstract String mo1676a();

    public abstract void mo1677a(ArrayList<String> arrayList);

    static {
        kae kae = glk.f15570q;
    }

    public boolean mo2072a(frj frj) {
        iil.m21867a();
        if (frj != null && m12708f(frj)) {
            m12707d();
        }
        return false;
    }

    public void m12714b(frj frj) {
        iil.m21867a();
        m12721e(frj);
    }

    public void m12718c(frj frj) {
        m12710a(new frg(this, frj));
    }

    public void m12720d(frj frj) {
        m12710a(new frh(this, frj));
    }

    protected String m12713b() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Number of keys in mPendingKeys: " + this.f10560c.size());
        stringBuilder.append("\nNumber of keys in mRequestsByKey: " + this.f10559b.size());
        return stringBuilder.toString();
    }

    public void m12710a(Runnable runnable) {
        this.f10563f.post(runnable);
    }

    protected boolean m12715b(String str) {
        return this.f10559b.containsKey(str);
    }

    public List<frj> m12716c(String str) {
        return (List) this.f10559b.remove(str);
    }

    protected frj m12719d(String str) {
        frj frj;
        synchronized (this.f10562e) {
            List list = (List) this.f10559b.get(str);
            if (list == null || list.size() <= 0) {
                frj = null;
            } else {
                frj = (frj) list.get(0);
            }
        }
        return frj;
    }

    void m12717c() {
        String str;
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (f10558a) {
                str = "loadKeys looping: ";
                String valueOf = String.valueOf(m12713b());
                if (valueOf.length() != 0) {
                    str.concat(valueOf);
                } else {
                    valueOf = new String(str);
                }
            }
            if (this.f10560c.drainTo(arrayList) == 0) {
                Object obj;
                try {
                    obj = (String) this.f10560c.poll(60, TimeUnit.SECONDS);
                } catch (InterruptedException e) {
                    str = String.valueOf(e);
                    glk.m17982e("Babel", new StringBuilder(String.valueOf(str).length() + 47).append("Our background loader thread was interrupted?? ").append(str).toString(), new Object[0]);
                    obj = null;
                }
                if (obj == null) {
                    synchronized (this.f10562e) {
                        if (this.f10560c.drainTo(arrayList) == 0) {
                            break;
                        }
                    }
                } else {
                    arrayList.add(obj);
                }
                this.f10560c.drainTo(arrayList);
            }
            if (f10558a) {
                new StringBuilder(25).append("Loading ").append(arrayList.size()).append(" keys.");
            }
            try {
                mo1677a(arrayList);
            } catch (bmu e2) {
            }
            arrayList.clear();
        }
        if (f10558a) {
            str = "Exiting loading thread: ";
            String valueOf2 = String.valueOf(this.f10561d.getName());
            if (valueOf2.length() != 0) {
                str.concat(valueOf2);
            } else {
                valueOf2 = new String(str);
            }
            m12713b();
        }
        this.f10561d = null;
    }

    private boolean m12708f(frj frj) {
        String str;
        boolean z;
        boolean z2 = true;
        String c = frj.mo594c();
        if (f10558a) {
            str = "addRequest 1: ";
            String valueOf = String.valueOf(m12713b());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        if (frj.f3553d == null || frj.f3553d == this) {
            z = true;
        } else {
            z = false;
        }
        iil.m21874a("Expected condition to be true", z);
        frj.f3553d = this;
        synchronized (this.f10562e) {
            List list = (List) this.f10559b.get(c);
            if (list == null) {
                String valueOf2;
                list = new ArrayList();
                list.add(frj);
                this.f10559b.put(c, list);
                if (f10558a) {
                    str = "addRequest 2: ";
                    valueOf2 = String.valueOf(m12713b());
                    if (valueOf2.length() != 0) {
                        str.concat(valueOf2);
                    } else {
                        valueOf2 = new String(str);
                    }
                }
                this.f10560c.add(c);
                if (f10558a) {
                    str = "Added first request for: ";
                    valueOf2 = String.valueOf(c);
                    if (valueOf2.length() != 0) {
                        str.concat(valueOf2);
                    } else {
                        valueOf2 = new String(str);
                    }
                }
            } else {
                if (f10558a) {
                    String str2 = "Added additional request for: ";
                    c = String.valueOf(c);
                    if (c.length() != 0) {
                        str2.concat(c);
                    } else {
                        c = new String(str2);
                    }
                }
                list.add(frj);
                z2 = false;
            }
        }
        return z2;
    }

    public void m12722e(String str) {
        synchronized (this.f10562e) {
            this.f10560c.add(str);
        }
        m12707d();
    }

    private void m12707d() {
        synchronized (this.f10562e) {
            if (this.f10561d == null) {
                this.f10561d = new Thread(new fri(this), mo1676a());
                if (f10558a) {
                    String str = "Starting loader thread: ";
                    String valueOf = String.valueOf(this.f10561d.getName());
                    if (valueOf.length() != 0) {
                        str.concat(valueOf);
                    } else {
                        valueOf = new String(str);
                    }
                }
                this.f10561d.start();
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void m12721e(frj frj) {
        if (frj.f3553d != null) {
            iil.m21869a(frj.f3553d, (Object) this);
            synchronized (this.f10562e) {
                String c = frj.mo594c();
                List list = (List) this.f10559b.get(c);
                if (list == null) {
                    return;
                }
                frj.f3553d = null;
                list.remove(frj);
                if (list.size() == 0) {
                    this.f10559b.remove(c);
                    this.f10560c.remove(c);
                    if (f10558a) {
                        String str = "Removed request for: ";
                        c = String.valueOf(c);
                        if (c.length() != 0) {
                            str.concat(c);
                        } else {
                            c = new String(str);
                        }
                    }
                }
            }
        }
    }
}
