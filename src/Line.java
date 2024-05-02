public class Line {
    private Object[] array;
    private int length;
    
    public Line() {
        array = new Object[11];
        this.length = 11;
        addNumbers();
    }

    public Line(int length) {
        array = new Object[length];
        this.length = length; 
        addNumbers();
    }

    public void addNumbers() {
        int mid = length/2;
        int firstNum = (mid + 1) - length;
        for (int i = 0; i < length; i++) {
            array[i] = firstNum;
            firstNum++;
        }
    } 

    public int getLength() {
        return length;
    }

    public void print() {
        for (Object o: array) {
            System.out.print(o + " ");
        }
    }

    

}