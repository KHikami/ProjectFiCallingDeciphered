package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/* renamed from: gfa */
final class gfa extends AsyncTask<Void, Void, Long> {
    private static final byte[] a;
    private static final byte[] b;
    private static final byte[] c;
    private final gfc d;
    private gfb e;

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return c();
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        a((Long) obj);
    }

    static {
        a = new byte[]{(byte) 0, (byte) 1};
        b = new byte[]{(byte) 1, (byte) 1};
        c = new byte[]{a[0], a[1], (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    }

    gfa(Context context, gfb gfb) {
        gfc gfc = (gfc) jyn.b(context, gfc.class);
        if (gfc != null) {
            this.d = gfc;
        } else {
            this.d = new gfc();
        }
        this.e = gfb;
    }

    void a() {
        glk.c("Babel_telephony", "TeleStunPing.startPing", new Object[0]);
        executeOnExecutor(this.d.b(), new Void[0]);
    }

    void b() {
        glk.c("Babel_telephony", "TeleStunPing.cancelPing", new Object[0]);
        this.e = null;
        cancel(true);
    }

    private Long c() {
        String valueOf;
        Long l = null;
        try {
            InetAddress byName = InetAddress.getByName("stun.l.google.com");
            try {
                DatagramSocket a = this.d.a();
                a.setSoTimeout(1000);
                int i = 0;
                while (!isCancelled() && i < 3) {
                    try {
                        i++;
                        long b = glj.b();
                        if (gfa.a(a, byName, 19302)) {
                            l = Long.valueOf(glj.b() - b);
                            break;
                        }
                    } finally {
                        a.close();
                    }
                }
                a.close();
            } catch (SocketException e) {
                valueOf = String.valueOf(e);
                glk.e("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 54).append("TeleStunPing.doInBackground, unable to create socket: ").append(valueOf).toString(), new Object[0]);
            }
        } catch (UnknownHostException e2) {
            valueOf = String.valueOf(e2);
            glk.e("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 64).append("TeleStunPing.doInBackground, unable to get stun server address: ").append(valueOf).toString(), new Object[0]);
        }
        return l;
    }

    private void a(Long l) {
        boolean z = false;
        String valueOf = String.valueOf(l);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 36).append("TeleStunPing.onPostExecute, result: ").append(valueOf).toString(), new Object[0]);
        if (this.e != null) {
            gfb gfb = this.e;
            this.e = null;
            if (l != null) {
                z = true;
            }
            gfb.a(z, gwb.a(l));
        }
    }

    private static boolean a(DatagramSocket datagramSocket, InetAddress inetAddress, int i) {
        byte[] bArr = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(c, c.length, inetAddress, 19302);
        DatagramPacket datagramPacket2 = new DatagramPacket(bArr, 1024);
        try {
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(datagramPacket2);
            if (datagramPacket2.getLength() > 2 && bArr[0] == b[0] && bArr[1] == b[1]) {
                return true;
            }
            return false;
        } catch (IOException e) {
            String valueOf = String.valueOf(e);
            glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 44).append("TeleStunPing.bindToStunServer, bind failed: ").append(valueOf).toString(), new Object[0]);
            return false;
        }
    }
}
