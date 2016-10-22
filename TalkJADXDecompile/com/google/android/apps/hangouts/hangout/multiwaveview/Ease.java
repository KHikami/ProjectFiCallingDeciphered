package com.google.android.apps.hangouts.hangout.multiwaveview;

import android.animation.TimeInterpolator;

class Ease {
    private static final float DOMAIN = 1.0f;
    private static final float DURATION = 1.0f;
    private static final float START = 0.0f;

    class Cubic {
        public static final TimeInterpolator easeIn;
        public static final TimeInterpolator easeInOut;
        public static final TimeInterpolator easeOut;

        final class 1 implements TimeInterpolator {
            1() {
            }

            public float getInterpolation(float f) {
                return (((Ease.DURATION * f) * f) * f) + 0.0f;
            }
        }

        final class 2 implements TimeInterpolator {
            2() {
            }

            public float getInterpolation(float f) {
                float f2 = f - Ease.DURATION;
                return (((f2 * (f2 * f2)) + Ease.DURATION) * Ease.DURATION) + 0.0f;
            }
        }

        final class 3 implements TimeInterpolator {
            3() {
            }

            public float getInterpolation(float f) {
                float f2 = f / 0.5f;
                if (f2 < Ease.DURATION) {
                    return (f2 * ((0.5f * f2) * f2)) + 0.0f;
                }
                f2 -= 2.0f;
                return (((f2 * (f2 * f2)) + 2.0f) * 0.5f) + 0.0f;
            }
        }

        Cubic() {
        }

        static {
            easeIn = new 1();
            easeOut = new 2();
            easeInOut = new 3();
        }
    }

    class Linear {
        public static final TimeInterpolator easeNone;

        final class 1 implements TimeInterpolator {
            1() {
            }

            public float getInterpolation(float f) {
                return f;
            }
        }

        Linear() {
        }

        static {
            easeNone = new 1();
        }
    }

    class Quad {
        public static final TimeInterpolator easeIn;
        public static final TimeInterpolator easeInOut;
        public static final TimeInterpolator easeOut;

        final class 1 implements TimeInterpolator {
            1() {
            }

            public float getInterpolation(float f) {
                return ((Ease.DURATION * f) * f) + 0.0f;
            }
        }

        final class 2 implements TimeInterpolator {
            2() {
            }

            public float getInterpolation(float f) {
                return ((-1.0f * f) * (f - 2.0f)) + 0.0f;
            }
        }

        final class 3 implements TimeInterpolator {
            3() {
            }

            public float getInterpolation(float f) {
                float f2 = f / 0.5f;
                if (f2 < Ease.DURATION) {
                    return (f2 * (0.5f * f2)) + 0.0f;
                }
                f2 -= Ease.DURATION;
                return (((f2 * (f2 - 2.0f)) - Ease.DURATION) * -0.5f) + 0.0f;
            }
        }

        Quad() {
        }

        static {
            easeIn = new 1();
            easeOut = new 2();
            easeInOut = new 3();
        }
    }

    class Quart {
        public static final TimeInterpolator easeIn;
        public static final TimeInterpolator easeInOut;
        public static final TimeInterpolator easeOut;

        final class 1 implements TimeInterpolator {
            1() {
            }

            public float getInterpolation(float f) {
                return ((((Ease.DURATION * f) * f) * f) * f) + 0.0f;
            }
        }

        final class 2 implements TimeInterpolator {
            2() {
            }

            public float getInterpolation(float f) {
                float f2 = f - Ease.DURATION;
                return (-1.0f * ((f2 * ((f2 * f2) * f2)) - Ease.DURATION)) + 0.0f;
            }
        }

        final class 3 implements TimeInterpolator {
            3() {
            }

            public float getInterpolation(float f) {
                float f2 = f / 0.5f;
                if (f2 < Ease.DURATION) {
                    return (f2 * (((0.5f * f2) * f2) * f2)) + 0.0f;
                }
                f2 -= 2.0f;
                return (((f2 * ((f2 * f2) * f2)) - 2.0f) * -0.5f) + 0.0f;
            }
        }

        Quart() {
        }

        static {
            easeIn = new 1();
            easeOut = new 2();
            easeInOut = new 3();
        }
    }

    class Quint {
        public static final TimeInterpolator easeIn;
        public static final TimeInterpolator easeInOut;
        public static final TimeInterpolator easeOut;

        final class 1 implements TimeInterpolator {
            1() {
            }

            public float getInterpolation(float f) {
                return (((((Ease.DURATION * f) * f) * f) * f) * f) + 0.0f;
            }
        }

        final class 2 implements TimeInterpolator {
            2() {
            }

            public float getInterpolation(float f) {
                float f2 = f - Ease.DURATION;
                return (((f2 * (((f2 * f2) * f2) * f2)) + Ease.DURATION) * Ease.DURATION) + 0.0f;
            }
        }

        final class 3 implements TimeInterpolator {
            3() {
            }

            public float getInterpolation(float f) {
                float f2 = f / 0.5f;
                if (f2 < Ease.DURATION) {
                    return (f2 * ((((0.5f * f2) * f2) * f2) * f2)) + 0.0f;
                }
                f2 -= 2.0f;
                return (((f2 * (((f2 * f2) * f2) * f2)) + 2.0f) * 0.5f) + 0.0f;
            }
        }

        Quint() {
        }

        static {
            easeIn = new 1();
            easeOut = new 2();
            easeInOut = new 3();
        }
    }

    class Sine {
        public static final TimeInterpolator easeIn;
        public static final TimeInterpolator easeInOut;
        public static final TimeInterpolator easeOut;

        final class 1 implements TimeInterpolator {
            1() {
            }

            public float getInterpolation(float f) {
                return ((-1.0f * ((float) Math.cos(((double) f) * 1.5707963267948966d))) + Ease.DURATION) + 0.0f;
            }
        }

        final class 2 implements TimeInterpolator {
            2() {
            }

            public float getInterpolation(float f) {
                return (Ease.DURATION * ((float) Math.sin(((double) f) * 1.5707963267948966d))) + 0.0f;
            }
        }

        final class 3 implements TimeInterpolator {
            3() {
            }

            public float getInterpolation(float f) {
                return (-0.5f * (((float) Math.cos(3.141592653589793d * ((double) f))) - Ease.DURATION)) + 0.0f;
            }
        }

        Sine() {
        }

        static {
            easeIn = new 1();
            easeOut = new 2();
            easeInOut = new 3();
        }
    }

    Ease() {
    }
}
