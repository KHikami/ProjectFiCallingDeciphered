package p000;

final class dzu implements Runnable {
    final /* synthetic */ dzs f10958a;

    dzu(dzs dzs) {
        this.f10958a = dzs;
    }

    public void run() {
        dzs dzs = this.f10958a;
        if (dzs.f10944a) {
            String str = dzs.f10945b;
            new StringBuilder(String.valueOf(str).length() + 48).append("resuming queue for internal retry ").append(str).append(" [").append(dzs.f10946c.size()).append("]");
        }
        if (dzs.f10949f != null) {
            dzs.f10949f = null;
            dzs.mo1794a(true);
        }
    }
}
