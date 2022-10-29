class Solution {

    public int getSum(int a, int b) {
        //  String aBinary =a.toBinaryString();
        //   String bBinary =b.toBinaryString();
        int s = a ^ b;
        int carry = a & b;

        if (carry == 0) return s; else return getSum(s, carry << 1);
    }
}
