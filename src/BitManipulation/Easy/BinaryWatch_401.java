package BitManipulation.Easy;
/*
二进制手表顶部有 4 个 LED 代表小时（0-11），底部的 6 个 LED 代表分钟（0-59）。
每个 LED 代表一个 0 或 1，最低位在右侧。

给定一个非负整数 n 代表当前 LED 亮着的数量，返回所有可能的时间。

案例:
输入: n = 1
返回: ["1:00", "2:00", "4:00", "8:00", "0:01", "0:02", "0:04", "0:08", "0:16", "0:32"]
 */
import java.util.ArrayList;
import java.util.List;

public class BinaryWatch_401 {

    public static void main(String[] args){

        System.out.println(readBinaryWatch(1));
    }
    public static List<String> readBinaryWatch(int num) {
        List<String> times = new ArrayList<>();
        for (int h=0; h<12; h++)
            for (int m=0; m<60; m++)
                if (Integer.bitCount(h * 64 + m) == num)
                    times.add(String.format("%d:%02d", h, m)); return times;
    }
}