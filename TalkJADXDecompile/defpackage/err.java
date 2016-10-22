package defpackage;

/* renamed from: err */
final class err implements Runnable {
    final /* synthetic */ ero a;
    private boolean b;
    private long c;
    private long d;

    err(ero ero) {
        this.a = ero;
    }

    public void a() {
        synchronized (this.a.b) {
            long b = glj.b() + 100;
            if (b < this.c) {
                this.c = b;
                this.a.b.notifyAll();
            }
        }
    }

    public void b() {
        synchronized (this.a.b) {
            if (!this.b) {
                this.b = true;
                this.c = 0;
                this.d = 0;
                Thread thread = new Thread(this, "presence_fetcher");
                thread.setPriority(4);
                thread.setDaemon(true);
                thread.start();
            }
        }
    }

    public void run() {
        synchronized (this.a.b) {
            try {
                glk.c("Babel", "Presence polling thread starting", new Object[0]);
                while (true) {
                    long b = glj.b();
                    if (b >= this.c) {
                        if (this.a.a.size() == 0) {
                            break;
                        }
                        Object obj;
                        if (b >= this.d - 12000) {
                            obj = 1;
                        } else {
                            obj = null;
                        }
                        long a = obj != null ? 0 : glj.a() - 60000;
                        long j = b + 60000;
                        this.d = j;
                        this.c = j;
                        for (int i = 0; i < this.a.a.size(); i++) {
                            ((erb) this.a.a.valueAt(i)).a(a);
                        }
                    } else {
                        this.a.b.wait(this.c - b);
                    }
                }
                this.b = false;
                glk.c("Babel", "Presence polling thread exiting", new Object[0]);
            } catch (InterruptedException e) {
                glk.d("Babel", "Presence polling thread interrupted", new Object[0]);
                this.b = false;
                glk.c("Babel", "Presence polling thread exiting", new Object[0]);
            } catch (Throwable th) {
                this.b = false;
                glk.c("Babel", "Presence polling thread exiting", new Object[0]);
            }
        }
    }
}
