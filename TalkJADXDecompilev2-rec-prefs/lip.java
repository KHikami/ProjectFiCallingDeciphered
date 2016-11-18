package p000;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

final class lip implements Runnable {
    final /* synthetic */ Set f25054a;
    final /* synthetic */ lio f25055b;

    lip(lio lio, Set set) {
        this.f25055b = lio;
        this.f25054a = set;
    }

    public void run() {
        try {
            Map allStackTraces = Thread.getAllStackTraces();
            Set<Thread> hashSet = new HashSet();
            for (Thread thread : allStackTraces.keySet()) {
                if (!(this.f25054a.contains(thread) || thread == Thread.currentThread() || lio.f25049a.matcher(thread.getName()).matches() || lio.m29105a((StackTraceElement[]) allStackTraces.get(thread)))) {
                    hashSet.add(thread);
                }
            }
            if (lio.m29104a((Set) hashSet)) {
                for (Thread thread2 : hashSet) {
                    PrintStream printStream = System.out;
                    String str = "Thread is ";
                    String valueOf = String.valueOf(thread2.getName());
                    printStream.println(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                    PrintStream printStream2 = System.out;
                    String valueOf2 = String.valueOf(thread2.getState());
                    printStream2.println(new StringBuilder(String.valueOf(valueOf2).length() + 9).append("State is ").append(valueOf2).toString());
                    System.out.println(Arrays.toString((StackTraceElement[]) allStackTraces.get(thread2)));
                }
                gwb.m1863a(new liq(this, hashSet));
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
