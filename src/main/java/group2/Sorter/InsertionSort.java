package group2.Sorter;

public class InsertionSort extends Sorter {
    @Override
    public void sort() {
        int[] array = getArray();

        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
        setArray(array);
    }
}

// võtan massiivi, nt 64, 34, 25, 12, 22, 11, 90, mille sain getArray meetodiga
// teen tsükli, mis jookseb i muutujaga 1-st massiivi pikkuseni
// tsükli sees võtan key muutujasse massiivi i
// võtan j muutujasse i-1
// teen while tsükli, mis jookseb seni, kuni j on suurem või võrdne 0-ga ja massiivi j on suurem kui key
// tsükli sees annan massiivi j+1-le massiivi j väärtuse
// seejärel vähendan j väärtust ühe võrra
// kui while tsükkel lõpeb, siis annan massiivi j+1-le key väärtuse
// nii jätkan, kuni kogu massiiv on sorteeritud
// lõpuks kasutan setArray meetodit, et salvestada sorteeritud massiiv tagasi