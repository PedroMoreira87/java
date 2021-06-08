package aula10_busca_binaria;

public class BinarySearch {

    public int binarySearch (int[] data, int x, int beginning, int end) {
        if (end >= beginning) {
            int mid = (beginning + end) / 2;
            if(x == data[mid])
                return x;
            else if(x > data[mid])
                return binarySearch(data, x, mid + 1,end);
            return binarySearch(data, x, beginning, mid - 1);
        }return -1;
    }

    public int binarySearch (int[] data, int x) {
        return binarySearch(data, x,0, data.length-1 );
    }
}
