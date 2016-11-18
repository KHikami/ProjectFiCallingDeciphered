package p000;

import org.chromium.base.ApplicationStatus;

public final class otm implements Runnable {
    public void run() {
        if (ApplicationStatus.b == null) {
            ApplicationStatus.b(new otn(this));
            ApplicationStatus.a(ApplicationStatus.b);
        }
    }
}
