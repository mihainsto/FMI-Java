package candy;

import java.util.Arrays;

public class CandyBag {
    private CandyBox[] boxArr;
    private int maxNumber;
    private int index;

    public CandyBag(int maxNumber) {
        this.maxNumber = maxNumber;
        index = 0;
        boxArr = new CandyBox[maxNumber];
    }

    public void addCandy(CandyBox candy){
        if (index < boxArr.length){
            boxArr[index++] = candy;
        }
    }

    @Override
    public String toString() {
        return "CandyBag{" +
                "boxArr=" + Arrays.toString(boxArr) +
                '}';
    }
}
