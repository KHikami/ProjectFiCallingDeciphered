package com.google.android.libraries.hangouts.video.internal;

import com.google.android.apps.common.proguard.UsedByNative;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import lkn;
import lkq;
import lkr;
import lks;
import lkt;
import lku;
import lle;
import wi;

@UsedByNative
public abstract class Stats {

    @UsedByNative
    public class AggregatePrintStats {
        final ArrayList<Float> a;
        final ArrayList<Float> b;
        boolean c;

        public AggregatePrintStats() {
            this.a = new ArrayList();
            this.b = new ArrayList();
            this.c = false;
        }

        public void a(PrintWriter printWriter) {
            float f;
            printWriter.println("Aggregate statistics");
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            if (size == 0) {
                f = 0.0f;
            } else {
                float[] fArr = new float[size];
                for (int i = 0; i < size; i++) {
                    fArr[i] = ((Float) arrayList.get(i)).floatValue();
                }
                Arrays.sort(fArr);
                int i2 = size / 2;
                if (size % 2 == 1) {
                    f = fArr[i2];
                } else {
                    f = (fArr[i2] + fArr[i2 - 1]) / 2.0f;
                }
            }
            printWriter.println("               send FPS: " + Math.round(f));
            printWriter.println("  Median video receive FPS: " + Math.round(Stats.a(this.b)));
            printWriter.println("  using relay: " + this.c);
        }
    }

    @UsedByNative
    public class BandwidthEstimationStats extends Stats {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;

        @UsedByNative
        public BandwidthEstimationStats(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
            this.g = i7;
        }

        @UsedByNative
        public void addTo(lkq lkq) {
            lkt a = Stats.a(2);
            a.k = Integer.valueOf(2);
            a.A = Integer.valueOf(this.a);
            a.B = Integer.valueOf(this.b);
            a.C = Integer.valueOf(this.c);
            a.D = Integer.valueOf(this.d);
            a.F = Integer.valueOf(this.g);
            int length = lkq.d.length;
            lkq.d = (lkt[]) Arrays.copyOf(lkq.d, length + 1);
            lkq.d[length] = a;
        }

        @UsedByNative
        public static void printLegend(PrintWriter printWriter) {
            printWriter.println("  BandwidthEstimation -- availSend, avilRecv, trans, retrans, targetEnc, actualEnc, leakyBucketDelay");
        }

        @UsedByNative
        public void print(PrintWriter printWriter, AggregatePrintStats aggregatePrintStats) {
            int i = this.a;
            int i2 = this.b;
            int i3 = this.c;
            int i4 = this.d;
            int i5 = this.e;
            int i6 = this.f;
            printWriter.println(" -- BandwidthEstimation -- " + i + ", " + i2 + ", " + i3 + ", " + i4 + ", " + i5 + ", " + i6 + ", " + this.g);
        }
    }

    @UsedByNative
    public class ConnectionInfoStats extends Stats {
        public int a;
        public int b;
        public String c;
        public int d;
        public int e;
        public String f;
        public int g;
        public int h;
        public int i;
        public int j;
        public int k;
        public int l;
        public int m;
        public int n;
        public lks o;

        @UsedByNative
        public ConnectionInfoStats(int i, String str, String str2, String str3, String str4, String str5, String str6, int i2, int i3, int i4, int i5, int i6, int i7) {
            this.n = 0;
            this.o = null;
            this.a = i;
            this.b = Stats.parseConnectionType(str);
            this.c = str2;
            this.d = Stats.parseConnectionProtocol(str3);
            this.e = Stats.parseConnectionType(str4);
            this.f = str5;
            this.g = Stats.parseConnectionProtocol(str6);
            this.h = i2;
            this.i = i3;
            this.j = i4;
            this.k = i5;
            this.l = i6;
            this.m = i7;
        }

        @UsedByNative
        public void setMediaNetworkType(int i) {
            this.n = i;
        }

        @UsedByNative
        public void setSignalStrength(lks lks) {
            this.o = lks;
        }

        @UsedByNative
        public void addTo(lkq lkq) {
            int i;
            switch (this.a) {
                case wi.w /*0*/:
                    i = 2;
                    break;
                case wi.j /*1*/:
                    i = 1;
                    break;
                default:
                    i = 0;
                    break;
            }
            lkn lkn = new lkn();
            lkn.a = this.c;
            lkn.b = Integer.valueOf(i);
            lkn.c = Integer.valueOf(this.b);
            lkn.d = Integer.valueOf(this.d);
            lkn lkn2 = new lkn();
            lkn2.a = this.c;
            lkn2.b = Integer.valueOf(i);
            lkn2.c = Integer.valueOf(this.e);
            lkn2.d = Integer.valueOf(this.g);
            lkr lkr = new lkr();
            lkr.a = Integer.valueOf(i);
            lkr.b = Integer.valueOf(this.m);
            lkr.c = Integer.valueOf(this.l);
            lkr.d = Long.valueOf((long) this.j);
            lkr.h = Long.valueOf((long) this.h);
            lkr.e = Integer.valueOf(this.k / 8);
            lkr.i = Integer.valueOf(this.i / 8);
            lkr.j = lkn;
            lkr.k = lkn2;
            if (this.n > 0) {
                lkr.l = Integer.valueOf(this.n);
            }
            lkr.m = this.o;
            int length = lkq.e.length;
            lkq.e = (lkr[]) Arrays.copyOf(lkq.e, length + 1);
            lkq.e[length] = lkr;
        }

        @UsedByNative
        public static void printLegend(PrintWriter printWriter) {
            printWriter.println("  Connection -- media type, local address, type, protocol, remote address, type, protocol, received bitrate, sent bitrate, media network type, wifi signal strength, cell signal type, cell level, cell asu level");
        }

        @UsedByNative
        public void print(PrintWriter printWriter, AggregatePrintStats aggregatePrintStats) {
            if (3 == this.b || 3 == this.e) {
                aggregatePrintStats.c = true;
            } else {
                aggregatePrintStats.c = false;
            }
            String str = this.a == 0 ? "video" : "audio";
            String str2 = this.c;
            int i = this.b;
            int i2 = this.d;
            String str3 = this.f;
            int i3 = this.e;
            int i4 = this.g;
            int i5 = this.i;
            int i6 = this.k;
            int i7 = this.n;
            String valueOf = String.valueOf(this.o.a);
            String valueOf2 = String.valueOf(this.o.b);
            String valueOf3 = String.valueOf(this.o.c);
            String valueOf4 = String.valueOf(this.o.d);
            printWriter.println(new StringBuilder(((((((String.valueOf(str).length() + 121) + String.valueOf(str2).length()) + String.valueOf(str3).length()) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()).append(" -- Connection -- ").append(str).append(", ").append(str2).append(", ").append(i).append(", ").append(i2).append(", ").append(str3).append(", ").append(i3).append(", ").append(i4).append(", ").append(i5).append(", ").append(i6).append(", ").append(i7).append(", ").append(valueOf).append(", ").append(valueOf2).append(", ").append(valueOf3).append(", ").append(valueOf4).toString());
        }
    }

    @UsedByNative
    public class VideoReceiverStats extends Stats {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final float e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;
        public final int j;
        public final int k;
        public final float l;
        public final float m;
        public final int n;
        public final boolean o;
        public int p;
        public int q;
        public lle r;
        public lle s;

        @UsedByNative
        public VideoReceiverStats(int i, int i2, int i3, int i4, float f, int i5, int i6, int i7, int i8, int i9, int i10, float f2, float f3, int i11, boolean z) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = f;
            this.f = i5;
            this.g = i6;
            this.h = i7;
            this.i = i8;
            this.j = i9;
            this.k = i10;
            this.l = f2;
            this.m = f3;
            this.n = i11;
            this.o = z;
        }

        public void b(int i) {
            this.p = i;
        }

        public void c(int i) {
            this.q = i;
        }

        public void a(lle lle) {
            this.r = lle;
        }

        @UsedByNative
        public void addTo(lkq lkq) {
            lkt a = Stats.a(2);
            a.k = Integer.valueOf(1);
            a.l = Integer.valueOf(this.a);
            a.i = Long.valueOf((long) this.b);
            a.j = Integer.valueOf(this.c);
            a.c = Integer.valueOf(this.d);
            a.b = Integer.valueOf((int) (this.e * 100.0f));
            a.o = Integer.valueOf(this.f);
            a.p = Integer.valueOf(this.g);
            a.P = Integer.valueOf(this.h);
            a.Q = Integer.valueOf(this.i);
            a.r = Integer.valueOf(this.j);
            a.s = Integer.valueOf(this.k);
            a.t = Float.valueOf(this.l);
            a.v = Float.valueOf(this.m);
            a.R = Integer.valueOf(this.p);
            a.S = Integer.valueOf(this.q);
            a.W = Boolean.valueOf(this.o);
            if (this.r != null) {
                a.ap = this.r.c;
                a.aq = this.r.b;
                a.as = this.r.a;
                a.ar = this.r.d;
            } else {
                a.ap = Integer.valueOf(this.n);
            }
            if (this.s != null) {
                a.av = this.s;
            }
            int length = lkq.d.length;
            lkq.d = (lkt[]) Arrays.copyOf(lkq.d, length + 1);
            lkq.d[length] = a;
        }

        @UsedByNative
        public static void printLegend(PrintWriter printWriter) {
            printWriter.println("  VideoReceiver -- ssrc, rcvd, lost, firs, size, rcvd, dec, rendIn, rendOut, viewRequestWidth, viewRequestHeight, oneWayDelayMs");
        }

        @UsedByNative
        public void print(PrintWriter printWriter, AggregatePrintStats aggregatePrintStats) {
            aggregatePrintStats.b.add(Float.valueOf((float) this.j));
            int i = this.a;
            int i2 = this.c;
            int i3 = this.b;
            int i4 = this.d;
            float f = this.e;
            int i5 = this.f;
            int i6 = this.g;
            int i7 = this.h;
            int i8 = this.i;
            int i9 = this.j;
            int i10 = this.k;
            float f2 = this.l;
            float f3 = this.m;
            int i11 = this.p;
            int i12 = this.q;
            String str = ", ";
            PrintWriter printWriter2 = printWriter;
            printWriter2.println(" -- VideoReceiver -- " + i + r17 + i2 + " (" + i3 + "), " + i4 + " (" + f + "), " + i5 + " (" + i6 + "), " + i7 + "x" + i8 + ", " + i9 + ", " + i10 + ", " + f2 + ", " + f3 + ", " + i11 + ", " + i12 + "," + this.n);
        }
    }

    @UsedByNative
    public class VideoSenderStats extends Stats {
        public final int a;
        public final SsrcGroup[] b;
        public final String c;
        public final int d;
        public final int e;
        public final int f;
        public final float g;
        public final int h;
        public final int i;
        public final int j;
        public final int k;
        public final int l;
        public final int m;
        public final int n;
        public final int o;
        public final int p;
        public final boolean q;
        public lle r;

        @UsedByNative
        public class SsrcGroup {
            public final String a;
            public final int[] b;

            @UsedByNative
            public SsrcGroup(String str, int[] iArr) {
                this.a = str;
                this.b = iArr;
            }
        }

        @UsedByNative
        public VideoSenderStats(int i, SsrcGroup[] ssrcGroupArr, String str, int i2, int i3, int i4, float f, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, boolean z) {
            this.a = i;
            this.b = ssrcGroupArr;
            this.c = str;
            this.d = i2;
            this.e = i3;
            this.f = i4;
            this.g = f;
            this.h = i5;
            this.i = i6;
            this.j = i7;
            this.k = i8;
            this.l = i9;
            this.m = i10;
            this.n = i11;
            this.o = i12;
            this.p = i13;
            this.q = z;
        }

        @UsedByNative
        public void addTo(lkq lkq) {
            lkt a = Stats.a(2);
            a.k = Integer.valueOf(0);
            a.l = Integer.valueOf(this.a);
            a.G = this.c;
            a.g = Long.valueOf((long) this.d);
            a.h = Integer.valueOf(this.e);
            a.c = Integer.valueOf(this.f);
            a.b = Integer.valueOf((int) (this.g * 100.0f));
            a.o = Integer.valueOf(this.h);
            a.p = Integer.valueOf(this.i);
            a.f = Integer.valueOf(this.j);
            a.P = Integer.valueOf(this.k);
            a.Q = Integer.valueOf(this.l);
            a.q = Integer.valueOf(this.m);
            a.r = Integer.valueOf(this.n);
            a.A = Integer.valueOf(this.p);
            a.C = Integer.valueOf(this.o);
            a.W = Boolean.valueOf(this.q);
            if (this.b != null) {
                ArrayList arrayList = new ArrayList(this.b.length);
                for (SsrcGroup ssrcGroup : this.b) {
                    lku lku = new lku();
                    lku.a = ssrcGroup.a;
                    lku.b = (int[]) ssrcGroup.b.clone();
                    arrayList.add(lku);
                }
                a.O = (lku[]) arrayList.toArray(new lku[arrayList.size()]);
            }
            if (this.r != null) {
                a.au = this.r;
            }
            int length = lkq.d.length;
            lkq.d = (lkt[]) Arrays.copyOf(lkq.d, length + 1);
            lkq.d[length] = a;
        }

        public void a(lle lle) {
            this.r = lle;
        }

        @UsedByNative
        public static void printLegend(PrintWriter printWriter) {
            printWriter.println("  VideoSender -- ssrc, codec, sent, lost, rcvd, rtt, size, in, sent, rate");
        }

        @UsedByNative
        public void print(PrintWriter printWriter, AggregatePrintStats aggregatePrintStats) {
            aggregatePrintStats.a.add(Float.valueOf((float) this.n));
            int i = this.a;
            String str = this.q ? "(camera)" : "(screencast)";
            String str2 = this.c;
            int i2 = this.e;
            int i3 = this.d;
            int i4 = this.f;
            float f = this.g;
            int i5 = this.h;
            int i6 = this.i;
            int i7 = this.j;
            int i8 = this.k;
            int i9 = this.l;
            int i10 = this.m;
            int i11 = this.n;
            int i12 = this.o;
            PrintWriter printWriter2 = printWriter;
            printWriter2.println(new StringBuilder((String.valueOf(str).length() + 208) + String.valueOf(str2).length()).append(" -- VideoSender -- ").append(i).append(", ").append(str).append(str2).append(", ").append(i2).append(" (").append(i3).append("), ").append(i4).append(" (").append(f).append("), ").append(i5).append(" (").append(i6).append("), ").append(i7).append(", ").append(i8).append("x").append(i9).append(", ").append(i10).append(", ").append(i11).append(", ").append(i12).append(" (").append(this.p).append(")").toString());
        }
    }

    @UsedByNative
    public class VoiceReceiverStats extends Stats {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final float e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;
        public final int j;
        public final int k;
        public final float l;
        public final float m;
        public final float n;
        public final float o;
        public final float p;
        public final int q;
        public final int r;
        public final int s;
        public final int t;
        public final int u;
        public final int v;

        @UsedByNative
        public VoiceReceiverStats(int i, int i2, int i3, int i4, float f, int i5, int i6, int i7, int i8, int i9, int i10, float f2, float f3, float f4, float f5, float f6, int i11, int i12, int i13, int i14, int i15, int i16) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = f;
            this.f = i5;
            this.g = i6;
            this.h = i7;
            this.i = i8;
            this.j = i9;
            this.k = i10;
            this.l = f2;
            this.m = f3;
            this.n = f4;
            this.o = f5;
            this.p = f6;
            this.q = i11;
            this.r = i12;
            this.s = i13;
            this.t = i14;
            this.u = i15;
            this.v = i16;
        }

        @UsedByNative
        public void addTo(lkq lkq) {
            lkt a = Stats.a(1);
            a.k = Integer.valueOf(1);
            a.l = Integer.valueOf(this.a);
            a.i = Long.valueOf((long) this.b);
            a.j = Integer.valueOf(this.c);
            a.c = Integer.valueOf(this.d);
            a.b = Integer.valueOf((int) (this.e * 100.0f));
            a.d = Integer.valueOf(this.f);
            a.e = Integer.valueOf(this.g);
            a.x = Integer.valueOf(this.h);
            a.y = Integer.valueOf(this.i);
            a.aa = Float.valueOf(this.l);
            a.ab = Float.valueOf(this.m);
            a.ac = Float.valueOf(this.p);
            a.ad = Float.valueOf(this.o);
            a.ae = Float.valueOf(this.n);
            a.aj = Integer.valueOf(this.q);
            a.ak = Integer.valueOf(this.r);
            a.al = Integer.valueOf(this.s);
            a.am = Integer.valueOf(this.t);
            a.an = Integer.valueOf(this.u);
            a.ao = Integer.valueOf(this.v);
            if (this.j != -1) {
                a.z = Integer.valueOf(this.j);
            }
            if (this.k != -1) {
                a.n = Integer.valueOf(this.k);
            }
            int length = lkq.d.length;
            lkq.d = (lkt[]) Arrays.copyOf(lkq.d, length + 1);
            lkq.d[length] = a;
        }

        @UsedByNative
        public static void printLegend(PrintWriter printWriter) {
            printWriter.println("  VoiceReceiver -- ssrc, rcvd, lost, seq, jitter, jbuf, delay, level, expand");
        }

        @UsedByNative
        public void print(PrintWriter printWriter, AggregatePrintStats aggregatePrintStats) {
            long j = ((long) this.a) & 4294967295L;
            int i = this.c;
            int i2 = this.b;
            int i3 = this.d;
            float f = this.e;
            int i4 = this.f;
            int i5 = this.g;
            int i6 = this.h;
            int i7 = this.i;
            int i8 = this.j;
            int i9 = this.k;
            PrintWriter printWriter2 = printWriter;
            printWriter2.println(" -- VoiceReceiver -- " + j + ", " + i + " (" + i2 + "), " + i3 + " (" + f + "), " + i4 + ", " + i5 + ", " + i6 + " (" + i7 + "), " + i8 + ", " + i9 + ", " + this.l);
        }
    }

    @UsedByNative
    public class VoiceSenderStats extends Stats {
        public final int a;
        public final String b;
        public final int c;
        public final int d;
        public final int e;
        public final float f;
        public final int g;
        public final int h;
        public final int i;
        public final int j;
        public final int k;
        public final int l;
        public final int m;
        public final int n;

        @UsedByNative
        public VoiceSenderStats(int i, String str, int i2, int i3, int i4, float f, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
            this.a = i;
            this.b = str;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = f;
            this.g = i5;
            this.h = i6;
            this.i = i7;
            this.j = i8;
            this.k = i9;
            this.l = i10;
            this.m = i11;
            this.n = i12;
        }

        @UsedByNative
        public void addTo(lkq lkq) {
            lkt a = Stats.a(1);
            a.k = Integer.valueOf(0);
            a.l = Integer.valueOf(this.a);
            a.G = this.b;
            a.g = Long.valueOf((long) this.c);
            a.h = Integer.valueOf(this.d);
            a.c = Integer.valueOf(this.e);
            a.b = Integer.valueOf((int) (this.f * 100.0f));
            a.d = Integer.valueOf(this.g);
            a.f = Integer.valueOf(this.h);
            a.e = Integer.valueOf(this.i);
            if (this.j != -1) {
                a.n = Integer.valueOf(this.j);
            }
            if (this.k != -1) {
                a.I = Integer.valueOf(this.k);
            }
            if (this.l != -1) {
                a.J = Integer.valueOf(this.l);
            }
            if (this.m != -100) {
                a.K = Integer.valueOf(this.m);
            }
            if (this.n != -100) {
                a.L = Integer.valueOf(this.n);
            }
            int length = lkq.d.length;
            lkq.d = (lkt[]) Arrays.copyOf(lkq.d, length + 1);
            lkq.d[length] = a;
        }

        @UsedByNative
        public static void printLegend(PrintWriter printWriter) {
            printWriter.println("  VoiceSender -- ssrc, codec, sent, lost, seq, rtt, jitter, level, echo, echoRetLoss");
        }

        @UsedByNative
        public void print(PrintWriter printWriter, AggregatePrintStats aggregatePrintStats) {
            long j = ((long) this.a) & 4294967295L;
            String str = this.b;
            int i = this.d;
            int i2 = this.c;
            int i3 = this.e;
            float f = this.f;
            int i4 = this.g;
            int i5 = this.h;
            int i6 = this.i;
            int i7 = this.j;
            int i8 = this.k;
            int i9 = this.l;
            int i10 = this.m;
            int i11 = this.n;
            StringBuilder append = new StringBuilder(String.valueOf(str).length() + 205).append(" -- VoiceSender -- ");
            printWriter.println(r17.append(j).append(", ").append(str).append(", ").append(i).append(" (").append(i2).append("), ").append(i3).append(" (").append(f).append("), ").append(i4).append(", ").append(i5).append(", ").append(i6).append(", ").append(i7).append(", ").append(i8).append(" (").append(i9).append("), ").append(i10).append(" (").append(i11).append(")").toString());
        }
    }

    public abstract void addTo(lkq lkq);

    public abstract void print(PrintWriter printWriter, AggregatePrintStats aggregatePrintStats);

    static lkt a(int i) {
        lkt lkt = new lkt();
        lkt.a = Integer.valueOf(i);
        lkt.b = Integer.valueOf(-1);
        lkt.c = Integer.valueOf(-1);
        lkt.d = Integer.valueOf(-1);
        lkt.e = Integer.valueOf(-1);
        lkt.f = Integer.valueOf(-1);
        lkt.g = Long.valueOf(-1);
        lkt.h = Integer.valueOf(-1);
        lkt.i = Long.valueOf(-1);
        lkt.j = Integer.valueOf(-1);
        return lkt;
    }

    @UsedByNative
    private static int parseConnectionType(String str) {
        if (str.equals("local")) {
            return 1;
        }
        if (str.equals("stun")) {
            return 2;
        }
        if (str.equals("relay")) {
            return 3;
        }
        return 0;
    }

    @UsedByNative
    private static int parseConnectionProtocol(String str) {
        if (str.equals("udp")) {
            return 1;
        }
        if (str.equals("tcp")) {
            return 2;
        }
        if (str.equals("ssltcp")) {
            return 3;
        }
        return 0;
    }

    static float a(ArrayList<Float> arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return 0.0f;
        }
        float[] fArr = new float[size];
        for (int i = 0; i < size; i++) {
            fArr[i] = ((Float) arrayList.get(i)).floatValue();
        }
        Arrays.sort(fArr);
        int i2 = size / 2;
        if (size % 2 == 1) {
            return fArr[i2];
        }
        return (fArr[i2] + fArr[i2 - 1]) / 2.0f;
    }
}
