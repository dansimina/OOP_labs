class ExternCls {
    private int x;

    public void testInner() {
        InnerCls ic = new InnerCls();
        ic.go();
        System.out.println("x in outter este " + getX());
    }

    private int getX() {
        return x;
    }

    class InnerCls {
        void go() {
            x = 42;
        }
    }
}