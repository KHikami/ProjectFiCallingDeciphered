package p000;

final class err implements Runnable {
    final /* synthetic */ ero f12137a;
    private boolean f12138b;
    private long f12139c;
    private long f12140d;

    err(ero ero) {
        this.f12137a = ero;
    }

    public void m14335a() {
        synchronized (this.f12137a.f12129b) {
            long b = glj.m17963b() + 100;
            if (b < this.f12139c) {
                this.f12139c = b;
                this.f12137a.f12129b.notifyAll();
            }
        }
    }

    public void m14336b() {
        synchronized (this.f12137a.f12129b) {
            if (!this.f12138b) {
                this.f12138b = true;
                this.f12139c = 0;
                this.f12140d = 0;
                Thread thread = new Thread(this, "presence_fetcher");
                thread.setPriority(4);
                thread.setDaemon(true);
                thread.start();
            }
        }
    }

    public void run() {
        synchronized (this.f12137a.f12129b) {
            try {
                glk.m17979c("Babel", "Presence polling thread starting", new Object[0]);
                while (true) {
                    long b = glj.m17963b();
                    if (b >= this.f12139c) {
                        if (this.f12137a.f12128a.size() == 0) {
                            break;
                        }
                        Object obj;
                        if (b >= this.f12140d - 12000) {
                            obj = 1;
                        } else {
                            obj = null;
                        }
                        long a = obj != null ? 0 : glj.m17956a() - 60000;
                        long j = b + 60000;
                        this.f12140d = j;
                        this.f12139c = j;
                        for (int i = 0; i < this.f12137a.f12128a.size(); i++) {
                            ((erb) this.f12137a.f12128a.valueAt(i)).m14306a(a);
                        }
                    } else {
                        this.f12137a.f12129b.wait(this.f12139c - b);
                    }
                }
                this.f12138b = false;
                glk.m17979c("Babel", "Presence polling thread exiting", new Object[0]);
            } catch (InterruptedException e) {
                glk.m17981d("Babel", "Presence polling thread interrupted", new Object[0]);
                this.f12138b = false;
                glk.m17979c("Babel", "Presence polling thread exiting", new Object[0]);
            } catch (Throwable th) {
                this.f12138b = false;
                glk.m17979c("Babel", "Presence polling thread exiting", new Object[0]);
            }
        }
    }
}
