package p000;

import android.content.Context;
import android.os.AsyncTask;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

final class gfa extends AsyncTask<Void, Void, Long> {
    private static final byte[] f15123a = new byte[]{(byte) 0, (byte) 1};
    private static final byte[] f15124b = new byte[]{(byte) 1, (byte) 1};
    private static final byte[] f15125c = new byte[]{f15123a[0], f15123a[1], (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    private final gfc f15126d;
    private gfb f15127e;

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m17489c();
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        m17487a((Long) obj);
    }

    gfa(Context context, gfb gfb) {
        gfc gfc = (gfc) jyn.m25433b(context, gfc.class);
        if (gfc != null) {
            this.f15126d = gfc;
        } else {
            this.f15126d = new gfc();
        }
        this.f15127e = gfb;
    }

    void m17490a() {
        glk.m17979c("Babel_telephony", "TeleStunPing.startPing", new Object[0]);
        executeOnExecutor(this.f15126d.m17493b(), new Void[0]);
    }

    void m17491b() {
        glk.m17979c("Babel_telephony", "TeleStunPing.cancelPing", new Object[0]);
        this.f15127e = null;
        cancel(true);
    }

    private Long m17489c() {
        String valueOf;
        Long l = null;
        try {
            InetAddress byName = InetAddress.getByName("stun.l.google.com");
            try {
                DatagramSocket a = this.f15126d.m17492a();
                a.setSoTimeout(1000);
                int i = 0;
                while (!isCancelled() && i < 3) {
                    try {
                        i++;
                        long b = glj.m17963b();
                        if (gfa.m17488a(a, byName, 19302)) {
                            l = Long.valueOf(glj.m17963b() - b);
                            break;
                        }
                    } finally {
                        a.close();
                    }
                }
                a.close();
            } catch (SocketException e) {
                valueOf = String.valueOf(e);
                glk.m17982e("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 54).append("TeleStunPing.doInBackground, unable to create socket: ").append(valueOf).toString(), new Object[0]);
            }
        } catch (UnknownHostException e2) {
            valueOf = String.valueOf(e2);
            glk.m17982e("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 64).append("TeleStunPing.doInBackground, unable to get stun server address: ").append(valueOf).toString(), new Object[0]);
        }
        return l;
    }

    private void m17487a(Long l) {
        boolean z = false;
        String valueOf = String.valueOf(l);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 36).append("TeleStunPing.onPostExecute, result: ").append(valueOf).toString(), new Object[0]);
        if (this.f15127e != null) {
            gfb gfb = this.f15127e;
            this.f15127e = null;
            if (l != null) {
                z = true;
            }
            gfb.mo2201a(z, gwb.m1523a(l));
        }
    }

    private static boolean m17488a(DatagramSocket datagramSocket, InetAddress inetAddress, int i) {
        byte[] bArr = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(f15125c, f15125c.length, inetAddress, 19302);
        DatagramPacket datagramPacket2 = new DatagramPacket(bArr, 1024);
        try {
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(datagramPacket2);
            if (datagramPacket2.getLength() > 2 && bArr[0] == f15124b[0] && bArr[1] == f15124b[1]) {
                return true;
            }
            return false;
        } catch (IOException e) {
            String valueOf = String.valueOf(e);
            glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 44).append("TeleStunPing.bindToStunServer, bind failed: ").append(valueOf).toString(), new Object[0]);
            return false;
        }
    }
}
