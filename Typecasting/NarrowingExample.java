class NarrowingExample {
    public static void main(String[] args) {
        double d = 1234.56;       // 8 bytes
        long l = (long) d;        // double -> long (fractional part lost)
        int i = (int) l;          // long -> int
        short s = (short) i;      // int -> short
        byte b = (byte) s;        // short -> byte (overflow possible)

        System.out.println("double value: " + d);
        System.out.println("long value: " + l);
        System.out.println("int value: " + i);
        System.out.println("short value: " + s);
        System.out.println("byte value: " + b);
    }
}
