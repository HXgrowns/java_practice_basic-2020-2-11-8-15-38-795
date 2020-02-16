public class TypeConvert {
    public static void main(String[] args) {
        //自动转换规则：容量小的数据类型可以自动转换成容量大的数据类型，也可
        //以说低级自动向高级转换。这儿的容量指的不是字节数，而是指类型表述的范围。
        byte b = 1;
        short s = b; // byte -> short
        int i = s; // short -> int
        long l = i; // int -> long
        char c = '2';
        int ii = c; // char -> int
        float f = ii; // int -> float
        double d = ii; // int -> double
        float ff = l; // long -> float
        double dd = l; // long -> double
        //强制转换规则：高级变为低级需要强制转换。
        double ddd = 1.03;
        int iii = (int) ddd;
        System.out.println(iii); // 1 强制转换容易丢失精度
    }
}