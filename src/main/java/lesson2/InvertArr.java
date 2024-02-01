/*Task 5: Задать целочисленный массив, состоящий из элементов 0 и 1.
Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0*/

package lesson2;
import java.util.Arrays;

public class InvertArr {
    public static void invertArr() {
        int[] nums = {1,1,0,0,1,0,1,1,0,0};
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (nums[i] == 0) ? 1 : 0;
        }
        System.out.println(Arrays.toString(nums));
    }
}
